package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.efs.sdk.base.Constants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4304pL;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class zzalb {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfxs zze = zzfxs.zzp("auto", Constants.CP_NONE);
    private static final zzfxs zzf = zzfxs.zzq("dot", "sesame", "circle");
    private static final zzfxs zzg = zzfxs.zzp("filled", C4304pL.OPEN);
    private static final zzfxs zzh = zzfxs.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzalb(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    @Nullable
    public static zzalb zza(@Nullable String str) {
        byte b;
        int i;
        if (str == null) {
            return null;
        }
        String strZza = zzftt.zza(str.trim());
        if (strZza.isEmpty()) {
            return null;
        }
        zzfxs zzfxsVarZzm = zzfxs.zzm(TextUtils.split(strZza, zzd));
        String str2 = (String) zzfxt.zza(zzfzp.zzb(zzh, zzfxsVarZzm), "outside");
        int iHashCode = str2.hashCode();
        int i2 = -1;
        int i3 = 0;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals("after")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str2.equals("outside")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            i = b != 1 ? 1 : -2;
        } else {
            i = 2;
        }
        zzfzn zzfznVarZzb = zzfzp.zzb(zze, zzfxsVarZzm);
        if (zzfznVarZzb.isEmpty()) {
            zzfzn zzfznVarZzb2 = zzfzp.zzb(zzg, zzfxsVarZzm);
            zzfzn zzfznVarZzb3 = zzfzp.zzb(zzf, zzfxsVarZzm);
            if (!zzfznVarZzb2.isEmpty() || !zzfznVarZzb3.isEmpty()) {
                String str3 = (String) zzfxt.zza(zzfznVarZzb2, "filled");
                int i4 = (str3.hashCode() == 3417674 && str3.equals(C4304pL.OPEN)) ? 2 : 1;
                String str4 = (String) zzfxt.zza(zzfznVarZzb3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i2 = 0;
                    }
                } else if (str4.equals("sesame")) {
                    i2 = 1;
                }
                if (i2 == 0) {
                    i3 = i4;
                    i2 = 2;
                } else if (i2 != 1) {
                    i3 = i4;
                    i2 = 1;
                } else {
                    i2 = 3;
                    i3 = i4;
                }
            }
        } else {
            String str5 = (String) zzfznVarZzb.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals(Constants.CP_NONE)) {
                i2 = 0;
            }
        }
        return new zzalb(i2, i3, i);
    }
}
