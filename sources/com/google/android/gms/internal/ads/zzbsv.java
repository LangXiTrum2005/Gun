package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsv extends zzaya implements zzbsx {
    public zzbsv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zze(Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, intent);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzh() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsx
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzaVar);
        zzda(6, parcelZza);
    }
}
