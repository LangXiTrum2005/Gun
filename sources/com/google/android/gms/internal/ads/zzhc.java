package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.F6;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(24)
final class zzhc {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = F6.i();

    public static /* bridge */ /* synthetic */ void zza(zzhc zzhcVar, int i, int i2) {
        zzhcVar.zzb.set(i, i2);
        zzhcVar.zza.setPattern(zzhcVar.zzb);
    }
}
