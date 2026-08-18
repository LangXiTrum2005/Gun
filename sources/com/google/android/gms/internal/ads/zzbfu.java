package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbfu extends zzaya implements zzbfw {
    public zzbfu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final double zzb() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzc() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final int zzd() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final Uri zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        Uri uri = (Uri) zzayc.zza(parcelZzcZ, Uri.CREATOR);
        parcelZzcZ.recycle();
        return uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final IObjectWrapper zzf() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(1, zza()));
    }
}
