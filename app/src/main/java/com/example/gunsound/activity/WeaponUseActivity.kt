package com.example.gunsound.activity

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.PointF
import android.graphics.PorterDuff
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.view.animation.LinearInterpolator
import android.view.animation.OvershootInterpolator
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
import android.net.Uri
import com.example.gunsound.repository.WeaponRepository
import com.example.gunsound.utils.*
import com.example.gunsound.views.ElectricArcView
import com.example.gunsound.views.FlashbangOverlayView
import kotlin.random.Random

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
    private var wasPaused = false
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
    private lateinit var electricArcView: ElectricArcView
    private lateinit var flashbangOverlayView: FlashbangOverlayView

    // Shotgun pump-action state
    private var shotgunNeedsPump = false
    private var isShotgunPumping = false
    private var shotgunTouchDownY = 0f

    // M84 Flashbang state
    private enum class GrenadeState { IDLE, PIN_PULLED, THROWN, DETONATED }
    private var grenadeState = GrenadeState.IDLE
    private var grenadeFuseTimer: CountDownTimer? = null

    private var taserJitterRunnable: Runnable? = null
    private var isBladeExtended = true
    private var lastTouchX = 0f
    private var lastTouchY = 0f
    private var lightsaberJitterRunnable: Runnable? = null
    private var lightsaberIdleEnergyAnimator: ValueAnimator? = null
    private val startLightsaberHumRunnable = Runnable {
        if (weapon.type == WeaponType.LIGHTSABER && isBladeExtended) {
            soundManager.startLoopingSound("weaponsound/lightsaber/light_saber_circle_default.ogg")
        }
    }
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
            weaponImageView.post { startLightsaberIdleEnergy() }
        }
    }

    override fun onResume() {
        super.onResume()
        shakeDetector?.start()
        updateMuzzleFlashPosition()
        if (wasPaused && weapon.type == WeaponType.LIGHTSABER && isBladeExtended) {
            mainHandler.postDelayed(startLightsaberHumRunnable, 120L)
            weaponImageView.post { startLightsaberIdleEnergy() }
        }
        wasPaused = false
    }

    override fun onPause() {
        super.onPause()
        shakeDetector?.stop()
        stopAutoFire()
        stopFlamethrower()
        stopTaserShock()
        grenadeFuseTimer?.cancel()
        TinnitusSoundGenerator.stop()
        flashManager.turnOff()
        vibrationManager.cancel()
        soundManager.stopLoopingSound()
        mainHandler.removeCallbacks(hideFlashRunnable)
        mainHandler.removeCallbacks(startLightsaberHumRunnable)
        stopLightsaberIdleEnergy()
        wasPaused = true
    }

    override fun onDestroy() {
        super.onDestroy()
        stopTaserShock()
        stopLightsaberTouch()
        stopLightsaberIdleEnergy()
        bombTimer?.cancel()
        grenadeFuseTimer?.cancel()
        TinnitusSoundGenerator.stop()
        flashManager.release()
        mainHandler.removeCallbacks(hideFlashRunnable)
        mainHandler.removeCallbacks(startLightsaberHumRunnable)
    }

    private fun setupViews() {
        weaponImageView = ImageView(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            scaleType = ImageView.ScaleType.FIT_CENTER
            setImageResource(
                if (weapon.id.contains("rpg") && weapon.currentAmmo <= 0 && !isUnlimitedAmmo)
                    R.drawable.rpg_barrel_empty
                else
                    weapon.showPicRes
            )
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

        electricArcView = ElectricArcView(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            visibility = View.GONE
        }
        binding.flSpine.addView(electricArcView)

        flashbangOverlayView = FlashbangOverlayView(this).apply {
            layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        }
        binding.clBg.addView(flashbangOverlayView)

        weaponImageView.addOnLayoutChangeListener { _, _, _, _, _, _, _, _, _ ->
            updateMuzzleFlashPosition()
            if (weapon.type == WeaponType.LIGHTSABER) {
                prepareLightsaberPivot()
            }
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
                gunEffectBtn?.isVisible = true
                shakeBtn?.isVisible = true
                colorPickerBtn?.setOnClickListener {
                    soundManager.playButtonClick()
                    colorPickerCon?.isVisible = !(colorPickerCon.isVisible)
                }
                gunEffectBtn?.setOnClickListener {
                    soundManager.playButtonClick()
                    AppDialogs.showLightSaberEffectDialog(this) { effect ->
                        flashManager.flashOnce(50L)
                        vibrationManager.vibrateShot(60L)
                        soundManager.playSound("weaponsound/lightsaber/light_saber_shoot.ogg")
                        stopLightsaberIdleEnergy()
                        weaponImageView.animate()
                            .scaleX(1.08f)
                            .scaleY(1.08f)
                            .setDuration(120)
                            .withEndAction {
                                weaponImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(120).withEndAction {
                                    startLightsaberIdleEnergy()
                                }.start()
                            }.start()
                    }
                }
                colorSeekBar?.onColorChangeListener = { color ->
                    weaponImageView.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
                }
                resetColorBtn?.setOnClickListener {
                    soundManager.playButtonClick()
                    weaponImageView.clearColorFilter()
                }
            }
            WeaponType.MECHANICAL_GUN -> {
                colorPickerBtn?.isVisible = false
                gunEffectBtn?.isVisible = weapon.id != "flamethrower" && weapon.id != "m84"
                shakeBtn?.isVisible = true
                if (weapon.id == "m84") {
                    grenadeState = GrenadeState.IDLE
                }
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
            if (weapon.type == WeaponType.LIGHTSABER) {
                if (AppPreferences.get(this).isShakeSoundEnabled) {
                    triggerLightsaberSwing()
                }
            } else if (weapon.id == "m84") {
                if (grenadeState == GrenadeState.IDLE) {
                    pullGrenadePin()
                } else if (grenadeState == GrenadeState.PIN_PULLED) {
                    throwGrenade()
                }
            } else if (weapon.id == "xm1014" && shotgunNeedsPump) {
                performShotgunPump()
            } else {
                onWeaponTriggered(fromShake = true)
            }
        }
    }

    private fun handleWeaponTouch(event: MotionEvent): Boolean {
        if (weapon.isBomb) return false

        // Special handling for M84 Flashbang grenade
        if (weapon.id == "m84") {
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    lastTouchX = event.x
                    lastTouchY = event.y
                    if (grenadeState == GrenadeState.IDLE) {
                        pullGrenadePin()
                    }
                    return true
                }
                MotionEvent.ACTION_MOVE -> {
                    if (grenadeState == GrenadeState.PIN_PULLED) {
                        val dy = lastTouchY - event.y
                        if (dy > 50f * resources.displayMetrics.density) {
                            throwGrenade()
                        }
                    }
                    return true
                }
                MotionEvent.ACTION_UP -> {
                    if (grenadeState == GrenadeState.PIN_PULLED) {
                        throwGrenade()
                    }
                    return true
                }
            }
            return true
        }

        // Special handling for Pump-Action Shotgun (M1014)
        if (weapon.id == "xm1014") {
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    shotgunTouchDownY = event.y
                    if (shotgunNeedsPump) {
                        performShotgunPump {
                            if (weapon.currentAmmo > 0 || isUnlimitedAmmo) {
                                onWeaponTriggered(fromShake = false)
                            } else {
                                soundManager.playSound(weapon.emptySoundPath)
                                binding.groupReloadBullets.visibility = View.VISIBLE
                                updateAmmoDisplay()
                            }
                        }
                    } else {
                        onWeaponTriggered(fromShake = false)
                    }
                    return true
                }
                MotionEvent.ACTION_MOVE -> {
                    if (shotgunNeedsPump && !isShotgunPumping) {
                        val dy = event.y - shotgunTouchDownY
                        if (dy > 45f * resources.displayMetrics.density) {
                            performShotgunPump()
                        }
                    }
                    return true
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    shotgunTouchDownY = 0f
                    return true
                }
            }
            return true
        }

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                if (weapon.type == WeaponType.LIGHTSABER) {
                    startLightsaberTouch(event)
                } else if (weapon.type == WeaponType.TASER) {
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
                    handleLightsaberMove(event)
                }
                return true
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                if (weapon.type == WeaponType.LIGHTSABER) {
                    stopLightsaberTouch()
                } else if (weapon.type == WeaponType.TASER) {
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

        // Special handling for Pump-action Shotgun (M1014) firing:
        if (weapon.id == "xm1014") {
            soundManager.playSound(weapon.shootSoundPath)
            flashManager.flashOnce(60L)
            vibrationManager.vibrateShot(90L)

            // Heavy shotgun recoil
            weaponImageView.translationY = 28f
            weaponImageView.animate().translationY(0f).setDuration(80).start()

            // Buckshot muzzle flash
            val prefs = AppPreferences.get(this)
            val effectIndex = prefs.currentFiringEffectIndex
            val effect = WeaponRepository.shootEffects.getOrNull(effectIndex) ?: WeaponRepository.shootEffects.first()
            muzzleFlashImageView.setImageResource(effect.effectDrawableRes)
            muzzleFlashImageView.visibility = View.VISIBLE
            mainHandler.removeCallbacks(hideFlashRunnable)
            mainHandler.postDelayed(hideFlashRunnable, 60L)

            shotgunNeedsPump = true
            return
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

        // Special handling for Taser on tap / shake (hiệu ứng tia điện):
        if (weapon.type == WeaponType.TASER) {
            soundManager.playSound(weapon.shootSoundPath)
            flashManager.flashOnce(220L)
            vibrationManager.vibrateShot(220L)

            val (p1, p2) = getTaserProngCoords()
            if (p1.x > 0f) {
                if (weapon.id == "taser_5") {
                    val targetX = p1.x + (Random.nextFloat() * 30f - 15f) * resources.displayMetrics.density
                    val targetY = p1.y - (140 * resources.displayMetrics.density)
                    electricArcView.startShock(p1.x, p1.y, targetX, targetY, straight = true)
                } else {
                    electricArcView.startShock(p1.x, p1.y, p2.x, p2.y, straight = false)
                }
            }

            weaponImageView.translationX = (Random.nextFloat() * 8f - 4f)
            weaponImageView.translationY = (Random.nextFloat() * 8f - 4f)

            mainHandler.postDelayed({
                electricArcView.stopShock()
                weaponImageView.translationX = 0f
                weaponImageView.translationY = 0f
            }, 250L)
            return
        }

        // Special handling for RPG-7 Rocket Launch:
        if (weapon.id.contains("rpg")) {
            soundManager.playSound("weaponsound/machine/rpg.MP3")
            flashManager.flashOnce(100L)
            vibrationManager.vibrateHeavyExplosion()

            // Recoil launcher downward
            weaponImageView.translationY = 32f
            weaponImageView.animate().translationY(0f).setDuration(120).start()

            // Show empty launcher tube immediately
            weaponImageView.setImageResource(R.drawable.rpg_barrel_empty)

            // Spawn and launch rocket projectile upwards
            spawnAndLaunchRpgRocket()
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
        val recoilAmt = 18f
        weaponImageView.translationY = recoilAmt
        weaponImageView.animate().translationY(0f).setDuration(60).start()

        // 4. Single Straight Muzzle Flash Flare
        if (weapon.type == WeaponType.MECHANICAL_GUN || weapon.type == WeaponType.SCI_FI_GUN) {
            if (weapon.type == WeaponType.SCI_FI_GUN) {
                muzzleFlashImageView.setImageResource(R.drawable.effect_sci_fi_cosmic_laser)
            } else {
                val prefs = AppPreferences.get(this)
                val effectIndex = prefs.currentFiringEffectIndex
                val effect = WeaponRepository.shootEffects.getOrNull(effectIndex) ?: WeaponRepository.shootEffects.first()
                muzzleFlashImageView.setImageResource(effect.effectDrawableRes)
            }
            muzzleFlashImageView.rotation = 0f
            muzzleFlashImageView.scaleX = 1.0f
            muzzleFlashImageView.scaleY = 1.0f
            muzzleFlashImageView.visibility = View.VISIBLE

            mainHandler.removeCallbacks(hideFlashRunnable)
            mainHandler.postDelayed(hideFlashRunnable, 45L)
        }

        // 5. Bullet Drop Effect
        if (weapon.type == WeaponType.MECHANICAL_GUN) {
            spawnBulletDrop()
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

    private fun getTaserProngCoords(): Pair<PointF, PointF> {
        val drawable = weaponImageView.drawable ?: return Pair(PointF(0f, 0f), PointF(0f, 0f))
        val dWidth = drawable.intrinsicWidth.toFloat()
        val dHeight = drawable.intrinsicHeight.toFloat()
        val vWidth = weaponImageView.width.toFloat()
        val vHeight = weaponImageView.height.toFloat()
        if (dWidth <= 0f || dHeight <= 0f || vWidth <= 0f || vHeight <= 0f) {
            return Pair(PointF(0f, 0f), PointF(0f, 0f))
        }
        val scale = minOf(vWidth / dWidth, vHeight / dHeight)
        val renderedWidth = dWidth * scale
        val renderedHeight = dHeight * scale
        val offsetX = (vWidth - renderedWidth) / 2f
        val offsetY = (vHeight - renderedHeight) / 2f

        val (pLeftRel, pRightRel, pYRel) = when (weapon.id) {
            "taser_1" -> Triple(0.3204f, 0.6120f, 0.2607f)
            "taser_2" -> Triple(0.3269f, 0.6722f, 0.2142f)
            "taser_3" -> Triple(0.4602f, 0.6519f, 0.2057f)
            "taser_4" -> Triple(0.3497f, 0.6494f, 0.1476f)
            "taser_5" -> Triple(0.5600f, 0.5600f, 0.1773f) // Ảnh 2: Đầu nòng phóng thẳng
            "taser_6" -> Triple(0.5056f, 0.6648f, 0.1797f)
            "taser_7" -> Triple(0.3778f, 0.7194f, 0.2051f)
            "taser_8" -> Triple(0.4056f, 0.5907f, 0.1446f)
            else -> Triple(0.35f, 0.65f, 0.20f)
        }

        val p1 = PointF(offsetX + renderedWidth * pLeftRel, offsetY + renderedHeight * pYRel)
        val p2 = PointF(offsetX + renderedWidth * pRightRel, offsetY + renderedHeight * pYRel)
        return Pair(p1, p2)
    }

    private fun spawnBulletDrop() {
        if (!AppPreferences.get(this).isBulletDropEnabled) return
        if (weapon.isBomb || weapon.type == WeaponType.LIGHTSABER || weapon.type == WeaponType.TASER) return
        if (weapon.id.contains("flamethrower") || weapon.id.contains("rpg") || weapon.id.contains("m84") || weapon.id == "xm1014") return

        val container = binding.flSpine
        val drawable = weaponImageView.drawable ?: return
        val dWidth = drawable.intrinsicWidth.toFloat()
        val dHeight = drawable.intrinsicHeight.toFloat()
        val vWidth = weaponImageView.width.toFloat()
        val vHeight = weaponImageView.height.toFloat()
        if (dWidth <= 0f || dHeight <= 0f || vWidth <= 0f || vHeight <= 0f) return

        val scale = minOf(vWidth / dWidth, vHeight / dHeight)
        val renderedWidth = dWidth * scale
        val renderedHeight = dHeight * scale
        val offsetX = (vWidth - renderedWidth) / 2f
        val offsetY = (vHeight - renderedHeight) / 2f

        val density = resources.displayMetrics.density
        val startX = offsetX + renderedWidth * 0.48f + (Random.nextFloat() * 16f - 8f) * density
        val startY = offsetY + renderedHeight * 0.44f

        val bullet = ImageView(this).apply {
            setImageResource(R.drawable.machine_bullet)
            layoutParams = FrameLayout.LayoutParams(
                (14 * density).toInt(),
                (34 * density).toInt()
            )
            x = startX
            y = startY
            rotation = Random.nextFloat() * 30f - 15f
        }

        container.addView(bullet)

        val shootUp = (Random.nextFloat() * 70f + 60f) * density
        val travelX = (Random.nextFloat() * 95f + 70f) * (if (Random.nextBoolean()) 1 else -1) * density
        val fallDown = (Random.nextFloat() * 300f + 250f) * density
        val totalRotation = (Random.nextFloat() * 360f + 360f) * (if (travelX > 0) 1 else -1)

        val animator = ValueAnimator.ofFloat(0f, 1f).apply {
            duration = Random.nextLong(480L, 620L)
            interpolator = LinearInterpolator()
            addUpdateListener { va ->
                val t = va.animatedFraction
                val curX = startX + travelX * t
                val curY = startY - shootUp * (4f * t * (1f - t).coerceAtLeast(0f)) + fallDown * (t * t)
                bullet.x = curX
                bullet.y = curY
                bullet.rotation = t * totalRotation
                if (t > 0.60f) {
                    bullet.alpha = ((1f - t) / 0.40f).coerceIn(0f, 1f)
                }
            }
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    container.removeView(bullet)
                }
            })
        }
        animator.start()
    }

    private fun performShotgunPump(afterPump: (() -> Unit)? = null) {
        if (isShotgunPumping) return
        isShotgunPumping = true

        soundManager.playSound("weaponsound/machine/gun_xm1014_reload.ogg")
        vibrationManager.vibrateShot(60L)

        // Slide pump down
        weaponImageView.animate()
            .translationY(40f)
            .setDuration(110L)
            .withEndAction {
                // Eject red shotgun shell
                spawnShotgunShellDrop()

                // Slide pump back up
                weaponImageView.animate()
                    .translationY(0f)
                    .setDuration(120L)
                    .withEndAction {
                        shotgunNeedsPump = false
                        isShotgunPumping = false
                        vibrationManager.vibrateShot(40L)
                        afterPump?.invoke()
                    }
                    .start()
            }
            .start()
    }

    private fun spawnShotgunShellDrop() {
        val container = binding.flSpine
        val drawable = weaponImageView.drawable ?: return
        val dWidth = drawable.intrinsicWidth.toFloat()
        val dHeight = drawable.intrinsicHeight.toFloat()
        val vWidth = weaponImageView.width.toFloat()
        val vHeight = weaponImageView.height.toFloat()
        if (dWidth <= 0f || dHeight <= 0f || vWidth <= 0f || vHeight <= 0f) return

        val scale = minOf(vWidth / dWidth, vHeight / dHeight)
        val renderedWidth = dWidth * scale
        val renderedHeight = dHeight * scale
        val offsetX = (vWidth - renderedWidth) / 2f
        val offsetY = (vHeight - renderedHeight) / 2f

        val density = resources.displayMetrics.density
        val startX = offsetX + renderedWidth * 0.54f
        val startY = offsetY + renderedHeight * 0.40f

        val shell = ImageView(this).apply {
            setImageResource(R.drawable.machine_bullet)
            setColorFilter(Color.parseColor("#E53935"), PorterDuff.Mode.SRC_ATOP) // Red shotgun shell
            layoutParams = FrameLayout.LayoutParams(
                (18 * density).toInt(),
                (38 * density).toInt()
            )
            x = startX
            y = startY
            rotation = 35f
        }

        container.addView(shell)

        val shootUp = (Random.nextFloat() * 85f + 75f) * density
        val travelX = (Random.nextFloat() * 110f + 85f) * density
        val fallDown = (Random.nextFloat() * 320f + 280f) * density
        val totalRotation = (Random.nextFloat() * 540f + 360f)

        ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 580L
            interpolator = LinearInterpolator()
            addUpdateListener { va ->
                val t = va.animatedFraction
                val curX = startX + travelX * t
                val curY = startY - shootUp * (4f * t * (1f - t).coerceAtLeast(0f)) + fallDown * (t * t)
                shell.x = curX
                shell.y = curY
                shell.rotation = 35f + t * totalRotation
                if (t > 0.65f) {
                    shell.alpha = ((1f - t) / 0.35f).coerceIn(0f, 1f)
                }
            }
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    container.removeView(shell)
                }
            })
            start()
        }
    }

    private fun pullGrenadePin() {
        if (grenadeState != GrenadeState.IDLE) return
        grenadeState = GrenadeState.PIN_PULLED

        soundManager.playSound("weaponsound/bomb/bomb_btn.ogg")
        vibrationManager.vibrateShot(60L)

        // Spawn safety ring pin flying off to the left
        spawnGrenadePinFly()

        // 2.5s Fuse countdown timer
        grenadeFuseTimer?.cancel()
        grenadeFuseTimer = object : CountDownTimer(2500L, 50L) {
            override fun onTick(millisUntilFinished: Long) {
                if (millisUntilFinished in 400L..600L) {
                    vibrationManager.vibrateShot(20L)
                }
            }

            override fun onFinish() {
                detonateFlashbang()
            }
        }.start()
    }

    private fun spawnGrenadePinFly() {
        val container = binding.flSpine
        val density = resources.displayMetrics.density
        val ring = ImageView(this).apply {
            setImageResource(R.drawable.color_choose_thumb)
            setColorFilter(Color.parseColor("#B0BEC5"), PorterDuff.Mode.SRC_ATOP)
            layoutParams = FrameLayout.LayoutParams((28 * density).toInt(), (28 * density).toInt())
            x = (weaponImageView.width * 0.44f).coerceAtLeast(60f * density)
            y = (weaponImageView.height * 0.24f).coerceAtLeast(80f * density)
        }
        container.addView(ring)

        val startX = ring.x
        val startY = ring.y
        val travelX = -(Random.nextFloat() * 120f + 90f) * density
        val fallDown = (Random.nextFloat() * 300f + 200f) * density

        ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 450L
            addUpdateListener { va ->
                val t = va.animatedFraction
                ring.x = startX + travelX * t
                ring.y = startY - (60f * density * (4f * t * (1f - t))) + fallDown * (t * t)
                ring.rotation = -720f * t
                if (t > 0.6f) ring.alpha = ((1f - t) / 0.4f).coerceIn(0f, 1f)
            }
            addListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    container.removeView(ring)
                }
            })
            start()
        }
    }

    private fun throwGrenade() {
        if (grenadeState != GrenadeState.PIN_PULLED) return
        grenadeState = GrenadeState.THROWN

        vibrationManager.vibrateShot(50L)

        val flyUp = weaponImageView.height * 0.65f
        weaponImageView.animate()
            .translationY(-flyUp)
            .scaleX(0.18f)
            .scaleY(0.18f)
            .rotation(270f)
            .setDuration(400L)
            .setInterpolator(AccelerateInterpolator(1.6f))
            .withEndAction {
                weaponImageView.visibility = View.INVISIBLE
            }
            .start()
    }

    private fun detonateFlashbang() {
        if (grenadeState == GrenadeState.DETONATED) return
        grenadeState = GrenadeState.DETONATED
        grenadeFuseTimer?.cancel()
        grenadeFuseTimer = null

        weaponImageView.visibility = View.INVISIBLE

        // 1. Flashbang blast sound
        soundManager.playSound("weaponsound/bomb/bomb_m84_shoot.MP3")

        // 2. Multi-pulse strobe camera flash
        flashManager.flashOnce(70L)
        mainHandler.postDelayed({ flashManager.flashOnce(60L) }, 100L)
        mainHandler.postDelayed({ flashManager.flashOnce(60L) }, 180L)

        // 3. Heavy concussion vibration
        vibrationManager.vibrateHeavyExplosion()

        // 4. Whiteout flash screen overlay (3.5s fade)
        flashbangOverlayView.triggerFlashbang(3500L) {
            if (!isUnlimitedAmmo) {
                binding.groupReloadBullets.visibility = View.VISIBLE
            }
        }

        // 5. Authentic Tinnitus Ear Ringing (3.5s sine tone)
        TinnitusSoundGenerator.playTinnitus(3.5f, 3800.0)

        // Ammo decrement
        if (!isUnlimitedAmmo) {
            weapon.currentAmmo = 0
            updateAmmoDisplay()
        }
    }

    private fun spawnAndLaunchRpgRocket() {
        val dWidth = 1080f
        val dHeight = 1653f
        val vWidth = weaponImageView.width.toFloat()
        val vHeight = weaponImageView.height.toFloat()
        if (vWidth <= 0f || vHeight <= 0f) return

        val scale = minOf(vWidth / dWidth, vHeight / dHeight)
        val renderedWidth = dWidth * scale
        val renderedHeight = dHeight * scale
        val offsetX = (vWidth - renderedWidth) / 2f
        val offsetY = (vHeight - renderedHeight) / 2f

        val rocketW = renderedWidth.toInt()
        val rocketH = (renderedHeight * 0.335f).toInt()

        val rocket = ImageView(this).apply {
            setImageResource(R.drawable.rpg_rocket)
            layoutParams = FrameLayout.LayoutParams(rocketW, rocketH)
            x = offsetX
            y = offsetY
        }

        binding.flSpine.addView(rocket)

        val flyDistance = resources.displayMetrics.heightPixels.toFloat() * 1.5f
        rocket.animate()
            .translationY(-flyDistance)
            .setDuration(320L)
            .setInterpolator(android.view.animation.AccelerateInterpolator(2.2f))
            .withEndAction {
                binding.flSpine.removeView(rocket)
            }
            .start()
    }

    private fun startTaserShock() {
        soundManager.startLoopingSound(weapon.shootSoundPath)
        flashManager.turnOn()
        vibrationManager.vibrateContinuous(5000L)

        weaponImageView.post {
            val (p1, p2) = getTaserProngCoords()
            if (p1.x > 0f) {
                if (weapon.id == "taser_5") {
                    val targetX = p1.x + (Random.nextFloat() * 30f - 15f) * resources.displayMetrics.density
                    val targetY = p1.y - (140 * resources.displayMetrics.density)
                    electricArcView.startShock(p1.x, p1.y, targetX, targetY, straight = true)
                } else {
                    electricArcView.startShock(p1.x, p1.y, p2.x, p2.y, straight = false)
                }
            }
        }

        taserJitterRunnable = object : Runnable {
            override fun run() {
                if (::electricArcView.isInitialized && electricArcView.visibility == View.VISIBLE) {
                    weaponImageView.translationX = (Random.nextFloat() * 6f - 3f)
                    weaponImageView.translationY = (Random.nextFloat() * 6f - 3f)
                    mainHandler.postDelayed(this, 30L)
                }
            }
        }
        mainHandler.post(taserJitterRunnable!!)
    }

    private fun stopTaserShock() {
        soundManager.stopLoopingSound()
        flashManager.turnOff()
        vibrationManager.cancel()
        if (::electricArcView.isInitialized) {
            electricArcView.stopShock()
        }
        taserJitterRunnable?.let { mainHandler.removeCallbacks(it) }
        taserJitterRunnable = null
        if (::weaponImageView.isInitialized) {
            weaponImageView.translationX = 0f
            weaponImageView.translationY = 0f
        }
    }

    private fun triggerLightsaberSwing() {
        if (!isBladeExtended) return
        soundManager.playSound("weaponsound/lightsaber/light_saber_shake.ogg")
        vibrationManager.vibrateShot(60L)
        flashManager.flashOnce(40L)
        val tilt = if (Random.nextBoolean()) 8f else -8f
        weaponImageView.animate()
            .rotation(tilt)
            .translationX((Random.nextFloat() * 16f - 8f))
            .setDuration(100)
            .withEndAction {
                weaponImageView.animate()
                    .rotation(0f)
                    .translationX(0f)
                    .setDuration(120)
                    .start()
            }.start()
    }

    private fun startLightsaberTouch(event: MotionEvent) {
        lastTouchX = event.x
        lastTouchY = event.y

        findViewById<View>(R.id.con_color_choose)?.visibility = View.GONE

        if (!isBladeExtended) {
            extendLightsaberBlade()
            return
        }

        soundManager.playSound("weaponsound/lightsaber/light_saber_shake.ogg")
        flashManager.flashOnce(40L)
        vibrationManager.vibrateShot(50L)

        lightsaberJitterRunnable?.let { mainHandler.removeCallbacks(it) }
        lightsaberJitterRunnable = object : Runnable {
            override fun run() {
                if (weapon.type == WeaponType.LIGHTSABER && isBladeExtended) {
                    weaponImageView.translationX = (Random.nextFloat() * 6f - 3f)
                    weaponImageView.translationY = (Random.nextFloat() * 6f - 3f)
                    mainHandler.postDelayed(this, 35L)
                }
            }
        }
        mainHandler.post(lightsaberJitterRunnable!!)
    }

    private fun handleLightsaberMove(event: MotionEvent) {
        if (!isBladeExtended) return
        val dx = event.x - lastTouchX
        val dy = event.y - lastTouchY
        val dist = kotlin.math.sqrt(dx * dx + dy * dy)
        if (dist > 30f) {
            lastTouchX = event.x
            lastTouchY = event.y
            soundManager.playSound("weaponsound/lightsaber/light_saber_shake.ogg")
            vibrationManager.vibrateShot(40L)
            val angle = (dx / 30f).coerceIn(-12f, 12f)
            weaponImageView.animate().rotation(angle).setDuration(80).withEndAction {
                weaponImageView.animate().rotation(0f).setDuration(100).start()
            }.start()
        }
    }

    private fun stopLightsaberTouch() {
        lightsaberJitterRunnable?.let { mainHandler.removeCallbacks(it) }
        lightsaberJitterRunnable = null
        if (::weaponImageView.isInitialized) {
            weaponImageView.translationX = 0f
            weaponImageView.translationY = 0f
            weaponImageView.rotation = 0f
        }
    }

    private fun prepareLightsaberPivot() {
        if (!::weaponImageView.isInitialized) return
        val width = weaponImageView.width.toFloat()
        val height = weaponImageView.height.toFloat()
        if (width <= 0f || height <= 0f) return

        weaponImageView.pivotX = width * 0.5f
        weaponImageView.pivotY = height * 0.82f
    }

    private fun startLightsaberIdleEnergy() {
        if (weapon.type != WeaponType.LIGHTSABER || !isBladeExtended || !::weaponImageView.isInitialized) return
        if (lightsaberIdleEnergyAnimator?.isStarted == true) return

        prepareLightsaberPivot()
        lightsaberIdleEnergyAnimator = ValueAnimator.ofFloat(0f, 1f).apply {
            duration = 920L
            repeatCount = ValueAnimator.INFINITE
            repeatMode = ValueAnimator.REVERSE
            interpolator = LinearInterpolator()
            addUpdateListener { animator ->
                if (weapon.type != WeaponType.LIGHTSABER || !isBladeExtended) {
                    stopLightsaberIdleEnergy()
                    return@addUpdateListener
                }

                val pulse = animator.animatedValue as Float
                val energyScale = 1f + (pulse * 0.018f)
                weaponImageView.scaleX = energyScale
                weaponImageView.scaleY = energyScale
                weaponImageView.alpha = 0.92f + (pulse * 0.08f)
            }
            start()
        }
    }

    private fun stopLightsaberIdleEnergy() {
        lightsaberIdleEnergyAnimator?.cancel()
        lightsaberIdleEnergyAnimator = null
        if (::weaponImageView.isInitialized && isBladeExtended) {
            weaponImageView.scaleX = 1f
            weaponImageView.scaleY = 1f
            weaponImageView.alpha = 1f
        }
    }

    private fun resetLightsaberVisualState() {
        if (!::weaponImageView.isInitialized) return
        mainHandler.removeCallbacks(startLightsaberHumRunnable)
        stopLightsaberIdleEnergy()
        weaponImageView.animate().cancel()
        weaponImageView.rotation = 0f
        weaponImageView.translationX = 0f
        weaponImageView.translationY = 0f
        prepareLightsaberPivot()
    }

    private fun pulseLightsaberIgnitionFlash() {
        flashManager.flashOnce(45L)
        mainHandler.postDelayed({ flashManager.flashOnce(35L) }, 150L)
        mainHandler.postDelayed({ vibrationManager.vibrateShot(35L) }, 170L)
    }

    private fun retractLightsaberBlade() {
        stopLightsaberTouch()
        resetLightsaberVisualState()
        isBladeExtended = false
        soundManager.playSound("weaponsound/lightsaber/light_saber_return.ogg")
        soundManager.stopLoopingSound()
        vibrationManager.vibrateShot(50L)
        weaponImageView.animate()
            .scaleX(0.42f)
            .scaleY(0.04f)
            .alpha(0.22f)
            .setDuration(260)
            .setInterpolator(android.view.animation.AccelerateInterpolator())
            .withEndAction {
                weaponImageView.scaleX = 0.42f
                weaponImageView.scaleY = 0.04f
                weaponImageView.alpha = 0.22f
                isReloading = false
            }
            .start()
    }

    private fun extendLightsaberBlade() {
        resetLightsaberVisualState()
        isBladeExtended = true
        soundManager.playSound("weaponsound/lightsaber/light_saber_shoot.ogg")
        mainHandler.postDelayed(startLightsaberHumRunnable, 180L)
        pulseLightsaberIgnitionFlash()
        vibrationManager.vibrateShot(80L)
        weaponImageView.scaleX = 0.48f
        weaponImageView.scaleY = 0.05f
        weaponImageView.alpha = 0.28f
        weaponImageView.animate()
            .scaleX(1.0f)
            .scaleY(1.0f)
            .alpha(1.0f)
            .setDuration(340)
            .setInterpolator(android.view.animation.OvershootInterpolator(1.18f))
            .withEndAction {
                weaponImageView.scaleX = 1.0f
                weaponImageView.scaleY = 1.0f
                weaponImageView.alpha = 1.0f
                isReloading = false
                startLightsaberIdleEnergy()
            }
            .start()
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
                refillAmmoAction()
                if (isBladeExtended) {
                    retractLightsaberBlade()
                } else {
                    extendLightsaberBlade()
                }
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
                if (weapon.id == "m84") {
                    grenadeFuseTimer?.cancel()
                    grenadeFuseTimer = null
                    TinnitusSoundGenerator.stop()
                    flashbangOverlayView.reset()

                    // Fresh M84 grenade slides in from top
                    weaponImageView.translationY = -400f
                    weaponImageView.translationX = 0f
                    weaponImageView.scaleX = 1f
                    weaponImageView.scaleY = 1f
                    weaponImageView.rotation = 0f
                    weaponImageView.visibility = View.VISIBLE
                    weaponImageView.setImageResource(R.drawable.gun_machine_m84)

                    soundManager.playSound("weaponsound/machine/reload_bullets.mp3")
                    vibrationManager.vibrateShot(50L)

                    weaponImageView.animate()
                        .translationY(0f)
                        .setDuration(350L)
                        .setInterpolator(OvershootInterpolator(1.4f))
                        .withEndAction {
                            grenadeState = GrenadeState.IDLE
                            refillAmmoAction()
                            isReloading = false
                        }
                        .start()
                    return
                }

                if (weapon.id == "xm1014") {
                    shotgunNeedsPump = false
                    isShotgunPumping = false
                }

                if (weapon.id.contains("rpg")) {
                    // RPG-7 Rocket Reload Animation: Rocket slides from above down into the tube
                    val dWidth = 1080f
                    val dHeight = 1653f
                    val vWidth = weaponImageView.width.toFloat()
                    val vHeight = weaponImageView.height.toFloat()
                    val scale = if (vWidth > 0f && vHeight > 0f) minOf(vWidth / dWidth, vHeight / dHeight) else 1f
                    val renderedWidth = dWidth * scale
                    val renderedHeight = dHeight * scale
                    val offsetX = (vWidth - renderedWidth) / 2f
                    val offsetY = (vHeight - renderedHeight) / 2f

                    val rocketW = renderedWidth.toInt()
                    val rocketH = (renderedHeight * 0.335f).toInt()

                    val rocket = ImageView(this).apply {
                        setImageResource(R.drawable.rpg_rocket)
                        layoutParams = FrameLayout.LayoutParams(rocketW, rocketH)
                        x = offsetX
                        y = offsetY - (420 * resources.displayMetrics.density)
                        alpha = 0f
                    }

                    binding.flSpine.addView(rocket)
                    soundManager.playSound("weaponsound/machine/reload_bullets.mp3")

                    rocket.animate()
                        .translationY(offsetY)
                        .alpha(1.0f)
                        .setDuration(560L)
                        .setInterpolator(android.view.animation.DecelerateInterpolator(1.5f))
                        .withEndAction {
                            vibrationManager.vibrateShot(60L)
                            weaponImageView.setImageResource(R.drawable.pic_weapon_show_rpg_7)
                            weaponImageView.animate()
                                .translationY(14f)
                                .setDuration(70)
                                .withEndAction {
                                    weaponImageView.animate().translationY(0f).setDuration(90).start()
                                }.start()
                            binding.flSpine.removeView(rocket)
                            refillAmmoAction()
                            isReloading = false
                        }.start()
                    return
                }

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

    private val dismissExplosionRunnable = Runnable {
        dismissExplosion()
    }

    private fun detonateBomb() {
        isBombActive = false
        soundManager.playSound(weapon.shootSoundPath)
        vibrationManager.vibrateHeavyExplosion()
        flashManager.flashStrobe(8, 40L)

        // Select explosion fire video matching bomb type or conventional explosion
        val explosionVideoRes = when (weapon.id) {
            "bomb_nuclear" -> R.raw.bomb_effect_nuclear
            "bomb_frostbite" -> R.raw.bomb_effect_frostbite
            "bomb_gas" -> R.raw.bomb_effect_gas
            "bomb_skibidi" -> R.raw.bomb_effect_skibidi
            "bomb_stone" -> R.raw.bomb_effect_stone_age
            else -> R.raw.conventional_explosion
        }

        try {
            val uri = Uri.parse("android.resource://$packageName/$explosionVideoRes")
            binding.videoView.setVideoURI(uri)
            binding.videoView.bringToFront()
            binding.videoView.visibility = View.VISIBLE
            binding.videoView.setOnPreparedListener { mp ->
                mp.isLooping = false
                binding.videoView.start()
            }
            binding.videoView.setOnCompletionListener {
                dismissExplosion()
            }
        } catch (e: Exception) {
            dismissExplosion()
        }

        // Full screen fire engulfs for ~2 seconds then returns back to screen
        mainHandler.removeCallbacks(dismissExplosionRunnable)
        mainHandler.postDelayed(dismissExplosionRunnable, 2000L)
    }

    private fun dismissExplosion() {
        mainHandler.removeCallbacks(dismissExplosionRunnable)
        try {
            if (binding.videoView.isPlaying) {
                binding.videoView.stopPlayback()
            }
        } catch (e: Exception) {}
        binding.videoView.visibility = View.GONE

        // Reset bomb timer UI back to normal
        bombSeconds = 5
        isBombActive = false
        val tvTimer = findViewById<TextView>(R.id.tv_timer)
        tvTimer?.let { updateNormalBombTimerText(it) }
    }
}
