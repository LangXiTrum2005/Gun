package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbqi extends zzbpj {
    private final Adapter zza;
    private final zzbwh zzb;

    public zzbqi(Adapter adapter, zzbwh zzbwhVar) {
        this.zza = adapter;
        this.zzb = zzbwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze() throws RemoteException {
        zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() throws RemoteException {
        zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int i) throws RemoteException {
        zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzj(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() throws RemoteException {
        zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() throws RemoteException {
        zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(zzbgq zzbgqVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzs(zzbwi zzbwiVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzt(zzbwm zzbwmVar) throws RemoteException {
        zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzm(ObjectWrapper.wrap(this.zza), new zzbwi(zzbwmVar.zzf(), zzbwmVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzu() throws RemoteException {
        zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzy() throws RemoteException {
        zzbwh zzbwhVar = this.zzb;
        if (zzbwhVar != null) {
            zzbwhVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
