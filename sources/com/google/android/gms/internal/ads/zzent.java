package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzent implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzent(zzgcs zzgcsVar, Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzens
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzenu zzc() throws Exception {
        int i;
        int streamMaxVolume;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        float fZza = com.google.android.gms.ads.internal.zzv.zzs().zza();
        boolean zZze = com.google.android.gms.ads.internal.zzv.zzs().zze();
        if (audioManager == null) {
            return new zzenu(-1, false, false, -1, -1, -1, -1, -1, fZza, zZze, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkQ)).booleanValue()) {
            int iZzj = com.google.android.gms.ads.internal.zzv.zzr().zzj(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i = iZzj;
        } else {
            i = -1;
            streamMaxVolume = -1;
        }
        return new zzenu(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fZza, zZze, false);
    }
}
