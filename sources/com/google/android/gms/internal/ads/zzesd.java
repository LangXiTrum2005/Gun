package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesd implements zzetr {
    private final zzetr zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzesd(zzetr zzetrVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetrVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        AI aiZzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcr)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            aiZzb = zzgch.zzo(aiZzb, j, timeUnit, this.zzc);
        }
        return zzgch.zzf(aiZzb, Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzesc
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzbzw.zzg);
    }

    public final /* synthetic */ AI zzc(Throwable th) throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcq)).booleanValue()) {
            zzetr zzetrVar = this.zza;
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "OptionalSignalTimeout:" + zzetrVar.zza());
        }
        return zzgch.zzh(null);
    }
}
