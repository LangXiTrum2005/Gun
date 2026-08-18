package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IE implements View.OnTouchListener {
    public final /* synthetic */ C1361cL A00;

    public IE(C1361cL c1361cL) {
        this.A00 = c1361cL;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A0C.A02(new C1327bn(view, motionEvent));
        return false;
    }
}
