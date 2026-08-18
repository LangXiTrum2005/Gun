package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcf {
    private final boolean zza;
    private final zzfxn zzb;

    public /* synthetic */ zzgcf(boolean z, zzfxn zzfxnVar, zzgcg zzgcgVar) {
        this.zza = z;
        this.zzb = zzfxnVar;
    }

    public final AI zza(Callable callable, Executor executor) {
        return new zzgbu(this.zzb, this.zza, executor, callable);
    }
}
