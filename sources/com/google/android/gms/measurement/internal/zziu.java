package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zziu implements Runnable {
    final /* synthetic */ zzir zza;
    final /* synthetic */ zzir zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zziz zze;

    public zziu(zziz zzizVar, zzir zzirVar, zzir zzirVar2, long j, boolean z) {
        this.zze = zzizVar;
        this.zza = zzirVar;
        this.zzb = zzirVar2;
        this.zzc = j;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzA(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
