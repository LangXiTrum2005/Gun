package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbva extends zzaya implements zzbvc {
    public zzbva(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbbVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, parcelFileDescriptor);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvk zzbvkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, parcelFileDescriptor);
        zzayc.zzd(parcelZza, zzbvkVar);
        zzda(3, parcelZza);
    }
}
