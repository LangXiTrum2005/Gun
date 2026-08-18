package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzff implements Runnable {
    final /* synthetic */ zzfg zza;

    public zzff(zzfg zzfgVar) {
        this.zza = zzfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfi zzfiVar = this.zza.zza;
        if (zzfiVar.zza != null) {
            try {
                zzfiVar.zza.zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
