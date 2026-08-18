package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzdxs implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcab zza = new zzcab();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbvk zze;

    @GuardedBy("lock")
    @VisibleForTesting(otherwise = 3)
    protected zzbup zzf;

    public static void zzc(Context context, AI ai, Executor executor) {
        if (((Boolean) zzbed.zzj.zze()).booleanValue() || ((Boolean) zzbed.zzh.zze()).booleanValue()) {
            zzgch.zzr(ai, new zzdxp(context), executor);
        }
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdyh(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                    this.zzf.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
