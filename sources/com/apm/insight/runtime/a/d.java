package com.apm.insight.runtime.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.apm.insight.runtime.n;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f167a;

    public class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            try {
                if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                    d.this.f167a = (int) ((intent.getIntExtra("level", 0) * 100.0f) / intent.getIntExtra("scale", 100));
                }
            } catch (Throwable unused) {
            }
        }

        public /* synthetic */ a(d dVar, byte b) {
            this();
        }
    }

    public d(final Context context) {
        n.a().a(new Runnable() { // from class: com.apm.insight.runtime.a.d.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    context.registerReceiver(new a(d.this, (byte) 0), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                }
            }
        });
    }

    public final int a() {
        return this.f167a;
    }
}
