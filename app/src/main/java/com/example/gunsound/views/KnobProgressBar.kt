package com.example.gunsound.views

import android.content.Context
import android.graphics.*
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import com.example.gunsound.R
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin

class KnobProgressBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var progressBg: Drawable? = null
    private var progressFg: Drawable? = null
    private var progressSrc: Drawable? = null
    private var thumb: Drawable? = null

    private var max = 100
    private var min = 0
    private var progress = 0
    private var scaleStart = 25f
    private var scaleEnd = 335f

    private val arcRect = RectF()
    private val arcPaint = Paint(Paint.ANTI_ALIAS_FLAG)

    var onProgressChangeListener: ((progress: Int, fromUser: Boolean) -> Unit)? = null

    init {
        if (attrs != null) {
            val a = context.obtainStyledAttributes(attrs, R.styleable.KnobProgressBar)
            progressBg = a.getDrawable(R.styleable.KnobProgressBar_progressBg)
            progressFg = a.getDrawable(R.styleable.KnobProgressBar_progressFg)
            progressSrc = a.getDrawable(R.styleable.KnobProgressBar_progressSrc)
            thumb = a.getDrawable(R.styleable.KnobProgressBar_thumb)
            max = a.getInt(R.styleable.KnobProgressBar_android_max, 100)
            progress = a.getInt(R.styleable.KnobProgressBar_android_progress, 0)
            scaleStart = a.getFloat(R.styleable.KnobProgressBar_scaleStart, 25f)
            scaleEnd = a.getFloat(R.styleable.KnobProgressBar_scaleEnd, 335f)
            a.recycle()
        }
        arcPaint.style = Paint.Style.STROKE
        arcPaint.strokeWidth = 12f
        arcPaint.color = Color.parseColor("#00E5FF")
        arcPaint.strokeCap = Paint.Cap.ROUND
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        progressBg?.setBounds(0, 0, w, h)
        progressFg?.setBounds(0, 0, w, h)
        progressSrc?.setBounds(0, 0, w, h)
        val pad = 16f
        arcRect.set(pad, pad, w - pad, h - pad)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        progressBg?.draw(canvas)
        progressSrc?.draw(canvas)

        val sweepTotal = scaleEnd - scaleStart
        val fraction = if (max > min) (progress - min).toFloat() / (max - min) else 0f
        val sweepAngle = sweepTotal * fraction.coerceIn(0f, 1f)

        // Draw active arc
        canvas.drawArc(arcRect, scaleStart + 90f, sweepAngle, false, arcPaint)

        progressFg?.draw(canvas)

        // Draw thumb if present
        thumb?.let {
            val angleRad = Math.toRadians((scaleStart + 90f + sweepAngle).toDouble())
            val cx = arcRect.centerX() + (arcRect.width() / 2f) * cos(angleRad).toFloat()
            val cy = arcRect.centerY() + (arcRect.height() / 2f) * sin(angleRad).toFloat()
            val tw = it.intrinsicWidth.coerceAtLeast(20) / 2
            val th = it.intrinsicHeight.coerceAtLeast(20) / 2
            it.setBounds((cx - tw).toInt(), (cy - th).toInt(), (cx + tw).toInt(), (cy + th).toInt())
            it.draw(canvas)
        }
    }

    fun setProgress(value: Int) {
        progress = value.coerceIn(min, max)
        invalidate()
    }

    fun getProgress(): Int = progress

    fun setMax(value: Int) {
        max = value
        invalidate()
    }

    fun getMax(): Int = max
}
