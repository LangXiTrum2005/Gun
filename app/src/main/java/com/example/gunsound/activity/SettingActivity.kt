package com.example.gunsound.activity

import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gunsound.R
import com.example.gunsound.databinding.ActivitySettingBinding
import com.example.gunsound.dialog.AppDialogs
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

        // Set background image
        binding.ivBg.setImageResource(R.drawable.bg_setting)

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
        binding.switchShakeSound.isChecked = prefs.isShakeSoundEnabled
        binding.switchShakeSound.setOnCheckedChangeListener { _, isChecked ->
            prefs.isShakeSoundEnabled = isChecked
        }

        // Explosion Effect
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

        // Rate 5 Stars Dialog
        binding.layoutRate.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            AppDialogs.showRateDialog(this)
        }

        // More of our apps
        binding.layoutMoreApps.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            try {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:BetterLife Technology")))
            } catch (unused: ActivityNotFoundException) {
                try {
                    startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=BetterLife+Technology")))
                } catch (e: Exception) {
                    Toast.makeText(this, R.string.install_google_play, Toast.LENGTH_SHORT).show()
                }
            }
        }

        // Share App
        binding.layoutShare.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            try {
                val shareIntent = Intent(Intent.ACTION_SEND).apply {
                    type = "text/plain"
                    putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name))
                    putExtra(Intent.EXTRA_TEXT, "\n\n\nhttps://play.google.com/store/apps/details?id=$packageName \n\n")
                }
                startActivity(Intent.createChooser(shareIntent, getString(R.string.share_app)))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        // Feedback
        binding.layoutFeedback.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_EMAIL, arrayOf("ALL-Betterlife@hotmail.com"))
                val verName = try {
                    packageManager.getPackageInfo(packageName, 0).versionName
                } catch (e: PackageManager.NameNotFoundException) {
                    ""
                }
                putExtra(Intent.EXTRA_SUBJECT, "Feedback for Gun Simulator, app ver is $verName :")
            }
            try {
                startActivity(emailIntent)
            } catch (unused: Exception) {
                Toast.makeText(this, getString(R.string.cm_no_email), Toast.LENGTH_SHORT).show()
            }
        }

        // Privacy Policy
        binding.layoutPrivacyPolicy.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            try {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://colordrawfun.com/BetterLifeTechnology.html"))
                startActivity(intent)
            } catch (e: Exception) {
                AlertDialog.Builder(this)
                    .setTitle(R.string.privacy_policy)
                    .setMessage("Gun Simulator respects user privacy. We do not collect or share any personal identifiable information.")
                    .setPositiveButton(R.string.Done, null)
                    .show()
            }
        }
    }

    override fun onResume() {
        super.onResume()
        if (prefs.isBgmEnabled) {
            SoundManager.get(this).startBgm()
        }
    }

    override fun onPause() {
        super.onPause()
        SoundManager.get(this).stopBgm()
    }
}
