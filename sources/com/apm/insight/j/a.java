package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f111a;
    private final long b = 0;
    private final long c;

    public a(Handler handler, long j) {
        this.f111a = handler;
        this.c = j;
    }

    public final void a() {
        this.f111a.post(this);
    }

    public final long b() {
        return this.c;
    }

    public final void a(long j) {
        if (j > 0) {
            this.f111a.postDelayed(this, j);
        } else {
            this.f111a.post(this);
        }
    }
}
