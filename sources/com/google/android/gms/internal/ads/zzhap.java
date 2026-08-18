package com.google.android.gms.internal.ads;

import com.umeng.analytics.pro.cw;

/* JADX INFO: loaded from: classes3.dex */
final class zzhap {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzgyg {
        if (!zzg(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !zzg(b3) && !zzg(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw new zzgyg("Protocol message had invalid UTF-8.");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0016  */
    /* JADX WARN: Code duplicated, block: B:12:0x0018 A[PHI: r2
  0x0018: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0012, B:11:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001e  */
    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i) throws zzgyg {
        if (!zzg(b2)) {
            if (b != -32) {
                if (b != -19) {
                    if (!zzg(b3)) {
                        cArr[i] = (char) (((b & cw.m) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!zzg(b3)) {
                        cArr[i] = (char) (((b & cw.m) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            } else if (b2 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!zzg(b3)) {
                        cArr[i] = (char) (((b & cw.m) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                } else if (b2 < -96) {
                    b = -19;
                    if (!zzg(b3)) {
                        cArr[i] = (char) (((b & cw.m) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                        return;
                    }
                }
            }
        }
        throw new zzgyg("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i) throws zzgyg {
        if (b < -62 || zzg(b2)) {
            throw new zzgyg("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b) {
        return b >= 0;
    }

    public static /* bridge */ /* synthetic */ boolean zze(byte b) {
        return b < -16;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(byte b) {
        return b < -32;
    }

    private static boolean zzg(byte b) {
        return b > -65;
    }
}
