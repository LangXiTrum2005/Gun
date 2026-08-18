package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
final class zzgbc extends zzgbe {
    public zzgbc(AI ai, zzgbo zzgboVar) {
        super(ai, zzgboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgbo zzgboVar = (zzgbo) obj;
        AI aiZza = zzgboVar.zza(obj2);
        zzfun.zzd(aiZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgboVar);
        return aiZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgbe
    public final /* synthetic */ void zzf(Object obj) {
        zzs((AI) obj);
    }
}
