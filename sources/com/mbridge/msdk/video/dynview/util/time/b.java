package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f2172a = 0;
    private long b;
    private com.mbridge.msdk.video.dynview.util.time.a c;
    private a d;

    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f2173a;

        public a(long j, long j2) {
            super(j, j2);
        }

        public void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f2173a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f2173a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f2173a;
            if (aVar != null) {
                aVar.onTick(j);
            }
        }
    }

    public b a(long j) {
        if (j < 0) {
            j = 1000;
        }
        this.b = j;
        return this;
    }

    public b b(long j) {
        this.f2172a = j;
        return this;
    }

    public void c() {
        if (this.d == null) {
            b();
        }
        this.d.start();
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
        if (this.b <= 0) {
            this.b = this.f2172a + 1000;
        }
        a aVar2 = new a(this.f2172a, this.b);
        this.d = aVar2;
        aVar2.a(this.c);
    }

    public void a(long j, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f2172a = j;
        this.c = aVar;
        b();
        a aVar2 = this.d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.d;
        if (aVar != null) {
            aVar.cancel();
            this.d = null;
        }
    }
}
