package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzia implements zzkk {
    private final zzls zza;
    private final zzhz zzb;

    @Nullable
    private zzlj zzc;

    @Nullable
    private zzkk zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzia(zzhz zzhzVar, zzcx zzcxVar) {
        this.zzb = zzhzVar;
        this.zza = new zzls(zzcxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        if (this.zze) {
            return this.zza.zza();
        }
        zzkk zzkkVar = this.zzd;
        zzkkVar.getClass();
        return zzkkVar.zza();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    public final long zzb(boolean z) {
        zzbe zzbeVarZzc;
        zzlj zzljVar = this.zzc;
        if (zzljVar == null || zzljVar.zzW() || ((z && this.zzc.zzcT() != 2) || (!this.zzc.zzX() && (z || this.zzc.zzQ())))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkk zzkkVar = this.zzd;
            zzkkVar.getClass();
            long jZza = zzkkVar.zza();
            if (!this.zze) {
                this.zza.zzb(jZza);
                zzbeVarZzc = zzkkVar.zzc();
                if (!zzbeVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzbeVarZzc);
                    this.zzb.zza(zzbeVarZzc);
                }
            } else if (jZza < this.zza.zza()) {
                this.zza.zze();
            } else {
                this.zze = false;
                if (this.zzf) {
                    this.zza.zzd();
                }
                this.zza.zzb(jZza);
                zzbeVarZzc = zzkkVar.zzc();
                if (!zzbeVarZzc.equals(this.zza.zzc())) {
                    this.zza.zzg(zzbeVarZzc);
                    this.zzb.zza(zzbeVarZzc);
                }
            }
        }
        return zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final zzbe zzc() {
        zzkk zzkkVar = this.zzd;
        return zzkkVar != null ? zzkkVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzlj zzljVar) {
        if (zzljVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzlj zzljVar) throws zzib {
        zzkk zzkkVar;
        zzkk zzkkVarZzl = zzljVar.zzl();
        if (zzkkVarZzl == null || zzkkVarZzl == (zzkkVar = this.zzd)) {
            return;
        }
        if (zzkkVar != null) {
            throw zzib.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzkkVarZzl;
        this.zzc = zzljVar;
        zzkkVarZzl.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzbe zzbeVar) {
        zzkk zzkkVar = this.zzd;
        if (zzkkVar != null) {
            zzkkVar.zzg(zzbeVar);
            zzbeVar = this.zzd.zzc();
        }
        this.zza.zzg(zzbeVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean zzj() {
        if (this.zze) {
            return false;
        }
        zzkk zzkkVar = this.zzd;
        zzkkVar.getClass();
        return zzkkVar.zzj();
    }
}
