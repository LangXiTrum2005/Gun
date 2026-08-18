package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzaep implements zzabx {
    private final zzacy zza;
    private final int zzb;
    private final zzact zzc = new zzact();

    public /* synthetic */ zzaep(zzacy zzacyVar, int i, zzaeq zzaeqVar) {
        this.zza = zzacyVar;
        this.zzb = i;
    }

    private final long zzc(zzaco zzacoVar) throws IOException {
        while (zzacoVar.zze() < zzacoVar.zzd() - 6) {
            zzacy zzacyVar = this.zza;
            int i = this.zzb;
            zzact zzactVar = this.zzc;
            long jZze = zzacoVar.zze();
            byte[] bArr = new byte[2];
            zzacoVar.zzh(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzacoVar.zzj();
                zzacoVar.zzg((int) (jZze - zzacoVar.zzf()));
            } else {
                zzdy zzdyVar = new zzdy(16);
                System.arraycopy(bArr, 0, zzdyVar.zzN(), 0, 2);
                zzdyVar.zzK(zzacr.zza(zzacoVar, zzdyVar.zzN(), 2, 14));
                zzacoVar.zzj();
                zzacoVar.zzg((int) (jZze - zzacoVar.zzf()));
                if (zzacu.zzc(zzdyVar, zzacyVar, i, zzactVar)) {
                    break;
                }
            }
            zzacoVar.zzg(1);
        }
        if (zzacoVar.zze() < zzacoVar.zzd() - 6) {
            return this.zzc.zza;
        }
        zzacoVar.zzg((int) (zzacoVar.zzd() - zzacoVar.zze()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final zzabw zza(zzaco zzacoVar, long j) throws IOException {
        long jZzf = zzacoVar.zzf();
        long jZzc = zzc(zzacoVar);
        long jZze = zzacoVar.zze();
        zzacoVar.zzg(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzacoVar);
        long jZze2 = zzacoVar.zze();
        if (jZzc > j || jZzc2 <= j) {
            return jZzc2 <= j ? zzabw.zzf(jZzc2, jZze2) : zzabw.zzd(jZzc, jZzf);
        }
        return zzabw.zze(jZze);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* synthetic */ void zzb() {
    }
}
