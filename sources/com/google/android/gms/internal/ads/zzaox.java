package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaox implements Runnable {
    final /* synthetic */ zzapm zza;
    final /* synthetic */ zzaoy zzb;

    public zzaox(zzaoy zzaoyVar, zzapm zzapmVar) {
        this.zza = zzapmVar;
        this.zzb = zzaoyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc.put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
