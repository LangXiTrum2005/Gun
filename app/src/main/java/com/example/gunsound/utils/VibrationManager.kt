package com.example.gunsound.utils

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager

class VibrationManager private constructor(private val context: Context) {

    private val vibrator: Vibrator? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val vibratorManager = context.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as? VibratorManager
        vibratorManager?.defaultVibrator
    } else {
        @Suppress("DEPRECATION")
        context.getSystemService(Context.VIBRATOR_SERVICE) as? Vibrator
    }

    private val prefs = AppPreferences.get(context)

    fun vibrateShot(durationMs: Long = 70L) {
        if (!prefs.isVibrationEnabled || vibrator == null || !vibrator.hasVibrator()) return

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(
                VibrationEffect.createOneShot(durationMs, VibrationEffect.DEFAULT_AMPLITUDE)
            )
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(durationMs)
        }
    }

    fun vibrateHeavyExplosion() {
        if (!prefs.isVibrationEnabled || vibrator == null || !vibrator.hasVibrator()) return

        val pattern = longArrayOf(0, 100, 50, 200, 50, 400)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(VibrationEffect.createWaveform(pattern, -1))
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(pattern, -1)
        }
    }

    fun vibrateContinuous(durationMs: Long = 1000L) {
        if (!prefs.isVibrationEnabled || vibrator == null || !vibrator.hasVibrator()) return
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            vibrator.vibrate(VibrationEffect.createOneShot(durationMs, 180))
        } else {
            @Suppress("DEPRECATION")
            vibrator.vibrate(durationMs)
        }
    }

    fun cancel() {
        vibrator?.cancel()
    }

    companion object {
        @Volatile
        private var instance: VibrationManager? = null

        fun get(context: Context): VibrationManager {
            return instance ?: synchronized(this) {
                instance ?: VibrationManager(context.applicationContext).also { instance = it }
            }
        }
    }
}
