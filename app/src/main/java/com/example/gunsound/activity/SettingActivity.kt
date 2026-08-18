package com.example.gunsound.activity

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gunsound.R
import com.example.gunsound.databinding.ActivitySettingBinding
import com.example.gunsound.utils.AppPreferences
import com.example.gunsound.utils.SoundManager

class SettingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingBinding
    private lateinit var prefs: AppPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prefs = AppPreferences.get(this)

        setupSwitches()
        setupClickListeners()
    }

    private fun setupSwitches() {
        // Flash
        binding.switchFlash.isChecked = prefs.isFlashlightEnabled
        binding.switchFlash.setOnCheckedChangeListener { _, isChecked ->
            prefs.isFlashlightEnabled = isChecked
        }

        // Screen Flash / Gun Effect
        binding.switchScreenFlash.isChecked = prefs.isGunEffectEnabled
        binding.switchScreenFlash.setOnCheckedChangeListener { _, isChecked ->
            prefs.isGunEffectEnabled = isChecked
        }

        // Haptic / Vibration
        binding.switchHaptic.isChecked = prefs.isVibrationEnabled
        binding.switchHaptic.setOnCheckedChangeListener { _, isChecked ->
            prefs.isVibrationEnabled = isChecked
        }

        // Firing Sound
        binding.switchFiringSound.isChecked = prefs.isSoundEnabled
        binding.switchFiringSound.setOnCheckedChangeListener { _, isChecked ->
            prefs.isSoundEnabled = isChecked
        }

        // Bullet Drop
        binding.switchBullet.isChecked = prefs.isBulletDropEnabled
        binding.switchBullet.setOnCheckedChangeListener { _, isChecked ->
            prefs.isBulletDropEnabled = isChecked
        }

        // Shake Sound
        binding.switchShakeSound.isChecked = prefs.isSoundEnabled
        binding.switchShakeSound.setOnCheckedChangeListener { _, isChecked ->
            prefs.isSoundEnabled = isChecked
        }

        // Explosion / Broken Screen Effect
        binding.switchExplosion.isChecked = prefs.isBrokenScreenEnabled
        binding.switchExplosion.setOnCheckedChangeListener { _, isChecked ->
            prefs.isBrokenScreenEnabled = isChecked
        }

        // Button Click Sound
        binding.switchClickSound.isChecked = prefs.isButtonClickSoundEnabled
        binding.switchClickSound.setOnCheckedChangeListener { _, isChecked ->
            prefs.isButtonClickSoundEnabled = isChecked
        }

        // BGM
        binding.switchBgm.isChecked = prefs.isBgmEnabled
        binding.switchBgm.setOnCheckedChangeListener { _, isChecked ->
            prefs.isBgmEnabled = isChecked
            if (isChecked) {
                SoundManager.get(this).startBgm()
            } else {
                SoundManager.get(this).stopBgm()
            }
        }
    }

    private fun setupClickListeners() {
        binding.ivBack.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            finish()
        }

        binding.layoutRate.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            try {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName")))
            } catch (e: Exception) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=$packageName")))
            }
        }

        binding.layoutShare.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name))
                putExtra(Intent.EXTRA_TEXT, "Check out Gun Simulator: Real Gun Sounds & Lightsaber Prank!")
            }
            startActivity(Intent.createChooser(shareIntent, getString(R.string.share_app)))
        }

        binding.layoutFeedback.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:feedback@gunsound.example.com")
                putExtra(Intent.EXTRA_SUBJECT, "Gun Simulator Feedback")
            }
            try {
                startActivity(emailIntent)
            } catch (e: Exception) {
                AlertDialog.Builder(this)
                    .setTitle(R.string.feedback)
                    .setMessage(R.string.Thanks_your_feedback)
                    .setPositiveButton(R.string.Done, null)
                    .show()
            }
        }

        binding.layoutPrivacyPolicy.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            AlertDialog.Builder(this)
                .setTitle(R.string.privacy_policy)
                .setMessage("Gun Simulator respects user privacy. We do not collect or share any personal identifiable information.")
                .setPositiveButton(R.string.Done, null)
                .show()
        }
    }
}
