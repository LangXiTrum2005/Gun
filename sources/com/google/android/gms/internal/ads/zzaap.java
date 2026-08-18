package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaap {
    private final zzzj zza = new zzzj();

    @Nullable
    private final zzaan zzb;

    @Nullable
    private final zzaao zzc;
    private boolean zzd;

    @Nullable
    private Surface zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private int zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;

    public zzaap(@Nullable Context context) {
        DisplayManager displayManager;
        zzaan zzaanVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new zzaan(this, displayManager);
        this.zzb = zzaanVar;
        this.zzc = zzaanVar != null ? zzaao.zza() : null;
        this.zzk = C.TIME_UNSET;
        this.zzl = C.TIME_UNSET;
        this.zzf = -1.0f;
        this.zzi = 1.0f;
        this.zzj = 0;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaap zzaapVar, Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            zzaapVar.zzk = refreshRate;
            zzaapVar.zzl = (refreshRate * 80) / 100;
        } else {
            zzdo.zzf("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            zzaapVar.zzk = C.TIME_UNSET;
            zzaapVar.zzl = C.TIME_UNSET;
        }
    }

    private final void zzk() {
        Surface surface;
        if (zzei.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE || this.zzh == 0.0f) {
            return;
        }
        this.zzh = 0.0f;
        zzaam.zza(surface, 0.0f);
    }

    private final void zzl() {
        this.zzm = 0L;
        this.zzp = -1L;
        this.zzn = -1L;
    }

    private final void zzm() {
        if (zzei.zza < 30 || this.zze == null) {
            return;
        }
        float fZza = this.zza.zzg() ? this.zza.zza() : this.zzf;
        float f = this.zzg;
        if (fZza != f) {
            if (fZza != -1.0f && f != -1.0f) {
                float f2 = 1.0f;
                if (this.zza.zzg() && this.zza.zzd() >= 5000000000L) {
                    f2 = 0.02f;
                }
                if (Math.abs(fZza - this.zzg) < f2) {
                    return;
                }
            } else if (fZza == -1.0f && this.zza.zzb() < 30) {
                return;
            }
            this.zzg = fZza;
            zzn(false);
        }
    }

    private final void zzn(boolean z) {
        Surface surface;
        if (zzei.zza < 30 || (surface = this.zze) == null || this.zzj == Integer.MIN_VALUE) {
            return;
        }
        float f = 0.0f;
        if (this.zzd) {
            float f2 = this.zzg;
            if (f2 != -1.0f) {
                f = this.zzi * f2;
            }
        }
        if (z || this.zzh != f) {
            this.zzh = f;
            zzaam.zza(surface, f);
        }
    }

    public final long zza(long j) {
        long j2;
        if (this.zzp != -1 && this.zza.zzg()) {
            long jZzc = this.zzq + ((long) (((this.zzm - this.zzp) * this.zza.zzc()) / this.zzi));
            if (Math.abs(j - jZzc) > 20000000) {
                zzl();
            } else {
                j = jZzc;
            }
        }
        this.zzn = this.zzm;
        this.zzo = j;
        zzaao zzaaoVar = this.zzc;
        if (zzaaoVar != null && this.zzk != C.TIME_UNSET) {
            long j3 = zzaaoVar.zza;
            if (j3 != C.TIME_UNSET) {
                long j4 = this.zzk;
                long j5 = (((j - j3) / j4) * j4) + j3;
                if (j <= j5) {
                    j2 = j5 - j4;
                } else {
                    j2 = j5;
                    j5 = j4 + j5;
                }
                long j6 = this.zzl;
                if (j5 - j >= j - j2) {
                    j5 = j2;
                }
                return j5 - j6;
            }
        }
        return j;
    }

    public final void zzc(float f) {
        this.zzf = f;
        this.zza.zzf();
        zzm();
    }

    public final void zzd(long j) {
        long j2 = this.zzn;
        if (j2 != -1) {
            this.zzp = j2;
            this.zzq = this.zzo;
        }
        this.zzm++;
        this.zza.zze(j * 1000);
        zzm();
    }

    public final void zze(float f) {
        this.zzi = f;
        zzl();
        zzn(false);
    }

    public final void zzf() {
        zzl();
    }

    public final void zzg() {
        this.zzd = true;
        zzl();
        if (this.zzb != null) {
            zzaao zzaaoVar = this.zzc;
            zzaaoVar.getClass();
            zzaaoVar.zzb();
            this.zzb.zza();
        }
        zzn(false);
    }

    public final void zzh() {
        this.zzd = false;
        zzaan zzaanVar = this.zzb;
        if (zzaanVar != null) {
            zzaanVar.zzb();
            zzaao zzaaoVar = this.zzc;
            zzaaoVar.getClass();
            zzaaoVar.zzc();
        }
        zzk();
    }

    public final void zzi(@Nullable Surface surface) {
        if (this.zze == surface) {
            return;
        }
        zzk();
        this.zze = surface;
        zzn(true);
    }

    public final void zzj(int i) {
        if (this.zzj == i) {
            return;
        }
        this.zzj = i;
        zzn(true);
    }
}
