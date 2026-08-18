package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeop implements zzetr {
    private final zzgcs zza;
    private final zzdpr zzb;
    private final String zzc;
    private final zzfcj zzd;

    public zzeop(zzgcs zzgcsVar, zzdpr zzdprVar, zzfcj zzfcjVar, String str) {
        this.zza = zzgcsVar;
        this.zzb = zzdprVar;
        this.zzd = zzfcjVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeoo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzeoq zzc() throws Exception {
        zzdpr zzdprVar = this.zzb;
        return new zzeoq(zzdprVar.zzb(this.zzd.zzf, this.zzc), zzdprVar.zza());
    }
}
