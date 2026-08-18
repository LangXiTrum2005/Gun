package com.google.android.gms.internal.ads;

import android.os.Build;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewl implements zzetr {
    private final zzgcs zza;

    public zzewl(zzgcs zzgcsVar) {
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzW);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzX)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            map.put(str2, com.google.android.gms.ads.internal.util.zzcj.zza(str2));
                        }
                    }
                }
                return new zzewm(map);
            }
        });
    }
}
