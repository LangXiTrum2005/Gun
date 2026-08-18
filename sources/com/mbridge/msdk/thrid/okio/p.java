package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    static o f2016a;
    static long b;

    private p() {
    }

    public static o a() {
        synchronized (p.class) {
            try {
                o oVar = f2016a;
                if (oVar == null) {
                    return new o();
                }
                f2016a = oVar.f;
                oVar.f = null;
                b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(o oVar) {
        if (oVar.f == null && oVar.g == null) {
            if (oVar.d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j = b + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    if (j > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        return;
                    }
                    b = j;
                    oVar.f = f2016a;
                    oVar.c = 0;
                    oVar.b = 0;
                    f2016a = oVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
