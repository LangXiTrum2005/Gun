package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
final class zzeoi {
    public final AI zza;
    private final long zzb;
    private final Clock zzc;

    public zzeoi(AI ai, long j, Clock clock) {
        this.zza = ai;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
