package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwz {
    private final ScheduledExecutorService zza;
    private final zzgcs zzb;
    private final zzgcs zzc;
    private final zzdxu zzd;
    private final zzhel zze;

    public zzdwz(ScheduledExecutorService scheduledExecutorService, zzgcs zzgcsVar, zzgcs zzgcsVar2, zzdxu zzdxuVar, zzhel zzhelVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgcsVar;
        this.zzc = zzgcsVar2;
        this.zzd = zzdxuVar;
        this.zze = zzhelVar;
    }

    public final /* synthetic */ zzdyi zza(zzbvk zzbvkVar) throws Exception {
        return (zzdyi) this.zzd.zza(zzbvkVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfy)).intValue(), TimeUnit.SECONDS);
    }

    public final /* synthetic */ AI zzb(final zzbvk zzbvkVar, int i, Throwable th) throws Exception {
        Bundle bundle;
        if (zzbvkVar != null && (bundle = zzbvkVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgch.zzn(((zzdzl) this.zze.zzb()).zzd(zzbvkVar, i), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdww
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return zzgch.zzh(new zzdyi((InputStream) obj, zzbvkVar));
            }
        }, this.zzb);
    }

    public final AI zzc(final zzbvk zzbvkVar) {
        AI aiZzb;
        String str = zzbvkVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(str)) {
            aiZzb = zzgch.zzg(new zzdyh(1));
        } else {
            aiZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhn)).booleanValue() ? this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zza(zzbvkVar);
                }
            }) : this.zzd.zza(zzbvkVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgby) zzgch.zzf((zzgby) zzgch.zzo(zzgby.zzu(aiZzb), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfy)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdwy
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzb(zzbvkVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }
}
