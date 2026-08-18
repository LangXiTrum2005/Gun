package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbwm;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbww;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbxd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfq extends zzbwo {
    private static void zzr(final zzbww zzbwwVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfp
            @Override // java.lang.Runnable
            public final void run() {
                zzbww zzbwwVar2 = zzbwwVar;
                if (zzbwwVar2 != null) {
                    try {
                        zzbwwVar2.zze(1);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final zzdy zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    @Nullable
    public final zzbwm zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzf(zzm zzmVar, zzbww zzbwwVar) throws RemoteException {
        zzr(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzg(zzm zzmVar, zzbww zzbwwVar) throws RemoteException {
        zzr(zzbwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(zzdo zzdoVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(zzbws zzbwsVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzl(zzbxd zzbxdVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(zzbwx zzbwxVar) throws RemoteException {
    }
}
