package com.google.android.gms.internal.ads;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeto implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzeto(zzgcs zzgcsVar, Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 37;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzetn zzc() throws Exception {
        return new zzetn(com.google.android.gms.ads.internal.util.zzad.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfX)));
    }
}
