package com.example.gunsound.activity

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.view.animation.OvershootInterpolator
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.gunsound.R
import com.example.gunsound.databinding.ActivityRussianRouletteBinding
import com.example.gunsound.dialog.AppDialogs
import com.example.gunsound.repository.WeaponRepository
import com.example.gunsound.utils.AppPreferences
import com.example.gunsound.utils.FlashlightManager
import com.example.gunsound.utils.SoundManager
import com.example.gunsound.utils.VibrationManager
import kotlin.random.Random

class RussianRouletteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRussianRouletteBinding
    private lateinit var soundManager: SoundManager
    private lateinit var flashManager: FlashlightManager
    private lateinit var vibrationManager: VibrationManager

    // 6 Chambers: true = loaded, false = empty
    private val chambers = BooleanArray(6) { false }
    private var currentChamberIndex = 0
    private var isReloading = false
    private var isImmersive = false

    private lateinit var revolverImageView: ImageView
    private lateinit var muzzleFlashImageView: ImageView
    private lateinit var cylinderReloadContainer: FrameLayout
    private lateinit var cylinderWheelLayout: FrameLayout
    private val chamberBulletViews = arrayOfNulls<ImageView>(6)

    private val mainHandler = Handler(Looper.getMainLooper())
    private val hideFlashRunnable = Runnable {
        if (::muzzleFlashImageView.isInitialized) {
            muzzleFlashImageView.visibility = View.GONE
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRussianRouletteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        soundManager = SoundManager.get(this)
        flashManager = FlashlightManager.get(this)
        vibrationManager = VibrationManager.get(this)

        setupViews()
        setupListeners()

        // Start directly in Reload mode so user loads bullets one by one, or with 1 bullet loaded
        openCylinderForReload(initial = true)
    }

    override fun onResume() {
        super.onResume()
        updateMuzzleFlashPosition()
    }

    override fun onPause() {
        super.onPause()
        flashManager.turnOff()
        vibrationManager.cancel()
        mainHandler.removeCallbacks(hideFlashRunnable)
    }

    override fun onDestroy() {
        super.onDestroy()
        flashManager.release()
        mainHandler.removeCallbacks(hideFlashRunnable)
    }

    private fun setupViews() {
        val density = resources.displayMetrics.density

        // 1. Revolver Gun View for Firing
        revolverImageView = ImageView(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            scaleType = ImageView.ScaleType.FIT_CENTER
            setImageResource(R.drawable.pic_weapon_show_colt_python)
        }
        binding.flSpine.addView(revolverImageView)

        // Muzzle Flash
        val flashWidth = (90 * density).toInt()
        val flashHeight = (150 * density).toInt()
        muzzleFlashImageView = ImageView(this).apply {
            layoutParams = FrameLayout.LayoutParams(flashWidth, flashHeight).apply {
                gravity = Gravity.TOP or Gravity.START
            }
            scaleType = ImageView.ScaleType.FIT_CENTER
            visibility = View.GONE
        }
        binding.flSpine.addView(muzzleFlashImageView)

        revolverImageView.addOnLayoutChangeListener { _, _, _, _, _, _, _, _, _ ->
            updateMuzzleFlashPosition()
        }

        // 2. Cylinder Reload View (Open Revolver Frame + 6-Chamber Wheel + 6 Bullets)
        val cylinderSize = (280 * density).toInt()
        val bulletSize = (46 * density).toInt()
        val radius = 86 * density // Distance from cylinder center to bullet chambers

        cylinderReloadContainer = FrameLayout(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            visibility = View.GONE
        }

        // Open Revolver Background Frame
        val frameImageView = ImageView(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            scaleType = ImageView.ScaleType.FIT_CENTER
            setImageResource(R.drawable.cylinder_revolver_frame)
            alpha = 0.85f
        }
        cylinderReloadContainer.addView(frameImageView)

        // Rotating Cylinder Wheel (contains dancao base + 6 bullet chambers)
        cylinderWheelLayout = FrameLayout(this).apply {
            layoutParams = FrameLayout.LayoutParams(cylinderSize, cylinderSize).apply {
                gravity = Gravity.CENTER
            }
        }

        val cylinderBaseView = ImageView(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            scaleType = ImageView.ScaleType.FIT_CENTER
            setImageResource(R.drawable.cylinder_dancao)
        }
        cylinderWheelLayout.addView(cylinderBaseView)

        // Place 6 Bullet Chambers in a circle at 60 degree intervals
        for (i in 0 until 6) {
            val angleDeg = i * 60.0 - 90.0 // Start from top (-90°)
            val angleRad = Math.toRadians(angleDeg)
            val bx = (cylinderSize / 2f + radius * Math.cos(angleRad) - bulletSize / 2f).toFloat()
            val by = (cylinderSize / 2f + radius * Math.sin(angleRad) - bulletSize / 2f).toFloat()

            val bulletView = ImageView(this).apply {
                layoutParams = FrameLayout.LayoutParams(bulletSize, bulletSize).apply {
                    leftMargin = bx.toInt()
                    topMargin = by.toInt()
                }
                scaleType = ImageView.ScaleType.FIT_CENTER
                setImageResource(R.drawable.bullet_revolver)
                visibility = View.INVISIBLE
            }
            chamberBulletViews[i] = bulletView
            cylinderWheelLayout.addView(bulletView)
        }

        cylinderReloadContainer.addView(cylinderWheelLayout)
        binding.flSpine.addView(cylinderReloadContainer)

        // Apply saved background
        val prefs = AppPreferences.get(this)
        val scene = WeaponRepository.sceneBackgrounds.getOrNull(prefs.currentBackgroundIndex)
        scene?.let { binding.root.setBackgroundResource(it.bgDrawableRes) }
    }

    private fun updateMuzzleFlashPosition() {
        revolverImageView.post {
            val drawable = revolverImageView.drawable ?: return@post
            val dWidth = drawable.intrinsicWidth.toFloat()
            val dHeight = drawable.intrinsicHeight.toFloat()
            if (dWidth <= 0f || dHeight <= 0f) return@post

            val vWidth = revolverImageView.width.toFloat()
            val vHeight = revolverImageView.height.toFloat()
            if (vWidth <= 0f || vHeight <= 0f) return@post

            val scale = minOf(vWidth / dWidth, vHeight / dHeight)
            val renderedWidth = dWidth * scale
            val renderedHeight = dHeight * scale
            val offsetX = (vWidth - renderedWidth) / 2f
            val offsetY = (vHeight - renderedHeight) / 2f

            // Colt Python barrel tip: 62.13% X, 28.74% Y
            val barrelTipX = offsetX + renderedWidth * 0.6213f
            val barrelTipY = offsetY + renderedHeight * 0.2874f

            val flashW = muzzleFlashImageView.layoutParams.width.toFloat()
            val flashH = muzzleFlashImageView.layoutParams.height.toFloat()

            muzzleFlashImageView.x = barrelTipX - (flashW / 2f)
            muzzleFlashImageView.y = barrelTipY - (flashH * 0.85f)
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setupListeners() {
        binding.ivBack.setOnClickListener {
            soundManager.playButtonClick()
            finish()
        }

        binding.ivSetting.setOnClickListener {
            soundManager.playButtonClick()
            startActivity(Intent(this, SettingActivity::class.java))
        }

        binding.ivScene.setOnClickListener {
            soundManager.playButtonClick()
            AppDialogs.showSceneChangeDialog(this) { scene ->
                binding.root.setBackgroundResource(scene.bgDrawableRes)
            }
        }

        binding.ivFiringEffect.setOnClickListener {
            soundManager.playButtonClick()
            AppDialogs.showShootEffectDialog(this) {}
        }

        binding.ivHelp.setOnClickListener {
            soundManager.playButtonClick()
            val guide = findViewById<View>(R.id.group_layout)
            guide?.isVisible = true
        }

        findViewById<View>(R.id.bt_got_it)?.setOnClickListener {
            soundManager.playButtonClick()
            findViewById<View>(R.id.group_layout)?.isVisible = false
        }

        binding.ivImmersive.setOnClickListener {
            soundManager.playButtonClick()
            isImmersive = !isImmersive
            binding.groupReload.isVisible = !isImmersive && !isReloading
            binding.ivBack.isVisible = !isImmersive
        }

        binding.tvReload.setOnClickListener {
            openCylinderForReload(initial = false)
        }

        binding.tvReloadDone.setOnClickListener {
            closeCylinder()
        }

        // Tap on cylinder container to load bullet 1-by-1
        cylinderReloadContainer.setOnClickListener {
            loadNextBullet()
        }

        // Tap on gun to spin or shoot
        var downX = 0f
        var downY = 0f
        revolverImageView.setOnTouchListener { _, event ->
            if (isReloading) return@setOnTouchListener false
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    downX = event.x
                    downY = event.y
                    true
                }
                MotionEvent.ACTION_UP -> {
                    val dx = event.x - downX
                    val dy = event.y - downY
                    if (Math.hypot(dx.toDouble(), dy.toDouble()) > 50) {
                        // Swiped -> Spin cylinder
                        spinCylinder()
                    } else {
                        // Tapped -> Pull Trigger
                        pullTrigger()
                    }
                    true
                }
                else -> false
            }
        }
    }

    private fun openCylinderForReload(initial: Boolean = false) {
        isReloading = true
        if (!initial) {
            soundManager.playSound("weaponsound/russian_roulette/open_cartridge.mp3")
        }

        // Clear chambers for reloading
        for (i in 0 until 6) {
            chambers[i] = false
            chamberBulletViews[i]?.visibility = View.INVISIBLE
        }
        updateBulletCount()

        // Reset cylinder wheel rotation
        cylinderWheelLayout.rotation = 0f

        // Switch to Cylinder View
        revolverImageView.visibility = View.GONE
        cylinderReloadContainer.visibility = View.VISIBLE

        binding.groupReload.visibility = View.GONE
        binding.groupReloadDone.visibility = View.VISIBLE
        binding.tvGuide.alpha = 1f
        binding.tvReloadDone.alpha = 1f
    }

    private fun loadNextBullet() {
        if (!isReloading) return

        // Find next empty chamber
        var emptyIndex = -1
        for (i in 0 until 6) {
            if (!chambers[i]) {
                emptyIndex = i
                break
            }
        }

        if (emptyIndex != -1) {
            chambers[emptyIndex] = true
            soundManager.playSound("weaponsound/russian_roulette/load_bullet.MP3")
            vibrationManager.vibrateShot(35L)

            // Bullet pop-in animation
            val bulletView = chamberBulletViews[emptyIndex]
            bulletView?.visibility = View.VISIBLE
            bulletView?.scaleX = 0.2f
            bulletView?.scaleY = 0.2f
            bulletView?.animate()
                ?.scaleX(1.0f)
                ?.scaleY(1.0f)
                ?.setDuration(160)
                ?.setInterpolator(OvershootInterpolator())
                ?.start()

            updateBulletCount()

            val count = chambers.count { it }
            if (count < 6) {
                // Rotate cylinder 60° to bring next empty chamber into position
                cylinderWheelLayout.animate()
                    .rotationBy(60f)
                    .setDuration(240)
                    .setInterpolator(DecelerateInterpolator())
                    .start()
            } else {
                // All 6 holes filled -> automatically close cylinder and switch to revolver gun!
                mainHandler.postDelayed({
                    closeCylinder()
                }, 350L)
            }
        }
    }

    private fun closeCylinder() {
        if (!isReloading) return
        isReloading = false

        soundManager.playSound("weaponsound/russian_roulette/fold_cartridge.MP3")
        vibrationManager.vibrateShot(50L)

        // Switch to Revolver Gun View
        cylinderReloadContainer.visibility = View.GONE
        revolverImageView.visibility = View.VISIBLE

        binding.groupReloadDone.visibility = View.GONE
        binding.groupReload.visibility = if (!isImmersive) View.VISIBLE else View.GONE

        // Randomize initial firing chamber and play spin sound
        spinCylinder()
    }

    private fun spinCylinder() {
        soundManager.playSound("weaponsound/russian_roulette/sliding_cylinder.MP3")
        currentChamberIndex = Random.nextInt(6)
        vibrationManager.vibrateShot(40L)

        val spin = ObjectAnimator.ofFloat(revolverImageView, "rotation", 0f, 720f)
        spin.duration = 500
        spin.interpolator = DecelerateInterpolator()
        spin.start()
    }

    private fun pullTrigger() {
        if (isReloading) return

        val isLive = chambers[currentChamberIndex]
        if (isLive) {
            // BANG! Live round fired
            soundManager.playSound("weaponsound/russian_roulette/shoot.MP3")
            flashManager.flashOnce(60L)
            vibrationManager.vibrateHeavyExplosion()

            chambers[currentChamberIndex] = false
            updateBulletCount()

            // Warning Animation
            binding.lavShootWarn.isVisible = true
            binding.lavShootWarn.playAnimation()
            mainHandler.postDelayed({
                binding.lavShootWarn.isVisible = false
            }, 1000L)

            // Recoil
            revolverImageView.translationY = 18f
            revolverImageView.animate().translationY(0f).setDuration(60).start()

            // Muzzle Flash
            val prefs = AppPreferences.get(this)
            val effect = WeaponRepository.shootEffects.getOrNull(prefs.currentFiringEffectIndex)
                ?: WeaponRepository.shootEffects.first()
            muzzleFlashImageView.setImageResource(effect.effectDrawableRes)
            muzzleFlashImageView.rotation = 0f
            muzzleFlashImageView.visibility = View.VISIBLE
            mainHandler.removeCallbacks(hideFlashRunnable)
            mainHandler.postDelayed(hideFlashRunnable, 45L)
        } else {
            // CLICK! Empty chamber
            soundManager.playSound("weaponsound/russian_roulette/empty_shoot.MP3")
            vibrationManager.vibrateShot(30L)
        }

        // Advance chamber
        currentChamberIndex = (currentChamberIndex + 1) % 6

        // If all bullets fired, prompt reload
        if (chambers.none { it }) {
            mainHandler.postDelayed({
                openCylinderForReload(initial = false)
            }, 600L)
        }
    }

    private fun updateBulletCount() {
        val count = chambers.count { it }
        binding.tvBullet.text = count.toString()
    }
}
