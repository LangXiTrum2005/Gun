package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzwf implements zzvy {
    private final zzvy zza;
    private final long zzb;

    public zzwf(zzvy zzvyVar, long j) {
        this.zza = zzvyVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zza(zzke zzkeVar, zzhh zzhhVar, int i) {
        int iZza = this.zza.zza(zzkeVar, zzhhVar, i);
        if (iZza != -4) {
            return iZza;
        }
        zzhhVar.zze += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzvy zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvy
    public final boolean zze() {
        return this.zza.zze();
    }
}
