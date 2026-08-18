package com.example.gunsound.model

import com.example.gunsound.R

enum class WeaponType {
    MECHANICAL_GUN,
    LIGHTSABER,
    TASER,
    TIME_BOMB,
    SCI_FI_GUN,
    RUSSIAN_ROULETTE
}

enum class FireMode {
    SINGLE,
    BURST,
    AUTO,
    SHAKE
}

data class ShootEffect(
    val id: Int,
    val nameResId: Int,
    val previewDrawableRes: Int,
    val effectName: String,
    val effectDrawableRes: Int = R.drawable.effect_standard
)

data class SceneBackground(
    val id: Int,
    val nameResId: Int,
    val previewDrawableRes: Int,
    val bgDrawableRes: Int
)

data class WeaponCategory(
    val id: String,
    val titleResId: Int,
    val type: WeaponType,
    val coverDrawableRes: Int,
    val bgDrawableRes: Int
)
