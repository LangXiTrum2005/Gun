package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzcau implements Runnable {
    final /* synthetic */ zzcaw zza;

    public zzcau(zzcaw zzcawVar) {
        this.zza = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcaw zzcawVar = this.zza;
        if (zzcawVar.zzq != null) {
            if (!zzcawVar.zzr) {
                zzcawVar.zzq.zzg();
                this.zza.zzr = true;
            }
            this.zza.zzq.zze();
        }
    }
}
