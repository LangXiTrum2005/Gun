package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class zzejc implements com.google.android.gms.ads.internal.zzg {
    final /* synthetic */ zzder zza;

    public zzejc(zzejd zzejdVar, zzder zzderVar) {
        this.zza = zzderVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
