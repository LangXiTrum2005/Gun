package com.example.gunsound.activity

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gunsound.R
import com.example.gunsound.databinding.ActivityMainBinding
import com.example.gunsound.databinding.ItemRvWeaponSortBinding
import com.example.gunsound.model.WeaponCategory
import com.example.gunsound.model.WeaponType
import com.example.gunsound.repository.WeaponRepository
import com.example.gunsound.utils.SoundManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()

        binding.imgSetting.setOnClickListener {
            SoundManager.get(this).playButtonClick()
            startActivity(Intent(this, SettingActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        SoundManager.get(this).startBgm()
    }

    override fun onPause() {
        super.onPause()
        SoundManager.get(this).stopBgm()
    }

    private fun setupRecyclerView() {
        val categories = WeaponRepository.categories
        binding.rvHomeGun.layoutManager = LinearLayoutManager(this)

        class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {
            inner class ViewHolder(val itemBinding: ItemRvWeaponSortBinding) :
                RecyclerView.ViewHolder(itemBinding.root)

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val b = ItemRvWeaponSortBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                return ViewHolder(b)
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val cat = categories[position]
                holder.itemBinding.imgWeapon.setImageResource(cat.coverDrawableRes)
                holder.itemBinding.tvWeapon.setText(cat.titleResId)

                holder.itemBinding.root.setOnClickListener {
                    SoundManager.get(this@MainActivity).playButtonClick()
                    if (cat.type == WeaponType.RUSSIAN_ROULETTE) {
                        startActivity(Intent(this@MainActivity, RussianRouletteActivity::class.java))
                    } else {
                        val intent = Intent(this@MainActivity, WeaponSortActivity::class.java).apply {
                            putExtra("EXTRA_WEAPON_TYPE", cat.type.name)
                        }
                        startActivity(intent)
                    }
                }
            }

            override fun getItemCount(): Int = categories.size
        }

        binding.rvHomeGun.adapter = CategoryAdapter()
    }
}
