package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbwp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzch extends zzayb implements zzci {
    public zzch() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzcf zzcdVar;
        switch (i) {
            case 1:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzft.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzcdVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    zzcdVar = iInterfaceQueryLocalInterface instanceof zzcf ? (zzcf) iInterfaceQueryLocalInterface : new zzcd(strongBinder);
                }
                zzayc.zzc(parcel);
                zzi(arrayListCreateTypedArrayList, zzcdVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String string = parcel.readString();
                zzayc.zzc(parcel);
                boolean zZzl = zzl(string);
                parcel2.writeNoException();
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 3:
                String string2 = parcel.readString();
                zzayc.zzc(parcel);
                zzbwp zzbwpVarZzg = zzg(string2);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbwpVarZzg);
                return true;
            case 4:
                String string3 = parcel.readString();
                zzayc.zzc(parcel);
                boolean zZzj = zzj(string3);
                parcel2.writeNoException();
                parcel2.writeInt(zZzj ? 1 : 0);
                return true;
            case 5:
                String string4 = parcel.readString();
                zzayc.zzc(parcel);
                zzbad zzbadVarZze = zze(string4);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbadVarZze);
                return true;
            case 6:
                String string5 = parcel.readString();
                zzayc.zzc(parcel);
                boolean zZzk = zzk(string5);
                parcel2.writeNoException();
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 7:
                String string6 = parcel.readString();
                zzayc.zzc(parcel);
                zzby zzbyVarZzf = zzf(string6);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbyVarZzf);
                return true;
            case 8:
                zzbpe zzbpeVarZzf = zzbpd.zzf(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzh(zzbpeVarZzf);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
