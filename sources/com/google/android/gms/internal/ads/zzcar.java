package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzcar implements Runnable {
    final /* synthetic */ zzcaw zza;

    public zzcar(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar.zzq != null) {
            zzcawVar.zzq.zzh();
        }
    }
}
