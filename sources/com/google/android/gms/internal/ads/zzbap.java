package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes3.dex */
final class zzbap implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbar zza;

    public zzbap(zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                zzbar zzbarVar = this.zza;
                if (zzbarVar.zzd != null) {
                    zzbarVar.zzf = zzbarVar.zzd.zzq();
                }
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e);
                zzbar.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
