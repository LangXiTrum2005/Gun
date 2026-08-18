package com.mbridge.msdk.tracker.network.toolbox;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.tracker.network.v;
import com.mbridge.msdk.tracker.network.x;

/* JADX INFO: loaded from: classes2.dex */
public class o {
    public static v a(com.mbridge.msdk.tracker.network.n nVar, x xVar, int i, com.mbridge.msdk.tracker.network.b bVar) {
        if (nVar == null) {
            nVar = new b(new h());
        }
        if (xVar == null) {
            xVar = new com.mbridge.msdk.tracker.network.g(new Handler(Looper.getMainLooper()));
        }
        if (i <= 0) {
            i = 4;
        }
        if (bVar == null) {
            bVar = new l();
        }
        return new v(nVar, xVar, i, bVar);
    }
}
