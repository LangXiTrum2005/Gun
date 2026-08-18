package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbpe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcv extends zzayb implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcw asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof zzcw ? (zzcw) iInterfaceQueryLocalInterface : new zzcu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzfb liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzayc.zze(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            zzbpe adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzayc.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
