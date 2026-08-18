package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzboa;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbog;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzgcs;
import com.umeng.ccg.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzf {
    private Context zza;
    private long zzb = 0;

    public static final /* synthetic */ AI zzd(Long l, zzdrw zzdrwVar, zzfhk zzfhkVar, zzfgw zzfgwVar, JSONObject jSONObject) throws Exception {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzv.zzp().zzi().zzs(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdrwVar, "cld_s", zzv.zzC().elapsedRealtime() - l.longValue());
            }
        }
        zzfgwVar.zzg(zOptBoolean);
        zzfhkVar.zzb(zzfgwVar.zzm());
        return zzgch.zzh(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdrw zzdrwVar, String str, long j) {
        if (zzdrwVar != null) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzmy)).booleanValue()) {
                zzdrv zzdrvVarZza = zzdrwVar.zza();
                zzdrvVarZza.zzb(a.w, "lat_init");
                zzdrvVarZza.zzb(str, Long.toString(j));
                zzdrvVarZza.zzg();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable Runnable runnable, zzfhk zzfhkVar, @Nullable zzdrw zzdrwVar, @Nullable Long l) {
        zzb(context, versionInfoParcel, true, null, str, null, runnable, zzfhkVar, zzdrwVar, l);
    }

    @VisibleForTesting
    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, boolean z, @Nullable zzbzg zzbzgVar, String str, @Nullable String str2, @Nullable Runnable runnable, final zzfhk zzfhkVar, @Nullable final zzdrw zzdrwVar, @Nullable final Long l) {
        PackageInfo packageInfo;
        if (zzv.zzC().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzv.zzC().elapsedRealtime();
        if (zzbzgVar != null && !TextUtils.isEmpty(zzbzgVar.zzc())) {
            if (zzv.zzC().currentTimeMillis() - zzbzgVar.zza() <= ((Long) zzbe.zzc().zza(zzbcl.zzej)).longValue() && zzbzgVar.zzi()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfgw zzfgwVarZza = zzfgv.zza(context, 4);
        zzfgwVarZza.zzi();
        zzbog zzbogVarZza = zzv.zzg().zza(this.zza, versionInfoParcel, zzfhkVar);
        zzboa zzboaVar = zzbod.zza;
        zzbnw zzbnwVarZza = zzbogVarZza.zza("google.afma.config.fetchAppSettings", zzboaVar, zzboaVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(MintegralConstants.AD_UNIT_ID, str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            zzbcc zzbccVar = zzbcl.zza;
            jSONObject.put("experiment_ids", TextUtils.join(",", zzbe.zza().zza()));
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            try {
                ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                    jSONObject.put("version", packageInfo.versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
            }
            AI aiZzb = zzbnwVarZza.zzb(jSONObject);
            zzgbo zzgboVar = new zzgbo(this) { // from class: com.google.android.gms.ads.internal.zzd
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final AI zza(Object obj) {
                    return zzf.zzd(l, zzdrwVar, zzfhkVar, zzfgwVarZza, (JSONObject) obj);
                }
            };
            zzgcs zzgcsVar = zzbzw.zzg;
            AI aiZzn = zzgch.zzn(aiZzb, zzgboVar, zzgcsVar);
            if (runnable != null) {
                aiZzb.addListener(runnable, zzgcsVar);
            }
            if (l != null) {
                aiZzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzf.zzf(zzdrwVar, "cld_r", zzv.zzC().elapsedRealtime() - l.longValue());
                    }
                }, zzgcsVar);
            }
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzhC)).booleanValue()) {
                zzbzz.zzb(aiZzn, "ConfigLoader.maybeFetchNewAppSettings");
            } else {
                zzbzz.zza(aiZzn, "ConfigLoader.maybeFetchNewAppSettings");
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error requesting application settings", e);
            zzfgwVarZza.zzh(e);
            zzfgwVarZza.zzg(false);
            zzfhkVar.zzb(zzfgwVarZza.zzm());
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, zzbzg zzbzgVar, zzfhk zzfhkVar) {
        zzb(context, versionInfoParcel, false, zzbzgVar, zzbzgVar != null ? zzbzgVar.zzb() : null, str, null, zzfhkVar, null, null);
    }
}
