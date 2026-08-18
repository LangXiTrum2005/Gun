package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzcap implements Runnable {
    final /* synthetic */ zzcaw zza;

    public zzcap(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar.zzq != null) {
            zzcawVar.zzq.zza();
        }
    }
}
