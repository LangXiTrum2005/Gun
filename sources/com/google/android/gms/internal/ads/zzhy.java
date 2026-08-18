package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.unity3d.services.core.di.ServiceProvider;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhy implements zzkg {
    private final zzyk zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final HashMap zzg;
    private long zzh;

    public zzhy() {
        zzyk zzykVar = new zzyk(true, 65536);
        zzl(2500, 0, "bufferForPlaybackMs", "0");
        zzl(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzl(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzl(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzl(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        zzl(0, 0, "backBufferDurationMs", "0");
        this.zza = zzykVar;
        this.zzb = zzei.zzs(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzc = zzei.zzs(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT);
        this.zzd = zzei.zzs(2500L);
        this.zze = zzei.zzs(5000L);
        this.zzf = zzei.zzs(0L);
        this.zzg = new HashMap();
        this.zzh = -1L;
    }

    private static void zzl(int i, int i2, String str, String str2) {
        zzcw.zze(i >= i2, DM.i(str, " cannot be less than ", str2));
    }

    private final void zzm(zzog zzogVar) {
        if (this.zzg.remove(zzogVar) != null) {
            zzn();
        }
    }

    private final void zzn() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    @VisibleForTesting
    public final int zza() {
        Iterator it = this.zzg.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzhw) it.next()).zzb;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final long zzb(zzog zzogVar) {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzc(zzog zzogVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzh;
        boolean z = true;
        if (j != -1 && j != id) {
            z = false;
        }
        zzcw.zzg(z, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id;
        if (!this.zzg.containsKey(zzogVar)) {
            this.zzg.put(zzogVar, new zzhw(null));
        }
        zzhw zzhwVar = (zzhw) this.zzg.get(zzogVar);
        zzhwVar.getClass();
        zzhwVar.zzb = C.DEFAULT_VIDEO_BUFFER_SIZE;
        zzhwVar.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzd(zzog zzogVar) {
        zzm(zzogVar);
        if (this.zzg.isEmpty()) {
            this.zzh = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zze(zzog zzogVar) {
        zzm(zzogVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final void zzf(zzkf zzkfVar, zzwj zzwjVar, zzxv[] zzxvVarArr) {
        zzhw zzhwVar = (zzhw) this.zzg.get(zzkfVar.zza);
        zzhwVar.getClass();
        int length = zzxvVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = C.DEFAULT_VIDEO_BUFFER_SIZE;
            if (i >= length) {
                zzhwVar.zzb = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i2);
                zzn();
                return;
            }
            zzxv zzxvVar = zzxvVarArr[i];
            if (zzxvVar != null) {
                switch (zzxvVar.zzg().zzc) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i3 = 144310272;
                        break;
                    case 2:
                        i3 = 131072000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    default:
                        i3 = 131072;
                        break;
                }
                i2 += i3;
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzg(zzog zzogVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzh(zzkf zzkfVar) {
        zzhw zzhwVar = (zzhw) this.zzg.get(zzkfVar.zza);
        zzhwVar.getClass();
        int iZza = this.zza.zza();
        int iZza2 = zza();
        long jMin = this.zzb;
        float f = zzkfVar.zzc;
        if (f > 1.0f) {
            jMin = Math.min(zzei.zzq(jMin, f), this.zzc);
        }
        long j = zzkfVar.zzb;
        if (j < Math.max(jMin, 500000L)) {
            boolean z = iZza < iZza2;
            zzhwVar.zza = z;
            if (!z && j < 500000) {
                zzdo.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= this.zzc || iZza >= iZza2) {
            zzhwVar.zza = false;
        }
        return zzhwVar.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzi(zzbq zzbqVar, zzug zzugVar, long j) {
        Iterator it = this.zzg.values().iterator();
        while (it.hasNext()) {
            if (((zzhw) it.next()).zza) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final boolean zzj(zzkf zzkfVar) {
        boolean z = zzkfVar.zzd;
        long jZzr = zzei.zzr(zzkfVar.zzb, zzkfVar.zzc);
        long jMin = z ? this.zze : this.zzd;
        long j = zzkfVar.zze;
        if (j != C.TIME_UNSET) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jZzr >= jMin || this.zza.zza() >= zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkg
    public final zzyk zzk() {
        return this.zza;
    }
}
