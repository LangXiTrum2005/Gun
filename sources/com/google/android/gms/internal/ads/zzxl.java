package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(32)
final class zzxl {
    private final Spatializer zza;
    private final boolean zzb;

    @Nullable
    private Handler zzc;

    @Nullable
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzxl(Spatializer spatializer) {
        this.zza = spatializer;
        this.zzb = spatializer.getImmersiveAudioLevel() != 0;
    }

    @Nullable
    public static zzxl zza(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new zzxl(audioManager.getSpatializer());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzxj] */
    public final void zzb(zzxt zzxtVar, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzxk(this, zzxtVar);
            final Handler handler = new Handler(looper);
            this.zzc = handler;
            this.zza.addOnSpatializerStateChangedListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzxj
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener == null || this.zzc == null) {
            return;
        }
        this.zza.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        Handler handler = this.zzc;
        int i = zzei.zza;
        handler.removeCallbacksAndMessages(null);
        this.zzc = null;
        this.zzd = null;
    }

    public final boolean zzd(zze zzeVar, zzab zzabVar) {
        int i;
        if (Objects.equals(zzabVar.zzo, MimeTypes.AUDIO_E_AC3_JOC) && zzabVar.zzD == 16) {
            i = 12;
        } else {
            i = (Objects.equals(zzabVar.zzo, "audio/iamf") && zzabVar.zzD == -1) ? 6 : zzabVar.zzD;
        }
        int iZzi = zzei.zzi(i);
        if (iZzi == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iZzi);
        int i2 = zzabVar.zzE;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return this.zza.canBeSpatialized(zzeVar.zza().zza, channelMask.build());
    }

    public final boolean zze() {
        return this.zza.isAvailable();
    }

    public final boolean zzf() {
        return this.zza.isEnabled();
    }

    public final boolean zzg() {
        return this.zzb;
    }
}
