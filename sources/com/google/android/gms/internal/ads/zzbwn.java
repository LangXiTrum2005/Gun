package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwn extends zzaya implements zzbwp {
    public zzbwn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final Bundle zzb() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzayc.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final com.google.android.gms.ads.internal.client.zzdy zzc() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzb = com.google.android.gms.ads.internal.client.zzdx.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdyVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzbwm zzd() throws RemoteException {
        zzbwm zzbwkVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbwkVar = iInterfaceQueryLocalInterface instanceof zzbwm ? (zzbwm) iInterfaceQueryLocalInterface : new zzbwk(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbww zzbwwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, zzbwwVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbww zzbwwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, zzbwwVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo zzdoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzdoVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzdrVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(zzbws zzbwsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbwsVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(zzbxd zzbxdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbxdVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(zzbwx zzbwxVar) throws RemoteException {
        throw null;
    }
}
