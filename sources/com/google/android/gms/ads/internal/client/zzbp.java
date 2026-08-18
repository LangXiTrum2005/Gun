package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbp extends zzaya implements zzbr {
    public zzbp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzg(zzm zzmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzmVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final void zzh(zzm zzmVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeInt(i);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbr
    public final boolean zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
