package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbey {
    public static final zzbdv zza;

    static {
        zzbdv.zzb("gads:ad_loader:timeout_ms", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        zza = zzbdv.zzb("gads:rendering:timeout_ms", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        zzbdv.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}
