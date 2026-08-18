package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvx extends zzaya implements IInterface {
    public zzbvx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvw zzbvwVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbvwVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(2, parcelZza);
    }
}
