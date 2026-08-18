package com.example.gunsound.model

import java.io.Serializable

data class Weapon(
    val id: String,
    val nameResId: Int,
    val type: WeaponType,
    val showPicRes: Int,
    val thumbnailRes: Int,
    val magazineCapacity: Int = 30,
    val cartridgeClipCount: Int = 2,
    val fireIntervalMs: Long = 100L,
    val shootSoundPath: String = "",
    val reloadSoundPath: String = "weaponsound/machine/reload_bullets.mp3",
    val emptySoundPath: String = "weaponsound/empty_audio.MP3",
    val spinePath: String = "",
    val isBomb: Boolean = false,
    val bombType: Int = 0, // 0: C4, 1: Dial, 2: Slider, 3: Numpad
    val muzzleXPercent: Float = 0.55f,
    val muzzleYPercent: Float = 0.11f,
    var currentAmmo: Int = magazineCapacity,
    var currentClip: Int = cartridgeClipCount,
    var isUnlocked: Boolean = true
) : Serializable {

    fun resetAmmo() {
        currentAmmo = magazineCapacity
        currentClip = cartridgeClipCount
    }
}
