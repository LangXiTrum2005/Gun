package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zztk implements zzue, zzud {
    public final zzue zza;
    long zzb;

    @Nullable
    private zzud zzc;
    private zztj[] zzd = new zztj[0];
    private long zze = 0;

    public zztk(zzue zzueVar, boolean z, long j, long j2) {
        this.zza = zzueVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, zzlp zzlpVar) {
        if (j == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(zzlpVar.zzc, j));
        long j2 = zzlpVar.zzd;
        long j3 = this.zzb;
        long jMax2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (jMax != zzlpVar.zzc || jMax2 != zzlpVar.zzd) {
            zzlpVar = new zzlp(jMax, jMax2);
        }
        return this.zza.zza(j, zzlpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzb < j) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || jZzc < j) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = C.TIME_UNSET;
            long jZzd = zzd();
            return jZzd != C.TIME_UNSET ? jZzd : j;
        }
        long jZzd2 = this.zza.zzd();
        if (jZzd2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        zzcw.zzf(jZzd2 >= 0);
        long j2 = this.zzb;
        zzcw.zzf(j2 == Long.MIN_VALUE || jZzd2 <= j2);
        return jZzd2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        this.zze = C.TIME_UNSET;
        boolean z = false;
        for (zztj zztjVar : this.zzd) {
            if (zztjVar != null) {
                zztjVar.zzc();
            }
        }
        long jZze = this.zza.zze(j);
        if (jZze == j) {
            z = true;
        } else if (jZze >= 0) {
            long j2 = this.zzb;
            if (j2 == Long.MIN_VALUE || jZze <= j2) {
                z = true;
            }
        }
        zzcw.zzf(z);
        return jZze;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] zzxvVarArr, boolean[] zArr, zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        int length = zzvyVarArr.length;
        this.zzd = new zztj[length];
        zzvy[] zzvyVarArr2 = new zzvy[length];
        int i = 0;
        while (true) {
            zzvy zzvyVar = null;
            if (i >= zzvyVarArr.length) {
                break;
            }
            zztj[] zztjVarArr = this.zzd;
            zztj zztjVar = (zztj) zzvyVarArr[i];
            zztjVarArr[i] = zztjVar;
            if (zztjVar != null) {
                zzvyVar = zztjVar.zza;
            }
            zzvyVarArr2[i] = zzvyVar;
            i++;
        }
        long jZzf = this.zza.zzf(zzxvVarArr, zArr, zzvyVarArr2, zArr2, j);
        long j2 = (zzq() && j == 0) ? 0L : j;
        this.zze = C.TIME_UNSET;
        boolean z = true;
        if (jZzf != j2) {
            if (jZzf >= 0) {
                long j3 = this.zzb;
                if (j3 != Long.MIN_VALUE && jZzf > j3) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        zzcw.zzf(z);
        for (int i2 = 0; i2 < zzvyVarArr.length; i2++) {
            zzvy zzvyVar2 = zzvyVarArr2[i2];
            if (zzvyVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zztj[] zztjVarArr2 = this.zzd;
                zztj zztjVar2 = zztjVarArr2[i2];
                if (zztjVar2 == null || zztjVar2.zza != zzvyVar2) {
                    zztjVarArr2[i2] = new zztj(this, zzvyVar2);
                }
            }
            zzvyVarArr[i2] = this.zzd[i2];
        }
        return jZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final /* bridge */ /* synthetic */ void zzg(zzwa zzwaVar) {
        zzud zzudVar = this.zzc;
        zzudVar.getClass();
        zzudVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final zzwj zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzud
    public final void zzi(zzue zzueVar) {
        zzud zzudVar = this.zzc;
        zzudVar.getClass();
        zzudVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzudVar, long j) {
        this.zzc = zzudVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(zzkj zzkjVar) {
        return this.zza.zzo(zzkjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zza.zzp();
    }

    public final boolean zzq() {
        return this.zze != C.TIME_UNSET;
    }
}
