package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaal {
    private final zzaak zza;
    private final zzaap zzb;
    private boolean zzc;
    private long zzf;
    private boolean zzi;
    private int zzd = 0;
    private long zze = C.TIME_UNSET;
    private long zzg = C.TIME_UNSET;
    private long zzh = C.TIME_UNSET;
    private float zzj = 1.0f;
    private zzcx zzk = zzcx.zza;

    public zzaal(Context context, zzaak zzaakVar, long j) {
        this.zza = zzaakVar;
        this.zzb = new zzaap(context);
    }

    private final void zzq(int i) {
        this.zzd = Math.min(this.zzd, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r6 > 100000) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r21 >= r25) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        if (r18.zzc != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(long r19, long r21, long r23, long r25, boolean r27, com.google.android.gms.internal.ads.zzaaj r28) throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaal.zza(long, long, long, long, boolean, com.google.android.gms.internal.ads.zzaaj):int");
    }

    public final void zzb() {
        if (this.zzd == 0) {
            this.zzd = 1;
        }
    }

    public final void zzc(boolean z) {
        this.zzi = z;
        this.zzh = C.TIME_UNSET;
    }

    public final void zzd() {
        zzq(0);
    }

    public final void zze(boolean z) {
        this.zzd = z ? 1 : 0;
    }

    public final void zzf() {
        zzq(2);
    }

    public final void zzg() {
        this.zzc = true;
        this.zzf = zzei.zzs(this.zzk.zzb());
        this.zzb.zzg();
    }

    public final void zzh() {
        this.zzc = false;
        this.zzh = C.TIME_UNSET;
        this.zzb.zzh();
    }

    public final void zzi() {
        this.zzb.zzf();
        this.zzg = C.TIME_UNSET;
        this.zze = C.TIME_UNSET;
        zzq(1);
        this.zzh = C.TIME_UNSET;
    }

    public final void zzj(int i) {
        this.zzb.zzj(i);
    }

    public final void zzk(zzcx zzcxVar) {
        this.zzk = zzcxVar;
    }

    public final void zzl(float f) {
        this.zzb.zzc(f);
    }

    public final void zzm(@Nullable Surface surface) {
        this.zzb.zzi(surface);
        zzq(1);
    }

    public final void zzn(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        zzcw.zzd(f > 0.0f);
        if (f == this.zzj) {
            return;
        }
        this.zzj = f;
        this.zzb.zze(f);
    }

    public final boolean zzo(boolean z) {
        boolean z2 = true;
        if (z && this.zzd == 3) {
            this.zzh = C.TIME_UNSET;
        } else {
            if (this.zzh == C.TIME_UNSET) {
                return false;
            }
            if (this.zzk.zzb() >= this.zzh) {
                z2 = false;
                this.zzh = C.TIME_UNSET;
            }
        }
        return z2;
    }

    public final boolean zzp() {
        int i = this.zzd;
        this.zzd = 3;
        this.zzf = zzei.zzs(this.zzk.zzb());
        return i != 3;
    }
}
