package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzffv {
    final /* synthetic */ zzfgf zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzffv(zzfgf zzfgfVar, Object obj, List list, zzfge zzfgeVar) {
        this.zza = zzfgfVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfgd zza(Callable callable) {
        zzgcf zzgcfVarZzb = zzgch.zzb(this.zzc);
        AI aiZza = zzgcfVarZzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzffu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzbzw.zzg);
        AI aiZza2 = zzgcfVarZzb.zza(callable, this.zza.zzb);
        return new zzfgd(this.zza, this.zzb, aiZza, this.zzc, aiZza2);
    }
}
