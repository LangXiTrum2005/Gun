package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdq implements zzkg {
    private final zzyk zza = new zzyk(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @VisibleForTesting
    public final void zza(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zzb(zzog zzogVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzc(zzog zzogVar) {
        zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzd(zzog zzogVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zze(zzog zzogVar) {
        zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzf(zzkf zzkfVar, zzwj zzwjVar, zzxv[] zzxvVarArr) {
        int i;
        this.zzf = 0;
        for (zzxv zzxvVar : zzxvVarArr) {
            if (zzxvVar != null) {
                int i2 = this.zzf;
                int i3 = zzxvVar.zzg().zzc;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = C.DEFAULT_VIDEO_BUFFER_SIZE;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzg(zzog zzogVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzh(zzkf zzkfVar) {
        char c;
        long j = zzkfVar.zzb;
        boolean z = true;
        if (j > this.zzc) {
            c = 0;
        } else {
            c = j < this.zzb ? (char) 2 : (char) 1;
        }
        int iZza = this.zza.zza();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || iZza >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final /* synthetic */ boolean zzi(zzbq zzbqVar, zzug zzugVar, long j) {
        zzdo.zzf("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzj(zzkf zzkfVar) {
        long j = zzkfVar.zzd ? this.zze : this.zzd;
        return j <= 0 || zzkfVar.zzb >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzyk zzk() {
        return this.zza;
    }

    public final synchronized void zzl(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzo(int i) {
        this.zzb = ((long) i) * 1000;
    }
}
