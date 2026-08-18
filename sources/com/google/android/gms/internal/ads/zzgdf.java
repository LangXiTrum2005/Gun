package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzgdf extends zzgbx {

    @CheckForNull
    private AI zza;

    @CheckForNull
    private ScheduledFuture zzb;

    private zzgdf(AI ai) {
        ai.getClass();
        this.zza = ai;
    }

    public static AI zzf(AI ai, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgdf zzgdfVar = new zzgdf(ai);
        zzgdc zzgdcVar = new zzgdc(zzgdfVar);
        zzgdfVar.zzb = scheduledExecutorService.schedule(zzgdcVar, j, timeUnit);
        ai.addListener(zzgdcVar, zzgbv.INSTANCE);
        return zzgdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @CheckForNull
    public final String zza() {
        AI ai = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (ai == null) {
            return null;
        }
        String strB = DM.B("inputFuture=[", ai.toString(), "]");
        if (scheduledFuture == null) {
            return strB;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return strB;
        }
        return strB + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
