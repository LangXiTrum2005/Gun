package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzgl implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzgv zzb;

    public zzgl(zzgv zzgvVar, zzq zzqVar) {
        this.zzb = zzgvVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzA();
        this.zzb.zza.zzQ(this.zza);
    }
}
