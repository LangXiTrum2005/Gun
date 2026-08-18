package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzvq implements zzye {
    public long zza;
    public long zzb;

    @Nullable
    public zzyd zzc;

    @Nullable
    public zzvq zzd;

    public zzvq(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzvq zzb() {
        this.zzc = null;
        zzvq zzvqVar = this.zzd;
        this.zzd = null;
        return zzvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final zzyd zzc() {
        zzyd zzydVar = this.zzc;
        zzydVar.getClass();
        return zzydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    @Nullable
    public final zzye zzd() {
        zzvq zzvqVar = this.zzd;
        if (zzvqVar == null || zzvqVar.zzc == null) {
            return null;
        }
        return zzvqVar;
    }

    public final void zze(long j, int i) {
        zzcw.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
    }
}
