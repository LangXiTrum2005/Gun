package com.google.android.gms.internal.ads;

import com.umeng.ccg.a;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdrw {
    private final zzdsb zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdrw(zzdsb zzdsbVar, Executor executor) {
        this.zza = zzdsbVar;
        this.zzc = zzdsbVar.zza();
        this.zzb = executor;
    }

    public final zzdrv zza() {
        zzdrv zzdrvVar = new zzdrv(this);
        zzdrv.zza(zzdrvVar);
        return zzdrvVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlw)).booleanValue()) {
            zzdrv zzdrvVarZza = zza();
            zzdrvVarZza.zzb(a.w, "pecr");
            zzdrvVarZza.zzg();
        }
    }
}
