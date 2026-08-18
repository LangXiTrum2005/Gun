package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapv;

/* JADX INFO: loaded from: classes2.dex */
final class zzbi implements zzapq {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbk zzb;

    public zzbi(zzbo zzboVar, String str, zzbk zzbkVar) {
        this.zza = str;
        this.zzb = zzbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapq
    public final void zza(zzapv zzapvVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load URL: " + this.zza + "\n" + zzapvVar.toString());
        this.zzb.zza((Object) null);
    }
}
