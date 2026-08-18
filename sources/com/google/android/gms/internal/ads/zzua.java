package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzua extends zzbq {
    private final zzar zzb;

    public zzua(zzar zzarVar) {
        this.zzb = zzarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zza(Object obj) {
        return obj == zztz.zzc ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int i, zzbo zzboVar, boolean z) {
        zzboVar.zzi(z ? 0 : null, z ? zztz.zzc : null, 0, C.TIME_UNSET, 0L, zzb.zza, true);
        return zzboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbp zze(int i, zzbp zzbpVar, long j) {
        zzbpVar.zza(zzbp.zza, this.zzb, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        zzbpVar.zzk = true;
        return zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final Object zzf(int i) {
        return zztz.zzc;
    }
}
