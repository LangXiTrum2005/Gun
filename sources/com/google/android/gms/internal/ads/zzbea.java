package com.google.android.gms.internal.ads;

import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbea {
    public static final zzbdv zza = zzbdv.zzb("gads:app_permissions_caching_expiry_ms:expiry", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    public static final zzbdv zzb = zzbdv.zzb("gads:audio_caching_expiry_ms:expiry", 5000);
    public static final zzbdv zzc = zzbdv.zzb("gads:battery_caching_expiry_ms:expiry", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbdv zzd = zzbdv.zzb("gads:device_info_caching_expiry_ms:expiry", PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    public static final zzbdv zze = zzbdv.zzb("gads:hsdp_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbdv zzf = zzbdv.zzb("gads:memory_caching_expiry_ms:expiry", 5000);
    public static final zzbdv zzg = zzbdv.zzb("gads:sdk_environment_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbdv zzh = zzbdv.zzb("gads:telephony_caching_expiry_ms:expiry", 5000);
}
