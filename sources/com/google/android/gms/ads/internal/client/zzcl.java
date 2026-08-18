package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcl extends zzayb implements zzcm {
    public zzcl() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static zzcm zzd(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return iInterfaceQueryLocalInterface instanceof zzcm ? (zzcm) iInterfaceQueryLocalInterface : new zzck(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        zzayc.zzc(parcel);
        zzc(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
