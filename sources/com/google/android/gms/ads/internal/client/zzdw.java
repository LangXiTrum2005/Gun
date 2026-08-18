package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdw extends zzaya implements zzdy {
    public zzdw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        Bundle bundle = (Bundle) zzayc.zza(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final zzw zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        zzw zzwVar = (zzw) zzayc.zza(parcelZzcZ, zzw.CREATOR);
        parcelZzcZ.recycle();
        return zzwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(zzw.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }
}
