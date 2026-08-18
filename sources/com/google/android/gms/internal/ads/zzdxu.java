package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxu extends zzdxs {
    private final Context zzg;
    private final Executor zzh;

    public zzdxu(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbup(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzf(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmM)).booleanValue() ? new zzdxr(this.zza, this.zze) : new zzdxq(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdyh(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "RemoteSignalsClientTask.onConnected");
                        this.zza.zzd(new zzdyh(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AI zza(zzbvk zzbvkVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbvkVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                }, zzbzw.zzg);
                zzdxs.zzc(this.zzg, this.zza, this.zzh);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
