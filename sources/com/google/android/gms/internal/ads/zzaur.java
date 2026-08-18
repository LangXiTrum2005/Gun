package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaur implements Runnable {
    final /* synthetic */ zzaus zza;

    public zzaur(zzaus zzausVar) {
        this.zza = zzausVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzo) {
            if (this.zza.zzp) {
                return;
            }
            this.zza.zzp = true;
            try {
                zzaus.zzj(this.zza);
            } catch (Exception e) {
                this.zza.zzh.zzc(2023, -1L, e);
            }
            synchronized (this.zza.zzo) {
                this.zza.zzp = false;
            }
        }
    }
}
