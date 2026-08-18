package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfcu implements zzgcd {
    final /* synthetic */ zzfcv zza;
    final /* synthetic */ int zzb;

    public zzfcu(zzfcv zzfcvVar, int i) {
        this.zzb = i;
        this.zza = zzfcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = this.zzb;
        this.zza.zzb((String) obj, i);
    }
}
