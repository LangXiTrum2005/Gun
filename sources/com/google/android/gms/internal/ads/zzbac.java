package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbac extends zzayb implements zzbad {
    public zzbac() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbad zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof zzbad ? (zzbad) iInterfaceQueryLocalInterface : new zzbab(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbak zzbaiVar;
        switch (i) {
            case 2:
                com.google.android.gms.ads.internal.client.zzby zzbyVarZze = zze();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbyVarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof zzbah) {
                    }
                }
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbaiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbaiVar = iInterfaceQueryLocalInterface2 instanceof zzbak ? (zzbak) iInterfaceQueryLocalInterface2 : new zzbai(strongBinder2);
                }
                zzayc.zzc(parcel);
                zzi(iObjectWrapperAsInterface, zzbaiVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdy zzdyVarZzf = zzf();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzdyVarZzf);
                return true;
            case 6:
                boolean zZzg = zzayc.zzg(parcel);
                zzayc.zzc(parcel);
                zzg(zZzg);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdr zzdrVarZzb = com.google.android.gms.ads.internal.client.zzdq.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzh(zzdrVarZzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
