package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbq extends zzayb implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzm zzmVar = (zzm) zzayc.zza(parcel, zzm.CREATOR);
            zzayc.zzc(parcel);
            zzg(zzmVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            int i3 = zzayc.zza;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) zzayc.zza(parcel, zzm.CREATOR);
            int i4 = parcel.readInt();
            zzayc.zzc(parcel);
            zzh(zzmVar2, i4);
            parcel2.writeNoException();
        }
        return true;
    }
}
