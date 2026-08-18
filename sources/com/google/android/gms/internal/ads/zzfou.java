package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfou extends zzaya implements IInterface {
    public zzfou(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfos zze(zzfoq zzfoqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzfoqVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        zzfos zzfosVar = (zzfos) zzayc.zza(parcelZzcZ, zzfos.CREATOR);
        parcelZzcZ.recycle();
        return zzfosVar;
    }

    public final zzfpb zzf(zzfoz zzfozVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzfozVar);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzfpb zzfpbVar = (zzfpb) zzayc.zza(parcelZzcZ, zzfpb.CREATOR);
        parcelZzcZ.recycle();
        return zzfpbVar;
    }

    public final void zzg(zzfon zzfonVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzfonVar);
        zzda(2, parcelZza);
    }
}
