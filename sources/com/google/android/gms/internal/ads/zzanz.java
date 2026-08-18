package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzanz {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzdy zzdyVar, int i, int i2) {
        zzdyVar.zzL(i);
        if (zzdyVar.zzb() < 5) {
            return C.TIME_UNSET;
        }
        int iZzg = zzdyVar.zzg();
        if ((8388608 & iZzg) != 0 || ((iZzg >> 8) & 8191) != i2 || (iZzg & 32) == 0 || zzdyVar.zzm() < 7 || zzdyVar.zzb() < 7 || (zzdyVar.zzm() & 16) != 16) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[6];
        zzdyVar.zzH(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((((long) bArr[4]) & 255) >> 7);
    }
}
