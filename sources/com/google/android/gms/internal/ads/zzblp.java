package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzblp extends zzaya implements zzblr {
    public zzblp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzblr
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }
}
