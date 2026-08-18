package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzgdc implements Runnable {

    @CheckForNull
    zzgdf zza;

    public zzgdc(zzgdf zzgdfVar) {
        this.zza = zzgdfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AI ai;
        zzgdf zzgdfVar = this.zza;
        if (zzgdfVar == null || (ai = zzgdfVar.zza) == null) {
            return;
        }
        this.zza = null;
        if (ai.isDone()) {
            zzgdfVar.zzs(ai);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzgdfVar.zzb;
            zzgdfVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgdfVar.zzd(new zzgdd(str, null));
                    throw th;
                }
            }
            zzgdfVar.zzd(new zzgdd(str + ": " + ai.toString(), null));
            ai.cancel(true);
        } catch (Throwable th2) {
            ai.cancel(true);
            throw th2;
        }
    }
}
