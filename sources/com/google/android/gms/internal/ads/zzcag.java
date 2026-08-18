package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzcag implements zzgcd {
    final /* synthetic */ zzcai zza;

    public zzcag(zzcai zzcaiVar) {
        this.zza = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        this.zza.zzb.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(@Nullable Object obj) {
        this.zza.zzb.set(1);
    }
}
