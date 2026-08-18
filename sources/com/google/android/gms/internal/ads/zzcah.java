package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzcah implements zzgcd {
    final /* synthetic */ zzcaf zza;
    final /* synthetic */ zzcad zzb;

    public zzcah(zzcai zzcaiVar, zzcaf zzcafVar, zzcad zzcadVar) {
        this.zza = zzcafVar;
        this.zzb = zzcadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(@Nullable Object obj) {
        this.zza.zza(obj);
    }
}
