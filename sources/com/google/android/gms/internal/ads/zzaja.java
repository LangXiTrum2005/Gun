package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaja {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    @Nullable
    public static zzadq zza(zzaco zzacoVar) throws IOException {
        return zzc(zzacoVar, true, false);
    }

    @Nullable
    public static zzadq zzb(zzaco zzacoVar, boolean z) throws IOException {
        return zzc(zzacoVar, false, z);
    }

    @Nullable
    private static zzadq zzc(zzaco zzacoVar, boolean z, boolean z2) throws IOException {
        long jZzt;
        int i;
        int[] iArr;
        long jZzd = zzacoVar.zzd();
        long j = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        long j2 = -1;
        if (jZzd != -1 && jZzd <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j = jZzd;
        }
        zzdy zzdyVar = new zzdy(64);
        int i2 = (int) j;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        while (i4 < i2) {
            zzdyVar.zzI(8);
            if (!zzacoVar.zzm(zzdyVar.zzN(), i3, 8, true)) {
                break;
            }
            long jZzu = zzdyVar.zzu();
            int iZzg = zzdyVar.zzg();
            if (jZzu == 1) {
                zzacoVar.zzh(zzdyVar.zzN(), 8, 8);
                i = 16;
                zzdyVar.zzK(16);
                jZzt = zzdyVar.zzt();
            } else {
                if (jZzu == 0) {
                    long jZzd2 = zzacoVar.zzd();
                    if (jZzd2 != j2) {
                        jZzu = (jZzd2 - zzacoVar.zze()) + 8;
                    }
                }
                jZzt = jZzu;
                i = 8;
            }
            long j3 = i;
            if (jZzt < j3) {
                return new zzahy(iZzg, jZzt, i);
            }
            i4 += i;
            if (iZzg == 1836019574) {
                i2 += (int) jZzt;
                if (jZzd != -1 && i2 > jZzd) {
                    i2 = (int) jZzd;
                }
                i3 = 0;
            } else {
                if (iZzg == 1836019558 || iZzg == 1836475768) {
                    i3 = 1;
                    break;
                }
                z3 |= !(iZzg != 1835295092);
                long j4 = jZzd;
                int i5 = i2;
                if ((((long) i4) + jZzt) - j3 >= i5) {
                    i3 = 0;
                    break;
                }
                int i6 = (int) (jZzt - j3);
                i4 += i6;
                if (iZzg != 1718909296) {
                    i3 = 0;
                    if (i6 != 0) {
                        zzacoVar.zzg(i6);
                    }
                } else {
                    if (i6 < 8) {
                        return new zzahy(1718909296, i6, 8);
                    }
                    zzdyVar.zzI(i6);
                    i3 = 0;
                    zzacoVar.zzh(zzdyVar.zzN(), 0, i6);
                    int iZzg2 = zzdyVar.zzg();
                    boolean zZzd = zzd(iZzg2, z2) | z3;
                    zzdyVar.zzM(4);
                    int iZzb = zzdyVar.zzb() / 4;
                    if (zZzd || iZzb <= 0) {
                        iArr = null;
                    } else {
                        iArr = new int[iZzb];
                        for (int i7 = 0; i7 < iZzb; i7++) {
                            int iZzg3 = zzdyVar.zzg();
                            iArr[i7] = iZzg3;
                            if (zzd(iZzg3, z2)) {
                                zZzd = true;
                                break;
                            }
                        }
                    }
                    if (!zZzd) {
                        return new zzajf(iZzg2, iArr);
                    }
                    z3 = zZzd;
                }
                i2 = i5;
                jZzd = j4;
            }
            j2 = -1;
        }
        if (!z3) {
            return zzaiw.zza;
        }
        if (z != i3) {
            return i3 != 0 ? zzair.zza : zzair.zzb;
        }
        return null;
    }

    private static boolean zzd(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579) {
            if (z) {
                return true;
            }
            i = 1751476579;
        }
        int[] iArr = zza;
        for (int i2 = 0; i2 < 29; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
