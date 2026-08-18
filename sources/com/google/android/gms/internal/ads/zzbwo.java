package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbwo extends zzayb implements zzbwp {
    public zzbwo() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbwp zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzbwp ? (zzbwp) iInterfaceQueryLocalInterface : new zzbwn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbww zzbwuVar = null;
        zzbww zzbwuVar2 = null;
        zzbwx zzbwxVar = null;
        zzbws zzbwqVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwuVar = iInterfaceQueryLocalInterface instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface : new zzbwu(strongBinder);
                }
                zzayc.zzc(parcel);
                zzf(zzmVar, zzbwuVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzbwqVar = iInterfaceQueryLocalInterface2 instanceof zzbws ? (zzbws) iInterfaceQueryLocalInterface2 : new zzbwq(strongBinder2);
                }
                zzayc.zzc(parcel);
                zzk(zzbwqVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                int i3 = zzayc.zza;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzm(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzbwxVar = iInterfaceQueryLocalInterface3 instanceof zzbwx ? (zzbwx) iInterfaceQueryLocalInterface3 : new zzbwx(strongBinder3);
                }
                zzayc.zzc(parcel);
                zzp(zzbwxVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbxd zzbxdVar = (zzbxd) zzayc.zza(parcel, zzbxd.CREATOR);
                zzayc.zzc(parcel);
                zzl(zzbxdVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdo zzdoVarZzb = com.google.android.gms.ads.internal.client.zzdn.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzi(zzdoVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                zzayc.zze(parcel2, bundleZzb);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZzg = zzayc.zzg(parcel);
                zzayc.zzc(parcel);
                zzn(iObjectWrapperAsInterface2, zZzg);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbwm zzbwmVarZzd = zzd();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbwmVarZzd);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdy zzdyVarZzc = zzc();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzdyVarZzc);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdr zzdrVarZzb = com.google.android.gms.ads.internal.client.zzdq.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzj(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzbwuVar2 = iInterfaceQueryLocalInterface4 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface4 : new zzbwu(strongBinder4);
                }
                zzayc.zzc(parcel);
                zzg(zzmVar2, zzbwuVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZzg2 = zzayc.zzg(parcel);
                zzayc.zzc(parcel);
                zzh(zZzg2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
