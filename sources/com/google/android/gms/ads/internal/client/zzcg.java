package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcg extends zzaya implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbad zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        zzbad zzbadVarZzb = zzbac.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbadVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzby zzf(String str) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(7, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final zzbwp zzg(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzbwp zzbwpVarZzq = zzbwo.zzq(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbwpVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzh(zzbpe zzbpeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbpeVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzi(List list, zzcf zzcfVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzayc.zzf(parcelZza, zzcfVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzj(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzk(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(6, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final boolean zzl(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
