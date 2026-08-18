package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzebv;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class zzaa {
    public /* synthetic */ zzaa(zzz zzzVar) {
    }

    @Nullable
    public CookieManager zza(Context context) {
        throw null;
    }

    public WebResourceResponse zzb(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        throw null;
    }

    public zzcff zzc(zzcex zzcexVar, zzbbj zzbbjVar, boolean z, @Nullable zzebv zzebvVar) {
        throw null;
    }

    public boolean zzd(Activity activity, Configuration configuration) {
        return false;
    }

    @Nullable
    public Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public zzbbq.zzq zzg(Context context, TelephonyManager telephonyManager) {
        return zzbbq.zzq.ENUM_UNKNOWN;
    }

    public void zzh(Context context, String str, String str2) {
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(AudioManager audioManager) {
        return 0;
    }

    public void zzk(Activity activity) {
    }

    public int zzm(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
