package com.example.gunsound.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import com.example.gunsound.R

class RadiusImageView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    private var radiusLT = 0
    private var radiusRT = 0
    private var radiusLB = 0
    private var radiusRB = 0
    private var cornerRadius = 0
    private val clipPath = Path()

    init {
        if (attrs != null) {
            val a = context.obtainStyledAttributes(attrs, R.styleable.RadiusImageView)
            cornerRadius = a.getDimensionPixelSize(R.styleable.RadiusImageView_radius, 0)
            radiusLT = a.getDimensionPixelSize(R.styleable.RadiusImageView_radiusLeftTop, 0)
            radiusRT = a.getDimensionPixelSize(R.styleable.RadiusImageView_radiusRightTop, 0)
            radiusLB = a.getDimensionPixelSize(R.styleable.RadiusImageView_radiusLeftBottom, 0)
            radiusRB = a.getDimensionPixelSize(R.styleable.RadiusImageView_radiusRightBottom, 0)
            a.recycle()
        }
    }

    private fun updatePath() {
        clipPath.reset()
        val w = width.toFloat()
        val h = height.toFloat()
        if (w <= 0 || h <= 0) return

        val maxR = (Math.min(w, h) / 2f).toInt()
        val lt = (if (radiusLT > 0) radiusLT else cornerRadius).coerceAtMost(maxR).toFloat()
        val rt = (if (radiusRT > 0) radiusRT else cornerRadius).coerceAtMost(maxR).toFloat()
        val rb = (if (radiusRB > 0) radiusRB else cornerRadius).coerceAtMost(maxR).toFloat()
        val lb = (if (radiusLB > 0) radiusLB else cornerRadius).coerceAtMost(maxR).toFloat()

        clipPath.moveTo(0f, lt)
        clipPath.arcTo(RectF(0f, 0f, lt * 2, lt * 2), -180f, 90f)
        clipPath.arcTo(RectF(w - rt * 2, 0f, w, rt * 2), -90f, 90f)
        clipPath.arcTo(RectF(w - rb * 2, h - rb * 2, w, h), 0f, 90f)
        clipPath.arcTo(RectF(0f, h - lb * 2, lb * 2, h), 90f, 90f)
        clipPath.close()
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        updatePath()
    }

    override fun onDraw(canvas: Canvas) {
        if (!clipPath.isEmpty) {
            canvas.save()
            canvas.clipPath(clipPath)
            super.onDraw(canvas)
            canvas.restore()
        } else {
            super.onDraw(canvas)
        }
    }
}
