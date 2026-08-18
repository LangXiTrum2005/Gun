package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzgr implements Runnable {
    final /* synthetic */ zzlk zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ zzgv zzc;

    public zzgr(zzgv zzgvVar, zzlk zzlkVar, zzq zzqVar) {
        this.zzc = zzgvVar;
        this.zza = zzlkVar;
        this.zzb = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzP(this.zza.zzb, this.zzb);
        } else {
            this.zzc.zza.zzW(this.zza, this.zzb);
        }
    }
}
