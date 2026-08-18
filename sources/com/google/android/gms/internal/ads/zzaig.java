package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
final class zzaig implements zzaid {
    private final int zza;
    private final int zzb;
    private final zzdy zzc;

    public zzaig(zzeo zzeoVar, zzab zzabVar) {
        zzdy zzdyVar = zzeoVar.zza;
        this.zzc = zzdyVar;
        zzdyVar.zzL(12);
        int iZzp = zzdyVar.zzp();
        if (MimeTypes.AUDIO_RAW.equals(zzabVar.zzo)) {
            int iZzk = zzei.zzk(zzabVar.zzF) * zzabVar.zzD;
            if (iZzp == 0 || iZzp % iZzk != 0) {
                zzdo.zzf("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iZzk + ", stsz sample size: " + iZzp);
                iZzp = iZzk;
            }
        }
        this.zza = iZzp == 0 ? -1 : iZzp;
        this.zzb = zzdyVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaid
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzp() : i;
    }
}
