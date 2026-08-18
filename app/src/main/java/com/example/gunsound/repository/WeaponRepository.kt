package com.example.gunsound.repository

import com.example.gunsound.R
import com.example.gunsound.model.*

object WeaponRepository {

    val categories: List<WeaponCategory> = listOf(
        WeaponCategory(
            id = "cat_mechanical",
            titleResId = R.string.all_weapons,
            type = WeaponType.MECHANICAL_GUN,
            coverDrawableRes = R.drawable.home_machine_gun,
            bgDrawableRes = R.drawable.secondary_page_background_machine_gun
        ),
        WeaponCategory(
            id = "cat_lightsaber",
            titleResId = R.string.lightsaber,
            type = WeaponType.LIGHTSABER,
            coverDrawableRes = R.drawable.home_new_lightsaber,
            bgDrawableRes = R.drawable.secondary_page_background_lightsaber
        ),
        WeaponCategory(
            id = "cat_taser",
            titleResId = R.string.taser,
            type = WeaponType.TASER,
            coverDrawableRes = R.drawable.home_new_taser,
            bgDrawableRes = R.drawable.secondary_page_background_taser
        ),
        WeaponCategory(
            id = "cat_timebomb",
            titleResId = R.string.time_bomb,
            type = WeaponType.TIME_BOMB,
            coverDrawableRes = R.drawable.home_new_timebomb,
            bgDrawableRes = R.drawable.secondary_page_background_timebomb
        ),
        WeaponCategory(
            id = "cat_scifi",
            titleResId = R.string.Sci_Fi_Gun,
            type = WeaponType.SCI_FI_GUN,
            coverDrawableRes = R.drawable.home_sci_fi_gun,
            bgDrawableRes = R.drawable.secondary_page_background_sci_fi_gun
        ),
        WeaponCategory(
            id = "cat_russian_roulette",
            titleResId = R.string.Russian_Roulette,
            type = WeaponType.RUSSIAN_ROULETTE,
            coverDrawableRes = R.drawable.home_russian_roulette,
            bgDrawableRes = R.drawable.home_background
        )
    )

    val sceneBackgrounds: List<SceneBackground> = listOf(
        SceneBackground(0, R.string.Change_Background, R.drawable.bg_thumbnail_scene_machine_gun, R.drawable.bg_scene_machine_gun),
        SceneBackground(1, R.string.Change_Background, R.drawable.bg_thumbnail_scene_light_saber, R.drawable.bg_scene_war),
        SceneBackground(2, R.string.Change_Background, R.drawable.bg_thumbnail_scene_taser, R.drawable.bg_scene_rain),
        SceneBackground(3, R.string.Change_Background, R.drawable.bg_thumbnail_scene_time_bomb, R.drawable.bg_scene_universe),
        SceneBackground(4, R.string.Change_Background, R.drawable.bg_thumbnail_scene_sci_fi_gun, R.drawable.bg_scene_sebo),
        SceneBackground(5, R.string.Change_Background, R.drawable.bg_thumbnail_scene_machine_gun, R.drawable.bg_scene_city_war)
    )

    val shootEffects: List<ShootEffect> = listOf(
        ShootEffect(0, R.string.Standard, R.drawable.shoot_effect_standard, "Standard", R.drawable.effect_standard),
        ShootEffect(1, R.string.Incendiary, R.drawable.shoot_effect_incendiary, "Incendiary", R.drawable.effect_incendiary),
        ShootEffect(2, R.string.Poison, R.drawable.shoot_effect_poison, "Poison", R.drawable.effect_poison),
        ShootEffect(3, R.string.Tracer, R.drawable.shoot_effect_tracer, "Tracer", R.drawable.effect_tracer),
        ShootEffect(4, R.string.Anime, R.drawable.shoot_effect_anime, "Anime", R.drawable.effect_anime),
        ShootEffect(5, R.string.Buckshot, R.drawable.shoot_effect_buckshot, "Buckshot", R.drawable.effect_buckshot)
    )

    val mechanicalGuns: List<Weapon> = listOf(
        Weapon("ak47", R.string.weapon_name_ak47, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_ak47, R.drawable.gun_machine_ak47, 30, 2, 100L, "weaponsound/machine/gun_ak47_shoot.MP3", "weaponsound/machine/gun_ak47_reload.MP3", muzzleXPercent = 0.5519f, muzzleYPercent = 0.1031f),
        Weapon("m4a4", R.string.weapon_name_m4a4, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_m4a4, R.drawable.gun_machine_m4a4, 30, 2, 90L, "weaponsound/machine/gun_m4a4_shoot.MP3", "weaponsound/machine/gun_m4a4_reload.MP3", muzzleXPercent = 0.5556f, muzzleYPercent = 0.1204f),
        Weapon("awp", R.string.weapon_name_awp, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_awp, R.drawable.gun_machine_awp, 10, 3, 600L, "weaponsound/machine/gun_awp_shoot.MP3", "weaponsound/machine/gun_awp_reload.MP3", muzzleXPercent = 0.5185f, muzzleYPercent = 0.1028f),
        Weapon("desert_eagle", R.string.weapon_name_desert_eagle, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_desert_eagle, R.drawable.gun_machine_desert_eagle, 7, 3, 300L, "weaponsound/machine/gun_desert_eagle_shoot.MP3", "weaponsound/machine/gun_desert_eagle_reload.MP3", muzzleXPercent = 0.5907f, muzzleYPercent = 0.2559f),
        Weapon("p90", R.string.weapon_name_p90, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_p90, R.drawable.gun_machine_p90, 50, 2, 80L, "weaponsound/machine/gun_p90_shoot.MP3", "weaponsound/machine/gun_p90_reload.MP3", muzzleXPercent = 0.4769f, muzzleYPercent = 0.1331f),
        Weapon("negev", R.string.weapon_name_negev, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_negev, R.drawable.gun_machine_negev, 100, 1, 75L, "weaponsound/machine/gun_negev_shoot.ogg", muzzleXPercent = 0.5722f, muzzleYPercent = 0.1016f),
        Weapon("ump45", R.string.weapon_name_ump45, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_ump45, R.drawable.gun_machine_ump45, 25, 2, 95L, "weaponsound/machine/gun_ump_shoot.MP3", muzzleXPercent = 0.5583f, muzzleYPercent = 0.1540f),
        Weapon("hk416", R.string.weapon_name_hk416, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_hk416, R.drawable.gun_machine_hk416, 30, 2, 90L, "weaponsound/machine/gun_hk416_shoot.MP3", muzzleXPercent = 0.5417f, muzzleYPercent = 0.1065f),
        Weapon("m762", R.string.weapon_name_m762, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_m762, R.drawable.gun_machine_m762, 30, 2, 95L, "weaponsound/machine/gun_m762_shoot.ogg", muzzleXPercent = 0.5824f, muzzleYPercent = 0.1198f),
        Weapon("kar98k", R.string.weapon_name_kar98k, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_kar98k, R.drawable.gun_machine_kar98k, 5, 4, 700L, "weaponsound/machine/gun_kr98k_shoot.MP3", "weaponsound/machine/gun_kr98k_reload.MP3", muzzleXPercent = 0.5458f, muzzleYPercent = 0.0907f),
        Weapon("colt_python", R.string.weapon_name_colt_python, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_colt_python, R.drawable.gun_machine_colt_python, 6, 4, 320L, "weaponsound/machine/gun_colt_shoot.MP3", muzzleXPercent = 0.6213f, muzzleYPercent = 0.2874f),
        Weapon("usp", R.string.weapon_name_usp, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_usp, R.drawable.gun_machine_usp, 12, 3, 260L, "weaponsound/machine/gun_usp_shoot.MP3", muzzleXPercent = 0.6333f, muzzleYPercent = 0.2904f),
        Weapon("mp5", R.string.weapon_name_mp5, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_mp5_1, R.drawable.gun_machine_mp5, 30, 2, 85L, "weaponsound/machine/gun_mp5_shoot.ogg", "weaponsound/machine/gun_mp5_reload.MP3", muzzleXPercent = 0.5301f, muzzleYPercent = 0.1034f),
        Weapon("scar20", R.string.weapon_name_scar_20s, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_scar_20s, R.drawable.gun_machine_scar_20s, 20, 2, 220L, "weaponsound/machine/gun_scar20_shoot.ogg", "weaponsound/machine/gun_scar20_reload.ogg", muzzleXPercent = 0.4977f, muzzleYPercent = 0.0877f),
        Weapon("xm1014", R.string.weapon_name_m1014, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_m1014_1, R.drawable.gun_machine_m1014, 7, 3, 350L, "weaponsound/machine/gun_xm1014_shoot.ogg", "weaponsound/machine/gun_xm1014_reload.ogg", muzzleXPercent = 0.5541f, muzzleYPercent = 0.0974f),
        Weapon("rpg7", R.string.weapon_name_rpg_7, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_rpg_7, R.drawable.gun_machine_rpg_7, 1, 5, 1200L, "weaponsound/machine/rpg.MP3", muzzleXPercent = 0.5231f, muzzleYPercent = 0.0926f),
        Weapon("flamethrower", R.string.weapon_name_m2_flamethrower, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_m2_flamethrower, R.drawable.gun_machine_m2_flamethrower, 100, 1, 60L, "weaponsound/machine/fire.mp3", muzzleXPercent = 0.6065f, muzzleYPercent = 0.4465f),
        Weapon("ak47_r", R.string.weapon_name_ak47_r, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_ak47_r, R.drawable.gun_machine_ak47_r, 30, 2, 100L, "weaponsound/machine/gun_ak47_shoot.MP3", muzzleXPercent = 0.5583f, muzzleYPercent = 0.1101f),
        Weapon("ak47_y", R.string.weapon_name_ak47_y, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_ak47_y, R.drawable.gun_machine_ak47_y, 30, 2, 100L, "weaponsound/machine/gun_ak47_shoot.MP3", muzzleXPercent = 0.5333f, muzzleYPercent = 0.1143f),
        Weapon("m4a4_p", R.string.weapon_name_m4a4_p, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_m4a4_p, R.drawable.gun_machine_m4a4_p, 30, 2, 90L, "weaponsound/machine/gun_m4a4_shoot.MP3", muzzleXPercent = 0.5380f, muzzleYPercent = 0.1518f),
        Weapon("aug", R.string.weapon_name_aug, WeaponType.MECHANICAL_GUN, R.drawable.pic_weapon_show_aug, R.drawable.gun_machine_aug, 30, 2, 95L, "weaponsound/machine/gun_m4a4_shoot.MP3", muzzleXPercent = 0.5972f, muzzleYPercent = 0.1283f)
    )

    val lightsabers: List<Weapon> = (1..12).map { index ->
        val nameRes = when (index) {
            1 -> R.string.lightsaber_one
            2 -> R.string.lightsaber_two
            3 -> R.string.lightsaber_three
            4 -> R.string.lightsaber_four
            5 -> R.string.lightsaber_five
            6 -> R.string.lightsaber_six
            7 -> R.string.lightsaber_seven
            8 -> R.string.lightsaber_eight
            9 -> R.string.lightsaber_nine
            10 -> R.string.lightsaber_ten
            11 -> R.string.lightsaber_eleven
            else -> R.string.lightsaber_twelve
        }
        val drawableRes = when (index) {
            1 -> R.drawable.gun_lightsaber_one
            2 -> R.drawable.gun_lightsaber_two
            3 -> R.drawable.gun_lightsaber_three
            4 -> R.drawable.gun_lightsaber_four
            5 -> R.drawable.gun_lightsaber_five
            6 -> R.drawable.gun_lightsaber_six
            7 -> R.drawable.gun_lightsaber_seven
            8 -> R.drawable.gun_lightsaber_eight
            9 -> R.drawable.gun_lightsaber_nine
            10 -> R.drawable.gun_lightsaber_ten
            11 -> R.drawable.gun_lightsaber_eleven
            else -> R.drawable.gun_lightsaber_twelve
        }
        Weapon(
            id = "lightsaber_$index",
            nameResId = nameRes,
            type = WeaponType.LIGHTSABER,
            showPicRes = drawableRes,
            thumbnailRes = drawableRes,
            magazineCapacity = 100,
            cartridgeClipCount = 1,
            fireIntervalMs = 200L,
            shootSoundPath = "weaponsound/lightsaber/light_saber_shoot.ogg",
            reloadSoundPath = "weaponsound/lightsaber/light_saber_return.ogg"
        )
    }

    val tasers: List<Weapon> = (1..8).map { index ->
        val nameRes = when (index) {
            1 -> R.string.taser_one
            2 -> R.string.taser_two
            3 -> R.string.taser_three
            4 -> R.string.taser_four
            5 -> R.string.taser_five
            6 -> R.string.taser_six
            7 -> R.string.taser_seven
            else -> R.string.taser_eight
        }
        val drawableRes = when (index) {
            1 -> R.drawable.gun_taser_one
            2 -> R.drawable.gun_taser_two
            3 -> R.drawable.gun_taser_three
            4 -> R.drawable.gun_taser_four
            5 -> R.drawable.gun_taser_five
            6 -> R.drawable.gun_taser_six
            7 -> R.drawable.gun_taser_seven
            else -> R.drawable.gun_taser_eight
        }
        val soundPath = if (index % 2 == 1) "weaponsound/taser/taser gun1.MP3" else "weaponsound/taser/taser gun2.mp3"
        Weapon(
            id = "taser_$index",
            nameResId = nameRes,
            type = WeaponType.TASER,
            showPicRes = drawableRes,
            thumbnailRes = drawableRes,
            magazineCapacity = 100,
            cartridgeClipCount = 1,
            fireIntervalMs = 150L,
            shootSoundPath = soundPath
        )
    }

    val timeBombs: List<Weapon> = listOf(
        Weapon("bomb_c4", R.string.weapon_name_time_bomb_c4, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_c4, R.drawable.gun_science_time_bomb_c4, 1, 0, 1000L, "weaponsound/bomb/boom_1.ogg", isBomb = true, bombType = 0),
        Weapon("bomb_stone", R.string.weapon_name_time_bomb_stone_age, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_stone_age, R.drawable.gun_science_time_bomb_stone_age, 1, 0, 1000L, "weaponsound/bomb/boom_2.ogg", isBomb = true, bombType = 1),
        Weapon("bomb_frostbite", R.string.weapon_name_time_bomb_frostbite, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_frostbite, R.drawable.gun_science_time_bomb_frostbite, 1, 0, 1000L, "weaponsound/bomb/boom_frostbite.ogg", isBomb = true, bombType = 1),
        Weapon("bomb_n", R.string.weapon_name_time_bomb_n, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_n, R.drawable.gun_science_time_bomb_n, 1, 0, 1000L, "weaponsound/bomb/boom_1.ogg", isBomb = true, bombType = 2),
        Weapon("bomb_gas", R.string.weapon_name_time_bomb_gas, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_gas, R.drawable.gun_science_time_bomb_gas, 1, 0, 1000L, "weaponsound/bomb/boom_gas.ogg", isBomb = true, bombType = 1),
        Weapon("bomb_skibidi", R.string.weapon_name_time_bomb_skibidi, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_skibidi, R.drawable.gun_science_time_bomb_skibidi, 1, 0, 1000L, "weaponsound/bomb/boom_skibidi.ogg", isBomb = true, bombType = 1),
        Weapon("bomb_tomahawk", R.string.weapon_name_time_bomb_tomahawk, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_tomahawk, R.drawable.gun_science_time_bomb_tomahawk, 1, 0, 1000L, "weaponsound/bomb/boom_2.ogg", isBomb = true, bombType = 2),
        Weapon("bomb_nuclear", R.string.weapon_name_time_bomb_nuclear, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_nuclear, R.drawable.gun_science_time_bomb_nuclear, 1, 0, 1000L, "weaponsound/bomb/boom_nuclear.ogg", isBomb = true, bombType = 2),
        Weapon("bomb_drone", R.string.weapon_name_time_bomb_drone, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_drone, R.drawable.gun_science_time_bomb_drone, 1, 0, 1000L, "weaponsound/bomb/boom_1.ogg", isBomb = true, bombType = 2),
        Weapon("bomb_s", R.string.weapon_name_time_bomb_s, WeaponType.TIME_BOMB, R.drawable.pic_weapon_show_time_bomb_s, R.drawable.gun_science_time_bomb_s, 1, 0, 1000L, "weaponsound/bomb/boom_2.ogg", isBomb = true, bombType = 3)
    )

    val sciFiGuns: List<Weapon> = listOf(
        Weapon("sci_arc_1", R.string.weapon_name_science_arc, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_science_arc, R.drawable.gun_science_arc, 50, 2, 90L, "weaponsound/sci/arc.MP3", muzzleXPercent = 0.5269f, muzzleYPercent = 0.2902f),
        Weapon("sci_arc_2", R.string.weapon_name_science_arc2, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_arc2, R.drawable.gun_science_arc2, 50, 2, 90L, "weaponsound/sci/arc.MP3", muzzleXPercent = 0.4046f, muzzleYPercent = 0.1210f),
        Weapon("sci_arc_3", R.string.weapon_name_science_arc3, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_arc3, R.drawable.gun_science_arc3, 50, 2, 90L, "weaponsound/sci/arc.MP3", muzzleXPercent = 0.5519f, muzzleYPercent = 0.2861f),
        Weapon("sci_cannon_1", R.string.weapon_name_science_energy_cannon, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_science_energy_cannon, R.drawable.gun_science_energy_cannon, 30, 2, 200L, "weaponsound/sci/energy_cannon.MP3", muzzleXPercent = 0.5167f, muzzleYPercent = 0.1475f),
        Weapon("sci_cannon_2", R.string.weapon_name_science_energy_cannon2, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_ec2, R.drawable.gun_science_ec2, 30, 2, 200L, "weaponsound/sci/energy_cannon.MP3", muzzleXPercent = 0.6059f, muzzleYPercent = 0.1760f),
        Weapon("sci_cannon_3", R.string.weapon_name_science_energy_cannon3, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_ec3, R.drawable.gun_science_ec3, 30, 2, 200L, "weaponsound/sci/energy_cannon.MP3", muzzleXPercent = 0.5819f, muzzleYPercent = 0.1815f),
        Weapon("sci_laser_1", R.string.weapon_name_laser_gun, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_laser_gun, R.drawable.gun_science_laser, 40, 2, 100L, "weaponsound/sci/laser_head.MP3", muzzleXPercent = 0.5306f, muzzleYPercent = 0.1609f),
        Weapon("sci_laser_2", R.string.weapon_name_science_laser_gun2, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_laser2, R.drawable.gun_science_laser2, 40, 2, 100L, "weaponsound/sci/laser_head.MP3", muzzleXPercent = 0.5204f, muzzleYPercent = 0.1603f),
        Weapon("sci_laser_3", R.string.weapon_name_science_laser_gun3, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_laser3, R.drawable.gun_science_laser3, 40, 2, 100L, "weaponsound/sci/laser_head.MP3", muzzleXPercent = 0.5370f, muzzleYPercent = 0.1603f),
        Weapon("sci_auto9", R.string.weapon_name_science_auto9, WeaponType.SCI_FI_GUN, R.drawable.pic_weapon_show_auto9, R.drawable.gun_science_auto9, 40, 2, 100L, "weaponsound/sci/laser_head.MP3", muzzleXPercent = 0.5685f, muzzleYPercent = 0.2849f)
    )

    fun getWeaponsByType(type: WeaponType): List<Weapon> {
        return when (type) {
            WeaponType.MECHANICAL_GUN -> mechanicalGuns
            WeaponType.LIGHTSABER -> lightsabers
            WeaponType.TASER -> tasers
            WeaponType.TIME_BOMB -> timeBombs
            WeaponType.SCI_FI_GUN -> sciFiGuns
            WeaponType.RUSSIAN_ROULETTE -> emptyList()
        }
    }
}
