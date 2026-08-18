package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfhg {
    public static void zza(AI ai, zzfhh zzfhhVar, zzfgw zzfgwVar) {
        zzg(ai, zzfhhVar, zzfgwVar, false);
    }

    public static void zzb(AI ai, zzfhh zzfhhVar, zzfgw zzfgwVar) {
        zzg(ai, zzfhhVar, zzfgwVar, true);
    }

    public static void zzc(AI ai, zzfhh zzfhhVar, zzfgw zzfgwVar) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            zzgch.zzr(zzgby.zzu(ai), new zzfhf(zzfhhVar, zzfgwVar), zzbzw.zzg);
        }
    }

    public static void zzd(AI ai, zzfgw zzfgwVar) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            zzgch.zzr(zzgby.zzu(ai), new zzfhd(zzfgwVar), zzbzw.zzg);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziH), str);
    }

    public static int zzf(zzfcj zzfcjVar) {
        int iZzf = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(zzfcjVar) - 1;
        return (iZzf == 0 || iZzf == 1) ? 7 : 23;
    }

    private static void zzg(AI ai, zzfhh zzfhhVar, zzfgw zzfgwVar, boolean z) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            zzgch.zzr(zzgby.zzu(ai), new zzfhe(zzfhhVar, zzfgwVar, z), zzbzw.zzg);
        }
    }
}
