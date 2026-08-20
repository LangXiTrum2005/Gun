package com.example.gunsound.utils

import android.content.Context
import android.content.SharedPreferences

class AppPreferences(context: Context) {

    private val prefs: SharedPreferences =
        context.getSharedPreferences("gun_simulator_prefs", Context.MODE_PRIVATE)

    var isFlashlightEnabled: Boolean
        get() = prefs.getBoolean(KEY_FLASHLIGHT, true)
        set(value) = prefs.edit().putBoolean(KEY_FLASHLIGHT, value).apply()

    var isVibrationEnabled: Boolean
        get() = prefs.getBoolean(KEY_VIBRATION, true)
        set(value) = prefs.edit().putBoolean(KEY_VIBRATION, value).apply()

    var isSoundEnabled: Boolean
        get() = prefs.getBoolean(KEY_SOUND, true)
        set(value) = prefs.edit().putBoolean(KEY_SOUND, value).apply()

    var isBulletDropEnabled: Boolean
        get() = prefs.getBoolean(KEY_BULLET_DROP, true)
        set(value) = prefs.edit().putBoolean(KEY_BULLET_DROP, value).apply()

    var isBrokenScreenEnabled: Boolean
        get() = prefs.getBoolean(KEY_BROKEN_SCREEN, true)
        set(value) = prefs.edit().putBoolean(KEY_BROKEN_SCREEN, value).apply()

    var isGunEffectEnabled: Boolean
        get() = prefs.getBoolean(KEY_GUN_EFFECT, true)
        set(value) = prefs.edit().putBoolean(KEY_GUN_EFFECT, value).apply()

    var isBgmEnabled: Boolean
        get() = prefs.getBoolean(KEY_BGM, false)
        set(value) = prefs.edit().putBoolean(KEY_BGM, value).apply()

    var isButtonClickSoundEnabled: Boolean
        get() = prefs.getBoolean(KEY_BTN_SOUND, true)
        set(value) = prefs.edit().putBoolean(KEY_BTN_SOUND, value).apply()

    var isShakeSoundEnabled: Boolean
        get() = prefs.getBoolean(KEY_SHAKE_SOUND, true)
        set(value) = prefs.edit().putBoolean(KEY_SHAKE_SOUND, value).apply()

    var shakeSensitivity: Int
        get() = prefs.getInt(KEY_SHAKE_SENSITIVITY, 50)
        set(value) = prefs.edit().putInt(KEY_SHAKE_SENSITIVITY, value).apply()

    var currentBackgroundIndex: Int
        get() = prefs.getInt(KEY_BG_INDEX, 0)
        set(value) = prefs.edit().putInt(KEY_BG_INDEX, value).apply()

    var currentFiringEffectIndex: Int
        get() = prefs.getInt(KEY_EFFECT_INDEX, 0)
        set(value) = prefs.edit().putInt(KEY_EFFECT_INDEX, value).apply()

    companion object {
        private const val KEY_FLASHLIGHT = "key_flashlight"
        private const val KEY_VIBRATION = "key_vibration"
        private const val KEY_SOUND = "key_sound"
        private const val KEY_BULLET_DROP = "key_bullet_drop"
        private const val KEY_BROKEN_SCREEN = "key_broken_screen"
        private const val KEY_GUN_EFFECT = "key_gun_effect"
        private const val KEY_BGM = "key_bgm"
        private const val KEY_BTN_SOUND = "key_btn_sound"
        private const val KEY_SHAKE_SOUND = "key_shake_sound"
        private const val KEY_SHAKE_SENSITIVITY = "key_shake_sensitivity"
        private const val KEY_BG_INDEX = "key_bg_index"
        private const val KEY_EFFECT_INDEX = "key_effect_index"

        @Volatile
        private var instance: AppPreferences? = null

        fun get(context: Context): AppPreferences {
            return instance ?: synchronized(this) {
                instance ?: AppPreferences(context.applicationContext).also { instance = it }
            }
        }
    }
}
