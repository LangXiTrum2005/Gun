package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzels implements zzetr {
    private final Clock zza;
    private final zzfcj zzb;

    public zzels(Clock clock, zzfcj zzfcjVar) {
        this.zza = clock;
        this.zzb = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return zzgch.zzh(new zzelt(this.zzb, this.zza.currentTimeMillis()));
    }
}
