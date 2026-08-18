package com.google.android.gms.internal.ads;

import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzano implements zzabx {
    private final zzef zza;
    private final zzdy zzb = new zzdy();
    private final int zzc;

    public zzano(int i, zzef zzefVar, int i2) {
        this.zzc = i;
        this.zza = zzefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final zzabw zza(zzaco zzacoVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long jZzf = zzacoVar.zzf();
        int iMin = (int) Math.min(112800L, zzacoVar.zzd() - jZzf);
        this.zzb.zzI(iMin);
        zzacoVar.zzh(this.zzb.zzN(), 0, iMin);
        zzdy zzdyVar = this.zzb;
        int iZze = zzdyVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzdyVar.zzb() >= 188 && (iZza2 = (iZza = zzanz.zza(zzdyVar.zzN(), zzdyVar.zzd(), iZze)) + Input.Keys.F18) <= iZze) {
            long jZzb = zzanz.zzb(zzdyVar, iZza, this.zzc);
            if (jZzb != C.TIME_UNSET) {
                long jZzb2 = this.zza.zzb(jZzb);
                if (jZzb2 <= j) {
                    j4 = iZza;
                    if (100000 + jZzb2 <= j) {
                        j3 = jZzb2;
                    }
                } else if (j3 == C.TIME_UNSET) {
                    return zzabw.zzd(jZzb2, jZzf);
                }
                return zzabw.zze(jZzf + j4);
            }
            zzdyVar.zzL(iZza2);
            j2 = iZza2;
        }
        return j3 != C.TIME_UNSET ? zzabw.zzf(j3, jZzf + j2) : zzabw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzb() {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
