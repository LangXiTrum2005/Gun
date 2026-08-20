package com.example.gunsound.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.gunsound.R
import com.example.gunsound.databinding.ActivityGunBinding
import com.example.gunsound.databinding.LayoutTimeBombBinding
import com.example.gunsound.databinding.LayoutTimeBombC4Binding
import com.example.gunsound.dialog.AppDialogs
import com.example.gunsound.model.FireMode
import com.example.gunsound.model.Weapon
import com.example.gunsound.model.WeaponType
import com.example.gunsound.repository.WeaponRepository
import com.example.gunsound.utils.*

class WeaponUseActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGunBinding
    private lateinit var weapon: Weapon
    private lateinit var soundManager: SoundManager
    private lateinit var flashManager: FlashlightManager
    private lateinit var vibrationManager: VibrationManager
    private var shakeDetector: ShakeDetector? = null

    private var currentMode = FireMode.SINGLE
    private var isFiring = false
    private var isUnlimitedAmmo = false
    private var isReloading = false
    private var isImmersive = false
    private val mainHandler = Handler(Looper.getMainLooper())
    private var autoFireRunnable: Runnable? = null
    private var flameRunnable: Runnable? = null
    private var flameFrameIndex = 0
    private val flameDrawables = intArrayOf(
        R.drawable.flame_stream_1,
        R.drawable.flame_stream_2,
        R.drawable.flame_stream_3,
        R.drawable.flame_stream_4
    )

    private var bombTimer: CountDownTimer? = null
    private var bombSeconds = 5
    private var isBombActive = false

    private lateinit var weaponImageView: ImageView
    private lateinit var muzzleFlashImageView: ImageView
    private val hideFlashRunnable = Runnable {
        if (::muzzleFlashImageView.isInitialized) {
            muzzleFlashImageView.visibility = View.GONE
        }
    }

    private lateinit var ammoCounterText: TextView
    private lateinit var ammoSeparatorText: TextView
    private lateinit var ammoAllText: TextView
    private lateinit var ammoUnlimitedText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGunBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val w = intent.getSerializableExtra("EXTRA_WEAPON") as? Weapon
        weapon = w ?: WeaponRepository.mechanicalGuns.first()

        soundManager = SoundManager.get(this)
        flashManager = FlashlightManager.get(this)
        vibrationManager = VibrationManager.get(this)

        setupViews()
        setupWeaponDisplay()
        setupListeners()
        setupShakeDetector()

        if (weapon.type == WeaponType.LIGHTSABER) {
            soundManager.playSound(weapon.shootSoundPath)
            soundManager.startLoopingSound("weaponsound/lightsaber/light_saber_circle_default.ogg")
        }
    }

    override fun onResume() {
        super.onResume()
        shakeDetector?.start()
        updateMuzzleFlashPosition()
    }

    override fun onPause() {
        super.onPause()
        shakeDetector?.stop()
        stopAutoFire()
        stopFlamethrower()
        flashManager.turnOff()
        vibrationManager.cancel()
        soundManager.stopLoopingSound()
        mainHandler.removeCallbacks(hideFlashRunnable)
    }

    override fun onDestroy() {
        super.onDestroy()
        bombTimer?.cancel()
        flashManager.release()
        mainHandler.removeCallbacks(hideFlashRunnable)
    }

    private fun setupViews() {
        weaponImageView = ImageView(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            scaleType = ImageView.ScaleType.FIT_CENTER
            setImageResource(weapon.showPicRes)
        }
        binding.flSpine.addView(weaponImageView)

        val density = resources.displayMetrics.density
        val flashWidth = if (weapon.id == "flamethrower") (180 * density).toInt() else (90 * density).toInt()
        val flashHeight = if (weapon.id == "flamethrower") (290 * density).toInt() else (150 * density).toInt()

        muzzleFlashImageView = ImageView(this).apply {
            layoutParams = FrameLayout.LayoutParams(flashWidth, flashHeight).apply {
                gravity = Gravity.TOP or Gravity.START
            }
            scaleType = ImageView.ScaleType.FIT_CENTER
            visibility = View.GONE
        }
        binding.flSpine.addView(muzzleFlashImageView)

        weaponImageView.addOnLayoutChangeListener { _, _, _, _, _, _, _, _, _ ->
            updateMuzzleFlashPosition()
        }

        ammoCounterText = findViewById(R.id.tv_bullets_number_in_cartridge_clip)
        ammoSeparatorText = findViewById(R.id.tv_separator_bullets_number)
        ammoAllText = findViewById(R.id.tv_bullets_number_all)
        ammoUnlimitedText = findViewById(R.id.tv_unlimited)

        updateAmmoDisplay()

        // Background theme
        val prefs = AppPreferences.get(this)
        val scene = WeaponRepository.sceneBackgrounds.getOrNull(prefs.currentBackgroundIndex)
        scene?.let { binding.clBg.setBackgroundResource(it.bgDrawableRes) }
    }

    private fun updateMuzzleFlashPosition() {
        weaponImageView.post {
            val drawable = weaponImageView.drawable ?: return@post
            val dWidth = drawable.intrinsicWidth.toFloat()
            val dHeight = drawable.intrinsicHeight.toFloat()
            if (dWidth <= 0f || dHeight <= 0f) return@post

            val vWidth = weaponImageView.width.toFloat()
            val vHeight = weaponImageView.height.toFloat()
            if (vWidth <= 0f || vHeight <= 0f) return@post

            val scale = minOf(vWidth / dWidth, vHeight / dHeight)
            val renderedWidth = dWidth * scale
            val renderedHeight = dHeight * scale
            val offsetX = (vWidth - renderedWidth) / 2f
            val offsetY = (vHeight - renderedHeight) / 2f

            val barrelTipX = offsetX + renderedWidth * weapon.muzzleXPercent
            val barrelTipY = offsetY + renderedHeight * weapon.muzzleYPercent

            val flashW = muzzleFlashImageView.layoutParams.width.toFloat()
            val flashH = muzzleFlashImageView.layoutParams.height.toFloat()

            // Centered horizontally on the barrel tip, projecting straight upward
            muzzleFlashImageView.x = barrelTipX - (flashW / 2f)
            muzzleFlashImageView.y = barrelTipY - (flashH * 0.88f)
        }
    }

    private fun setupWeaponDisplay() {
        val colorPickerCon = findViewById<View>(R.id.con_color_choose)
        val colorPickerBtn = findViewById<ImageView>(R.id.iv_color_choose)
        val colorSeekBar = findViewById<com.example.gunsound.views.ColorSeekBarVertical>(R.id.choose_color_seek_bar)
        val resetColorBtn = findViewById<View>(R.id.iv_reset_color_choose)
        val gunEffectBtn = findViewById<ImageView>(R.id.iv_gun_effect)
        val shakeBtn = findViewById<ImageView>(R.id.iv_shake)

        when (weapon.type) {
            WeaponType.LIGHTSABER -> {
                colorPickerBtn?.isVisible = true
                gunEffectBtn?.isVisible = false
                shakeBtn?.isVisible = true
                colorPickerBtn?.setOnClickListener {
                    soundManager.playButtonClick()
                    colorPickerCon?.isVisible = !(colorPickerCon.isVisible)
                }
                colorSeekBar?.onColorChangeListener = { color ->
                    weaponImageView.setColorFilter(color, PorterDuff.Mode.MULTIPLY)
                }
                resetColorBtn?.setOnClickListener {
                    soundManager.playButtonClick()
                    weaponImageView.clearColorFilter()
                }
            }
            WeaponType.MECHANICAL_GUN -> {
                colorPickerBtn?.isVisible = false
                gunEffectBtn?.isVisible = weapon.id != "flamethrower"
                shakeBtn?.isVisible = true
                gunEffectBtn?.setOnClickListener {
                    soundManager.playButtonClick()
                    AppDialogs.showShootEffectDialog(this) {}
                }
            }
            WeaponType.TIME_BOMB -> {
                colorPickerBtn?.isVisible = false
                gunEffectBtn?.isVisible = false
                shakeBtn?.isVisible = false
                setupBombMode()
            }
            WeaponType.SCI_FI_GUN -> {
                colorPickerBtn?.isVisible = false
                gunEffectBtn?.isVisible = false
                shakeBtn?.isVisible = true
            }
            WeaponType.TASER -> {
                colorPickerBtn?.isVisible = false
                gunEffectBtn?.isVisible = false
                shakeBtn?.isVisible = true
            }
            else -> {
                colorPickerBtn?.isVisible = false
                gunEffectBtn?.isVisible = false
                shakeBtn?.isVisible = true
            }
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun setupListeners() {
        findViewById<View>(R.id.iv_back)?.setOnClickListener {
            soundManager.playButtonClick()
            finish()
        }

        findViewById<View>(R.id.iv_setting)?.setOnClickListener {
            soundManager.playButtonClick()
            startActivity(Intent(this, SettingActivity::class.java))
        }

        findViewById<View>(R.id.iv_scene_menu)?.setOnClickListener {
            soundManager.playButtonClick()
            AppDialogs.showSceneChangeDialog(this) { selectedScene ->
                binding.clBg.setBackgroundResource(selectedScene.bgDrawableRes)
            }
        }

        findViewById<View>(R.id.iv_shake)?.setOnClickListener {
            soundManager.playButtonClick()
            AppDialogs.showShakeSensitivityDialog(this)
        }

        findViewById<View>(R.id.iv_immersive)?.setOnClickListener {
            soundManager.playButtonClick()
            toggleImmersive()
        }

        findViewById<View>(R.id.iv_unlimited_bullet)?.setOnClickListener {
            soundManager.playButtonClick()
            isUnlimitedAmmo = !isUnlimitedAmmo
            findViewById<ImageView>(R.id.iv_unlimited_bullet)?.setImageResource(
                if (isUnlimitedAmmo) R.drawable.icon_unlimited_bullet_on else R.drawable.icon_unlimited_bullet
            )
            updateAmmoDisplay()
        }

        findViewById<View>(R.id.layout_click_cover)?.setOnTouchListener { _, event ->
            handleWeaponTouch(event)
        }

        binding.ivReloadBullets.setOnClickListener {
            performReload()
        }
        binding.conReloadTv.setOnClickListener {
            performReload()
        }
    }

    private fun setupShakeDetector() {
        shakeDetector = ShakeDetector(this) {
            onWeaponTriggered(fromShake = true)
        }
    }

    private fun handleWeaponTouch(event: MotionEvent): Boolean {
        if (weapon.isBomb) return false

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                if (weapon.type == WeaponType.TASER) {
                    startTaserShock()
                } else if (weapon.id == "flamethrower") {
                    startFlamethrower()
                } else if (currentMode == FireMode.AUTO || weapon.magazineCapacity > 10) {
                    startAutoFire()
                } else {
                    onWeaponTriggered(fromShake = false)
                }
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                if (weapon.type == WeaponType.LIGHTSABER) {
                    soundManager.playSound("weaponsound/lightsaber/light_saber_shake.ogg")
                }
                return true
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (weapon.type == WeaponType.TASER) {
                    stopTaserShock()
                } else if (weapon.id == "flamethrower") {
                    stopFlamethrower()
                } else {
                    stopAutoFire()
                }
                return true
            }
        }
        return false
    }

    private fun onWeaponTriggered(fromShake: Boolean = false) {
        if (weapon.currentAmmo <= 0 && !isUnlimitedAmmo) {
            soundManager.playSound(weapon.emptySoundPath)
            binding.groupReloadBullets.visibility = View.VISIBLE
            return
        }

        if (!isUnlimitedAmmo) {
            weapon.currentAmmo--
            updateAmmoDisplay()
        }

        // Special handling for M2 Flamethrower on tap/shake:
        if (weapon.id == "flamethrower") {
            soundManager.playSound("weaponsound/machine/fire.mp3")
            flashManager.flashOnce(180L)
            vibrationManager.vibrateShot(180L)

            val density = resources.displayMetrics.density
            muzzleFlashImageView.layoutParams = FrameLayout.LayoutParams((180 * density).toInt(), (290 * density).toInt())
            updateMuzzleFlashPosition()
            muzzleFlashImageView.setImageResource(R.drawable.flame_stream_1)
            muzzleFlashImageView.visibility = View.VISIBLE

            mainHandler.postDelayed({
                muzzleFlashImageView.setImageResource(R.drawable.flame_stream_2)
            }, 45L)
            mainHandler.postDelayed({
                muzzleFlashImageView.setImageResource(R.drawable.flame_stream_3)
            }, 90L)
            mainHandler.postDelayed({
                muzzleFlashImageView.setImageResource(R.drawable.flame_stream_4)
            }, 135L)
            mainHandler.postDelayed({
                muzzleFlashImageView.visibility = View.GONE
            }, 180L)
            return
        }

        // 1. Play Sound
        if (weapon.shootSoundPath.isNotEmpty()) {
            soundManager.playSound(weapon.shootSoundPath)
        }

        // 2. Hardware Feedback (Flash & Vibration)
        flashManager.flashOnce(50L)
        vibrationManager.vibrateShot(60L)

        // 3. Recoil Animation
        weaponImageView.translationY = 18f
        weaponImageView.animate().translationY(0f).setDuration(60).start()

        // 4. Single Straight Muzzle Flash Flare aligned directly with the barrel
        if (weapon.type == WeaponType.MECHANICAL_GUN || weapon.type == WeaponType.SCI_FI_GUN) {
            val prefs = AppPreferences.get(this)
            val effectIndex = prefs.currentFiringEffectIndex
            val effect = WeaponRepository.shootEffects.getOrNull(effectIndex) ?: WeaponRepository.shootEffects.first()
            muzzleFlashImageView.setImageResource(effect.effectDrawableRes)
            muzzleFlashImageView.rotation = 0f
            muzzleFlashImageView.scaleX = 1.0f
            muzzleFlashImageView.scaleY = 1.0f
            muzzleFlashImageView.visibility = View.VISIBLE

            mainHandler.removeCallbacks(hideFlashRunnable)
            mainHandler.postDelayed(hideFlashRunnable, 45L)
        }
    }

    private fun startFlamethrower() {
        if (weapon.currentAmmo <= 0 && !isUnlimitedAmmo) {
            soundManager.playSound(weapon.emptySoundPath)
            binding.groupReloadBullets.visibility = View.VISIBLE
            return
        }

        isFiring = true
        soundManager.startLoopingSound("weaponsound/machine/fire.mp3")
        flashManager.turnOn()
        vibrationManager.vibrateContinuous(5000L)

        val density = resources.displayMetrics.density
        val flameW = (180 * density).toInt()
        val flameH = (290 * density).toInt()
        muzzleFlashImageView.layoutParams = FrameLayout.LayoutParams(flameW, flameH)
        muzzleFlashImageView.visibility = View.VISIBLE
        updateMuzzleFlashPosition()

        flameRunnable = object : Runnable {
            override fun run() {
                if (isFiring && (weapon.currentAmmo > 0 || isUnlimitedAmmo)) {
                    if (!isUnlimitedAmmo) {
                        weapon.currentAmmo = (weapon.currentAmmo - 1).coerceAtLeast(0)
                        updateAmmoDisplay()
                    }

                    // Cycle flame animation frames
                    muzzleFlashImageView.setImageResource(flameDrawables[flameFrameIndex % flameDrawables.size])
                    muzzleFlashImageView.scaleX = (95..110).random() / 100f
                    muzzleFlashImageView.scaleY = (95..110).random() / 100f
                    flameFrameIndex++

                    // Realistic flamethrower recoil tremor
                    weaponImageView.translationX = (-3..3).random().toFloat()
                    weaponImageView.translationY = (-2..4).random().toFloat()

                    mainHandler.postDelayed(this, 50L)
                } else {
                    stopFlamethrower()
                }
            }
        }
        mainHandler.post(flameRunnable!!)
    }

    private fun stopFlamethrower() {
        isFiring = false
        flameRunnable?.let { mainHandler.removeCallbacks(it) }
        flameRunnable = null

        soundManager.stopLoopingSound()
        flashManager.turnOff()
        vibrationManager.cancel()

        muzzleFlashImageView.visibility = View.GONE
        weaponImageView.translationX = 0f
        weaponImageView.translationY = 0f

        val density = resources.displayMetrics.density
        val flashWidth = (90 * density).toInt()
        val flashHeight = (150 * density).toInt()
        muzzleFlashImageView.layoutParams = FrameLayout.LayoutParams(flashWidth, flashHeight)
        updateMuzzleFlashPosition()
    }

    private fun startAutoFire() {
        isFiring = true
        onWeaponTriggered(fromShake = false)
        autoFireRunnable = object : Runnable {
            override fun run() {
                if (isFiring && (weapon.currentAmmo > 0 || isUnlimitedAmmo)) {
                    onWeaponTriggered(fromShake = false)
                    mainHandler.postDelayed(this, weapon.fireIntervalMs.coerceAtLeast(70L))
                } else {
                    stopAutoFire()
                }
            }
        }
        mainHandler.postDelayed(autoFireRunnable!!, weapon.fireIntervalMs.coerceAtLeast(70L))
    }

    private fun stopAutoFire() {
        isFiring = false
        autoFireRunnable?.let { mainHandler.removeCallbacks(it) }
        autoFireRunnable = null
    }

    private fun startTaserShock() {
        soundManager.startLoopingSound(weapon.shootSoundPath)
        flashManager.turnOn()
        vibrationManager.vibrateContinuous(5000L)
        weaponImageView.animate().scaleX(1.05f).scaleY(1.05f).setDuration(100).start()
    }

    private fun stopTaserShock() {
        soundManager.stopLoopingSound()
        flashManager.turnOff()
        vibrationManager.cancel()
        weaponImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start()
    }

    private fun performReload() {
        if (isReloading || weapon.isBomb) return
        isReloading = true

        soundManager.playSound(weapon.reloadSoundPath)
        binding.groupReloadBullets.visibility = View.GONE

        // Animate ammo counter pop effect on refill
        val refillAmmoAction = {
            weapon.resetAmmo()
            updateAmmoDisplay()
            ammoCounterText.animate().scaleX(1.3f).scaleY(1.3f).setDuration(120).withEndAction {
                ammoCounterText.animate().scaleX(1.0f).scaleY(1.0f).setDuration(120).start()
            }.start()
        }

        when (weapon.type) {
            WeaponType.LIGHTSABER -> {
                // Lightsaber Retract & Energy Burst Extension
                vibrationManager.vibrateShot(50L)
                weaponImageView.animate()
                    .scaleY(0.15f)
                    .alpha(0.6f)
                    .setDuration(220)
                    .withEndAction {
                        refillAmmoAction()
                        vibrationManager.vibrateShot(80L)
                        soundManager.playSound("weaponsound/lightsaber/light_saber_shoot.ogg")
                        weaponImageView.animate()
                            .scaleY(1.05f)
                            .alpha(1.0f)
                            .setDuration(260)
                            .withEndAction {
                                weaponImageView.animate().scaleY(1.0f).setDuration(100).start()
                                isReloading = false
                            }.start()
                    }.start()
            }
            WeaponType.TASER -> {
                // Taser cartridge eject and slap in
                vibrationManager.vibrateShot(40L)
                weaponImageView.animate()
                    .translationY(70f)
                    .rotation(-8f)
                    .setDuration(180)
                    .withEndAction {
                        refillAmmoAction()
                        vibrationManager.vibrateShot(60L)
                        weaponImageView.animate()
                            .translationY(-20f)
                            .rotation(3f)
                            .setDuration(180)
                            .withEndAction {
                                weaponImageView.animate()
                                    .translationY(0f)
                                    .rotation(0f)
                                    .setInterpolator(android.view.animation.OvershootInterpolator(1.8f))
                                    .setDuration(150)
                                    .withEndAction { isReloading = false }
                                    .start()
                            }.start()
                    }.start()
            }
            else -> {
                // Mechanical & Sci-Fi Guns: Multi-phase realistic magazine drop, slap in, and slide rack
                // Phase 1: Magazine Drop & Weapon Tilt Down
                vibrationManager.vibrateShot(40L)
                weaponImageView.animate()
                    .translationY(110f)
                    .translationX(-25f)
                    .rotation(-9f)
                    .scaleX(0.94f)
                    .scaleY(0.94f)
                    .setInterpolator(android.view.animation.AccelerateInterpolator())
                    .setDuration(220)
                    .withEndAction {
                        // Phase 2: Fresh Magazine Slam In
                        vibrationManager.vibrateShot(70L)
                        refillAmmoAction()
                        weaponImageView.animate()
                            .translationY(-40f)
                            .translationX(10f)
                            .rotation(4f)
                            .scaleX(1.04f)
                            .scaleY(1.04f)
                            .setInterpolator(android.view.animation.DecelerateInterpolator())
                            .setDuration(200)
                            .withEndAction {
                                // Phase 3: Slide Release / Cocking Recoil Snap
                                vibrationManager.vibrateShot(50L)
                                weaponImageView.animate()
                                    .translationY(0f)
                                    .translationX(0f)
                                    .rotation(0f)
                                    .scaleX(1.0f)
                                    .scaleY(1.0f)
                                    .setInterpolator(android.view.animation.OvershootInterpolator(2.2f))
                                    .setDuration(240)
                                    .withEndAction {
                                        isReloading = false
                                    }.start()
                            }.start()
                    }.start()
            }
        }
    }

    private fun updateAmmoDisplay() {
        if (isUnlimitedAmmo) {
            ammoCounterText.visibility = View.INVISIBLE
            ammoSeparatorText.visibility = View.INVISIBLE
            ammoAllText.visibility = View.INVISIBLE
            ammoUnlimitedText.visibility = View.VISIBLE
            binding.groupReloadBullets.visibility = View.GONE
        } else {
            ammoCounterText.visibility = View.VISIBLE
            ammoSeparatorText.visibility = View.VISIBLE
            ammoAllText.visibility = View.VISIBLE
            ammoUnlimitedText.visibility = View.INVISIBLE

            ammoCounterText.text = weapon.currentAmmo.toString()
            ammoAllText.text = weapon.magazineCapacity.toString()
            if (weapon.currentAmmo == 0) {
                binding.groupReloadBullets.visibility = View.VISIBLE
            }
        }
    }

    private fun toggleImmersive() {
        isImmersive = !isImmersive
        findViewById<View>(R.id.iv_back)?.isVisible = !isImmersive
        findViewById<View>(R.id.iv_setting)?.isVisible = !isImmersive
        findViewById<View>(R.id.iv_shake)?.isVisible = !isImmersive && (weapon.type != WeaponType.TIME_BOMB)
        findViewById<View>(R.id.iv_scene_menu)?.isVisible = !isImmersive
        findViewById<View>(R.id.iv_gun_effect)?.isVisible = !isImmersive && (weapon.type == WeaponType.MECHANICAL_GUN && weapon.id != "flamethrower")
        findViewById<View>(R.id.iv_unlimited_bullet)?.isVisible = !isImmersive
        findViewById<View>(R.id.iv_bullets)?.isVisible = !isImmersive
        findViewById<View>(R.id.tv_bullets_number_in_cartridge_clip)?.isVisible = !isImmersive && !isUnlimitedAmmo
        findViewById<View>(R.id.tv_separator_bullets_number)?.isVisible = !isImmersive && !isUnlimitedAmmo
        findViewById<View>(R.id.tv_bullets_number_all)?.isVisible = !isImmersive && !isUnlimitedAmmo
        findViewById<View>(R.id.tv_unlimited)?.isVisible = !isImmersive && isUnlimitedAmmo
    }

    private fun setupBombMode() {
        findViewById<View>(R.id.iv_bullets)?.visibility = View.GONE
        findViewById<View>(R.id.tv_bullets_number_in_cartridge_clip)?.visibility = View.GONE
        findViewById<View>(R.id.tv_separator_bullets_number)?.visibility = View.GONE
        findViewById<View>(R.id.tv_bullets_number_all)?.visibility = View.GONE
        findViewById<View>(R.id.tv_unlimited)?.visibility = View.GONE
        findViewById<View>(R.id.iv_unlimited_bullet)?.visibility = View.GONE

        if (weapon.bombType == 0) {
            // C4 Keypad Bomb + Bottom Console Confirm Bar
            try {
                val c4View = binding.vbTimeBombC4.inflate()
                val c4Binding = LayoutTimeBombC4Binding.bind(c4View)

                val bombConsoleView = binding.vbTimeBomb.inflate()
                val consoleBinding = LayoutTimeBombBinding.bind(bombConsoleView)

                // Hide time display on the bottom console since C4 displays it on its own LCD screen
                consoleBinding.bgTime.visibility = View.INVISIBLE
                consoleBinding.tvTimer.visibility = View.INVISIBLE

                bombSeconds = 5
                c4Binding.tvTimer.text = String.format("%02d:%02d", bombSeconds / 60, bombSeconds % 60)

                var inputAccumulator = 5

                val numberButtons = listOf(
                    c4Binding.tvNumber1 to 1,
                    c4Binding.tvNumber2 to 2,
                    c4Binding.tvNumber3 to 3,
                    c4Binding.tvNumber4 to 4,
                    c4Binding.tvNumber5 to 5,
                    c4Binding.tvNumber6 to 6,
                    c4Binding.tvNumber7 to 7,
                    c4Binding.tvNumber8 to 8,
                    c4Binding.tvNumber9 to 9
                )

                // Number keypad input (allows typing custom times without starting immediately)
                numberButtons.forEach { (tv, digit) ->
                    tv.setOnClickListener {
                        soundManager.playSound("weaponsound/bomb/bomb_btn_c4.ogg")
                        vibrationManager.vibrateShot(30L)
                        if (!isBombActive) {
                            if (inputAccumulator == 5) {
                                inputAccumulator = digit
                            } else {
                                inputAccumulator = (inputAccumulator * 10 + digit) % 3600
                            }
                            bombSeconds = inputAccumulator.coerceAtLeast(1)
                            c4Binding.tvTimer.text = String.format("%02d:%02d", bombSeconds / 60, bombSeconds % 60)
                        }
                    }
                }

                // Console adjustment buttons
                consoleBinding.ivAddOneSecond.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    if (!isBombActive) {
                        bombSeconds = (bombSeconds + 1).coerceAtMost(3599)
                        inputAccumulator = bombSeconds
                        c4Binding.tvTimer.text = String.format("%02d:%02d", bombSeconds / 60, bombSeconds % 60)
                    }
                }

                consoleBinding.ivMinusOneSecond.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    if (!isBombActive && bombSeconds > 1) {
                        bombSeconds = (bombSeconds - 1).coerceAtLeast(1)
                        inputAccumulator = bombSeconds
                        c4Binding.tvTimer.text = String.format("%02d:%02d", bombSeconds / 60, bombSeconds % 60)
                    }
                }

                consoleBinding.ivAddOneMin.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    if (!isBombActive) {
                        bombSeconds = (bombSeconds + 60).coerceAtMost(3599)
                        inputAccumulator = bombSeconds
                        c4Binding.tvTimer.text = String.format("%02d:%02d", bombSeconds / 60, bombSeconds % 60)
                    }
                }

                consoleBinding.ivMinusOneMin.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    if (!isBombActive && bombSeconds > 60) {
                        bombSeconds = (bombSeconds - 60).coerceAtLeast(1)
                        inputAccumulator = bombSeconds
                        c4Binding.tvTimer.text = String.format("%02d:%02d", bombSeconds / 60, bombSeconds % 60)
                    }
                }

                consoleBinding.ivBgRefresh.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    bombTimer?.cancel()
                    isBombActive = false
                    bombSeconds = 5
                    inputAccumulator = 5
                    c4Binding.tvTimer.text = String.format("%02d:%02d", bombSeconds / 60, bombSeconds % 60)
                }

                // Confirm / Start Button at the bottom to trigger countdown
                consoleBinding.ivBgStart.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_btn.ogg")
                    if (!isBombActive) {
                        startBombCountdown(bombSeconds) { remaining ->
                            c4Binding.tvTimer.text = String.format("%02d:%02d", remaining / 60, remaining % 60)
                        }
                    }
                }
            } catch (e: Exception) {
                setupGenericBombTouch()
            }
        } else {
            // Normal Time Bomb console
            try {
                val bombView = binding.vbTimeBomb.inflate()
                val bombBinding = LayoutTimeBombBinding.bind(bombView)
                bombSeconds = 5
                updateNormalBombTimerText(bombBinding.tvTimer)

                bombBinding.ivMinusOneSecond.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    if (bombSeconds > 1 && !isBombActive) {
                        bombSeconds--
                        updateNormalBombTimerText(bombBinding.tvTimer)
                    }
                }

                bombBinding.ivAddOneSecond.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    if (!isBombActive) {
                        bombSeconds++
                        updateNormalBombTimerText(bombBinding.tvTimer)
                    }
                }

                bombBinding.ivMinusOneMin.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    if (bombSeconds > 60 && !isBombActive) {
                        bombSeconds -= 60
                        updateNormalBombTimerText(bombBinding.tvTimer)
                    }
                }

                bombBinding.ivAddOneMin.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    if (!isBombActive) {
                        bombSeconds += 60
                        updateNormalBombTimerText(bombBinding.tvTimer)
                    }
                }

                bombBinding.ivBgRefresh.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_virtual_btn.ogg")
                    bombTimer?.cancel()
                    isBombActive = false
                    bombSeconds = 5
                    updateNormalBombTimerText(bombBinding.tvTimer)
                }

                bombBinding.ivBgStart.setOnClickListener {
                    soundManager.playSound("weaponsound/bomb/bomb_btn.ogg")
                    if (!isBombActive) {
                        startBombCountdown(bombSeconds) { remaining ->
                            bombSeconds = remaining
                            updateNormalBombTimerText(bombBinding.tvTimer)
                        }
                    }
                }
            } catch (e: Exception) {
                setupGenericBombTouch()
            }
        }
    }

    private fun updateNormalBombTimerText(tv: TextView) {
        val min = bombSeconds / 60
        val sec = bombSeconds % 60
        tv.text = String.format("00:%02d:%02d", min, sec)
    }

    private fun setupGenericBombTouch() {
        weaponImageView.setOnClickListener {
            if (!isBombActive) {
                startBombCountdown(5) {}
            }
        }
    }

    private fun startBombCountdown(seconds: Int, onTickUpdate: (Int) -> Unit) {
        isBombActive = true
        var current = seconds

        bombTimer?.cancel()
        bombTimer = object : CountDownTimer(seconds * 1000L, 1000L) {
            override fun onTick(millisUntilFinished: Long) {
                current--
                onTickUpdate(current.coerceAtLeast(0))
                soundManager.playSound("weaponsound/bomb/bomb_byoyomi.MP3")
                flashManager.flashOnce(40L)
                vibrationManager.vibrateShot(40L)
            }

            override fun onFinish() {
                onTickUpdate(0)
                detonateBomb()
            }
        }.start()
    }

    private fun detonateBomb() {
        isBombActive = false
        soundManager.playSound(weapon.shootSoundPath)
        vibrationManager.vibrateHeavyExplosion()
        flashManager.flashStrobe(5, 50L)

        // Screen crack prank effect
        binding.ivBoom.setImageResource(R.drawable.bomb_break)
        binding.ivBoom.visibility = View.VISIBLE
        soundManager.playSound("weaponsound/bomb/broken_screen.ogg")

        mainHandler.postDelayed({
            binding.ivBoom.visibility = View.GONE
        }, 3500L)
    }
}
