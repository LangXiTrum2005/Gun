package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbpe;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcx extends zzaya implements zzcz {
    public zzcx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(zzbln.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzdlVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpe zzbpeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbpeVar);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzblu zzbluVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbluVar);
        zzda(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzfvVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
