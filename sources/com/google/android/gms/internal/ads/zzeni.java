package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeni implements zzetr {

    @VisibleForTesting
    final zzbzm zza;

    @VisibleForTesting
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzgcs zzd;
    private final Context zze;

    public zzeni(Context context, zzbzm zzbzmVar, ScheduledExecutorService scheduledExecutorService, zzgcs zzgcsVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdb)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzbzmVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcX)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdc)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcY)).booleanValue()) {
                    return zzgch.zzm(zzfrj.zza(this.zzb.getAppSetIdInfo(), null), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzenf
                        @Override // com.google.android.gms.internal.ads.zzfuc
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzenj(appSetIdInfo.getId(), appSetIdInfo.getScope());
                        }
                    }, zzbzw.zzg);
                }
                Task<AppSetIdInfo> taskZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdb)).booleanValue() ? zzfdn.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return zzgch.zzh(new zzenj(null, -1));
                }
                AI aiZzn = zzgch.zzn(zzfrj.zza(taskZza, null), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzeng
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final AI zza(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzgch.zzh(new zzenj(null, -1)) : zzgch.zzh(new zzenj(appSetIdInfo.getId(), appSetIdInfo.getScope()));
                    }
                }, zzbzw.zzg);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcZ)).booleanValue()) {
                    aiZzn = zzgch.zzo(aiZzn, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzda)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgch.zze(aiZzn, Exception.class, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzenh
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final Object apply(Object obj) {
                        this.zza.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzenj(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgch.zzh(new zzenj(null, -1));
    }
}
