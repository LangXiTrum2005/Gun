package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdg extends zzayb implements zzdh {
    public zzdg() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzdh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof zzdh ? (zzdh) iInterfaceQueryLocalInterface : new zzdf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else {
            if (i != 2) {
                return false;
            }
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        }
        return true;
    }
}
