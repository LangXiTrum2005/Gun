package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdtm extends zzbwr {
    final /* synthetic */ zzdtn zza;

    public zzdtm(zzdtn zzdtnVar) {
        this.zza = zzdtnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zze() throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzj(zzdtnVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzf() throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzo(zzdtnVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzg() throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzk(zzdtnVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzh(int i) throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzn(zzdtnVar.zza, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzn(zzdtnVar.zza, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzj() throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzr(zzdtnVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzk(zzbwm zzbwmVar) throws RemoteException {
        zzdtn zzdtnVar = this.zza;
        zzdtnVar.zzb.zzl(zzdtnVar.zza, zzbwmVar);
    }
}
