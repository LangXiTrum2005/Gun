package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxy extends zzdxs {
    private String zzg;
    private int zzh = 1;

    public zzdxy(Context context) {
        this.zzf = new zzbup(context, com.google.android.gms.ads.internal.zzv.zzu().zzb(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        int i = this.zzh;
                        if (i == 2) {
                            this.zzf.zzp().zze(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmM)).booleanValue() ? new zzdxr(this.zza, this.zze) : new zzdxq(this));
                        } else if (i == 3) {
                            this.zzf.zzp().zzh(this.zzg, ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmM)).booleanValue() ? new zzdxr(this.zza, this.zze) : new zzdxq(this));
                        } else {
                            this.zza.zzd(new zzdyh(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdyh(1));
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                        this.zza.zzd(new zzdyh(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxs, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyh(1));
    }

    public final AI zza(zzbvk zzbvkVar) {
        synchronized (this.zzb) {
            try {
                int i = this.zzh;
                if (i != 1 && i != 2) {
                    return zzgch.zzg(new zzdyh(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbvkVar;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                }, zzbzw.zzg);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AI zzd(String str) {
        synchronized (this.zzb) {
            try {
                int i = this.zzh;
                if (i != 1 && i != 3) {
                    return zzgch.zzg(new zzdyh(2));
                }
                if (this.zzc) {
                    return this.zza;
                }
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                }, zzbzw.zzg);
                return this.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
