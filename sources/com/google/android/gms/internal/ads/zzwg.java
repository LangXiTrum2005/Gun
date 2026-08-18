package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzwg implements zzue, zzud {
    private final zzue zza;
    private final long zzb;
    private zzud zzc;

    public zzwg(zzue zzueVar, long j) {
        this.zza = zzueVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, zzlp zzlpVar) {
        long j2 = this.zzb;
        return this.zza.zza(j - j2, zzlpVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        long jZzd = this.zza.zzd();
        return jZzd == C.TIME_UNSET ? C.TIME_UNSET : jZzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        long j2 = this.zzb;
        return this.zza.zze(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] zzxvVarArr, boolean[] zArr, zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        zzvy[] zzvyVarArr2 = new zzvy[zzvyVarArr.length];
        int i = 0;
        while (true) {
            zzvy zzvyVarZzc = null;
            if (i >= zzvyVarArr.length) {
                break;
            }
            zzwf zzwfVar = (zzwf) zzvyVarArr[i];
            if (zzwfVar != null) {
                zzvyVarZzc = zzwfVar.zzc();
            }
            zzvyVarArr2[i] = zzvyVarZzc;
            i++;
        }
        long jZzf = this.zza.zzf(zzxvVarArr, zArr, zzvyVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzvyVarArr.length; i2++) {
            zzvy zzvyVar = zzvyVarArr2[i2];
            if (zzvyVar == null) {
                zzvyVarArr[i2] = null;
            } else {
                zzvy zzvyVar2 = zzvyVarArr[i2];
                if (zzvyVar2 == null || ((zzwf) zzvyVar2).zzc() != zzvyVar) {
                    zzvyVarArr[i2] = new zzwf(zzvyVar, this.zzb);
                }
            }
        }
        return jZzf + this.zzb;
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
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzudVar, long j) {
        this.zzc = zzudVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final zzue zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(zzkj zzkjVar) {
        long j = zzkjVar.zza;
        long j2 = this.zzb;
        zzkh zzkhVarZza = zzkjVar.zza();
        zzkhVarZza.zze(j - j2);
        return this.zza.zzo(zzkhVarZza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
