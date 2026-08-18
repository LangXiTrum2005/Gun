package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzajn {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final zzdy zzg = new zzdy(255);

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzaco zzacoVar, boolean z) throws IOException {
        zza();
        this.zzg.zzI(27);
        if (zzacr.zzc(zzacoVar, this.zzg.zzN(), 0, 27, z) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z) {
                    return false;
                }
                throw zzbc.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int iZzm = this.zzg.zzm();
            this.zzc = iZzm;
            this.zzd = iZzm + 27;
            this.zzg.zzI(iZzm);
            if (zzacr.zzc(zzacoVar, this.zzg.zzN(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzm();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzaco zzacoVar, long j) throws IOException {
        zzcw.zzd(zzacoVar.zzf() == zzacoVar.zze());
        this.zzg.zzI(4);
        while (true) {
            if ((j != -1 && zzacoVar.zzf() + 4 >= j) || !zzacr.zzc(zzacoVar, this.zzg.zzN(), 0, 4, true)) {
                break;
            }
            this.zzg.zzL(0);
            if (this.zzg.zzu() == 1332176723) {
                zzacoVar.zzj();
                return true;
            }
            zzacoVar.zzk(1);
        }
        do {
            if (j != -1 && zzacoVar.zzf() >= j) {
                break;
            }
        } while (zzacoVar.zzc(1) != -1);
        return false;
    }
}
