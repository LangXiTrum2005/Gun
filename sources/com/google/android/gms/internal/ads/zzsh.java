package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4652tI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ul0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(29)
final class zzsh {
    /* JADX WARN: Code duplicated, block: B:13:0x0026  */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, AbstractC4652tI.f(i, i2, (int) d));
        boolean z = true;
        if (iZzc == 1 && zzsi.zza == null) {
            if (zzei.zza >= 35) {
                z = false;
            } else {
                int iZzb = zzb(false);
                int iZzb2 = zzb(true);
                if (iZzb != 0 && (iZzb2 != 0 ? !(iZzb != 2 || iZzb2 != 2) : iZzb == 2)) {
                    z = false;
                }
            }
            zzsi.zza = Boolean.valueOf(z);
            if (zzsi.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z) {
        List supportedPerformancePoints;
        try {
            zzz zzzVar = new zzz();
            zzzVar.zzaa("video/avc");
            zzab zzabVarZzag = zzzVar.zzag();
            if (zzabVarZzag.zzo != null) {
                List listZze = zzta.zze(zzsp.zza, zzabVarZzag, z, false);
                for (int i = 0; i < listZze.size(); i++) {
                    if (((zzsg) listZze.get(i)).zzd != null && ((zzsg) listZze.get(i)).zzd.getVideoCapabilities() != null && (supportedPerformancePoints = ((zzsg) listZze.get(i)).zzd.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        AbstractC4652tI.k();
                        return zzc(supportedPerformancePoints, Ul0.d());
                    }
                }
            }
        } catch (zzsu unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (AbstractC4652tI.g(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
