package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* JADX INFO: loaded from: classes2.dex */
public final class zzec extends zzaya implements zzee {
    public zzec(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() throws RemoteException {
        zzda(1, zza());
    }
}
