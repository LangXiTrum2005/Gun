package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbyk {
    @VisibleForTesting
    public static Uri zza(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i));
        AbstractC5044xl.t(sb, str2, "=", str3, "&");
        sb.append(str.substring(i));
        return Uri.parse(sb.toString());
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!com.google.android.gms.ads.internal.zzv.zzo().zzp(context)) {
            return uri.toString();
        }
        String strZza = com.google.android.gms.ads.internal.zzv.zzo().zza(context);
        if (strZza == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzas);
        String string = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzar)).booleanValue() && string.contains(str)) {
            com.google.android.gms.ads.internal.zzv.zzo().zzj(context, strZza, (Map) map.get("_ac"));
            return zzd(string, context).replace(str, strZza);
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaq)).booleanValue()) {
            return string;
        }
        String string2 = zza(zzd(string, context), "fbs_aeid", strZza).toString();
        com.google.android.gms.ads.internal.zzv.zzo().zzj(context, strZza, (Map) map.get("_ac"));
        return string2;
    }

    public static String zzc(String str, Context context, boolean z, Map map) {
        String strZza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaz)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzv.zzo().zzp(context) || TextUtils.isEmpty(str) || (strZza = com.google.android.gms.ads.internal.zzv.zzo().zza(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzas);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzar)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzv.zzq().zzj(str)) {
                com.google.android.gms.ads.internal.zzv.zzo().zzj(context, strZza, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZza);
            }
            if (!com.google.android.gms.ads.internal.zzv.zzq().zzk(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzv.zzo().zzk(context, strZza, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZza);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaq)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzv.zzq().zzj(str)) {
            com.google.android.gms.ads.internal.zzv.zzo().zzj(context, strZza, (Map) map.get("_ac"));
            return zza(zzd(str, context), "fbs_aeid", strZza).toString();
        }
        if (!com.google.android.gms.ads.internal.zzv.zzq().zzk(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzv.zzo().zzk(context, strZza, (Map) map.get("_ai"));
        return zza(zzd(str, context), "fbs_aeid", strZza).toString();
    }

    private static String zzd(String str, Context context) {
        String strZzd = com.google.android.gms.ads.internal.zzv.zzo().zzd(context);
        String strZzb = com.google.android.gms.ads.internal.zzv.zzo().zzb(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzd)) {
            str = zza(str, "gmp_app_id", strZzd).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzb)) ? str : zza(str, "fbs_aiid", strZzb).toString();
    }
}
