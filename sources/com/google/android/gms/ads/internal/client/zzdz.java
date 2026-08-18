package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdz extends zzaya implements zzeb {
    public zzdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        int i = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final zzee zzi() throws RemoteException {
        zzee zzecVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzecVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzecVar = iInterfaceQueryLocalInterface instanceof zzee ? (zzee) iInterfaceQueryLocalInterface : new zzec(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzecVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(zzee zzeeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzeeVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
