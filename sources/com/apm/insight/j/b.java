package com.apm.insight.j;

import android.content.Context;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.apm.insight.e;
import com.apm.insight.runtime.n;
import com.apm.insight.runtime.q;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    private static Runnable b = new Runnable() { // from class: com.apm.insight.j.b.1
        @Override // java.lang.Runnable
        public final void run() {
            n.a().a().removeCallbacks(this);
            n.a().a(new b(n.a().a(), e.g()));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f112a;

    public b(Handler handler, Context context) {
        super(handler, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        this.f112a = context;
    }

    public static void c() {
        n.a().a(b, 100L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map<String, Object> commonParams;
        try {
            commonParams = e.a().c().getCommonParams();
        } catch (Throwable unused) {
            commonParams = null;
        }
        if (commonParams != null) {
            try {
                if (com.apm.insight.nativecrash.b.a(commonParams)) {
                    a(b());
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
        q.a().a(commonParams, com.apm.insight.entity.b.b());
    }
}
