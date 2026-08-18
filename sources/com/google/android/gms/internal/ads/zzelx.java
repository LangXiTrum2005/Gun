package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelx implements zzetq {

    @Nullable
    private final String zza;

    public zzelx(@Nullable String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = this.zza;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (str != null) {
            zzcuvVar.zza.putString("arek", str);
        }
    }
}
