package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbmg extends zzaya implements zzbmi {
    public zzbmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zze(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public final void zzg(zzbmc zzbmcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbmcVar);
        zzda(1, parcelZza);
    }
}
