package com.google.android.gms.internal.ads;

import android.util.Pair;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzaoh {
    public static Pair zza(zzaco zzacoVar) throws IOException {
        zzacoVar.zzj();
        zzaog zzaogVarZzd = zzd(1684108385, zzacoVar, new zzdy(8));
        zzacoVar.zzk(8);
        return Pair.create(Long.valueOf(zzacoVar.zzf()), Long.valueOf(zzaogVarZzd.zzb));
    }

    public static zzaof zzb(zzaco zzacoVar) throws IOException {
        byte[] bArr;
        zzdy zzdyVar = new zzdy(16);
        zzaog zzaogVarZzd = zzd(1718449184, zzacoVar, zzdyVar);
        zzcw.zzf(zzaogVarZzd.zzb >= 16);
        zzacoVar.zzh(zzdyVar.zzN(), 0, 16);
        zzdyVar.zzL(0);
        int iZzk = zzdyVar.zzk();
        int iZzk2 = zzdyVar.zzk();
        int iZzj = zzdyVar.zzj();
        int iZzj2 = zzdyVar.zzj();
        int iZzk3 = zzdyVar.zzk();
        int iZzk4 = zzdyVar.zzk();
        int i = ((int) zzaogVarZzd.zzb) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzacoVar.zzh(bArr, 0, i);
        } else {
            bArr = zzei.zzf;
        }
        byte[] bArr2 = bArr;
        zzacoVar.zzk((int) (zzacoVar.zze() - zzacoVar.zzf()));
        return new zzaof(iZzk, iZzk2, iZzj, iZzj2, iZzk3, iZzk4, bArr2);
    }

    public static boolean zzc(zzaco zzacoVar) throws IOException {
        zzdy zzdyVar = new zzdy(8);
        int i = zzaog.zza(zzacoVar, zzdyVar).zza;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzacoVar.zzh(zzdyVar.zzN(), 0, 4);
        zzdyVar.zzL(0);
        int iZzg = zzdyVar.zzg();
        if (iZzg == 1463899717) {
            return true;
        }
        zzdo.zzc("WavHeaderReader", "Unsupported form type: " + iZzg);
        return false;
    }

    private static zzaog zzd(int i, zzaco zzacoVar, zzdy zzdyVar) throws IOException {
        zzaog zzaogVarZza = zzaog.zza(zzacoVar, zzdyVar);
        while (true) {
            int i2 = zzaogVarZza.zza;
            if (i2 == i) {
                return zzaogVarZza;
            }
            AbstractC3888ke0.r("Ignoring unknown WAV chunk: ", i2, "WavHeaderReader");
            long j = zzaogVarZza.zzb;
            long j2 = 8 + j;
            if ((1 & j) != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw zzbc.zzc("Chunk is too large (~2GB+) to skip; id: " + zzaogVarZza.zza);
            }
            zzacoVar.zzk((int) j2);
            zzaogVarZza = zzaog.zza(zzacoVar, zzdyVar);
        }
    }
}
