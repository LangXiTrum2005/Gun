package com.example.gunsound.utils

import android.content.Context
import android.content.res.AssetFileDescriptor
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.media.SoundPool
import android.util.Log
import java.io.IOException

class SoundManager private constructor(private val context: Context) {

    private val soundPool: SoundPool
    private val soundMap = mutableMapOf<String, Int>()
    private var loopingPlayer: MediaPlayer? = null
    private var bgmPlayer: MediaPlayer? = null
    private val prefs = AppPreferences.get(context)

    init {
        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_GAME)
            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
            .build()

        soundPool = SoundPool.Builder()
            .setMaxStreams(16)
            .setAudioAttributes(audioAttributes)
            .build()
    }

    fun playSound(assetPath: String, loop: Int = 0, rate: Float = 1.0f): Int {
        if (!prefs.isSoundEnabled) return 0
        val soundId = getOrLoadSound(assetPath) ?: return 0
        return soundPool.play(soundId, 1.0f, 1.0f, 1, loop, rate)
    }

    fun stopSound(streamId: Int) {
        if (streamId != 0) {
            soundPool.stop(streamId)
        }
    }

    fun playButtonClick() {
        if (prefs.isButtonClickSoundEnabled && prefs.isSoundEnabled) {
            playSound("button_sound/btn_click_sound.MP3")
        }
    }

    fun startLoopingSound(assetPath: String) {
        if (!prefs.isSoundEnabled) return
        stopLoopingSound()
        try {
            val afd: AssetFileDescriptor = context.assets.openFd(assetPath)
            loopingPlayer = MediaPlayer().apply {
                setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
                isLooping = true
                prepare()
                start()
            }
            afd.close()
        } catch (e: Exception) {
            Log.e(TAG, "Error starting looping sound: $assetPath", e)
        }
    }

    fun stopLoopingSound() {
        try {
            loopingPlayer?.let {
                if (it.isPlaying) it.stop()
                it.release()
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error stopping looping sound", e)
        } finally {
            loopingPlayer = null
        }
    }

    fun startBgm() {
        if (!prefs.isBgmEnabled) return
        if (bgmPlayer != null && bgmPlayer!!.isPlaying) return
        try {
            val afd: AssetFileDescriptor = context.assets.openFd("bgm/bgm.MP3")
            bgmPlayer = MediaPlayer().apply {
                setDataSource(afd.fileDescriptor, afd.startOffset, afd.length)
                isLooping = true
                setVolume(0.5f, 0.5f)
                prepare()
                start()
            }
            afd.close()
        } catch (e: Exception) {
            Log.e(TAG, "Error starting BGM", e)
        }
    }

    fun stopBgm() {
        try {
            bgmPlayer?.let {
                if (it.isPlaying) it.stop()
                it.release()
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error stopping BGM", e)
        } finally {
            bgmPlayer = null
        }
    }

    private fun getOrLoadSound(assetPath: String): Int? {
        soundMap[assetPath]?.let { return it }
        return try {
            val afd = context.assets.openFd(assetPath)
            val soundId = soundPool.load(afd, 1)
            soundMap[assetPath] = soundId
            afd.close()
            soundId
        } catch (e: IOException) {
            Log.e(TAG, "Failed to load asset sound: $assetPath", e)
            null
        }
    }

    fun release() {
        stopLoopingSound()
        stopBgm()
        soundPool.release()
        soundMap.clear()
    }

    companion object {
        private const val TAG = "SoundManager"

        @Volatile
        private var instance: SoundManager? = null

        fun get(context: Context): SoundManager {
            return instance ?: synchronized(this) {
                instance ?: SoundManager(context.applicationContext).also { instance = it }
            }
        }
    }
}
