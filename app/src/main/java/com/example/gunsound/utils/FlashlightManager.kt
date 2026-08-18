package com.example.gunsound.utils

import android.content.Context
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraManager
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.Log

class FlashlightManager private constructor(private val context: Context) {

    private val cameraManager = context.getSystemService(Context.CAMERA_SERVICE) as? CameraManager
    private var cameraId: String? = null
    private val handler = Handler(Looper.getMainLooper())
    private val prefs = AppPreferences.get(context)
    private var isTorchOn = false

    init {
        try {
            cameraManager?.cameraIdList?.forEach { id ->
                val characteristics = cameraManager.getCameraCharacteristics(id)
                val hasFlash = characteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE) == true
                val facing = characteristics.get(CameraCharacteristics.LENS_FACING)
                if (hasFlash && facing == CameraCharacteristics.LENS_FACING_BACK) {
                    cameraId = id
                    return@forEach
                }
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error discovering camera flashlight", e)
        }
    }

    fun turnOn() {
        if (!prefs.isFlashlightEnabled || cameraId == null) return
        try {
            cameraManager?.setTorchMode(cameraId!!, true)
            isTorchOn = true
        } catch (e: Exception) {
            Log.e(TAG, "Error turning torch ON", e)
        }
    }

    fun turnOff() {
        if (cameraId == null || !isTorchOn) return
        try {
            cameraManager?.setTorchMode(cameraId!!, false)
            isTorchOn = false
        } catch (e: Exception) {
            Log.e(TAG, "Error turning torch OFF", e)
        }
    }

    fun flashOnce(durationMs: Long = 60L) {
        if (!prefs.isFlashlightEnabled) return
        turnOn()
        handler.postDelayed({ turnOff() }, durationMs)
    }

    fun flashStrobe(count: Int = 3, intervalMs: Long = 70L) {
        if (!prefs.isFlashlightEnabled) return
        for (i in 0 until count) {
            handler.postDelayed({ turnOn() }, i * (intervalMs * 2))
            handler.postDelayed({ turnOff() }, i * (intervalMs * 2) + intervalMs)
        }
    }

    fun release() {
        turnOff()
        handler.removeCallbacksAndMessages(null)
    }

    companion object {
        private const val TAG = "FlashlightManager"

        @Volatile
        private var instance: FlashlightManager? = null

        fun get(context: Context): FlashlightManager {
            return instance ?: synchronized(this) {
                instance ?: FlashlightManager(context.applicationContext).also { instance = it }
            }
        }
    }
}
