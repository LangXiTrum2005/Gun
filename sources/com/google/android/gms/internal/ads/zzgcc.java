package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgcc extends zzgca implements AI {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI
    public final void addListener(Runnable runnable, Executor executor) {
        zzc().addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgca
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    public abstract AI zzc();
}
