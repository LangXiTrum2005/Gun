package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqk implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzeqk(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeug zzeugVarZzb = ((zzeuh) this.zza).zzb();
        zzeoj zzeojVar = (zzeoj) this.zzb.zzb();
        List list = (List) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        if (list.contains("39")) {
            return new zzesd(zzeojVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlT)).intValue(), scheduledExecutorService);
        }
        return new zzesd(zzeugVarZzb, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlT)).intValue(), scheduledExecutorService);
    }
}
