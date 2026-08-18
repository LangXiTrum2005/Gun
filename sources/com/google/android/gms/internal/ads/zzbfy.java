package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfy extends zzaya implements zzbga {
    public zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        return AbstractC3888ke0.e(zzcZ(2, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzc() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdt(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdv(zzbft zzbftVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbftVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdx(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        zzda(5, parcelZza);
    }
}
