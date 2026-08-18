package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflu {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzflu zza = new zzflu();
    private WeakReference zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public static zzflu zza() {
        return zza;
    }

    public final void zzc() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        boolean zIsDeviceLocked = Build.VERSION.SDK_INT >= 22 ? keyguardManager.isDeviceLocked() : keyguardManager.inKeyguardRestrictedInputMode();
        zzd(this.zzc, zIsDeviceLocked);
        this.zzd = zIsDeviceLocked;
    }

    public final void zzd(boolean z, boolean z2) {
        if ((z2 || z) == (this.zzd || this.zzc)) {
            return;
        }
        Iterator it = zzflk.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfkt) it.next()).zzg().zzm(z2 || z);
        }
    }

    public final void zze(Context context) {
        if (context == null) {
            return;
        }
        this.zzb = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new zzflt(this), intentFilter);
    }
}
