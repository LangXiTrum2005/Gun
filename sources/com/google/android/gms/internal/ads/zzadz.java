package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadz {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    @Nullable
    public static zzay zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zzei.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzdo.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafn.zzb(new zzdy(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    zzdo.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzahe(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzay(arrayList);
    }

    public static zzadw zzc(zzdy zzdyVar, boolean z, boolean z2) throws zzbc {
        if (z) {
            zzd(3, zzdyVar, false);
        }
        String strZzB = zzdyVar.zzB((int) zzdyVar.zzs(), StandardCharsets.UTF_8);
        int length = strZzB.length();
        long jZzs = zzdyVar.zzs();
        String[] strArr = new String[(int) jZzs];
        int length2 = length + 15;
        for (int i = 0; i < jZzs; i++) {
            String strZzB2 = zzdyVar.zzB((int) zzdyVar.zzs(), StandardCharsets.UTF_8);
            strArr[i] = strZzB2;
            length2 = length2 + 4 + strZzB2.length();
        }
        if (z2 && (zzdyVar.zzm() & 1) == 0) {
            throw zzbc.zza("framing bit expected to be set", null);
        }
        return new zzadw(strZzB, strArr, length2 + 1);
    }

    public static boolean zzd(int i, zzdy zzdyVar, boolean z) throws zzbc {
        if (zzdyVar.zzb() < 7) {
            if (z) {
                return false;
            }
            throw zzbc.zza("too short header: " + zzdyVar.zzb(), null);
        }
        if (zzdyVar.zzm() != i) {
            if (z) {
                return false;
            }
            throw zzbc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzdyVar.zzm() == 118 && zzdyVar.zzm() == 111 && zzdyVar.zzm() == 114 && zzdyVar.zzm() == 98 && zzdyVar.zzm() == 105 && zzdyVar.zzm() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzbc.zza("expected characters 'vorbis'", null);
    }
}
