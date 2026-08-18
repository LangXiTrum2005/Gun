package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2312Bj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4864vj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class zzn {
    private final zzl zza;
    private final Activity zzb;
    private final C4864vj zzc;
    private final C2312Bj zzd;

    public /* synthetic */ zzn(zzl zzlVar, Activity activity, C4864vj c4864vj, C2312Bj c2312Bj, zzm zzmVar) {
        this.zza = zzlVar;
        this.zzb = activity;
        this.zzc = c4864vj;
        this.zzd = c2312Bj;
    }

    public static zzcf zza(zzn zznVar) throws zzg {
        Bundle bundle;
        List listEmptyList;
        List listEmptyList2;
        PackageInfo packageInfo;
        zzcf zzcfVar = new zzcf();
        String string = zznVar.zzd.b;
        if (TextUtils.isEmpty(string)) {
            try {
                bundle = zznVar.zza.zza.getPackageManager().getApplicationInfo(zznVar.zza.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(string)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzcfVar.zza = string;
        if (zznVar.zzc.f5147a) {
            ArrayList arrayList = new ArrayList();
            int i = zznVar.zzc.b;
            if (i == 1) {
                arrayList.add(zzca.GEO_OVERRIDE_EEA);
            } else if (i == 2) {
                arrayList.add(zzca.GEO_OVERRIDE_NON_EEA);
            } else if (i == 3) {
                arrayList.add(zzca.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (i == 4) {
                arrayList.add(zzca.GEO_OVERRIDE_OTHER);
            }
            arrayList.add(zzca.PREVIEWING_DEBUG_MESSAGES);
            listEmptyList = arrayList;
        } else {
            listEmptyList = Collections.emptyList();
        }
        zzcfVar.zzi = listEmptyList;
        zzcfVar.zze = zznVar.zza.zzb.zzc();
        zzcfVar.zzd = Boolean.valueOf(zznVar.zzd.f2886a);
        zzcfVar.zzc = Locale.getDefault().toLanguageTag();
        zzcb zzcbVar = new zzcb();
        int i2 = Build.VERSION.SDK_INT;
        zzcbVar.zzb = Integer.valueOf(i2);
        zzcbVar.zza = Build.MODEL;
        zzcbVar.zzc = 2;
        zzcfVar.zzb = zzcbVar;
        Configuration configuration = zznVar.zza.zza.getResources().getConfiguration();
        zznVar.zza.zza.getResources().getConfiguration();
        zzcd zzcdVar = new zzcd();
        zzcdVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcdVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzcdVar.zzc = Double.valueOf(zznVar.zza.zza.getResources().getDisplayMetrics().density);
        if (i2 < 28) {
            listEmptyList2 = Collections.emptyList();
        } else {
            Activity activity = zznVar.zzb;
            Window window = activity == null ? null : activity.getWindow();
            View decorView = window == null ? null : window.getDecorView();
            WindowInsets rootWindowInsets = decorView == null ? null : decorView.getRootWindowInsets();
            DisplayCutout displayCutout = rootWindowInsets == null ? null : rootWindowInsets.getDisplayCutout();
            if (displayCutout == null) {
                listEmptyList2 = Collections.emptyList();
            } else {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzcc zzccVar = new zzcc();
                        zzccVar.zzb = Integer.valueOf(rect.left);
                        zzccVar.zzc = Integer.valueOf(rect.right);
                        zzccVar.zza = Integer.valueOf(rect.top);
                        zzccVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzccVar);
                    }
                }
                listEmptyList2 = arrayList2;
            }
        }
        zzcdVar.zzd = listEmptyList2;
        zzcfVar.zzf = zzcdVar;
        zzl zzlVar = zznVar.zza;
        Application application = zzlVar.zza;
        try {
            packageInfo = zzlVar.zza.getPackageManager().getPackageInfo(application.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzbz zzbzVar = new zzbz();
        zzbzVar.zza = application.getPackageName();
        CharSequence applicationLabel = zznVar.zza.zza.getPackageManager().getApplicationLabel(zznVar.zza.zza.getApplicationInfo());
        zzbzVar.zzb = applicationLabel != null ? applicationLabel.toString() : null;
        if (packageInfo != null) {
            zzbzVar.zzc = Long.toString(Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode);
        }
        zzcfVar.zzg = zzbzVar;
        zzce zzceVar = new zzce();
        zzceVar.zza = "3.1.0";
        zzcfVar.zzh = zzceVar;
        return zzcfVar;
    }
}
