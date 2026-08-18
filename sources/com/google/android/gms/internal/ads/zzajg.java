package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
final class zzajg implements zzadm {
    final /* synthetic */ zzaji zza;

    public /* synthetic */ zzajg(zzaji zzajiVar, zzajh zzajhVar) {
        this.zza = zzajiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        zzaji zzajiVar = this.zza;
        return zzajiVar.zzd.zzf(zzajiVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        zzaji zzajiVar = this.zza;
        long jZzg = zzajiVar.zzd.zzg(j);
        long j2 = zzajiVar.zzb;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(jZzg);
        zzaji zzajiVar2 = this.zza;
        long jLongValue = bigIntegerValueOf.multiply(BigInteger.valueOf(zzajiVar2.zzc - zzajiVar2.zzb)).divide(BigInteger.valueOf(this.zza.zzf)).longValue() + j2;
        zzaji zzajiVar3 = this.zza;
        zzadn zzadnVar = new zzadn(j, Math.max(zzajiVar3.zzb, Math.min(jLongValue - 30000, zzajiVar3.zzc - 1)));
        return new zzadk(zzadnVar, zzadnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
