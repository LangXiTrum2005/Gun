package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeur implements zzetr {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbzd zzg;

    public zzeur(zzbzd zzbzdVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzbzdVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return (zzgby) zzgch.zze((zzgby) zzgch.zzo((zzgby) zzgch.zzm(zzgby.zzu(this.zzg.zza(this.zza, this.zzd)), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzeup
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        }, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbe)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzeuq
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, this.zzc);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public final /* synthetic */ zzeus zzc(AdvertisingIdClient.Info info) {
        zzfra zzfraVar = new zzfra();
        if (!this.zze) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdj)).booleanValue()) {
                zzfre zzfreVarZzj = zzfre.zzj(this.zza);
                Objects.requireNonNull(info);
                String id = info.getId();
                Objects.requireNonNull(id);
                zzfraVar = zzfreVarZzj.zzi(id, this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdp)).longValue(), this.zzf);
            } else if (this.zze) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdk)).booleanValue()) {
                    try {
                        zzfre zzfreVarZzj2 = zzfre.zzj(this.zza);
                        Objects.requireNonNull(info);
                        String id2 = info.getId();
                        Objects.requireNonNull(id2);
                        zzfraVar = zzfreVarZzj2.zzi(id2, this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdp)).longValue(), this.zzf);
                    } catch (IOException | IllegalArgumentException e) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdIdInfoSignalSource.getPaidV1");
                        zzfraVar = new zzfra();
                    }
                }
            }
        } else if (this.zze) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdk)).booleanValue()) {
                zzfre zzfreVarZzj3 = zzfre.zzj(this.zza);
                Objects.requireNonNull(info);
                String id3 = info.getId();
                Objects.requireNonNull(id3);
                zzfraVar = zzfreVarZzj3.zzi(id3, this.zza.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdp)).longValue(), this.zzf);
            }
        }
        return new zzeus(info, null, zzfraVar);
    }

    public final /* synthetic */ zzeus zzd(Throwable th) {
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzeus(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzfra());
    }
}
