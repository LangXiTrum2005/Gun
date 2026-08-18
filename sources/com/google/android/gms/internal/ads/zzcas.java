package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzcas implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcaw zzc;

    public zzcas(zzcaw zzcawVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.zzc;
        if (zzcawVar.zzq != null) {
            zzcawVar.zzq.zzj(this.zza, this.zzb);
        }
    }
}
