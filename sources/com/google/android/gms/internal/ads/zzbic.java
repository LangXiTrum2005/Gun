package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbic extends zzbhg {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbic(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbhh
    public final void zze(com.google.android.gms.ads.internal.client.zzby zzbyVar, IObjectWrapper iObjectWrapper) {
        if (zzbyVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbyVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbyVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        try {
            if (zzbyVar.zzj() instanceof zzayy) {
                zzayy zzayyVar = (zzayy) zzbyVar.zzj();
                adManagerAdView.setAppEventListener(zzayyVar != null ? zzayyVar.zzb() : null);
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzbib(this, adManagerAdView, zzbyVar));
    }
}
