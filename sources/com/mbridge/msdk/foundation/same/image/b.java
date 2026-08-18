package com.mbridge.msdk.foundation.same.image;

import android.content.Context;
import android.graphics.Bitmap;
import com.mbridge.msdk.foundation.tools.t0;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f1187a;

    public b(Context context) {
    }

    public void a() {
    }

    public void b() {
    }

    public boolean c(String str) {
        if (t0.k(str)) {
            return false;
        }
        return d.a().d(str);
    }

    public void a(String str) {
    }

    public Bitmap b(String str) {
        if (t0.k(str)) {
            return null;
        }
        return d.a().c(str);
    }

    public static b a(Context context) {
        if (f1187a == null) {
            f1187a = new b(context);
        }
        return f1187a;
    }

    public void a(String str, c cVar) {
        d.a().b(str, null, cVar);
    }
}
