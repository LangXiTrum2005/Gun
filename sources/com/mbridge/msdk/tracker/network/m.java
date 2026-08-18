package com.mbridge.msdk.tracker.network;

/* JADX INFO: loaded from: classes2.dex */
public class m {
    private static volatile m b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f2047a;

    private m() {
    }

    public static m a() {
        if (b == null) {
            synchronized (m.class) {
                try {
                    if (b == null) {
                        b = new m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public v b() {
        if (this.f2047a == null) {
            v vVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.m()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.l());
            this.f2047a = vVarA;
            vVarA.b();
        }
        return this.f2047a;
    }
}
