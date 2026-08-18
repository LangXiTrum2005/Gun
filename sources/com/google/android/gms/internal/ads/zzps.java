package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzps {

    @Nullable
    private final Context zza;
    private Boolean zzb;

    public zzps() {
        this.zza = null;
    }

    public final zzor zza(zzab zzabVar, zze zzeVar) {
        boolean zBooleanValue;
        AudioManager audioManager;
        zzabVar.getClass();
        zzeVar.getClass();
        int i = zzei.zza;
        if (i < 29 || zzabVar.zzE == -1) {
            return zzor.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
                this.zzb = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzabVar.zzo;
        str.getClass();
        int iZza = zzbb.zza(str, zzabVar.zzk);
        if (iZza == 0 || i < zzei.zzh(iZza)) {
            return zzor.zza;
        }
        int iZzi = zzei.zzi(zzabVar.zzD);
        if (iZzi == 0) {
            return zzor.zza;
        }
        try {
            AudioFormat audioFormatZzx = zzei.zzx(zzabVar.zzE, iZzi, iZza);
            if (i < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatZzx, zzeVar.zza().zza)) {
                    return zzor.zza;
                }
                zzop zzopVar = new zzop();
                zzopVar.zza(true);
                zzopVar.zzc(zBooleanValue);
                return zzopVar.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatZzx, zzeVar.zza().zza);
            if (playbackOffloadSupport == 0) {
                return zzor.zza;
            }
            zzop zzopVar2 = new zzop();
            if (i > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            zzopVar2.zza(true);
            zzopVar2.zzb(z);
            zzopVar2.zzc(zBooleanValue);
            return zzopVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzor.zza;
        }
    }

    public zzps(@Nullable Context context) {
        this.zza = context;
    }
}
