package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemv implements zzetq {

    @Nullable
    private final String zza;
    private final boolean zzb;

    public zzemv(@Nullable String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (str != null) {
            Bundle bundleZza = zzfcx.zza(zzcuvVar.zza, "pii");
            bundleZza.putString("afai", str);
            bundleZza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
