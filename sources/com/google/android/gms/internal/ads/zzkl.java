package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
final class zzkl {
    public final zzue zza;
    public final Object zzb;
    public final zzvy[] zzc;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzkm zzg;
    public boolean zzh;
    private final boolean[] zzi;
    private final zzlm[] zzj;
    private final zzyb zzk;
    private final zzla zzl;

    @Nullable
    private zzkl zzm;
    private zzwj zzn;
    private zzyc zzo;
    private long zzp;

    public zzkl(zzlm[] zzlmVarArr, long j, zzyb zzybVar, zzyk zzykVar, zzla zzlaVar, zzkm zzkmVar, zzyc zzycVar, long j2) {
        this.zzj = zzlmVarArr;
        this.zzp = j;
        this.zzk = zzybVar;
        this.zzl = zzlaVar;
        zzug zzugVar = zzkmVar.zza;
        this.zzb = zzugVar.zza;
        this.zzg = zzkmVar;
        this.zzn = zzwj.zza;
        this.zzo = zzycVar;
        this.zzc = new zzvy[2];
        this.zzi = new boolean[2];
        long j3 = zzkmVar.zzb;
        long j4 = zzkmVar.zzd;
        zzue zzueVarZzp = zzlaVar.zzp(zzugVar, zzykVar, j3);
        this.zza = j4 != C.TIME_UNSET ? new zztk(zzueVarZzp, true, 0L, j4) : zzueVarZzp;
    }

    private final void zzu() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyc zzycVar = this.zzo;
            if (i >= zzycVar.zza) {
                return;
            }
            zzycVar.zzb(i);
            zzxv zzxvVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzv() {
        if (!zzw()) {
            return;
        }
        int i = 0;
        while (true) {
            zzyc zzycVar = this.zzo;
            if (i >= zzycVar.zza) {
                return;
            }
            zzycVar.zzb(i);
            zzxv zzxvVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzw() {
        return this.zzm == null;
    }

    public final long zza(zzyc zzycVar, long j, boolean z) {
        return zzb(zzycVar, j, false, new boolean[2]);
    }

    public final long zzb(zzyc zzycVar, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzycVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzycVar.zza(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzlm[] zzlmVarArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzlmVarArr[i2].zzb();
            i2++;
        }
        zzu();
        this.zzo = zzycVar;
        zzv();
        long jZzf = this.zza.zzf(zzycVar.zzc, this.zzi, this.zzc, zArr, j);
        int i3 = 0;
        while (true) {
            zzlm[] zzlmVarArr2 = this.zzj;
            if (i3 >= 2) {
                break;
            }
            zzlmVarArr2[i3].zzb();
            i3++;
        }
        this.zzf = false;
        int i4 = 0;
        while (true) {
            zzvy[] zzvyVarArr = this.zzc;
            if (i4 >= 2) {
                return jZzf;
            }
            if (zzvyVarArr[i4] != null) {
                zzcw.zzf(zzycVar.zzb(i4));
                this.zzj[i4].zzb();
                this.zzf = true;
            } else {
                zzcw.zzf(zzycVar.zzc[i4] == null);
            }
            i4++;
        }
    }

    public final long zzc() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzb = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzg.zze : jZzb;
    }

    public final long zzd() {
        if (this.zze) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzp;
    }

    public final long zzf() {
        return this.zzg.zzb + this.zzp;
    }

    @Nullable
    public final zzkl zzg() {
        return this.zzm;
    }

    public final zzwj zzh() {
        return this.zzn;
    }

    public final zzyc zzi() {
        return this.zzo;
    }

    public final zzyc zzj(float f, zzbq zzbqVar, boolean z) throws zzib {
        zzyc zzycVarZzo = this.zzk.zzo(this.zzj, this.zzn, this.zzg.zza, zzbqVar);
        for (int i = 0; i < zzycVarZzo.zza; i++) {
            boolean z2 = true;
            if (zzycVarZzo.zzb(i)) {
                if (zzycVarZzo.zzc[i] == null) {
                    this.zzj[i].zzb();
                    z2 = false;
                }
                zzcw.zzf(z2);
            } else {
                zzcw.zzf(zzycVarZzo.zzc[i] == null);
            }
        }
        for (zzxv zzxvVar : zzycVarZzo.zzc) {
        }
        return zzycVarZzo;
    }

    public final void zzk(zzkj zzkjVar) {
        zzcw.zzf(zzw());
        this.zza.zzo(zzkjVar);
    }

    public final void zzl(float f, zzbq zzbqVar, boolean z) throws zzib {
        this.zze = true;
        this.zzn = this.zza.zzh();
        zzyc zzycVarZzj = zzj(f, zzbqVar, z);
        zzkm zzkmVar = this.zzg;
        long jMax = zzkmVar.zzb;
        long j = zzkmVar.zze;
        if (j != C.TIME_UNSET && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jZza = zza(zzycVarZzj, jMax, false);
        long j2 = this.zzp;
        zzkm zzkmVar2 = this.zzg;
        this.zzp = (zzkmVar2.zzb - jZza) + j2;
        this.zzg = zzkmVar2.zzb(jZza);
    }

    public final void zzm(zzud zzudVar, long j) {
        this.zzd = true;
        this.zza.zzl(zzudVar, j);
    }

    public final void zzn(long j) {
        zzcw.zzf(zzw());
        if (this.zze) {
            this.zza.zzm(j - this.zzp);
        }
    }

    public final void zzo() {
        zzu();
        zzue zzueVar = this.zza;
        try {
            boolean z = zzueVar instanceof zztk;
            zzla zzlaVar = this.zzl;
            if (z) {
                zzlaVar.zzi(((zztk) zzueVar).zza);
            } else {
                zzlaVar.zzi(zzueVar);
            }
        } catch (RuntimeException e) {
            zzdo.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzp(@Nullable zzkl zzklVar) {
        if (zzklVar == this.zzm) {
            return;
        }
        zzu();
        this.zzm = zzklVar;
        zzv();
    }

    public final void zzq(long j) {
        this.zzp = j;
    }

    public final void zzr() {
        zzue zzueVar = this.zza;
        if (zzueVar instanceof zztk) {
            long j = this.zzg.zzd;
            if (j == C.TIME_UNSET) {
                j = Long.MIN_VALUE;
            }
            ((zztk) zzueVar).zzn(0L, j);
        }
    }

    public final boolean zzs() {
        if (this.zze) {
            return !this.zzf || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zzt() {
        if (this.zze) {
            return zzs() || zzc() - this.zzg.zzb >= C.TIME_UNSET;
        }
        return false;
    }
}
