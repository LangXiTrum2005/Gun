package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcu extends zzaya implements zzcw {
    public zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final zzbpe getAdapterCreator() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbpe zzbpeVarZzf = zzbpd.zzf(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbpeVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final zzfb getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        zzfb zzfbVar = (zzfb) zzayc.zza(parcelZzcZ, zzfb.CREATOR);
        parcelZzcZ.recycle();
        return zzfbVar;
    }
}
