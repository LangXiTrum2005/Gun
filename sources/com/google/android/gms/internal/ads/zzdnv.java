package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnv extends VideoController.VideoLifecycleCallbacks {
    private final zzdif zza;

    public zzdnv(zzdif zzdifVar) {
        this.zza = zzdifVar;
    }

    @Nullable
    private static com.google.android.gms.ads.internal.client.zzee zza(zzdif zzdifVar) {
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzj = zzdifVar.zzj();
        if (zzebVarZzj == null) {
            return null;
        }
        try {
            return zzebVarZzj.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzee zzeeVarZza = zza(this.zza);
        if (zzeeVarZza == null) {
            return;
        }
        try {
            zzeeVarZza.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzee zzeeVarZza = zza(this.zza);
        if (zzeeVarZza == null) {
            return;
        }
        try {
            zzeeVarZza.zzg();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzee zzeeVarZza = zza(this.zza);
        if (zzeeVarZza == null) {
            return;
        }
        try {
            zzeeVarZza.zzi();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
