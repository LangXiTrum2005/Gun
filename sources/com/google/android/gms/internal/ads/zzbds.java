package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbds {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final ScheduledExecutorService zzc;

    public zzbds(Context context, ScheduledExecutorService scheduledExecutorService, zzbdu zzbduVar, zzfhh zzfhhVar) {
        this.zzc = scheduledExecutorService;
    }

    public final AI zza() {
        return (zzgby) zzgch.zzo(zzgby.zzu(zzgch.zzh(null)), ((Long) zzbek.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
                return;
            }
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}
