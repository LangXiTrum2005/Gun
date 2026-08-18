package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdzf implements zzgcd {
    final /* synthetic */ zzbuu zza;
    final /* synthetic */ zzbvd zzb;

    public zzdzf(zzdzl zzdzlVar, zzbvd zzbvdVar, zzbuu zzbuuVar) {
        this.zzb = zzbvdVar;
        this.zza = zzbuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        try {
            this.zzb.zze(com.google.android.gms.ads.internal.util.zzbb.zzb(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zzf((String) obj, this.zza);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
