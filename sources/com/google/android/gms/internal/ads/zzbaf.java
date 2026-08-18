package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbaf extends zzayb implements zzbag {
    public zzbaf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbag zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof zzbag ? (zzbag) iInterfaceQueryLocalInterface : new zzbae(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbad zzbabVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbabVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbabVar = iInterfaceQueryLocalInterface instanceof zzbad ? (zzbad) iInterfaceQueryLocalInterface : new zzbab(strongBinder);
            }
            zzayc.zzc(parcel);
            zzd(zzbabVar);
        } else if (i == 2) {
            parcel.readInt();
            zzayc.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzayc.zzc(parcel);
            zzc(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
