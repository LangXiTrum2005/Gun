package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbys extends zzaya implements zzbyu {
    public zzbys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, iObjectWrapper3);
        return AbstractC3888ke0.e(zzcZ(11, parcelZza));
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzf(IObjectWrapper iObjectWrapper, zzbyy zzbyyVar, zzbyr zzbyrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzbyyVar);
        zzayc.zzf(parcelZza, zzbyrVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzg(zzbuc zzbucVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbucVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbttVar);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbttVar);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbttVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbttVar);
        zzda(5, parcelZza);
    }
}
