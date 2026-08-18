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
public final class zzbhr extends zzaya implements zzbht {
    public zzbhr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzA() throws RemoteException {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, bundle);
        zzda(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzC(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, bundle);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzD() throws RemoteException {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzE(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzddVar);
        zzda(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzF(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzdrVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzG(zzbhq zzbhqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbhqVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzH() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(30, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzI() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(24, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final double zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final Bundle zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) zzayc.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.ads.internal.client.zzdy zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(31, zza());
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzb = com.google.android.gms.ads.internal.client.zzdx.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final zzbfp zzi() throws RemoteException {
        zzbfp zzbfnVar;
        Parcel parcelZzcZ = zzcZ(14, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbfnVar = iInterfaceQueryLocalInterface instanceof zzbfp ? (zzbfp) iInterfaceQueryLocalInterface : new zzbfn(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final zzbft zzj() throws RemoteException {
        zzbft zzbfrVar;
        Parcel parcelZzcZ = zzcZ(29, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbfrVar = iInterfaceQueryLocalInterface instanceof zzbft ? (zzbft) iInterfaceQueryLocalInterface : new zzbfr(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final zzbfw zzk() throws RemoteException {
        zzbfw zzbfuVar;
        Parcel parcelZzcZ = zzcZ(5, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfuVar = iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfu(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final IObjectWrapper zzl() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(19, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final IObjectWrapper zzm() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(18, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzo() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzp() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzr() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzs() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final List zzu() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzb = zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final List zzv() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(23, zza());
        ArrayList arrayListZzb = zzayc.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzw() throws RemoteException {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzx() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzy(com.google.android.gms.ads.internal.client.zzdh zzdhVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzdhVar);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, bundle);
        zzda(15, parcelZza);
    }
}
