package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgaq extends zzgar {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int zzb(long j) {
        int i = (int) j;
        zzfun.zzh(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int zzc(int i, int i2, int i3) {
        zzfun.zzj(true, "min (%s) must be less than or equal to max (%s)", i2, 1073741823);
        int[] iArr = new int[2];
        int[] iArr2 = {i, i2};
        int i4 = iArr2[0];
        for (char c = 1; c < 2; c = 2) {
            int i5 = iArr2[1];
            if (i5 > i4) {
                i4 = i5;
            }
        }
        iArr[0] = i4;
        iArr[1] = 1073741823;
        for (char c2 = 1; c2 < 2; c2 = 2) {
            int i6 = iArr[1];
            if (i6 < i4) {
                i4 = i6;
            }
        }
        return i4;
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzfun.zzj(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int zze(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @CheckForNull
    public static Integer zzf(String str, int i) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i2 = cCharAt == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                int iZza = zzgas.zza(str.charAt(i2));
                if (iZza >= 0 && iZza < 10) {
                    long j = -iZza;
                    while (true) {
                        if (i3 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i4 = i3 + 1;
                        int iZza2 = zzgas.zza(str.charAt(i3));
                        if (iZza2 >= 0 && iZza2 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = iZza2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i3 = i4;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.emptyList() : new zzgap(iArr, 0, length);
    }

    public static int[] zzh(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
