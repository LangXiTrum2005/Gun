package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzenc implements zzetr {
    private final Executor zza;
    private final zzbzm zzb;

    public zzenc(Executor executor, zzbzm zzbzmVar) {
        this.zza = executor;
        this.zzb = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcW)).booleanValue() ? zzgch.zzh(new zzend(null)) : zzgch.zzm(this.zzb.zzk(), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzenb
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                ArrayList arrayList = (ArrayList) obj;
                if (true == arrayList.isEmpty()) {
                    arrayList = null;
                }
                return new zzend(arrayList);
            }
        }, this.zza);
    }
}
