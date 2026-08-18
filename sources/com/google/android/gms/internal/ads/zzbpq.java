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
public final class zzbpq extends zzaya implements IInterface {
    public zzbpq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        Bundle bundle = (Bundle) zzayc.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    public final com.google.android.gms.ads.internal.client.zzeb zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    public final zzbfp zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(19, zza());
        zzbfp zzbfpVarZzj = zzbfo.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfpVarZzj;
    }

    public final zzbfw zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbfw zzbfwVarZzg = zzbfv.zzg(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfwVarZzg;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(15, zza()));
    }

    public final IObjectWrapper zzj() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(20, zza()));
    }

    public final IObjectWrapper zzk() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(21, zza()));
    }

    public final String zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
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

    public final List zzp() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzb = zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    public final void zzq(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(9, parcelZza);
    }

    public final void zzr() throws RemoteException {
        zzda(8, zza());
    }

    public final void zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(10, parcelZza);
    }

    public final void zzt(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, iObjectWrapper2);
        zzayc.zzf(parcelZza, iObjectWrapper3);
        zzda(22, parcelZza);
    }

    public final void zzu(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(14, parcelZza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    public final boolean zzw() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
