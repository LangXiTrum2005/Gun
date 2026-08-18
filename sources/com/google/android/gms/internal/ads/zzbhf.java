package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhf extends zzaya implements zzbhh {
    public zzbhf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zze(com.google.android.gms.ads.internal.client.zzby zzbyVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbyVar);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }
}
