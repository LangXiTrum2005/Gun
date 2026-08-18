package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbuw extends zzaya implements zzbuy {
    public zzbuw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zze(zzbvk zzbvkVar, zzbvc zzbvcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbvkVar);
        zzayc.zzf(parcelZza, zzbvcVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzf(zzbvk zzbvkVar, zzbvc zzbvcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbvkVar);
        zzayc.zzf(parcelZza, zzbvcVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzg(zzbvk zzbvkVar, zzbvc zzbvcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbvkVar);
        zzayc.zzf(parcelZza, zzbvcVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzh(String str, zzbvc zzbvcVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbvcVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzi(zzbuu zzbuuVar, zzbvd zzbvdVar) throws RemoteException {
        throw null;
    }
}
