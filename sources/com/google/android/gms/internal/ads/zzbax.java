package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbax extends zzaya implements IInterface {
    public zzbax(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbav zzbavVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbavVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    public final zzbas zzf(zzbav zzbavVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbavVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzbas zzbasVar = (zzbas) zzayc.zza(parcelZzcZ, zzbas.CREATOR);
        parcelZzcZ.recycle();
        return zzbasVar;
    }

    public final zzbas zzg(zzbav zzbavVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbavVar);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        zzbas zzbasVar = (zzbas) zzayc.zza(parcelZzcZ, zzbas.CREATOR);
        parcelZzcZ.recycle();
        return zzbasVar;
    }
}
