package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzacj {
    public final String zza;

    private zzacj(int i, int i2, String str) {
        this.zza = str;
    }

    @Nullable
    public static zzacj zza(zzdy zzdyVar) {
        String str;
        zzdyVar.zzM(2);
        int iZzm = zzdyVar.zzm();
        int i = iZzm >> 1;
        int i2 = iZzm & 1;
        int iZzm2 = zzdyVar.zzm() >> 3;
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        int i3 = iZzm2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new zzacj(i, i3, sb.toString());
    }
}
