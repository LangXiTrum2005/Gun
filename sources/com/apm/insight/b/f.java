package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f67a;
    private static g c;
    private final b b;

    private f(@NonNull Context context) {
        this.b = new b(context);
        g gVar = new g();
        c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f67a == null) {
            synchronized (f.class) {
                try {
                    if (f67a == null) {
                        f67a = new f(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f67a;
    }

    public static g b() {
        return c;
    }

    public final void c() {
        this.b.a();
    }

    public final void d() {
        this.b.b();
    }

    public final b a() {
        return this.b;
    }
}
