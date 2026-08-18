package com.google.android.gms.internal.ads;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzgvy {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzgvx zzgvxVar) throws zzgyg {
        int iZzh = zzh(bArr, i, zzgvxVar);
        int i2 = zzgvxVar.zza;
        if (i2 < 0) {
            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iZzh) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zzgvxVar.zzc = zzgwj.zzb;
            return iZzh;
        }
        zzgvxVar.zzc = zzgwj.zzv(bArr, iZzh, i2);
        return iZzh + i2;
    }

    public static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static int zzc(zzgzv zzgzvVar, byte[] bArr, int i, int i2, int i3, zzgvx zzgvxVar) throws IOException {
        Object objZze = zzgzvVar.zze();
        int iZzl = zzl(objZze, zzgzvVar, bArr, i, i2, i3, zzgvxVar);
        zzgzvVar.zzf(objZze);
        zzgvxVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzgzv zzgzvVar, byte[] bArr, int i, int i2, zzgvx zzgvxVar) throws IOException {
        Object objZze = zzgzvVar.zze();
        int iZzm = zzm(objZze, zzgzvVar, bArr, i, i2, zzgvxVar);
        zzgzvVar.zzf(objZze);
        zzgvxVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzgzv zzgzvVar, int i, byte[] bArr, int i2, int i3, zzgyd zzgydVar, zzgvx zzgvxVar) throws IOException {
        int iZzd = zzd(zzgzvVar, bArr, i2, i3, zzgvxVar);
        zzgydVar.add(zzgvxVar.zzc);
        while (iZzd < i3) {
            int iZzh = zzh(bArr, iZzd, zzgvxVar);
            if (i != zzgvxVar.zza) {
                break;
            }
            iZzd = zzd(zzgzvVar, bArr, iZzh, i3, zzgvxVar);
            zzgydVar.add(zzgvxVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzgyd zzgydVar, zzgvx zzgvxVar) throws IOException {
        zzgxs zzgxsVar = (zzgxs) zzgydVar;
        int iZzh = zzh(bArr, i, zzgvxVar);
        int i2 = zzgvxVar.zza + iZzh;
        while (iZzh < i2) {
            iZzh = zzh(bArr, iZzh, zzgvxVar);
            zzgxsVar.zzi(zzgvxVar.zza);
        }
        if (iZzh == i2) {
            return iZzh;
        }
        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i, byte[] bArr, int i2, int i3, zzhai zzhaiVar, zzgvx zzgvxVar) throws zzgyg {
        if ((i >>> 3) == 0) {
            throw new zzgyg("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzk = zzk(bArr, i2, zzgvxVar);
            zzhaiVar.zzj(i, Long.valueOf(zzgvxVar.zzb));
            return iZzk;
        }
        if (i4 == 1) {
            zzhaiVar.zzj(i, Long.valueOf(zzn(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZzh = zzh(bArr, i2, zzgvxVar);
            int i5 = zzgvxVar.zza;
            if (i5 < 0) {
                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iZzh) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zzhaiVar.zzj(i, zzgwj.zzb);
            } else {
                zzhaiVar.zzj(i, zzgwj.zzv(bArr, iZzh, i5));
            }
            return iZzh + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzgyg("Protocol message contained an invalid tag (zero).");
            }
            zzhaiVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzhai zzhaiVarZzf = zzhai.zzf();
        int i7 = zzgvxVar.zze + 1;
        zzgvxVar.zze = i7;
        zzo(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iZzh2 = zzh(bArr, i2, zzgvxVar);
            i8 = zzgvxVar.zza;
            if (i8 == i6) {
                i2 = iZzh2;
                break;
            }
            i2 = zzg(i8, bArr, iZzh2, i3, zzhaiVarZzf, zzgvxVar);
        }
        zzgvxVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzgyg("Failed to parse the message.");
        }
        zzhaiVar.zzj(i, zzhaiVarZzf);
        return i2;
    }

    public static int zzh(byte[] bArr, int i, zzgvx zzgvxVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzi(b, bArr, i2, zzgvxVar);
        }
        zzgvxVar.zza = b;
        return i2;
    }

    public static int zzi(int i, byte[] bArr, int i2, zzgvx zzgvxVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        if (b >= 0) {
            zzgvxVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzgvxVar.zza = i5 | (b2 << cw.l);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzgvxVar.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzgvxVar.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzgvxVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int zzj(int i, byte[] bArr, int i2, int i3, zzgyd zzgydVar, zzgvx zzgvxVar) {
        zzgxs zzgxsVar = (zzgxs) zzgydVar;
        int iZzh = zzh(bArr, i2, zzgvxVar);
        zzgxsVar.zzi(zzgvxVar.zza);
        while (iZzh < i3) {
            int iZzh2 = zzh(bArr, iZzh, zzgvxVar);
            if (i != zzgvxVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzgvxVar);
            zzgxsVar.zzi(zzgvxVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i, zzgvx zzgvxVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgvxVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        zzgvxVar.zzb = j2;
        return i3;
    }

    public static int zzl(Object obj, zzgzv zzgzvVar, byte[] bArr, int i, int i2, int i3, zzgvx zzgvxVar) throws IOException {
        zzgzf zzgzfVar = (zzgzf) zzgzvVar;
        int i4 = zzgvxVar.zze + 1;
        zzgvxVar.zze = i4;
        zzo(i4);
        int iZzc = zzgzfVar.zzc(obj, bArr, i, i2, i3, zzgvxVar);
        zzgvxVar.zze--;
        zzgvxVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzgzv zzgzvVar, byte[] bArr, int i, int i2, zzgvx zzgvxVar) throws IOException {
        int iZzi = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzi = zzi(i3, bArr, iZzi, zzgvxVar);
            i3 = zzgvxVar.zza;
        }
        int i4 = iZzi;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = zzgvxVar.zze + 1;
        zzgvxVar.zze = i5;
        zzo(i5);
        int i6 = i3 + i4;
        zzgzvVar.zzi(obj, bArr, i4, i6, zzgvxVar);
        zzgvxVar.zze--;
        zzgvxVar.zzc = obj;
        return i6;
    }

    public static long zzn(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzo(int i) throws zzgyg {
        if (i >= zzb) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
