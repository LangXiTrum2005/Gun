package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HandlerThreadC4401qU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC2527Jq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(17)
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final HandlerThreadC4401qU thread;
    private boolean threadReleased;

    public static int b(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i = Ug0.f3833a;
        if (i >= 24 && ((i >= 26 || !("samsung".equals(Ug0.c) || "XT1650".equals(Ug0.d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        try {
            if (!secureModeInitialized) {
                secureMode = b(context);
                secureModeInitialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return secureMode != 0;
    }

    public static PlaceholderSurface d(Context context, boolean z) {
        boolean z2 = false;
        FW.s(!z || c(context));
        HandlerThreadC4401qU handlerThreadC4401qU = new HandlerThreadC4401qU("ExoPlayer:PlaceholderSurface");
        int i = z ? secureMode : 0;
        handlerThreadC4401qU.start();
        Handler handler = new Handler(handlerThreadC4401qU.getLooper(), handlerThreadC4401qU);
        handlerThreadC4401qU.b = handler;
        handlerThreadC4401qU.f4883a = new RunnableC2527Jq(handler);
        synchronized (handlerThreadC4401qU) {
            handlerThreadC4401qU.b.obtainMessage(1, i, 0).sendToTarget();
            while (handlerThreadC4401qU.e == null && handlerThreadC4401qU.d == null && handlerThreadC4401qU.c == null) {
                try {
                    handlerThreadC4401qU.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = handlerThreadC4401qU.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = handlerThreadC4401qU.c;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = handlerThreadC4401qU.e;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.thread) {
            try {
                if (!this.threadReleased) {
                    HandlerThreadC4401qU handlerThreadC4401qU = this.thread;
                    handlerThreadC4401qU.b.getClass();
                    handlerThreadC4401qU.b.sendEmptyMessage(2);
                    this.threadReleased = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private PlaceholderSurface(HandlerThreadC4401qU handlerThreadC4401qU, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = handlerThreadC4401qU;
        this.secure = z;
    }
}
