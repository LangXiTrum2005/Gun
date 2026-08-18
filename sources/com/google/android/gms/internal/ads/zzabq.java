package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    public static zzabo zza(zzdx zzdxVar) {
        int i;
        int i2;
        int i3;
        int iZzd;
        int iZzd2 = zzdxVar.zzd(16);
        int iZzd3 = zzdxVar.zzd(16);
        if (iZzd3 == 65535) {
            iZzd3 = zzdxVar.zzd(24);
            i = 7;
        } else {
            i = 4;
        }
        int i4 = iZzd3 + i;
        if (iZzd2 == 44097) {
            i4 += 2;
        }
        int i5 = i4;
        int iZzd4 = zzdxVar.zzd(2);
        if (iZzd4 == 3) {
            int i6 = 0;
            while (true) {
                iZzd = zzdxVar.zzd(2) + i6;
                if (!zzdxVar.zzp()) {
                    break;
                }
                i6 = (iZzd + 1) << 2;
            }
            i2 = iZzd + 3;
        } else {
            i2 = iZzd4;
        }
        int iZzd5 = zzdxVar.zzd(10);
        if (zzdxVar.zzp() && zzdxVar.zzd(3) > 0) {
            zzdxVar.zzn(2);
        }
        int i7 = true != zzdxVar.zzp() ? 44100 : 48000;
        int iZzd6 = zzdxVar.zzd(4);
        if (i7 == 44100 && iZzd6 == 13) {
            i3 = zzb[13];
        } else if (i7 != 48000 || iZzd6 >= 14) {
            i3 = 0;
        } else {
            int i8 = zzb[iZzd6];
            int i9 = iZzd5 % 5;
            if (i9 == 1) {
                if (iZzd6 != 3 || iZzd6 == 8) {
                    i8++;
                }
            } else if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4 && (iZzd6 == 3 || iZzd6 == 8 || iZzd6 == 11)) {
                        i8++;
                    }
                } else if (iZzd6 != 3) {
                    i8++;
                } else {
                    i8++;
                }
            } else if (iZzd6 == 8 || iZzd6 == 11) {
                i8++;
            }
            i3 = i8;
        }
        return new zzabo(i2, 2, i7, i5, i3, null);
    }

    public static void zzb(int i, zzdy zzdyVar) {
        zzdyVar.zzI(7);
        byte[] bArrZzN = zzdyVar.zzN();
        bArrZzN[0] = -84;
        bArrZzN[1] = 64;
        bArrZzN[2] = -1;
        bArrZzN[3] = -1;
        bArrZzN[4] = (byte) ((i >> 16) & 255);
        bArrZzN[5] = (byte) ((i >> 8) & 255);
        bArrZzN[6] = (byte) (i & 255);
    }
}
