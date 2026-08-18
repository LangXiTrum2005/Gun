package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeeq implements zzecw {
    private final zzcpq zza;
    private final zzedx zzb;
    private final zzgcs zzc;
    private final zzcvv zzd;
    private final ScheduledExecutorService zze;
    private final zzdrq zzf;

    public zzeeq(zzcpq zzcpqVar, zzedx zzedxVar, zzcvv zzcvvVar, ScheduledExecutorService scheduledExecutorService, zzgcs zzgcsVar, zzdrq zzdrqVar) {
        this.zza = zzcpqVar;
        this.zzb = zzedxVar;
        this.zzd = zzcvvVar;
        this.zze = scheduledExecutorService;
        this.zzc = zzgcsVar;
        this.zzf = zzdrqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final AI zza(final zzfca zzfcaVar, final zzfbo zzfboVar) {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeen
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc(zzfcaVar, zzfboVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfcaVar, zzfbo zzfboVar) {
        zzbhn zzbhnVarZza = zzfcaVar.zza.zza.zza();
        boolean zZzb = this.zzb.zzb(zzfcaVar, zzfboVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlQ)).booleanValue()) {
            this.zzf.zzb().put("has_dbl", zzbhnVarZza != null ? "1" : "0");
            this.zzf.zzb().put("crdb", true == zZzb ? "1" : "0");
        }
        return zzbhnVarZza != null && zZzb;
    }

    public final /* synthetic */ zzcom zzc(final zzfca zzfcaVar, final zzfbo zzfboVar) throws Exception {
        return this.zza.zzb(new zzcrp(zzfcaVar, zzfboVar, null), new zzcqh(zzfcaVar.zza.zza.zza(), new Runnable() { // from class: com.google.android.gms.internal.ads.zzeeo
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(zzfcaVar, zzfboVar);
            }
        })).zza();
    }

    public final /* synthetic */ void zzf(zzfca zzfcaVar, zzfbo zzfboVar) {
        zzgch.zzr(zzgch.zzo(this.zzb.zza(zzfcaVar, zzfboVar), zzfboVar.zzR, TimeUnit.SECONDS, this.zze), new zzeep(this), this.zzc);
    }
}
