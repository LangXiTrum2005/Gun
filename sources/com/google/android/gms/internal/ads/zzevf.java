package com.google.android.gms.internal.ads;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevf implements zzetr {
    final zzgcs zza;

    public zzevf(zzbay zzbayVar, zzgcs zzgcsVar, Context context) {
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeve
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevg(new JSONObject());
            }
        });
    }
}
