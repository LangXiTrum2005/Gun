package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpi extends zzaya implements zzbpk {
    public zzbpi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzeVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzj(int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzeVar);
        zzda(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzm() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(zzbgq zzbgqVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbgqVar);
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzs(zzbwi zzbwiVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzt(zzbwm zzbwmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbwmVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzu() throws RemoteException {
        zzda(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzv() throws RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws RemoteException {
        zzda(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzy() throws RemoteException {
        zzda(13, zza());
    }
}
