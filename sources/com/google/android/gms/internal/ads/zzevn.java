package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevn implements zzetr {
    public zzevn(zzbza zzbzaVar, zzgcs zzgcsVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        final AI aiZzh = zzgch.zzh(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfJ)).booleanValue()) {
            aiZzh = zzgch.zzh(null);
        }
        final AI aiZzh2 = zzgch.zzh(null);
        return zzgch.zzc(aiZzh, aiZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzevm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevo((String) aiZzh.get(), (String) aiZzh2.get());
            }
        }, zzbzw.zza);
    }
}
