package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpl extends zzaya implements zzbpn {
    public zzbpl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final IObjectWrapper zze() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbpn
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
