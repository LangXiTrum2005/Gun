package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
final class zzgau extends zzgaw {
    public zzgau(AI ai, Class cls, zzgbo zzgboVar) {
        super(ai, cls, zzgboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgbo zzgboVar = (zzgbo) obj;
        AI aiZza = zzgboVar.zza(th);
        zzfun.zzd(aiZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgboVar);
        return aiZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgaw
    public final /* synthetic */ void zzf(Object obj) {
        zzs((AI) obj);
    }
}
