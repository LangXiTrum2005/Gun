package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbmb extends zzayb implements zzbmc {
    public zzbmb() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbmf zzbmdVar;
        if (i == 3) {
            com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = zzb();
            parcel2.writeNoException();
            zzayc.zzf(parcel2, zzebVarZzb);
            return true;
        }
        if (i == 4) {
            zzd();
            parcel2.writeNoException();
            return true;
        }
        if (i == 5) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbmdVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                zzbmdVar = iInterfaceQueryLocalInterface instanceof zzbmf ? (zzbmf) iInterfaceQueryLocalInterface : new zzbmd(strongBinder);
            }
            zzayc.zzc(parcel);
            zzf(iObjectWrapperAsInterface, zzbmdVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 6) {
            IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayc.zzc(parcel);
            zze(iObjectWrapperAsInterface2);
            parcel2.writeNoException();
            return true;
        }
        if (i != 7) {
            return false;
        }
        zzbft zzbftVarZzc = zzc();
        parcel2.writeNoException();
        zzayc.zzf(parcel2, zzbftVarZzc);
        return true;
    }
}
