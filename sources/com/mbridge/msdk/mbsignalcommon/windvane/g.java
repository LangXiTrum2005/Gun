package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f1498a;
    protected Object b;
    protected WindVaneWebView c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f1498a = context;
        this.c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.b = obj;
        this.c = windVaneWebView;
    }
}
