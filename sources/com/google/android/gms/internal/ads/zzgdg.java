package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
final class zzgdg extends zzgcp {
    final /* synthetic */ zzgdi zza;
    private final zzgbn zzb;

    public zzgdg(zzgdi zzgdiVar, zzgbn zzgbnVar) {
        this.zza = zzgdiVar;
        this.zzb = zzgbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzgbn zzgbnVar = this.zzb;
        AI aiZza = zzgbnVar.zza();
        zzfun.zzd(aiZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgbnVar);
        return aiZza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    public final void zzd(Throwable th) {
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((AI) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
