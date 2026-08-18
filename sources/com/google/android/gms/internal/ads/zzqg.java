package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
final class zzqg {

    @Nullable
    private Exception zza;
    private long zzb = C.TIME_UNSET;
    private long zzc = C.TIME_UNSET;

    public final void zza() {
        this.zza = null;
        this.zzb = C.TIME_UNSET;
        this.zzc = C.TIME_UNSET;
    }

    public final void zzb(Exception exc) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
        }
        if (this.zzb == C.TIME_UNSET && !zzqm.zzK()) {
            this.zzb = 200 + jElapsedRealtime;
        }
        long j = this.zzb;
        if (j == C.TIME_UNSET || jElapsedRealtime < j) {
            this.zzc = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = this.zza;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = this.zza;
        zza();
        throw exc3;
    }

    public final boolean zzc() {
        if (this.zza == null) {
            return false;
        }
        return zzqm.zzK() || SystemClock.elapsedRealtime() < this.zzc;
    }
}
