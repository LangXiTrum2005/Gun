package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzgcd;

/* JADX INFO: loaded from: classes2.dex */
final class zzaw implements zzgcd {
    final /* synthetic */ zzdeh zza;

    public zzaw(zzdeh zzdehVar) {
        this.zza = zzdehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        this.zza.zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* synthetic */ void zzb(@Nullable Object obj) {
        this.zza.zza((zzbk) obj);
    }
}
