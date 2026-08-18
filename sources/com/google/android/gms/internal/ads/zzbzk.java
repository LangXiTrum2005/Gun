package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzk {
    private final Object zza = new Object();
    private volatile int zzc = 1;
    private volatile long zzb = 0;

    private zzbzk() {
    }

    public final void zza() {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc == 3) {
                    if (this.zzb + ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfP)).longValue() <= jCurrentTimeMillis) {
                        this.zzc = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        synchronized (this.zza) {
            try {
                if (this.zzc != 2) {
                    return;
                }
                this.zzc = 3;
                if (this.zzc == 3) {
                    this.zzb = jCurrentTimeMillis2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ zzbzk(zzbzl zzbzlVar) {
    }
}
