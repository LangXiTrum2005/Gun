package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpr extends zzaya implements zzbpt {
    public zzbpr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(18, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final boolean zzB() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final double zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(23, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(25, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final float zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(24, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        Bundle bundle = (Bundle) zzayc.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final com.google.android.gms.ads.internal.client.zzeb zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final zzbfp zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzbfp zzbfpVarZzj = zzbfo.zzj(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfpVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final zzbfw zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        zzbfw zzbfwVarZzg = zzbfv.zzg(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbfwVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final IObjectWrapper zzm() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(13, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final IObjectWrapper zzn() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(14, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final IObjectWrapper zzo() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(15, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzp() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzr() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzs() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final String zzu() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final List zzv() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzb = zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzx() throws RemoteException {
        zzda(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, iObjectWrapper2);
        zzayc.zzf(parcelZza, iObjectWrapper3);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpt
    public final void zzz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(22, parcelZza);
    }
}
