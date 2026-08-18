package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedh implements zzecw {
    private final zzcoa zza;
    private final Context zzb;
    private final zzdow zzc;
    private final zzfcj zzd;
    private final Executor zze;
    private final VersionInfoParcel zzf;
    private final zzbjs zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziM)).booleanValue();
    private final zzebv zzi;
    private final zzdrq zzj;
    private final zzdrw zzk;

    public zzedh(zzcoa zzcoaVar, Context context, Executor executor, zzdow zzdowVar, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel, zzbjs zzbjsVar, zzebv zzebvVar, zzdrq zzdrqVar, zzdrw zzdrwVar) {
        this.zzb = context;
        this.zza = zzcoaVar;
        this.zze = executor;
        this.zzc = zzdowVar;
        this.zzd = zzfcjVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzbjsVar;
        this.zzi = zzebvVar;
        this.zzj = zzdrqVar;
        this.zzk = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final AI zza(final zzfca zzfcaVar, final zzfbo zzfboVar) {
        final zzdpa zzdpaVar = new zzdpa();
        AI aiZzn = zzgch.zzn(zzgch.zzh(null), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzedd
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzc(zzfboVar, zzfcaVar, zzdpaVar, obj);
            }
        }, this.zze);
        aiZzn.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzede
            @Override // java.lang.Runnable
            public final void run() {
                zzdpaVar.zzb();
            }
        }, this.zze);
        return aiZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfcaVar, zzfbo zzfboVar) {
        zzfbt zzfbtVar = zzfboVar.zzs;
        return (zzfbtVar == null || zzfbtVar.zza == null) ? false : true;
    }

    public final /* synthetic */ AI zzc(final zzfbo zzfboVar, zzfca zzfcaVar, zzdpa zzdpaVar, Object obj) throws Exception {
        final zzedh zzedhVar;
        zzbcc zzbccVar = zzbcl.zzcm;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
            AbstractC3888ke0.o(this.zzj.zza(), zzdre.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final zzcex zzcexVarZza = this.zzc.zza(this.zzd.zze, zzfboVar, zzfcaVar.zzb.zzb);
        zzcexVarZza.zzac(zzfboVar.zzW);
        zzdpaVar.zza(this.zzb, zzcexVarZza.zzF());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
            AbstractC3888ke0.o(this.zzj.zza(), zzdre.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzcab zzcabVar = new zzcab();
        final zzcnx zzcnxVarZza = this.zza.zza(new zzcrp(zzfcaVar, zzfboVar, null), new zzdeu(new zzedj(this.zzf, zzcabVar, zzfboVar, zzcexVarZza, this.zzd, this.zzh, this.zzg, this.zzi, this.zzk), zzcexVarZza), new zzcny(zzfboVar.zzaa));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
            zzedhVar = this;
            AbstractC3888ke0.o(zzedhVar.zzj.zza(), zzdre.RENDERING_AD_COMPONENT_CREATION_END.zza());
        } else {
            zzedhVar = this;
        }
        zzcnxVarZza.zzh().zzi(zzcexVarZza, false, zzedhVar.zzh ? zzedhVar.zzg : null, zzedhVar.zzj.zza());
        zzcabVar.zzc(zzcnxVarZza);
        zzcnxVarZza.zzc().zzo(new zzcwn() { // from class: com.google.android.gms.internal.ads.zzedf
            @Override // com.google.android.gms.internal.ads.zzcwn
            public final void zzr() {
                zzcex zzcexVar = zzcexVarZza;
                if (zzcexVar.zzN() != null) {
                    zzcexVar.zzN().zzs();
                }
            }
        }, zzbzw.zzg);
        String strZzb = zzfboVar.zzs.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && zzcnxVarZza.zzi().zze(true)) {
            strZzb = zzcgi.zzb(strZzb, zzcgi.zza(zzfboVar));
        }
        zzcnxVarZza.zzh();
        return zzgch.zzm(zzdov.zzj(zzcexVarZza, zzfboVar.zzs.zzb, strZzb, zzedhVar.zzj.zza()), new zzfuc(zzedhVar) { // from class: com.google.android.gms.internal.ads.zzedg
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj2) {
                zzcex zzcexVar = zzcexVarZza;
                if (zzfboVar.zzM) {
                    zzcexVar.zzah();
                }
                zzcnx zzcnxVar = zzcnxVarZza;
                zzcexVar.zzab();
                zzcexVar.onPause();
                return zzcnxVar.zza();
            }
        }, zzedhVar.zze);
    }
}
