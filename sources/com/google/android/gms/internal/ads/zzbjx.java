package com.google.android.gms.internal.ads;

import com.umeng.analytics.pro.bc;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbjx implements zzgcd {
    final /* synthetic */ Map zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbkb zzd;

    public zzbjx(zzbkb zzbkbVar, Map map, com.google.android.gms.ads.internal.client.zza zzaVar, String str) {
        this.zza = map;
        this.zzb = zzaVar;
        this.zzc = str;
        this.zzd = zzbkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "OpenGmsgHandler.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjU)).booleanValue()) {
            this.zza.put(bc.aN, str);
        }
        this.zzd.zzh(str, this.zzb, this.zza, this.zzc);
    }
}
