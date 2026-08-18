package com.apm.insight.k;

import android.content.Context;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.n;
import com.apm.insight.runtime.q;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f133a;

    private h(Context context) {
        this.f133a = context;
    }

    public static boolean a() {
        return b.a().c() || !com.apm.insight.l.a.c(com.apm.insight.e.g());
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.apm.insight.b.f.a(this.f133a).a().f();
        } catch (Throwable unused) {
        }
        try {
            if (com.apm.insight.l.a.c(this.f133a)) {
                b.a().a(com.apm.insight.l.k.b(this.f133a));
            } else {
                NativeImpl.j();
            }
            q.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
            if (n.a().a() == null) {
            }
        } catch (Throwable th) {
            try {
                com.apm.insight.a.b(th);
            } finally {
                q.a().a(com.apm.insight.e.a().b(), com.apm.insight.entity.b.b());
                if (n.a().a() != null) {
                    com.apm.insight.j.d.a(n.a().a(), this.f133a).a();
                }
            }
        }
    }

    public static void a(Context context) {
        n.a().a(new h(context), 0L);
    }
}
