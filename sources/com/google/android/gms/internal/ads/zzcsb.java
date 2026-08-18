package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
final class zzcsb implements zzgcd {
    final /* synthetic */ zzcsd zza;

    public zzcsb(zzcsd zzcsdVar) {
        this.zza = zzcsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        this.zza.zzf.zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzf.zzn(true);
    }
}
