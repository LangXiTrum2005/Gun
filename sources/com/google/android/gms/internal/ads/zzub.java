package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzub extends zzwl {
    private final boolean zzb;
    private final zzbp zzc;
    private final zzbo zzd;
    private zztz zze;

    @Nullable
    private zzty zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    public zzub(zzui zzuiVar, boolean z) {
        boolean z2;
        super(zzuiVar);
        if (z) {
            zzuiVar.zzv();
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzb = z2;
        this.zzc = new zzbp();
        this.zzd = new zzbo();
        zzuiVar.zzM();
        this.zze = zztz.zzq(zzuiVar.zzJ());
    }

    private final Object zzK(Object obj) {
        return (this.zze.zze == null || !obj.equals(zztz.zzc)) ? obj : this.zze.zze;
    }

    private final boolean zzL(long j) {
        zzty zztyVar = this.zzf;
        int iZza = this.zze.zza(zztyVar.zza.zza);
        if (iZza == -1) {
            return false;
        }
        zztz zztzVar = this.zze;
        zzbo zzboVar = this.zzd;
        zztzVar.zzd(iZza, zzboVar, false);
        long j2 = zzboVar.zzd;
        if (j2 != C.TIME_UNSET && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        zztyVar.zzs(j);
        return true;
    }

    public final zzbq zzC() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    @Nullable
    public final zzug zzD(zzug zzugVar) {
        Object obj = this.zze.zze;
        Object obj2 = zzugVar.zza;
        if (obj != null && this.zze.zze.equals(obj2)) {
            obj2 = zztz.zzc;
        }
        return zzugVar.zza(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzE(zzbq zzbqVar) {
        long j;
        zzug zzugVarZza = null;
        if (this.zzh) {
            this.zze = this.zze.zzp(zzbqVar);
            zzty zztyVar = this.zzf;
            if (zztyVar != null) {
                zzL(zztyVar.zzn());
            }
        } else if (zzbqVar.zzo()) {
            this.zze = this.zzi ? this.zze.zzp(zzbqVar) : zztz.zzr(zzbqVar, zzbp.zza, zztz.zzc);
        } else {
            zzbqVar.zze(0, this.zzc, 0L);
            Object obj = this.zzc.zzb;
            zzty zztyVar2 = this.zzf;
            if (zztyVar2 != null) {
                long jZzq = zztyVar2.zzq();
                this.zze.zzn(zztyVar2.zza.zza, this.zzd);
                this.zze.zze(0, this.zzc, 0L);
                if (jZzq != 0) {
                    j = jZzq;
                } else {
                    j = 0;
                }
            } else {
                j = 0;
            }
            Pair pairZzl = zzbqVar.zzl(this.zzc, this.zzd, 0, j);
            Object obj2 = pairZzl.first;
            long jLongValue = ((Long) pairZzl.second).longValue();
            this.zze = this.zzi ? this.zze.zzp(zzbqVar) : zztz.zzr(zzbqVar, obj, obj2);
            zzty zztyVar3 = this.zzf;
            if (zztyVar3 != null && zzL(jLongValue)) {
                zzug zzugVar = zztyVar3.zza;
                zzugVarZza = zzugVar.zza(zzK(zzugVar.zza));
            }
        }
        this.zzi = true;
        this.zzh = true;
        zzo(this.zze);
        if (zzugVarZza != null) {
            zzty zztyVar4 = this.zzf;
            zztyVar4.getClass();
            zztyVar4.zzr(zzugVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwl
    public final void zzF() {
        if (this.zzb) {
            return;
        }
        this.zzg = true;
        zzB(null, ((zzwl) this).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzwl, com.google.android.gms.internal.ads.zzui
    public final void zzG(zzue zzueVar) {
        ((zzty) zzueVar).zzt();
        if (zzueVar == this.zzf) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwl, com.google.android.gms.internal.ads.zzui
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final zzty zzI(zzug zzugVar, zzyk zzykVar, long j) {
        zzty zztyVar = new zzty(zzugVar, zzykVar, j);
        zztyVar.zzu(((zzwl) this).zza);
        if (this.zzh) {
            zztyVar.zzr(zzugVar.zza(zzK(zzugVar.zza)));
        } else {
            this.zzf = zztyVar;
            if (!this.zzg) {
                this.zzg = true;
                zzB(null, ((zzwl) this).zza);
            }
        }
        return zztyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zztf
    public final void zzq() {
        this.zzh = false;
        this.zzg = false;
        super.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzui
    public final void zzt(zzar zzarVar) {
        if (this.zzi) {
            this.zze = this.zze.zzp(new zzwh(this.zze.zzb, zzarVar));
        } else {
            this.zze = zztz.zzq(zzarVar);
        }
        ((zzwl) this).zza.zzt(zzarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzui
    public final void zzz() {
    }
}
