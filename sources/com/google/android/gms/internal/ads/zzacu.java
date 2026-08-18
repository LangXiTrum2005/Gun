package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacu {
    public static int zza(zzdy zzdyVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzdyVar.zzm() + 1;
            case 7:
                return zzdyVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzaco zzacoVar, zzacy zzacyVar) throws IOException {
        zzacoVar.zzj();
        zzacoVar.zzg(1);
        byte[] bArr = new byte[1];
        zzacoVar.zzh(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzacoVar.zzg(2);
        int i2 = 1 != i ? 6 : 7;
        zzdy zzdyVar = new zzdy(i2);
        zzdyVar.zzK(zzacr.zza(zzacoVar, zzdyVar.zzN(), 0, i2));
        zzacoVar.zzj();
        zzact zzactVar = new zzact();
        if (zzd(zzdyVar, zzacyVar, z, zzactVar)) {
            return zzactVar.zza;
        }
        throw zzbc.zza(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b0 A[ORIG_RETURN, RETURN] */
    public static boolean zzc(zzdy zzdyVar, zzacy zzacyVar, int i, zzact zzactVar) {
        int iZza;
        int iZzd = zzdyVar.zzd();
        long jZzu = zzdyVar.zzu();
        long j = jZzu >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = jZzu >> 12;
        long j3 = jZzu >> 8;
        long j4 = jZzu >> 4;
        long j5 = jZzu >> 1;
        long j6 = jZzu & 1;
        int i2 = (int) (j4 & 15);
        if (i2 > 7 ? !(i2 > 10 || zzacyVar.zzg != 2) : i2 == zzacyVar.zzg - 1) {
            int i3 = (int) (j5 & 7);
            if ((i3 == 0 || i3 == zzacyVar.zzi) && j6 != 1 && zzd(zzdyVar, zzacyVar, z, zzactVar) && (iZza = zza(zzdyVar, (int) (j2 & 15))) != -1 && iZza <= zzacyVar.zzb) {
                int i4 = zzacyVar.zze;
                int i5 = (int) (j3 & 15);
                if (i5 != 0) {
                    if (i5 <= 11) {
                        if (i5 == zzacyVar.zzf) {
                            if (zzdyVar.zzm() == zzei.zzg(zzdyVar.zzN(), iZzd, zzdyVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i5 == 12) {
                        if (zzdyVar.zzm() * 1000 == i4) {
                            if (zzdyVar.zzm() == zzei.zzg(zzdyVar.zzN(), iZzd, zzdyVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i5 <= 14) {
                        int iZzq = zzdyVar.zzq();
                        if (i5 == 14) {
                            iZzq *= 10;
                        }
                        if (iZzq == i4) {
                            if (zzdyVar.zzm() == zzei.zzg(zzdyVar.zzN(), iZzd, zzdyVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    }
                } else if (zzdyVar.zzm() == zzei.zzg(zzdyVar.zzN(), iZzd, zzdyVar.zzd() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzdy zzdyVar, zzacy zzacyVar, boolean z, zzact zzactVar) {
        try {
            long jZzx = zzdyVar.zzx();
            if (!z) {
                jZzx *= (long) zzacyVar.zzb;
            }
            zzactVar.zza = jZzx;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
