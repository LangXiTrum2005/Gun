package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbks extends zzaya implements zzbku {
    public zzbks(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbku
    public final zzbkr zze(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i, zzbko zzbkoVar) throws RemoteException {
        zzbkr zzbkpVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        zzayc.zzf(parcelZza, zzbkoVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbkpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbkpVar = iInterfaceQueryLocalInterface instanceof zzbkr ? (zzbkr) iInterfaceQueryLocalInterface : new zzbkp(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbkpVar;
    }
}
