package com.example.gunsound.activity

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.MotionEvent
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.view.animation.OvershootInterpolator
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.gunsound.R
import com.example.gunsound.databinding.ActivityRussianRouletteBinding
import com.example.gunsound.dialog.AppDialogs
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
    private var isHammerCocked = false
    private var isImmersive = false

    private lateinit var revolverImageView: ImageView
    private val mainHandler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRussianRouletteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        soundManager = SoundManager.get(this)
        flashManager = FlashlightManager.get(this)
        vibrationManager = VibrationManager.get(this)

        // Load 1 bullet by default
        chambers[0] = true
        currentChamberIndex = Random.nextInt(6)

        setupViews()
        setupListeners()
        updateBulletCount()
    }

    private fun setupViews() {
        revolverImageView = ImageView(this).apply {
            layoutParams = androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.MATCH_PARENT,
                androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.MATCH_PARENT
            )
            scaleType = ImageView.ScaleType.FIT_CENTER
            setImageResource(R.drawable.gun_machine_colt_python)
        }
        binding.flSpine.addView(revolverImageView)
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
            binding.groupReload.isVisible = !isImmersive
            binding.ivBack.isVisible = !isImmersive
        }

        binding.tvReload.setOnClickListener {
            openCylinderForReload()
        }

        binding.tvReloadDone.setOnClickListener {
            closeCylinder()
        }

        // Tap on cylinder/revolver to spin or shoot
        var downX = 0f
        var downY = 0f
        revolverImageView.setOnTouchListener { _, event ->
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

    private fun spinCylinder() {
        soundManager.playSound("weaponsound/russian_roulette/sliding_cylinder.MP3")
        currentChamberIndex = Random.nextInt(6)
        vibrationManager.vibrateShot(40L)

        val spin = ObjectAnimator.ofFloat(revolverImageView, "rotation", 0f, 720f)
        spin.duration = 600
        spin.interpolator = DecelerateInterpolator()
        spin.start()
    }

    private fun pullTrigger() {
        if (isReloading) return

        val isLive = chambers[currentChamberIndex]
        if (isLive) {
            // BANG!
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
            val recoil = ObjectAnimator.ofFloat(revolverImageView, "translationY", 0f, -30f, 0f)
            recoil.duration = 100
            recoil.interpolator = OvershootInterpolator()
            recoil.start()
        } else {
            // CLICK! Empty
            soundManager.playSound("weaponsound/russian_roulette/empty_shoot.MP3")
            vibrationManager.vibrateShot(30L)
        }

        // Advance cylinder
        currentChamberIndex = (currentChamberIndex + 1) % 6
    }

    private fun openCylinderForReload() {
        isReloading = true
        soundManager.playSound("weaponsound/russian_roulette/open_cartridge.mp3")
        binding.groupReload.visibility = View.GONE
        binding.groupReloadDone.visibility = View.VISIBLE
        binding.tvGuide.alpha = 1f
        binding.tvReloadDone.alpha = 1f

        // Fill all chambers or load 1
        for (i in 0 until 6) {
            chambers[i] = true
        }
        updateBulletCount()
        soundManager.playSound("weaponsound/russian_roulette/load_bullet.MP3")
    }

    private fun closeCylinder() {
        isReloading = false
        soundManager.playSound("weaponsound/russian_roulette/fold_cartridge.MP3")
        binding.groupReloadDone.visibility = View.GONE
        binding.groupReload.visibility = View.VISIBLE
        spinCylinder()
    }

    private fun updateBulletCount() {
        val count = chambers.count { it }
        binding.tvBullet.text = count.toString()
    }
}
