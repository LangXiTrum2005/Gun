package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdtj implements zzdsx {
    private final long zza;
    private final zzekv zzb;

    public zzdtj(long j, Context context, zzdtc zzdtcVar, zzcgx zzcgxVar, String str) {
        this.zza = j;
        zzezt zzeztVarZzv = zzcgxVar.zzv();
        zzeztVarZzv.zzc(context);
        zzeztVarZzv.zza(new com.google.android.gms.ads.internal.client.zzs());
        zzeztVarZzv.zzb(str);
        zzekv zzekvVarZza = zzeztVarZzv.zzd().zza();
        this.zzb = zzekvVarZza;
        zzekvVarZza.zzD(new zzdti(this, zzdtcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzb(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zzab(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsx
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
