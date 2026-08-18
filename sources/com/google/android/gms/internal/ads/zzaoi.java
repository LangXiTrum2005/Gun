package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
final class zzaoi implements zzadm {
    private final zzaof zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaoi(zzaof zzaofVar, int i, long j, long j2) {
        this.zza = zzaofVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / ((long) zzaofVar.zzd);
        this.zzd = j3;
        this.zze = zzb(j3);
    }

    private final long zzb(long j) {
        return zzei.zzu(j * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        long jMax = Math.max(0L, Math.min((((long) this.zza.zzc) * j) / (((long) this.zzb) * 1000000), this.zzd - 1));
        long j2 = ((long) this.zza.zzd) * jMax;
        long jZzb = zzb(jMax);
        zzadn zzadnVar = new zzadn(jZzb, this.zzc + j2);
        if (jZzb >= j || jMax == this.zzd - 1) {
            return new zzadk(zzadnVar, zzadnVar);
        }
        long j3 = jMax + 1;
        return new zzadk(zzadnVar, new zzadn(zzb(j3), (j3 * ((long) this.zza.zzd)) + this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
