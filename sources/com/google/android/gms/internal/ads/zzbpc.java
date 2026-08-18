package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpc extends zzaya implements zzbpe {
    public zzbpc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final zzbph zzb(String str) throws RemoteException {
        zzbph zzbpfVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            zzbpfVar = iInterfaceQueryLocalInterface instanceof zzbph ? (zzbph) iInterfaceQueryLocalInterface : new zzbpf(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbpfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final zzbrd zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzbrd zzbrdVarZzb = zzbrc.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbrdVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final boolean zzd(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final boolean zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
