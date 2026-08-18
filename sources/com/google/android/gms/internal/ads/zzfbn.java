package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.umeng.ccg.a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfbn {
    private final Clock zza;
    private final zzdrw zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfbn(Clock clock, zzdrw zzdrwVar) {
        this.zza = clock;
        this.zzb = zzdrwVar;
    }

    private final void zze() {
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfP)).longValue() <= jCurrentTimeMillis) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i, int i2) {
        zze();
        Object obj = this.zzc;
        long jCurrentTimeMillis = this.zza.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i) {
                    return;
                }
                this.zze = i2;
                if (this.zze == 3) {
                    this.zzd = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmS)).booleanValue()) {
            zzdrv zzdrvVarZza = this.zzb.zza();
            zzdrvVarZza.zzb(a.w, "mbs_state");
            zzdrvVarZza.zzb("mbs_state", true != z ? "0" : "1");
            zzdrvVarZza.zzg();
        }
        if (z) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 3;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzc) {
            zze();
            z = this.zze == 2;
        }
        return z;
    }
}
