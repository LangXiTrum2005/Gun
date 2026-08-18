package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsj extends Exception {

    @Nullable
    public final String zza;
    public final boolean zzb;

    @Nullable
    public final zzsg zzc;

    @Nullable
    public final String zzd;

    public zzsj(zzab zzabVar, @Nullable Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + zzabVar.toString(), th, zzabVar.zzo, false, null, AbstractC3950lJ.p("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", Math.abs(i)), null);
    }

    public static /* bridge */ /* synthetic */ zzsj zza(zzsj zzsjVar, zzsj zzsjVar2) {
        return new zzsj(zzsjVar.getMessage(), zzsjVar.getCause(), zzsjVar.zza, false, zzsjVar.zzc, zzsjVar.zzd, zzsjVar2);
    }

    public zzsj(zzab zzabVar, @Nullable Throwable th, boolean z, zzsg zzsgVar) {
        this(AbstractC5044xl.m("Decoder init failed: ", zzsgVar.zza, ", ", zzabVar.toString()), th, zzabVar.zzo, false, zzsgVar, th instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : null, null);
    }

    private zzsj(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable zzsg zzsgVar, @Nullable String str3, @Nullable zzsj zzsjVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsgVar;
        this.zzd = str3;
    }
}
