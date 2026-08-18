package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeux implements zzetr {
    private final Executor zza;
    private final String zzb;

    public zzeux(zzbzd zzbzdVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return zzgch.zzf(zzgch.zzm(zzgch.zzh(this.zzb), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzeuv
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return new zzeuy((String) obj);
            }
        }, this.zza), Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzeuw
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    public final /* synthetic */ AI zzc(Throwable th) throws Exception {
        return zzgch.zzh(new zzeuy(this.zzb));
    }
}
