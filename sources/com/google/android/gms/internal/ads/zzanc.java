package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzanc implements zzank {
    private zzab zza;
    private zzef zzb;
    private zzadt zzc;

    public zzanc(String str) {
        zzz zzzVar = new zzz();
        zzzVar.zzaa(str);
        this.zza = zzzVar.zzag();
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zza(zzdy zzdyVar) {
        zzcw.zzb(this.zzb);
        int i = zzei.zza;
        long jZze = this.zzb.zze();
        long jZzf = this.zzb.zzf();
        if (jZze == C.TIME_UNSET || jZzf == C.TIME_UNSET) {
            return;
        }
        zzab zzabVar = this.zza;
        if (jZzf != zzabVar.zzt) {
            zzz zzzVarZzb = zzabVar.zzb();
            zzzVarZzb.zzae(jZzf);
            zzab zzabVarZzag = zzzVarZzb.zzag();
            this.zza = zzabVarZzag;
            this.zzc.zzm(zzabVarZzag);
        }
        int iZzb = zzdyVar.zzb();
        this.zzc.zzr(zzdyVar, iZzb);
        this.zzc.zzt(jZze, 1, iZzb, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zzb(zzef zzefVar, zzacq zzacqVar, zzanx zzanxVar) {
        this.zzb = zzefVar;
        zzanxVar.zzc();
        zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 5);
        this.zzc = zzadtVarZzw;
        zzadtVarZzw.zzm(this.zza);
    }
}
