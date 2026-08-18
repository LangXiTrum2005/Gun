package com.example.gunsound.views

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import com.example.gunsound.R

class LinerCustomSeekBar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var backgroundDrawable: Drawable? = null
    private var foregroundDrawable: Drawable? = null
    private var thumbDrawable: Drawable? = null
    private var maxProgress: Int = 100
    private var currentProgress: Float = 50f

    var onProgressChangedListener: ((progress: Int) -> Unit)? = null
    var targetTextView: TextView? = null

    init {
        if (attrs != null) {
            val a = context.obtainStyledAttributes(attrs, R.styleable.LinerCustomSeekBar)
            backgroundDrawable = a.getDrawable(R.styleable.LinerCustomSeekBar_backgroundDrawable)
            foregroundDrawable = a.getDrawable(R.styleable.LinerCustomSeekBar_foregroundDrawable)
            thumbDrawable = a.getDrawable(R.styleable.LinerCustomSeekBar_thumbDrawable)
            maxProgress = a.getInt(R.styleable.LinerCustomSeekBar_maxProgress, 100)
            a.recycle()
        }
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        val w = width.toFloat()
        val h = height.toFloat()

        backgroundDrawable?.setBounds(0, 0, w.toInt(), h.toInt())
        backgroundDrawable?.draw(canvas)

        val progressWidth = (w * (currentProgress / maxProgress.coerceAtLeast(1))).toInt()
        foregroundDrawable?.setBounds(0, 0, progressWidth, h.toInt())
        foregroundDrawable?.draw(canvas)

        thumbDrawable?.let {
            val thumbW = it.intrinsicWidth.coerceAtLeast(40)
            val thumbH = it.intrinsicHeight.coerceAtLeast(40)
            val left = (progressWidth - thumbW / 2).coerceIn(0, (w - thumbW).toInt())
            val top = ((h - thumbH) / 2).toInt()
            it.setBounds(left, top, left + thumbW, top + thumbH)
            it.draw(canvas)
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN, MotionEvent.ACTION_MOVE -> {
                val fraction = (event.x / width.toFloat()).coerceIn(0f, 1f)
                currentProgress = fraction * maxProgress
                val intProgress = currentProgress.toInt()
                targetTextView?.text = intProgress.toString()
                onProgressChangedListener?.invoke(intProgress)
                invalidate()
                return true
            }
        }
        return super.onTouchEvent(event)
    }

    fun setProgress(progress: Int) {
        currentProgress = progress.toFloat().coerceIn(0f, maxProgress.toFloat())
        targetTextView?.text = progress.toString()
        invalidate()
    }

    fun getProgress(): Int = currentProgress.toInt()
}
