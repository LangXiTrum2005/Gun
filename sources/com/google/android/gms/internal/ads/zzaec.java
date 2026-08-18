package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaec implements zzadm {
    final /* synthetic */ zzaef zza;
    private final long zzb;

    public zzaec(zzaef zzaefVar, long j) {
        this.zza = zzaefVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        zzadk zzadkVarZza = this.zza.zzi[0].zza(j);
        int i = 1;
        while (true) {
            zzaef zzaefVar = this.zza;
            if (i >= zzaefVar.zzi.length) {
                return zzadkVarZza;
            }
            zzadk zzadkVarZza2 = zzaefVar.zzi[i].zza(j);
            if (zzadkVarZza2.zza.zzc < zzadkVarZza.zza.zzc) {
                zzadkVarZza = zzadkVarZza2;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
