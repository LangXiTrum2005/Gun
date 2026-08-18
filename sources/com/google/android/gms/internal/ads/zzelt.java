package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.analytics.pro.f;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelt implements zzetq {
    final zzfcj zza;
    private final long zzb;

    public zzelt(zzfcj zzfcjVar, long j) {
        this.zza = zzfcjVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuv) obj).zzb;
        zzfcj zzfcjVar = this.zza;
        bundle.putString("slotname", zzfcjVar.zzf);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcjVar.zzd;
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        int i = zzmVar.zzg;
        zzfcx.zze(bundle, "tag_for_child_directed_treatment", i, i != -1);
        if (zzmVar.zza >= 8) {
            int i2 = zzmVar.zzt;
            zzfcx.zze(bundle, "tag_for_under_age_of_consent", i2, i2 != -1);
        }
        zzfcx.zzc(bundle, "url", zzmVar.zzl);
        zzfcx.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
        Bundle bundle2 = (Bundle) zzmVar.zzc.clone();
        HashSet hashSet = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhs)).split(",", -1)));
        for (String str : zzmVar.zzc.keySet()) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        zzfcx.zzb(bundle, "extras", bundle2);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza.zzd;
        bundle.putInt("http_timeout_millis", zzmVar.zzw);
        bundle.putString("slotname", this.zza.zzf);
        int i = this.zza.zzo.zza;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i2 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        bundle.putLong("start_signals_timestamp", this.zzb);
        zzfcx.zzg(bundle, "is_sdk_preload", true, zzmVar.zzb());
        zzfcx.zzf(bundle, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzmVar.zzb)), zzmVar.zzb != -1);
        zzfcx.zzb(bundle, "extras", zzmVar.zzc);
        int i3 = zzmVar.zzd;
        zzfcx.zze(bundle, "cust_gender", i3, i3 != -1);
        zzfcx.zzd(bundle, "kw", zzmVar.zze);
        int i4 = zzmVar.zzg;
        zzfcx.zze(bundle, "tag_for_child_directed_treatment", i4, i4 != -1);
        if (zzmVar.zzf) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", zzmVar.zzy);
        zzfcx.zze(bundle, "d_imp_hdr", 1, zzmVar.zza >= 2 && zzmVar.zzh);
        String str = zzmVar.zzi;
        zzfcx.zzf(bundle, "ppid", str, zzmVar.zza >= 2 && !TextUtils.isEmpty(str));
        Location location = zzmVar.zzk;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = location.getLongitude() * 1.0E7d;
            Bundle bundle2 = new Bundle();
            bundle2.putFloat("radius", accuracy);
            bundle2.putLong(f.C, (long) latitude);
            bundle2.putLong("long", (long) longitude);
            bundle2.putLong("time", time);
            bundle.putBundle("uule", bundle2);
        }
        zzfcx.zzc(bundle, "url", zzmVar.zzl);
        zzfcx.zzd(bundle, "neighboring_content_urls", zzmVar.zzv);
        zzfcx.zzb(bundle, "custom_targeting", zzmVar.zzn);
        zzfcx.zzd(bundle, "category_exclusions", zzmVar.zzo);
        zzfcx.zzc(bundle, "request_agent", zzmVar.zzp);
        zzfcx.zzc(bundle, "request_pkg", zzmVar.zzq);
        zzfcx.zzg(bundle, "is_designed_for_families", zzmVar.zzr, zzmVar.zza >= 7);
        if (zzmVar.zza >= 8) {
            int i5 = zzmVar.zzt;
            zzfcx.zze(bundle, "tag_for_under_age_of_consent", i5, i5 != -1);
            zzfcx.zzc(bundle, "max_ad_content_rating", zzmVar.zzu);
        }
    }
}
