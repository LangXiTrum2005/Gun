package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<Lxb> Lxb;

    public void Lxb(Lxb lxb) {
        this.Lxb = new WeakReference<>(lxb);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<Lxb> weakReference = this.Lxb;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.Lxb.get().onThemeChanged(intExtra);
    }
}
