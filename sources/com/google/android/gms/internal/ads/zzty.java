package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzty implements zzue, zzud {
    public final zzug zza;
    private final long zzb;
    private zzui zzc;
    private zzue zzd;

    @Nullable
    private zzud zze;
    private long zzf = C.TIME_UNSET;
    private final zzyk zzg;

    public zzty(zzug zzugVar, zzyk zzykVar, long j) {
        this.zza = zzugVar;
        this.zzg = zzykVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != C.TIME_UNSET ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, zzlp zzlpVar) {
        zzue zzueVar = this.zzd;
        int i = zzei.zza;
        return zzueVar.zza(j, zzlpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        zzue zzueVar = this.zzd;
        int i = zzei.zza;
        return zzueVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        zzue zzueVar = this.zzd;
        int i = zzei.zza;
        return zzueVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        zzue zzueVar = this.zzd;
        int i = zzei.zza;
        return zzueVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        zzue zzueVar = this.zzd;
        int i = zzei.zza;
        return zzueVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] zzxvVarArr, boolean[] zArr, zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        long j2 = this.zzf;
        long j3 = (j2 == C.TIME_UNSET || j != this.zzb) ? j : j2;
        this.zzf = C.TIME_UNSET;
        zzue zzueVar = this.zzd;
        int i = zzei.zza;
        return zzueVar.zzf(zzxvVarArr, zArr, zzvyVarArr, zArr2, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final /* bridge */ /* synthetic */ void zzg(zzwa zzwaVar) {
        zzud zzudVar = this.zze;
        int i = zzei.zza;
        zzudVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final zzwj zzh() {
        zzue zzueVar = this.zzd;
        int i = zzei.zza;
        return zzueVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzud
    public final void zzi(zzue zzueVar) {
        zzud zzudVar = this.zze;
        int i = zzei.zza;
        zzudVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzj(long j, boolean z) {
        zzue zzueVar = this.zzd;
        int i = zzei.zza;
        zzueVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        zzue zzueVar = this.zzd;
        if (zzueVar != null) {
            zzueVar.zzk();
            return;
        }
        zzui zzuiVar = this.zzc;
        if (zzuiVar != null) {
            zzuiVar.zzz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzudVar, long j) {
        this.zze = zzudVar;
        zzue zzueVar = this.zzd;
        if (zzueVar != null) {
            zzueVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        zzue zzueVar = this.zzd;
        int i = zzei.zza;
        zzueVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(zzkj zzkjVar) {
        zzue zzueVar = this.zzd;
        return zzueVar != null && zzueVar.zzo(zzkjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        zzue zzueVar = this.zzd;
        return zzueVar != null && zzueVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzug zzugVar) {
        long jZzv = zzv(this.zzb);
        zzui zzuiVar = this.zzc;
        zzuiVar.getClass();
        zzue zzueVarZzI = zzuiVar.zzI(zzugVar, this.zzg, jZzv);
        this.zzd = zzueVarZzI;
        if (this.zze != null) {
            zzueVarZzI.zzl(this, jZzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzt() {
        zzue zzueVar = this.zzd;
        if (zzueVar != null) {
            zzui zzuiVar = this.zzc;
            zzuiVar.getClass();
            zzuiVar.zzG(zzueVar);
        }
    }

    public final void zzu(zzui zzuiVar) {
        zzcw.zzf(this.zzc == null);
        this.zzc = zzuiVar;
    }
}
