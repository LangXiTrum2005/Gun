package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzapk implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzapm zzc;

    public zzapk(zzapm zzapmVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzapmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zza(this.zza, this.zzb);
        zzapm zzapmVar = this.zzc;
        zzapmVar.zza.zzb(zzapmVar.toString());
    }
}
