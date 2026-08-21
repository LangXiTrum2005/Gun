package com.example.gunsound.utils

import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import kotlin.math.exp
import kotlin.math.sin

object TinnitusSoundGenerator {
    private var activeTrack: AudioTrack? = null

    fun playTinnitus(durationSec: Float = 3.5f, frequencyHz: Double = 3800.0) {
        stop()
        Thread {
            try {
                val sampleRate = 44100
                val numSamples = (durationSec * sampleRate).toInt()
                val samples = ShortArray(numSamples)

                for (i in 0 until numSamples) {
                    val t = i.toDouble() / sampleRate
                    // Sine wave fundamental tone
                    val rawSin = sin(2.0 * Math.PI * frequencyHz * t)

                    // Envelope: fast 20ms attack, exponential decay
                    val envelope = if (t < 0.02) {
                        t / 0.02
                    } else {
                        exp(-(t - 0.02) * (3.0 / durationSec))
                    }

                    // Add subtle upper harmonic for acoustic realism
                    val harmonic = 0.15 * sin(2.0 * Math.PI * (frequencyHz * 2.0) * t)
                    val value = ((rawSin * 0.85 + harmonic) * envelope * Short.MAX_VALUE * 0.40).toInt()
                    samples[i] = value.coerceIn(Short.MIN_VALUE.toInt(), Short.MAX_VALUE.toInt()).toShort()
                }

                val minBufferSize = AudioTrack.getMinBufferSize(
                    sampleRate,
                    AudioFormat.CHANNEL_OUT_MONO,
                    AudioFormat.ENCODING_PCM_16BIT
                )
                val bufferSize = maxOf(minBufferSize, numSamples * 2)

                val track = AudioTrack.Builder()
                    .setAudioAttributes(
                        AudioAttributes.Builder()
                            .setUsage(AudioAttributes.USAGE_GAME)
                            .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                            .build()
                    )
                    .setAudioFormat(
                        AudioFormat.Builder()
                            .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                            .setSampleRate(sampleRate)
                            .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                            .build()
                    )
                    .setBufferSizeInBytes(bufferSize)
                    .setTransferMode(AudioTrack.MODE_STATIC)
                    .build()

                track.write(samples, 0, numSamples)
                activeTrack = track
                track.play()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }.start()
    }

    fun stop() {
        try {
            activeTrack?.let {
                if (it.playState == AudioTrack.PLAYSTATE_PLAYING) {
                    it.stop()
                }
                it.release()
            }
            activeTrack = null
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
