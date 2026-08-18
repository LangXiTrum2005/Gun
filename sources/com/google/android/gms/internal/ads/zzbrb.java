package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrb extends zzaya implements zzbrd {
    public zzbrb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final com.google.android.gms.ads.internal.client.zzeb zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final zzbrs zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbrs zzbrsVar = (zzbrs) zzayc.zza(parcelZzcZ, zzbrs.CREATOR);
        parcelZzcZ.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final zzbrs zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        zzbrs zzbrsVar = (zzbrs) zzayc.zza(parcelZzcZ, zzbrs.CREATOR);
        parcelZzcZ.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzs zzsVar, zzbrg zzbrgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzayc.zzd(parcelZza, bundle);
        zzayc.zzd(parcelZza, bundle2);
        zzayc.zzd(parcelZza, zzsVar);
        zzayc.zzf(parcelZza, zzbrgVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbqoVar);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqr zzbqrVar, zzbpk zzbpkVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbqrVar);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzayc.zzd(parcelZza, zzsVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqr zzbqrVar, zzbpk zzbpkVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbqrVar);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzayc.zzd(parcelZza, zzsVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqu zzbquVar, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbquVar);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqx zzbqxVar, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbqxVar);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqx zzbqxVar, zzbpk zzbpkVar, zzbfl zzbflVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbqxVar);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzayc.zzd(parcelZza, zzbflVar);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbra zzbraVar, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbraVar);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbra zzbraVar, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbraVar);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(24, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
