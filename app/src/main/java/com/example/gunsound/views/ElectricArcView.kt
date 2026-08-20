package com.example.gunsound.views

import android.content.Context
import android.graphics.BlurMaskFilter
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.PointF
import android.graphics.RadialGradient
import android.graphics.Shader
import android.util.AttributeSet
import android.view.View
import kotlin.random.Random

class ElectricArcView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var isActive = false
    private var isStraightBeam = false
    private val density = resources.displayMetrics.density

    private val outerGlowPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
        color = Color.parseColor("#8000E5FF")
        strokeWidth = 14f * density
        maskFilter = BlurMaskFilter(10f * density, BlurMaskFilter.Blur.NORMAL)
    }

    private val midArcPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
        color = Color.parseColor("#FF00E5FF")
        strokeWidth = 5.5f * density
    }

    private val coreArcPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeCap = Paint.Cap.ROUND
        strokeJoin = Paint.Join.ROUND
        color = Color.parseColor("#FFFFFFFF")
        strokeWidth = 2.2f * density
    }

    private val coronaPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
    }

    private val sparkPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.parseColor("#FFFFFFFF")
    }

    private var p1X = 0f
    private var p1Y = 0f
    private var p2X = 0f
    private var p2Y = 0f

    private val paths = mutableListOf<Path>()
    private val branchPaths = mutableListOf<Path>()
    private val sparks = mutableListOf<FloatArray>() // [x, y, vx, vy, life, decay, radius]

    fun startShock(x1: Float, y1: Float, x2: Float, y2: Float, straight: Boolean = false) {
        p1X = x1
        p1Y = y1
        p2X = x2
        p2Y = y2
        isStraightBeam = straight
        isActive = true
        visibility = VISIBLE
        invalidate()
    }

    fun updatePoints(x1: Float, y1: Float, x2: Float, y2: Float, straight: Boolean = false) {
        p1X = x1
        p1Y = y1
        p2X = x2
        p2Y = y2
        isStraightBeam = straight
        if (isActive) invalidate()
    }

    fun stopShock() {
        isActive = false
        visibility = GONE
        sparks.clear()
        paths.clear()
        branchPaths.clear()
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (!isActive) return

        paths.clear()
        branchPaths.clear()

        if (isStraightBeam) {
            // Straight electric beam (như Ảnh 2 súng phát ra thẳng từ đầu nòng)
            drawCorona(canvas, p1X, p1Y)

            val numMainArcs = Random.nextInt(3, 6)
            for (i in 0 until numMainArcs) {
                val path = Path()
                generateLightningPath(path, p1X, p1Y, p2X, p2Y, 20f * density, 5)
                paths.add(path)

                // Secondary branching arcs
                if (Random.nextFloat() > 0.3f) {
                    val branchPath = Path()
                    val fraction = Random.nextFloat() * 0.6f + 0.2f
                    val midX = p1X + (p2X - p1X) * fraction
                    val midY = p1Y + (p2Y - p1Y) * fraction
                    val branchEndX = midX + (Random.nextFloat() * 70f - 35f) * density
                    val branchEndY = midY - (Random.nextFloat() * 40f + 10f) * density
                    generateLightningPath(branchPath, midX, midY, branchEndX, branchEndY, 14f * density, 3)
                    branchPaths.add(branchPath)
                }
            }
        } else {
            // 2-point electrode prongs at the top of the machine (nằm chính xác ở 2 đầu chấu máy)
            drawCorona(canvas, p1X, p1Y)
            drawCorona(canvas, p2X, p2Y)

            val numMainArcs = Random.nextInt(3, 6)
            for (i in 0 until numMainArcs) {
                val path = Path()
                generateLightningPath(path, p1X, p1Y, p2X, p2Y, 22f * density, 5)
                paths.add(path)

                // Randomly branch upward into the air
                if (Random.nextFloat() > 0.25f) {
                    val branchPath = Path()
                    val midX = (p1X + p2X) / 2f + (Random.nextFloat() * 32f - 16f) * density
                    val midY = (p1Y + p2Y) / 2f + (Random.nextFloat() * 20f - 10f) * density
                    val branchEndX = midX + (Random.nextFloat() * 50f - 25f) * density
                    val branchEndY = midY - (Random.nextFloat() * 60f + 15f) * density
                    generateLightningPath(branchPath, midX, midY, branchEndX, branchEndY, 15f * density, 3)
                    branchPaths.add(branchPath)
                }
            }
        }

        // Render all paths with outer glow, mid arc, and core arc
        for (path in paths) {
            canvas.drawPath(path, outerGlowPaint)
            canvas.drawPath(path, midArcPaint)
            canvas.drawPath(path, coreArcPaint)
        }
        for (branch in branchPaths) {
            canvas.drawPath(branch, outerGlowPaint)
            canvas.drawPath(branch, midArcPaint)
            canvas.drawPath(branch, coreArcPaint)
        }

        // Update and draw electric spark particles
        if (Random.nextFloat() > 0.15f && sparks.size < 30) {
            val fromP1 = Random.nextBoolean()
            val sx = if (fromP1 || isStraightBeam) p1X else p2X
            val sy = if (fromP1 || isStraightBeam) p1Y else p2Y
            sparks.add(
                floatArrayOf(
                    sx + (Random.nextFloat() * 12f - 6f) * density,
                    sy + (Random.nextFloat() * 12f - 6f) * density,
                    (Random.nextFloat() * 16f - 8f) * density,
                    (Random.nextFloat() * 16f - 12f) * density,
                    1f,
                    Random.nextFloat() * 0.09f + 0.06f,
                    (Random.nextFloat() * 2.6f + 1.6f) * density
                )
            )
        }

        val it = sparks.iterator()
        while (it.hasNext()) {
            val spark = it.next()
            spark[0] += spark[2]
            spark[1] += spark[3]
            spark[4] -= spark[5]
            if (spark[4] <= 0f) {
                it.remove()
            } else {
                sparkPaint.alpha = (spark[4] * 255).toInt()
                canvas.drawCircle(spark[0], spark[1], spark[6] * spark[4], sparkPaint)
            }
        }

        // Keep animating at 60 FPS while active
        postInvalidateOnAnimation()
    }

    private fun drawCorona(canvas: Canvas, cx: Float, cy: Float) {
        val radius = (Random.nextFloat() * 16f + 20f) * density
        val gradient = RadialGradient(
            cx, cy, radius,
            intArrayOf(
                Color.argb(230, 255, 255, 255),
                Color.argb(170, 0, 229, 255),
                Color.argb(70, 0, 100, 255),
                Color.TRANSPARENT
            ),
            floatArrayOf(0f, 0.35f, 0.7f, 1f),
            Shader.TileMode.CLAMP
        )
        coronaPaint.shader = gradient
        canvas.drawCircle(cx, cy, radius, coronaPaint)
    }

    private fun generateLightningPath(
        path: Path,
        x1: Float,
        y1: Float,
        x2: Float,
        y2: Float,
        maxOffset: Float,
        iterations: Int
    ) {
        val points = mutableListOf(PointF(x1, y1), PointF(x2, y2))
        var curOffset = maxOffset

        for (i in 0 until iterations) {
            val newPoints = mutableListOf<PointF>()
            for (j in 0 until points.size - 1) {
                val pStart = points[j]
                val pEnd = points[j + 1]
                newPoints.add(pStart)

                val midX = (pStart.x + pEnd.x) / 2f
                val midY = (pStart.y + pEnd.y) / 2f

                val dx = pEnd.x - pStart.x
                val dy = pEnd.y - pStart.y
                val len = Math.hypot(dx.toDouble(), dy.toDouble()).toFloat()
                if (len > 0f) {
                    val nx = -dy / len
                    val ny = dx / len
                    val offset = (Random.nextFloat() * 2f - 1f) * curOffset
                    newPoints.add(PointF(midX + nx * offset, midY + ny * offset))
                }
            }
            newPoints.add(points.last())
            points.clear()
            points.addAll(newPoints)
            curOffset *= 0.52f
        }

        path.reset()
        if (points.isNotEmpty()) {
            path.moveTo(points[0].x, points[0].y)
            for (k in 1 until points.size) {
                path.lineTo(points[k].x, points[k].y)
            }
        }
    }
}
