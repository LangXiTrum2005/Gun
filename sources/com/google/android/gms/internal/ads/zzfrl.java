package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfrl extends zzaya implements zzfrn {
    public zzfrl(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zze(Bundle bundle, zzfrp zzfrpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, bundle);
        zzayc.zzf(parcelZza, zzfrpVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zzf(String str, Bundle bundle, zzfrp zzfrpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayc.zzd(parcelZza, bundle);
        zzayc.zzf(parcelZza, zzfrpVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfrn
    public final void zzg(Bundle bundle, zzfrp zzfrpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, bundle);
        zzayc.zzf(parcelZza, zzfrpVar);
        zzdb(3, parcelZza);
    }
}
