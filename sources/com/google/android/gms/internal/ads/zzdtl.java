package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdtl extends zzbwv {
    final /* synthetic */ zzdtn zza;

    public zzdtl(zzdtn zzdtnVar) {
        this.zza = zzdtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(int i) throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzm(zzdtnVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzm(zzdtnVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzp(zzdtnVar.zza);
    }
}
