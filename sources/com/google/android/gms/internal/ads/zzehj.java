package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class zzehj extends zzeik {
    private final zzdeb zza;

    public zzehj(zzcvr zzcvrVar, zzddq zzddqVar, zzcwl zzcwlVar, zzcxa zzcxaVar, zzcxf zzcxfVar, zzcwg zzcwgVar, zzdap zzdapVar, zzden zzdenVar, zzcxz zzcxzVar, zzdeb zzdebVar, zzdal zzdalVar) {
        super(zzcvrVar, zzddqVar, zzcwlVar, zzcxaVar, zzcxfVar, zzdapVar, zzcxzVar, zzdenVar, zzdalVar, zzcwgVar);
        this.zza = zzdebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzs(zzbwi zzbwiVar) {
        this.zza.zza(zzbwiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzt(zzbwm zzbwmVar) throws RemoteException {
        this.zza.zza(new zzbwi(zzbwmVar.zzf(), zzbwmVar.zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzv() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeik, com.google.android.gms.internal.ads.zzbpk
    public final void zzy() {
        this.zza.zzc();
    }
}
