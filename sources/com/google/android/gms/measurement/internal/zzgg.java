package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzgg implements Runnable {
    final /* synthetic */ zzac zza;
    final /* synthetic */ zzgv zzb;

    public zzgg(zzgv zzgvVar, zzac zzacVar) {
        this.zzb = zzgvVar;
        this.zza = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zzN(this.zza);
        } else {
            this.zzb.zza.zzT(this.zza);
        }
    }
}
