package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes3.dex */
final class zzaiu {
    public final zzajb zza;
    public final zzaje zzb;
    public final zzadt zzc;

    @Nullable
    public final zzadu zzd;
    public int zze;

    public zzaiu(zzajb zzajbVar, zzaje zzajeVar, zzadt zzadtVar) {
        this.zza = zzajbVar;
        this.zzb = zzajeVar;
        this.zzc = zzadtVar;
        this.zzd = MimeTypes.AUDIO_TRUEHD.equals(zzajbVar.zzg.zzo) ? new zzadu() : null;
    }
}
