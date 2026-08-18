package com.apm.insight.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.n;

/* JADX INFO: loaded from: classes.dex */
public class a implements ICrashCallback {
    private static volatile a d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile String f56a;
    private volatile i.a b;
    private volatile i.a c;
    private volatile boolean e = false;

    private a() {
    }

    public static a a() {
        if (d == null) {
            synchronized (a.class) {
                try {
                    if (d == null) {
                        d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f56a = str;
        this.b = aVar;
        this.c = aVar2;
        if (this.e) {
            return;
        }
        this.e = true;
        n.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}
