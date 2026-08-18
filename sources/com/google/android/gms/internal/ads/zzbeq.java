package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbeq {
    public static final zzbdv zza = zzbdv.zzd("gads:paw_app_signals:enabled", false);
    public static final zzbdv zzb = zzbdv.zzd("gads:paw_delegate_web_view_client:enabled", false);
    public static final zzbdv zzc = zzbdv.zzd("gads:paw_cache:enabled", false);
    public static final zzbdv zzd = zzbdv.zzb("gads:paw_cache:refresh_interval_seconds", 30);
    public static final zzbdv zze = zzbdv.zzb("gads:paw_cache:retry_delay_seconds", 10);
    public static final zzbdv zzf = zzbdv.zzb("gads:paw_cache:ttl_ms", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
}
