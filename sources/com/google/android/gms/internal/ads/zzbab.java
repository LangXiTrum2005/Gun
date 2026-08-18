package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbab extends zzaya implements zzbad {
    public zzbab(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final com.google.android.gms.ads.internal.client.zzby zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final com.google.android.gms.ads.internal.client.zzdy zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzb = com.google.android.gms.ads.internal.client.zzdx.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzg(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzh(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzdrVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzi(IObjectWrapper iObjectWrapper, zzbak zzbakVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbakVar);
        zzda(4, parcelZza);
    }
}
