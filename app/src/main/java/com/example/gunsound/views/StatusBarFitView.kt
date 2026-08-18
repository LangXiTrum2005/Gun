package com.example.gunsound.views

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

class StatusBarFitView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    init {
        if (visibility == VISIBLE) {
            visibility = INVISIBLE
        }
    }

    override fun draw(canvas: Canvas) {
        // Transparent space for status bar
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val resourceId = resources.getIdentifier("status_bar_height", "dimen", "android")
        val statusBarHeight = if (resourceId > 0) resources.getDimensionPixelOffset(resourceId) else 0
        setMeasuredDimension(
            resolveSize(0, widthMeasureSpec),
            resolveSize(statusBarHeight, heightMeasureSpec)
        )
    }
}
