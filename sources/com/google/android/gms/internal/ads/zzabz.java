package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabz {
    public static void zza(long j, zzdy zzdyVar, zzadt[] zzadtVarArr) {
        int iZzg;
        while (true) {
            if (zzdyVar.zzb() <= 1) {
                return;
            }
            int iZzc = zzc(zzdyVar);
            int iZzc2 = zzc(zzdyVar);
            int iZzd = zzdyVar.zzd() + iZzc2;
            if (iZzc2 == -1 || iZzc2 > zzdyVar.zzb()) {
                zzdo.zzf("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iZzd = zzdyVar.zze();
            } else if (iZzc == 4 && iZzc2 >= 8) {
                int iZzm = zzdyVar.zzm();
                int iZzq = zzdyVar.zzq();
                if (iZzq == 49) {
                    iZzg = zzdyVar.zzg();
                    iZzq = 49;
                } else {
                    iZzg = 0;
                }
                int iZzm2 = zzdyVar.zzm();
                if (iZzq == 47) {
                    zzdyVar.zzM(1);
                    iZzq = 47;
                }
                boolean z = iZzm == 181 && (iZzq == 49 || iZzq == 47) && iZzm2 == 3;
                if (iZzq == 49) {
                    z &= iZzg == 1195456820;
                }
                if (z) {
                    zzb(j, zzdyVar, zzadtVarArr);
                }
            }
            zzdyVar.zzL(iZzd);
        }
    }

    public static void zzb(long j, zzdy zzdyVar, zzadt[] zzadtVarArr) {
        int iZzm = zzdyVar.zzm();
        if ((iZzm & 64) != 0) {
            int i = iZzm & 31;
            zzdyVar.zzM(1);
            int iZzd = zzdyVar.zzd();
            for (zzadt zzadtVar : zzadtVarArr) {
                int i2 = i * 3;
                zzdyVar.zzL(iZzd);
                zzadtVar.zzr(zzdyVar, i2);
                zzcw.zzf(j != C.TIME_UNSET);
                zzadtVar.zzt(j, 1, i2, 0, null);
            }
        }
    }

    private static int zzc(zzdy zzdyVar) {
        int i = 0;
        while (zzdyVar.zzb() != 0) {
            int iZzm = zzdyVar.zzm();
            i += iZzm;
            if (iZzm != 255) {
                return i;
            }
        }
        return -1;
    }
}
