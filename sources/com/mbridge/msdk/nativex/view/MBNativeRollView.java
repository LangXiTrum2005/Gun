package com.mbridge.msdk.nativex.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MBNativeRollView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RollingBCView f1529a;
    private Context b;
    private NativeListener.FilpListener c;

    public interface a {
    }

    @SuppressLint({"NewApi"})
    public MBNativeRollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f1529a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, a aVar) {
        this.f1529a.setData(list, context, str, aVar);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.c = filpListener;
            this.f1529a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i) {
        this.f1529a.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f1529a = rollingBCView;
        addView(rollingBCView);
        this.f1529a.setLayoutParams(new LinearLayout.LayoutParams((int) (((double) t0.k(context)) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
