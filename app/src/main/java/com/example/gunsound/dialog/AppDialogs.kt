package com.example.gunsound.dialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.Window
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gunsound.R
import com.example.gunsound.databinding.*
import com.example.gunsound.model.SceneBackground
import com.example.gunsound.model.ShootEffect
import com.example.gunsound.repository.WeaponRepository
import com.example.gunsound.utils.AppPreferences
import com.example.gunsound.utils.SoundManager

object AppDialogs {

    fun showSceneChangeDialog(
        context: Context,
        onSceneSelected: (SceneBackground) -> Unit
    ) {
        val dialog = Dialog(context, R.style.myDialog)
        val binding = DialogChangeSceneBackgroundBinding.inflate(LayoutInflater.from(context))
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(binding.root)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val prefs = AppPreferences.get(context)
        var selectedIndex = prefs.currentBackgroundIndex

        val scenes = WeaponRepository.sceneBackgrounds
        binding.rvSceneChoose.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        class SceneAdapter : RecyclerView.Adapter<SceneAdapter.ViewHolder>() {
            inner class ViewHolder(val itemBinding: ItemRvSceneBackgroundBinding) :
                RecyclerView.ViewHolder(itemBinding.root)

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val b = ItemRvSceneBackgroundBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                return ViewHolder(b)
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val scene = scenes[position]
                holder.itemBinding.ivScene.setImageResource(scene.previewDrawableRes)
                holder.itemBinding.groupSelected.visibility =
                    if (position == selectedIndex) android.view.View.VISIBLE else android.view.View.GONE

                holder.itemBinding.root.setOnClickListener {
                    SoundManager.get(context).playButtonClick()
                    selectedIndex = position
                    notifyDataSetChanged()
                    prefs.currentBackgroundIndex = selectedIndex
                    onSceneSelected(scenes[selectedIndex])
                    dialog.dismiss()
                }
            }

            override fun getItemCount(): Int = scenes.size
        }

        binding.rvSceneChoose.adapter = SceneAdapter()

        binding.ivCloseDialog.setOnClickListener {
            SoundManager.get(context).playButtonClick()
            dialog.dismiss()
        }

        dialog.show()
    }

    fun showShootEffectDialog(
        context: Context,
        onEffectSelected: (ShootEffect) -> Unit
    ) {
        val dialog = Dialog(context, R.style.myDialog)
        val binding = DialogChangeShootEffectBinding.inflate(LayoutInflater.from(context))
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(binding.root)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val prefs = AppPreferences.get(context)
        var selectedIndex = prefs.currentFiringEffectIndex
        val effects = WeaponRepository.shootEffects

        binding.rvEffectChoose.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        class EffectAdapter : RecyclerView.Adapter<EffectAdapter.ViewHolder>() {
            inner class ViewHolder(val itemBinding: ItemRvEffectLayoutBinding) :
                RecyclerView.ViewHolder(itemBinding.root)

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val b = ItemRvEffectLayoutBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                return ViewHolder(b)
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val effect = effects[position]
                holder.itemBinding.ivEffect.setImageResource(effect.previewDrawableRes)
                holder.itemBinding.tvEffect.setText(effect.nameResId)
                holder.itemBinding.groupSelected.visibility =
                    if (position == selectedIndex) android.view.View.VISIBLE else android.view.View.GONE

                holder.itemBinding.root.setOnClickListener {
                    SoundManager.get(context).playButtonClick()
                    selectedIndex = position
                    notifyDataSetChanged()
                    prefs.currentFiringEffectIndex = selectedIndex
                    onEffectSelected(effects[selectedIndex])
                    dialog.dismiss()
                }
            }

            override fun getItemCount(): Int = effects.size
        }

        binding.rvEffectChoose.adapter = EffectAdapter()

        binding.ivCloseDialog.setOnClickListener {
            SoundManager.get(context).playButtonClick()
            dialog.dismiss()
        }

        dialog.show()
    }

    fun showLightSaberEffectDialog(
        context: Context,
        onEffectSelected: (ShootEffect) -> Unit
    ) {
        val dialog = Dialog(context, R.style.myDialog)
        val binding = DialogChangeLightSaberEffectBinding.inflate(LayoutInflater.from(context))
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(binding.root)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val prefs = AppPreferences.get(context)
        var selectedIndex = prefs.currentFiringEffectIndex.coerceIn(0, WeaponRepository.lightsaberEffects.size - 1)
        val effects = WeaponRepository.lightsaberEffects

        binding.rvEffectChoose.layoutManager =
            androidx.recyclerview.widget.GridLayoutManager(context, 2)

        class SaberEffectAdapter : RecyclerView.Adapter<SaberEffectAdapter.ViewHolder>() {
            inner class ViewHolder(val itemBinding: ItemRvLightSaberEffectLayoutBinding) :
                RecyclerView.ViewHolder(itemBinding.root)

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val b = ItemRvLightSaberEffectLayoutBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                return ViewHolder(b)
            }

            override fun onBindViewHolder(holder: ViewHolder, position: Int) {
                val effect = effects[position]
                holder.itemBinding.ivEffect.setImageResource(effect.previewDrawableRes)
                holder.itemBinding.groupSelected.visibility =
                    if (position == selectedIndex) android.view.View.VISIBLE else android.view.View.GONE

                holder.itemBinding.root.setOnClickListener {
                    SoundManager.get(context).playButtonClick()
                    selectedIndex = position
                    notifyDataSetChanged()
                    prefs.currentFiringEffectIndex = selectedIndex
                    onEffectSelected(effects[selectedIndex])
                    dialog.dismiss()
                }
            }

            override fun getItemCount(): Int = effects.size
        }

        binding.rvEffectChoose.adapter = SaberEffectAdapter()

        binding.ivCloseDialog.setOnClickListener {
            SoundManager.get(context).playButtonClick()
            dialog.dismiss()
        }
        binding.rootBg.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }

    fun showShakeSensitivityDialog(context: Context) {
        val dialog = Dialog(context, R.style.myDialog)
        val binding = DialogShakeSensitivityBinding.inflate(LayoutInflater.from(context))
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(binding.root)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val prefs = AppPreferences.get(context)
        val currentSensitivity = prefs.shakeSensitivity

        binding.ivShakeSensitivitySeekbar.targetTextView = binding.tvMaxSensitivity
        binding.ivShakeSensitivitySeekbar.setProgress(currentSensitivity)
        binding.tvMaxSensitivity.text = currentSensitivity.toString()

        binding.ivShakeSensitivitySeekbar.onProgressChangedListener = { progress ->
            prefs.shakeSensitivity = progress
        }

        binding.ivCloseDialog.setOnClickListener {
            SoundManager.get(context).playButtonClick()
            dialog.dismiss()
        }

        dialog.show()
    }

    fun showRateDialog(context: Context) {
        val dialog = Dialog(context, R.style.myDialog)
        val binding = DialogRateUsBinding.inflate(LayoutInflater.from(context))
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(binding.root)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        var selectedRating = 5
        binding.ratingBar.rating = 5f
        binding.tvRate.isEnabled = true
        binding.ivLogo.setImageResource(R.drawable.pic_five_star)

        binding.ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            selectedRating = rating.toInt().coerceIn(0, 5)
            binding.tvRate.isEnabled = selectedRating > 0
            when (selectedRating) {
                0 -> binding.ivLogo.setImageResource(R.drawable.pic_zero_star)
                1 -> binding.ivLogo.setImageResource(R.drawable.pic_one_star)
                2 -> binding.ivLogo.setImageResource(R.drawable.pic_two_star)
                3 -> binding.ivLogo.setImageResource(R.drawable.pic_three_star)
                4 -> binding.ivLogo.setImageResource(R.drawable.pic_four_star)
                5 -> binding.ivLogo.setImageResource(R.drawable.pic_five_star)
            }
        }

        binding.tvRate.setOnClickListener {
            SoundManager.get(context).playButtonClick()
            if (selectedRating >= 4) {
                try {
                    context.startActivity(android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("market://details?id=${context.packageName}")))
                } catch (e: Exception) {
                    context.startActivity(android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("https://play.google.com/store/apps/details?id=${context.packageName}")))
                }
            }
            dialog.dismiss()
        }

        binding.rootBg.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }
}
