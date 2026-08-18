package com.example.gunsound.views

import android.content.Context
import android.graphics.*
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import com.example.gunsound.R

class ColorSeekBarVertical @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val colors = intArrayOf(
        Color.parseColor("#FFFFFF"),
        Color.parseColor("#FF0000"),
        Color.parseColor("#FF6B00"),
        Color.parseColor("#FFE500"),
        Color.parseColor("#00FFA3"),
        Color.parseColor("#00ECFF"),
        Color.parseColor("#0075FF"),
        Color.parseColor("#EC00D4")
    )

    private val barRect = RectF()
    private val barPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val thumbPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val thumbStrokePaint = Paint(Paint.ANTI_ALIAS_FLAG)

    private var barWidth = 24f
    private var cornerRadius = 38f
    private var thumbRadius = 14f
    private var thumbY = 0f
    private var currentColor = Color.WHITE

    var onColorChangeListener: ((color: Int) -> Unit)? = null

    init {
        if (attrs != null) {
            val a = context.obtainStyledAttributes(attrs, R.styleable.ColorSeekBarVertical)
            barWidth = a.getDimension(R.styleable.ColorSeekBarVertical_barWidth, 24f)
            cornerRadius = a.getDimension(R.styleable.ColorSeekBarVertical_cornerRadius, 38f)
            thumbRadius = a.getDimension(R.styleable.ColorSeekBarVertical_thumbBorder, 14f)
            a.recycle()
        }
        thumbStrokePaint.style = Paint.Style.STROKE
        thumbStrokePaint.strokeWidth = 4f
        thumbStrokePaint.color = Color.WHITE
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        val left = (w - barWidth) / 2f
        barRect.set(left, thumbRadius, left + barWidth, h - thumbRadius)
        val gradient = LinearGradient(
            barRect.centerX(), barRect.top,
            barRect.centerX(), barRect.bottom,
            colors, null, Shader.TileMode.CLAMP
        )
        barPaint.shader = gradient
        if (thumbY == 0f) {
            thumbY = barRect.top
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawRoundRect(barRect, cornerRadius, cornerRadius, barPaint)

        // Draw thumb
        val cx = barRect.centerX()
        thumbPaint.color = currentColor
        canvas.drawCircle(cx, thumbY, thumbRadius, thumbPaint)
        canvas.drawCircle(cx, thumbY, thumbRadius, thumbStrokePaint)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE -> {
                thumbY = event.y.coerceIn(barRect.top, barRect.bottom)
                val unit = (thumbY - barRect.top) / barRect.height()
                currentColor = getColorAtFraction(unit)
                onColorChangeListener?.invoke(currentColor)
                invalidate()
                return true
            }
        }
        return super.onTouchEvent(event)
    }

    private fun getColorAtFraction(fraction: Float): Int {
        val f = fraction.coerceIn(0f, 1f)
        val count = colors.size - 1
        val position = f * count
        val index = position.toInt().coerceIn(0, count - 1)
        val remainder = position - index

        val c1 = colors[index]
        val c2 = colors[index + 1]

        val r = (Color.red(c1) + (Color.red(c2) - Color.red(c1)) * remainder).toInt()
        val g = (Color.green(c1) + (Color.green(c2) - Color.green(c1)) * remainder).toInt()
        val b = (Color.blue(c1) + (Color.blue(c2) - Color.blue(c1)) * remainder).toInt()
        return Color.rgb(r, g, b)
    }

    fun setColor(color: Int) {
        currentColor = color
        invalidate()
    }
}
