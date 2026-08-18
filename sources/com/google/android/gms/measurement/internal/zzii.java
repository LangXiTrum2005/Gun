package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzra;

/* JADX INFO: loaded from: classes3.dex */
final class zzii implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Uri zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzij zze;

    public zzii(zzij zzijVar, boolean z, Uri uri, String str, String str2) {
        this.zze = zzijVar;
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZzs;
        String str;
        zzij zzijVar = this.zze;
        boolean z = this.zza;
        Uri uri = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzd;
        zzijVar.zza.zzg();
        try {
            zzlp zzlpVarZzv = zzijVar.zza.zzt.zzv();
            zzra.zzc();
            zzag zzagVarZzf = zzijVar.zza.zzt.zzf();
            zzef zzefVar = zzeg.zzav;
            boolean zZzs = zzagVarZzf.zzs(null, zzefVar);
            if (TextUtils.isEmpty(str3)) {
                bundleZzs = null;
            } else {
                if (!str3.contains("gclid") && !str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains("utm_medium") && !str3.contains("utm_id") && !str3.contains("dclid") && !str3.contains("srsltid")) {
                    if (zZzs && str3.contains("sfmc_id")) {
                        zZzs = true;
                    }
                    zzlpVarZzv.zzt.zzaA().zzc().zza("Activity created with data 'referrer' without required params");
                    bundleZzs = null;
                }
                bundleZzs = zzlpVarZzv.zzs(Uri.parse("https://google.com/search?".concat(str3)), zZzs);
                if (bundleZzs != null) {
                    bundleZzs.putString("_cis", "referrer");
                }
            }
            if (z) {
                zzlp zzlpVarZzv2 = zzijVar.zza.zzt.zzv();
                zzra.zzc();
                str = "Activity created with data 'referrer' without required params";
                Bundle bundleZzs2 = zzlpVarZzv2.zzs(uri, zzijVar.zza.zzt.zzf().zzs(null, zzefVar));
                if (bundleZzs2 != null) {
                    bundleZzs2.putString("_cis", "intent");
                    if (!bundleZzs2.containsKey("gclid") && bundleZzs != null && bundleZzs.containsKey("gclid")) {
                        bundleZzs2.putString("_cer", "gclid=" + bundleZzs.getString("gclid"));
                    }
                    zzijVar.zza.zzG(str2, "_cmp", bundleZzs2);
                    zzijVar.zza.zzb.zza(str2, bundleZzs2);
                }
            } else {
                str = "Activity created with data 'referrer' without required params";
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            zzijVar.zza.zzt.zzaA().zzc().zzb("Activity created with referrer", str3);
            if (zzijVar.zza.zzt.zzf().zzs(null, zzeg.zzaa)) {
                if (bundleZzs != null) {
                    zzijVar.zza.zzG(str2, "_cmp", bundleZzs);
                    zzijVar.zza.zzb.zza(str2, bundleZzs);
                } else {
                    zzijVar.zza.zzt.zzaA().zzc().zzb("Referrer does not contain valid parameters", str3);
                }
                zzijVar.zza.zzW("auto", "_ldl", null, true);
                return;
            }
            if (!str3.contains("gclid") || (!str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains("utm_medium") && !str3.contains("utm_term") && !str3.contains("utm_content"))) {
                zzijVar.zza.zzt.zzaA().zzc().zza(str);
            } else {
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                zzijVar.zza.zzW("auto", "_ldl", str3, true);
            }
        } catch (RuntimeException e) {
            zzijVar.zza.zzt.zzaA().zzd().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
