package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdk extends zzayb implements zzdl {
    public zzdk() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zze zzeVar = (zze) zzayc.zza(parcel, zze.CREATOR);
        zzayc.zzc(parcel);
        zze(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
