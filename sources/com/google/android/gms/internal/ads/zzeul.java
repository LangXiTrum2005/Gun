package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeul implements zzetr {
    private final com.google.android.gms.ads.internal.util.zzg zza;
    private final Context zzb;
    private final zzgcs zzc;
    private final ScheduledExecutorService zzd;
    private final zzecu zze;
    private final zzfcj zzf;
    private final VersionInfoParcel zzg;

    public zzeul(com.google.android.gms.ads.internal.util.zzg zzgVar, Context context, zzgcs zzgcsVar, ScheduledExecutorService scheduledExecutorService, zzecu zzecuVar, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgVar;
        this.zzb = context;
        this.zzc = zzgcsVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzecuVar;
        this.zzf = zzfcjVar;
        this.zzg = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:17:0x0077  */
    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.zzb.getPackageName()) != false) goto L30;
     */
    @Override // com.google.android.gms.internal.ads.zzetr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI zzb() {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeul.zzb():gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI");
    }

    public final /* synthetic */ AI zzc(final Throwable th) throws Exception {
        zzeun zzeunVar;
        this.zzc.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeui
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkn)).booleanValue();
                Throwable th2 = th;
                if (zBooleanValue) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzx(th2, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        if (th instanceof SecurityException) {
            zzeunVar = new zzeun("", 2, null);
        } else if (th instanceof IllegalStateException) {
            zzeunVar = new zzeun("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            zzeunVar = new zzeun("", 4, null);
        } else {
            zzeunVar = th instanceof TimeoutException ? new zzeun("", 5, null) : new zzeun("", 0, null);
        }
        return zzgch.zzh(zzeunVar);
    }
}
