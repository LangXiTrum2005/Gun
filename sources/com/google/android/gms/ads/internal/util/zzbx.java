package com.google.android.gms.ads.internal.util;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbx {
    private long zza;
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbx(long j) {
        this.zza = j;
    }

    public final void zza(long j) {
        synchronized (this.zzc) {
            this.zza = j;
        }
    }

    public final boolean zzb() {
        synchronized (this.zzc) {
            try {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                if (this.zzb + this.zza > jElapsedRealtime) {
                    return false;
                }
                this.zzb = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
