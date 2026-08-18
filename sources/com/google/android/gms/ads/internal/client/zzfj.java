package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
final class zzfj implements Runnable {
    final /* synthetic */ zzfk zza;

    public zzfj(zzfk zzfkVar) {
        this.zza = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfk zzfkVar = this.zza;
        if (zzfkVar.zza != null) {
            try {
                zzfkVar.zza.zze(1);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
