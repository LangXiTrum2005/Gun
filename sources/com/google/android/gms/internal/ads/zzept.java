package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzept implements zzher {
    private final zzhfj zza;

    public zzept(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfxs zzfxsVarZzn;
        zzeol zzeolVarZza = zzeon.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zza.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeg)).booleanValue()) {
            zzfxsVarZzn = zzfxs.zzo(new zzesd(zzeolVarZza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeh)).intValue(), scheduledExecutorService));
        } else {
            zzfxsVarZzn = zzfxs.zzn();
        }
        zzhez.zzb(zzfxsVarZzn);
        return zzfxsVarZzn;
    }
}
