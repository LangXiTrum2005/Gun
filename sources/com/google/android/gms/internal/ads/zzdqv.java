package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdqv implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzdqv(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setEmptySet;
        final String strZza = ((zzewd) this.zza).zza();
        Context contextZza = ((zzche) this.zzb).zza();
        zzgcs zzgcsVarZzc = zzffh.zzc();
        Map mapZzb = ((zzhev) this.zzc).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeW)).booleanValue()) {
            zzbbj zzbbjVar = new zzbbj(new zzbbp(contextZza));
            zzbbjVar.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdqw
                @Override // com.google.android.gms.internal.ads.zzbbi
                public final void zza(zzbbq.zzt.zza zzaVar) {
                    zzaVar.zzO(strZza);
                }
            });
            setEmptySet = Collections.singleton(new zzddk(new zzdqy(zzbbjVar, mapZzb), zzgcsVarZzc));
        } else {
            setEmptySet = Collections.emptySet();
        }
        zzhez.zzb(setEmptySet);
        return setEmptySet;
    }
}
