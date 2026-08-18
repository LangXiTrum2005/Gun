package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdti extends com.google.android.gms.ads.internal.client.zzbk {
    final /* synthetic */ zzdtc zza;
    final /* synthetic */ zzdtj zzb;

    public zzdti(zzdtj zzdtjVar, zzdtc zzdtcVar) {
        this.zza = zzdtcVar;
        this.zzb = zzdtjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzc() throws RemoteException {
        this.zza.zzb(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzd() throws RemoteException {
        this.zza.zzc(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zze(int i) throws RemoteException {
        this.zza.zzd(this.zzb.zza, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        this.zza.zzd(this.zzb.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzi() throws RemoteException {
        this.zza.zze(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzj() throws RemoteException {
        this.zza.zzg(this.zzb.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbl
    public final void zzk() {
    }
}
