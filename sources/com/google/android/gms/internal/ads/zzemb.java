package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemb implements zzetr {
    private final AI zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    public zzemb(AI ai, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = ai;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 6;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        AI aiZzn = zzgch.zzn(this.zza, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzelz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return zzgch.zzh(new zzemc((String) obj));
            }
        }, this.zzb);
        zzbcc zzbccVar = zzbcl.zzmp;
        if (((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue() > 0) {
            aiZzn = zzgch.zzo(aiZzn, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzgch.zzf(aiZzn, Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzgch.zzh(new zzemc(Integer.toString(17))) : zzgch.zzh(new zzemc(null));
            }
        }, this.zzb);
    }
}
