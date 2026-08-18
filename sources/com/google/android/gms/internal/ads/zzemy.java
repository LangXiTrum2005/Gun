package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemy implements zzetr {
    private final zzgcs zza;
    private final zzfcj zzb;
    private final zzbzq zzc;

    public zzemy(zzgcs zzgcsVar, zzfcj zzfcjVar, zzbzq zzbzqVar) {
        this.zza = zzgcsVar;
        this.zzb = zzfcjVar;
        this.zzc = zzbzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 9;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzemz zzc() throws Exception {
        return new zzemz(this.zzb.zzj, this.zzc.zzm());
    }
}
