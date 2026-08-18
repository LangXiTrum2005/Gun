package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeun implements zzetq {

    @VisibleForTesting
    final String zza;
    final int zzb;

    public /* synthetic */ zzeun(String str, int i, zzeum zzeumVar) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            if (!TextUtils.isEmpty(this.zza)) {
                zzcuvVar.zza.putString("topics", this.zza);
            }
            int i = this.zzb;
            if (i != -1) {
                zzcuvVar.zza.putInt("atps", i);
            }
        }
    }
}
