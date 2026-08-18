package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class HomeWatcherReceiver extends BroadcastReceiver {
    private Lxb Lxb;

    public interface Lxb {
        void LD();

        void Lxb();
    }

    public void Lxb(Lxb lxb) {
        this.Lxb = lxb;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            String action = intent.getAction();
            "onReceive: action: ".concat(String.valueOf(action));
            if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(action)) {
                String stringExtra = intent.getStringExtra("reason");
                "reason: ".concat(String.valueOf(stringExtra));
                if ("homekey".equals(stringExtra)) {
                    Lxb lxb = this.Lxb;
                    if (lxb != null) {
                        lxb.Lxb();
                        return;
                    }
                    return;
                }
                if (!"recentapps".equals(stringExtra)) {
                    "assist".equals(stringExtra);
                    return;
                }
                Lxb lxb2 = this.Lxb;
                if (lxb2 != null) {
                    lxb2.LD();
                }
            }
        } catch (Throwable unused) {
            sLN.Lxb("HomeReceiver", "ACTION_CLOSE_SYSTEM_DIALOGS throw");
        }
    }
}
