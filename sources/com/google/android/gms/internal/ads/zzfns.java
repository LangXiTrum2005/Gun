package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
public final class zzfns {
    public static zzfpb zza(Context context, int i, int i2, String str, String str2, String str3, zzfni zzfniVar) {
        return new zzfnr(context, 1, i2, str, str2, "1", zzfniVar).zza(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS);
    }
}
