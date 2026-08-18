package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwq extends zzaya implements zzbws {
    public zzbwq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zze() throws RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzf() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzg() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzh(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzeVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzj() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final void zzk(zzbwm zzbwmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbwmVar);
        zzda(3, parcelZza);
    }
}
