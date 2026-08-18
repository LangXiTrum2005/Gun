package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbpd extends zzayb implements zzbpe {
    public zzbpd() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbpe zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbpe ? (zzbpe) iInterfaceQueryLocalInterface : new zzbpc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            zzayc.zzc(parcel);
            zzbph zzbphVarZzb = zzb(string);
            parcel2.writeNoException();
            zzayc.zzf(parcel2, zzbphVarZzb);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzayc.zzc(parcel);
            boolean zZze = zze(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
        } else if (i == 3) {
            String string3 = parcel.readString();
            zzayc.zzc(parcel);
            zzbrd zzbrdVarZzc = zzc(string3);
            parcel2.writeNoException();
            zzayc.zzf(parcel2, zzbrdVarZzc);
        } else {
            if (i != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzayc.zzc(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
