package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzaip {
    public final zzadt zza;
    public zzaje zzd;
    public zzail zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzajd zzb = new zzajd();
    public final zzdy zzc = new zzdy();
    private final zzdy zzj = new zzdy(1);
    private final zzdy zzk = new zzdy();

    public zzaip(zzadt zzadtVar, zzaje zzajeVar, zzail zzailVar) {
        this.zza = zzadtVar;
        this.zzd = zzajeVar;
        this.zze = zzailVar;
        zzh(zzajeVar, zzailVar);
    }

    public final int zza() {
        int i;
        if (this.zzl) {
            i = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i = this.zzd.zzg[this.zzf];
        }
        return zzf() != null ? i | 1073741824 : i;
    }

    public final int zzb() {
        return !this.zzl ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i, int i2) {
        zzdy zzdyVar;
        zzajc zzajcVarZzf = zzf();
        if (zzajcVarZzf == null) {
            return 0;
        }
        int i3 = zzajcVarZzf.zzd;
        if (i3 != 0) {
            zzdyVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzajcVarZzf.zze;
            int i4 = zzei.zza;
            zzdy zzdyVar2 = this.zzk;
            int length = bArr.length;
            zzdyVar2.zzJ(bArr, length);
            zzdyVar = this.zzk;
            i3 = length;
        }
        boolean zZzb = this.zzb.zzb(this.zzf);
        boolean z = zZzb || i2 != 0;
        zzdy zzdyVar3 = this.zzj;
        zzdyVar3.zzN()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzdyVar3.zzL(0);
        this.zza.zzs(this.zzj, 1, 1);
        this.zza.zzs(zzdyVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zZzb) {
            this.zzc.zzI(8);
            zzdy zzdyVar4 = this.zzc;
            byte[] bArrZzN = zzdyVar4.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 1;
            bArrZzN[2] = 0;
            bArrZzN[3] = (byte) i2;
            bArrZzN[4] = (byte) ((i >> 24) & 255);
            bArrZzN[5] = (byte) ((i >> 16) & 255);
            bArrZzN[6] = (byte) ((i >> 8) & 255);
            bArrZzN[7] = (byte) (i & 255);
            this.zza.zzs(zzdyVar4, 8, 1);
            return i3 + 9;
        }
        int i5 = i3 + 1;
        zzdy zzdyVar5 = this.zzb.zzn;
        int iZzq = zzdyVar5.zzq();
        zzdyVar5.zzM(-2);
        int i6 = (iZzq * 6) + 2;
        if (i2 != 0) {
            this.zzc.zzI(i6);
            byte[] bArrZzN2 = this.zzc.zzN();
            zzdyVar5.zzH(bArrZzN2, 0, i6);
            int i7 = (((bArrZzN2[2] & 255) << 8) | (bArrZzN2[3] & 255)) + i2;
            bArrZzN2[2] = (byte) ((i7 >> 8) & 255);
            bArrZzN2[3] = (byte) (i7 & 255);
            zzdyVar5 = this.zzc;
        }
        this.zza.zzs(zzdyVar5, i6, 1);
        return i5 + i6;
    }

    public final long zzd() {
        return !this.zzl ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzajd zzajdVar = this.zzb;
        return zzajdVar.zzi[this.zzf];
    }

    @Nullable
    public final zzajc zzf() {
        if (!this.zzl) {
            return null;
        }
        zzajd zzajdVar = this.zzb;
        zzail zzailVar = zzajdVar.zza;
        int i = zzei.zza;
        int i2 = zzailVar.zza;
        zzajc zzajcVarZzb = zzajdVar.zzm;
        if (zzajcVarZzb == null) {
            zzajcVarZzb = this.zzd.zza.zzb(i2);
        }
        if (zzajcVarZzb == null || !zzajcVarZzb.zza) {
            return null;
        }
        return zzajcVarZzb;
    }

    public final void zzh(zzaje zzajeVar, zzail zzailVar) {
        this.zzd = zzajeVar;
        this.zze = zzailVar;
        this.zza.zzm(zzajeVar.zza.zzg);
        zzi();
    }

    public final void zzi() {
        zzajd zzajdVar = this.zzb;
        zzajdVar.zzd = 0;
        zzajdVar.zzp = 0L;
        zzajdVar.zzq = false;
        zzajdVar.zzk = false;
        zzajdVar.zzo = false;
        zzajdVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }
}
