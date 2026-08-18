package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.runtime.n;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Runnable f114a = new Runnable() { // from class: com.apm.insight.k.a.1
        @Override // java.lang.Runnable
        public final void run() {
            if (com.apm.insight.l.k.b(com.apm.insight.e.g())) {
                a.i();
            }
            if (a.b > 0) {
                if (com.apm.insight.l.a.c(com.apm.insight.e.g())) {
                    n.a().a(a.f114a, MBInterstitialActivity.WEB_LOAD_TIME);
                } else {
                    n.a().a(a.f114a, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                }
            }
        }
    };
    private static int b = 0;

    public static void a() {
        b = 40;
        n.a().a(f114a);
    }

    public static void b() {
        if (!j.b()) {
            j.c();
        }
        if (com.apm.insight.l.k.b(com.apm.insight.e.g()) && j.g()) {
            i();
        }
    }

    public static boolean c() {
        return false;
    }

    public static void d() {
    }

    @Nullable
    private static byte[] h() {
        try {
            return e.a(com.apm.insight.e.i().getConfigUrl(), com.apm.insight.entity.b.a().toString().getBytes());
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void i() {
        try {
            int i = b;
            if (i > 0) {
                b = i - 1;
            }
            com.apm.insight.a.a((Object) "try fetchApmConfig");
            if (!com.apm.insight.l.a.c(com.apm.insight.e.g())) {
                j.c();
                if (j.a()) {
                    b = 0;
                }
                return;
            }
            JSONArray jSONArrayOptJSONArray = null;
            try {
                byte[] bArrH = h();
                if (bArrH != null) {
                    jSONArrayOptJSONArray = new JSONObject(new String(bArrH)).optJSONArray("data");
                }
            } catch (Throwable unused) {
                com.apm.insight.e.i().isDebugMode();
            }
            com.apm.insight.a.a((Object) "after fetchApmConfig net ".concat(String.valueOf(jSONArrayOptJSONArray)));
            if (jSONArrayOptJSONArray == null) {
                b -= 10;
            } else {
                com.apm.insight.runtime.a.a(jSONArrayOptJSONArray, true);
                b = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
