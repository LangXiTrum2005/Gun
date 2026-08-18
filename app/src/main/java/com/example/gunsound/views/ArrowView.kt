package com.example.gunsound.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.hypot
import kotlin.math.sin

class ArrowView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.parseColor("#FF4444")
        strokeWidth = 5f
        style = Paint.Style.STROKE
    }
    private val path = Path()

    var startX = 0f
    var startY = 0f
    var endX = 0f
    var endY = 0f

    private val circleRadius = 12f
    private val arrowLength = 24f
    private val halfBase = 12f

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (startX == endX && startY == endY) return

        val dx = endX - startX
        val dy = endY - startY
        val angle = atan2(dy, dx)
        val dist = hypot(dx, dy)

        val tipBackX = endX - (dx * arrowLength) / dist
        val tipBackY = endY - (dy * arrowLength) / dist

        // Draw start circle
        paint.style = Paint.Style.FILL
        canvas.drawCircle(startX, startY, circleRadius, paint)

        // Draw line
        paint.style = Paint.Style.STROKE
        canvas.drawLine(startX, startY, tipBackX, tipBackY, paint)

        // Draw arrow head
        val perpAngle = angle + (Math.PI / 2.0).toFloat()
        val cosA = cos(perpAngle)
        val sinA = sin(perpAngle)

        path.reset()
        path.moveTo(endX, endY)
        path.lineTo(tipBackX + halfBase * cosA, tipBackY + halfBase * sinA)
        path.lineTo(tipBackX - halfBase * cosA, tipBackY - halfBase * sinA)
        path.close()

        paint.style = Paint.Style.FILL
        canvas.drawPath(path, paint)
    }

    fun setPoints(x1: Float, y1: Float, x2: Float, y2: Float) {
        startX = x1
        startY = y1
        endX = x2
        endY = y2
        invalidate()
    }
}
