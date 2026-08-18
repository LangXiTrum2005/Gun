package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.bytedance.sdk.component.embedapplog.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbeu {
    public static final zzbdv zza = zzbdv.zzb("gads:dynamite_load:fail:sample_rate", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbdv zzb = zzbdv.zzd("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbdv zzc = new zzbdv("gads:public_beta:traffic_multiplier", BuildConfig.VERSION_NAME, 4);
    public static final zzbdv zzd = new zzbdv("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbdv zze = zzbdv.zzd("gads:sdk_crash_report_enabled", false);
    public static final zzbdv zzf = zzbdv.zzd("gads:sdk_crash_report_full_stacktrace", false);
    public static final zzbdv zzg = zzbdv.zza("gads:trapped_exception_sample_rate", 0.01d);
}
