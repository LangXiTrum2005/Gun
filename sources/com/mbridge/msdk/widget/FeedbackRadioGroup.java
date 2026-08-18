package com.mbridge.msdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* JADX INFO: loaded from: classes2.dex */
public class FeedbackRadioGroup extends RadioGroup {
    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (getPaddingRight() + childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + paddingLeft + marginLayoutParams.rightMargin > i3 - i) {
                paddingLeft = getPaddingLeft();
                paddingTop += iMax;
                iMax = getChildAt(i5).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int i6 = marginLayoutParams.leftMargin + paddingLeft;
            int i7 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
            paddingLeft += childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int iMax2 = 0;
        int i5 = 0;
        int iMax3 = 0;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int i6 = i5 + measuredWidth;
            if (getPaddingRight() + getPaddingLeft() + i6 > size) {
                iMax = Math.max(i5, iMax2);
                i4 += iMax3;
                iMax3 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                iMax3 = Math.max(iMax3, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                measuredWidth = i6;
                iMax = iMax2;
            }
            if (i3 == childCount - 1) {
                i4 += iMax3;
                iMax2 = Math.max(measuredWidth, iMax2);
            } else {
                iMax2 = iMax;
            }
            i3++;
            i5 = measuredWidth;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i4;
        if (mode != 1073741824) {
            size = paddingRight;
        }
        if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public FeedbackRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
