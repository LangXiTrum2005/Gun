package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile b f2139a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f2139a != null) {
            return f2139a;
        }
        synchronized (b.class) {
            try {
                if (f2139a == null) {
                    f2139a = new b();
                }
                bVar = f2139a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    private void b(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar);
    }

    private void c(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar, map);
    }

    private void b(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar, map);
    }

    public void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int iG = cVar.g();
        if (iG == 1) {
            a(view, map);
            return;
        }
        if (iG == 2) {
            c(view, cVar, map);
            return;
        }
        if (iG == 3) {
            b(view, cVar);
        } else if (iG == 4) {
            b(view, cVar, map);
        } else {
            if (iG != 5) {
                return;
            }
            a(view, cVar);
        }
    }

    private void a(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar);
    }

    private void a(View view, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, map);
    }
}
