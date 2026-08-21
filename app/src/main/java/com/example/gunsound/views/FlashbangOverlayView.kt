package com.example.gunsound.views

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RadialGradient
import android.graphics.Shader
import android.util.AttributeSet
import android.view.View
import android.view.animation.DecelerateInterpolator

class FlashbangOverlayView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var flashAlpha = 0f
    private var isFlashing = false

    private val whitePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.WHITE
        style = Paint.Style.FILL
    }

    private val bloomPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
    }

    private var animator: ValueAnimator? = null

    init {
        visibility = GONE
    }

    fun triggerFlashbang(durationMs: Long = 3500L, onComplete: () -> Unit = {}) {
        animator?.cancel()
        isFlashing = true
        visibility = VISIBLE
        flashAlpha = 1.0f
        invalidate()

        animator = ValueAnimator.ofFloat(1.0f, 0.0f).apply {
            duration = durationMs
            interpolator = DecelerateInterpolator(1.8f)
            addUpdateListener { va ->
                flashAlpha = va.animatedValue as Float
                invalidate()
            }
            addListener(object : android.animation.AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: android.animation.Animator) {
                    isFlashing = false
                    visibility = GONE
                    onComplete()
                }
            })
            start()
        }
    }

    fun reset() {
        animator?.cancel()
        animator = null
        isFlashing = false
        flashAlpha = 0f
        visibility = GONE
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (!isFlashing || flashAlpha <= 0f) return

        val w = width.toFloat()
        val h = height.toFloat()
        if (w <= 0f || h <= 0f) return

        // 1. Pure blinding white screen
        whitePaint.alpha = (flashAlpha * 255).toInt().coerceIn(0, 255)
        canvas.drawRect(0f, 0f, w, h, whitePaint)

        // 2. Central blinding bloom flare overlay
        if (flashAlpha > 0.15f) {
            val bloomRadius = maxOf(w, h) * 0.75f
            val bloomAlpha = ((flashAlpha - 0.15f) / 0.85f * 180).toInt().coerceIn(0, 255)
            bloomPaint.shader = RadialGradient(
                w / 2f, h / 2f, bloomRadius,
                Color.argb(bloomAlpha, 255, 255, 255),
                Color.argb(0, 255, 255, 255),
                Shader.TileMode.CLAMP
            )
            canvas.drawRect(0f, 0f, w, h, bloomPaint)
        }
    }
}
