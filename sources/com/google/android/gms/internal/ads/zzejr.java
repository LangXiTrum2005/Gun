package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejr extends com.google.android.gms.ads.internal.client.zzbq {
    private final zzeky zza;

    public zzejr(Context context, zzcgx zzcgxVar, zzfch zzfchVar, zzdiq zzdiqVar, com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        zzela zzelaVar = new zzela(zzdiqVar, zzcgxVar.zzj());
        zzelaVar.zze(zzblVar);
        this.zza = new zzeky(new zzelk(zzcgxVar, context, zzelaVar, zzfchVar), zzfchVar.zzL());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        this.zza.zzd(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzm zzmVar, int i) throws RemoteException {
        this.zza.zzd(zzmVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
