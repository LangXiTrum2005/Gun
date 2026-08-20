package com.example.gunsound.activity

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gunsound.R
import com.example.gunsound.databinding.ActivityWeaponSortBinding
import com.example.gunsound.databinding.ItemRvGunDisplayBinding
import com.example.gunsound.model.Weapon
import com.example.gunsound.model.WeaponType
import com.example.gunsound.repository.WeaponRepository
import com.example.gunsound.utils.SoundManager

class WeaponSortActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWeaponSortBinding
    private var weaponType: WeaponType = WeaponType.MECHANICAL_GUN

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeaponSortBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val typeStr = intent.getStringExtra("EXTRA_WEAPON_TYPE")
        weaponType = if (typeStr != null) WeaponType.valueOf(typeStr) else WeaponType.MECHANICAL_GUN

        setupUI()
        setupRecyclerView()
    }

    private fun setupUI() {
        binding.ivBack.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            finish()
        }

        binding.ivSetting.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            startActivity(Intent(this, SettingActivity::class.java))
        }

        val category = WeaponRepository.categories.find { it.type == weaponType }
        category?.let {
            binding.tvWeaponSort.setText(it.titleResId)
            binding.ivBg.setImageResource(it.bgDrawableRes)
        }
    }

    private fun setupRecyclerView() {
        val weapons = WeaponRepository.getWeaponsByType(weaponType)
        val category = WeaponRepository.categories.find { it.type == weaponType }
        val cardBgRes = category?.cardBgDrawableRes ?: R.drawable.bg_machine_gun

        binding.rvWeapons.layoutManager = GridLayoutManager(this, 2)

        class WeaponAdapter : RecyclerView.Adapter<WeaponAdapter.ViewHolder>() {
            inner class ViewHolder(val itemBinding: ItemRvGunDisplayBinding) :
                RecyclerView.ViewHolder(itemBinding.root)

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val b = ItemRvGunDisplayBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                return ViewHolder(b)
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val weapon = weapons[position]
                holder.itemBinding.ivGunDisplayBg.setImageResource(cardBgRes)
                holder.itemBinding.ivGun.setImageResource(weapon.thumbnailRes)
                holder.itemBinding.tvMachineGunName.setText(weapon.nameResId)

                if (weapon.isBomb || weapon.type == WeaponType.TIME_BOMB) {
                    holder.itemBinding.ivLabelBullet.visibility = android.view.View.GONE
                    holder.itemBinding.tvBulletsNumber.visibility = android.view.View.GONE
                } else {
                    holder.itemBinding.ivLabelBullet.visibility = android.view.View.VISIBLE
                    holder.itemBinding.tvBulletsNumber.visibility = android.view.View.VISIBLE
                    holder.itemBinding.tvBulletsNumber.text = weapon.magazineCapacity.toString()
                }

                holder.itemBinding.root.setOnClickListener {
                    SoundManager.get(this@WeaponSortActivity).playButtonClick()
                    val intent = Intent(this@WeaponSortActivity, WeaponUseActivity::class.java).apply {
                        putExtra("EXTRA_WEAPON", weapon)
                    }
                    startActivity(intent)
                }
            }

            override fun getItemCount(): Int = weapons.size
        }

        binding.rvWeapons.adapter = WeaponAdapter()
    }
}
