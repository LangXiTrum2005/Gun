package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzami implements zzamj {
    private final List zza;
    private final zzadt[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = C.TIME_UNSET;

    public zzami(List list) {
        this.zza = list;
        this.zzb = new zzadt[list.size()];
    }

    private final boolean zzf(zzdy zzdyVar, int i) {
        if (zzdyVar.zzb() == 0) {
            return false;
        }
        if (zzdyVar.zzm() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) {
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzdyVar, 32)) {
                if (this.zzd != 1 || zzf(zzdyVar, 0)) {
                    int iZzd = zzdyVar.zzd();
                    int iZzb = zzdyVar.zzb();
                    for (zzadt zzadtVar : this.zzb) {
                        zzdyVar.zzL(iZzd);
                        zzadtVar.zzr(zzdyVar, iZzb);
                    }
                    this.zze += iZzb;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzanu zzanuVar = (zzanu) this.zza.get(i);
            zzanxVar.zzc();
            zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 3);
            zzz zzzVar = new zzz();
            zzzVar.zzM(zzanxVar.zzb());
            zzzVar.zzaa(MimeTypes.APPLICATION_DVBSUBS);
            zzzVar.zzN(Collections.singletonList(zzanuVar.zzb));
            zzzVar.zzQ(zzanuVar.zza);
            zzadtVarZzw.zzm(zzzVar.zzag());
            this.zzb[i] = zzadtVarZzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        if (this.zzc) {
            zzcw.zzf(this.zzf != C.TIME_UNSET);
            for (zzadt zzadtVar : this.zzb) {
                zzadtVar.zzt(this.zzf, 1, this.zze, 0, null);
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = j;
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzc = false;
        this.zzf = C.TIME_UNSET;
    }
}
