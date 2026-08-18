package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzega {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcrc zzc;
    private final zzegq zzd;
    private final zzfiv zze;
    private final zzgdb zzf = zzgdb.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzegb zzh;
    private zzfca zzi;

    public zzega(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcrc zzcrcVar, zzegq zzegqVar, zzfiv zzfivVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcrcVar;
        this.zzd = zzegqVar;
        this.zze = zzfivVar;
    }

    private final synchronized AI zzd(zzfbo zzfboVar) {
        Iterator it = zzfboVar.zza.iterator();
        while (it.hasNext()) {
            zzecw zzecwVarZza = this.zzc.zza(zzfboVar.zzb, (String) it.next());
            if (zzecwVarZza != null && zzecwVarZza.zzb(this.zzi, zzfboVar)) {
                return zzgch.zzo(zzecwVarZza.zza(this.zzi, zzfboVar), zzfboVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgch.zzg(new zzdvy(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(@Nullable zzfbo zzfboVar) {
        AI aiZzd = zzd(zzfboVar);
        this.zzd.zzf(this.zzi, zzfboVar, aiZzd, this.zze);
        zzgch.zzr(aiZzd, new zzefz(this, zzfboVar), this.zza);
    }

    public final synchronized AI zzb(zzfca zzfcaVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (zzfcaVar.zzb.zza.isEmpty()) {
                    this.zzf.zzd(new zzegu(3, zzegx.zzc(zzfcaVar)));
                } else {
                    this.zzi = zzfcaVar;
                    this.zzh = new zzegb(zzfcaVar, this.zzd, this.zzf);
                    this.zzd.zzk(zzfcaVar.zzb.zza);
                    zzfbo zzfboVarZza = this.zzh.zza();
                    while (zzfboVarZza != null) {
                        zze(zzfboVarZza);
                        zzfboVarZza = this.zzh.zza();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzf;
    }
}
