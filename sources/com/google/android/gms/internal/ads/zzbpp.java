package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpp extends zzaya implements IInterface {
    public zzbpp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(15, zza());
        Bundle bundle = (Bundle) zzayc.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzeb zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    public final zzbfp zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzbfp zzbfpVarZzj = zzbfo.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfpVarZzj;
    }

    public final zzbfw zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbfw zzbfwVarZzg = zzbfv.zzg(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfwVarZzg;
    }

    public final IObjectWrapper zzj() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(18, zza()));
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(20, zza()));
    }

    public final IObjectWrapper zzl() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(21, zza()));
    }

    public final String zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzo() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzp() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final String zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    public final List zzr() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzb = zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(11, parcelZza);
    }

    public final void zzt() throws RemoteException {
        zzda(10, zza());
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(12, parcelZza);
    }

    public final void zzv(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, iObjectWrapper2);
        zzayc.zzf(parcelZza, iObjectWrapper3);
        zzda(22, parcelZza);
    }

    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(16, parcelZza);
    }

    public final boolean zzx() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(14, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    public final boolean zzy() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
