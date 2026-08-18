package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsy extends zzaya implements zzbta {
    public zzbsy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbta
    public final zzbsx zze(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException {
        zzbsx zzbsvVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbsvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbsvVar = iInterfaceQueryLocalInterface instanceof zzbsx ? (zzbsx) iInterfaceQueryLocalInterface : new zzbsv(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbsvVar;
    }
}
