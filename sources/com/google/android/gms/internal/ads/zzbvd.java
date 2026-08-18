package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvd extends zzaya implements IInterface {
    public zzbvd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbbVar);
        zzda(2, parcelZza);
    }

    public final void zzf(String str, zzbuu zzbuuVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayc.zzd(parcelZza, zzbuuVar);
        zzda(1, parcelZza);
    }
}
