package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcsd {
    private final zzdxl zza;
    private final zzfcj zzb;
    private final zzfgn zzc;
    private final zzcky zzd;
    private final zzegx zze;
    private final zzdba zzf;

    @Nullable
    private zzfca zzg;
    private final zzdyt zzh;
    private final zzcuw zzi;
    private final Executor zzj;
    private final zzdye zzk;
    private final zzedb zzl;

    public zzcsd(zzdxl zzdxlVar, zzfcj zzfcjVar, zzfgn zzfgnVar, zzcky zzckyVar, zzegx zzegxVar, zzdba zzdbaVar, @Nullable zzfca zzfcaVar, zzdyt zzdytVar, zzcuw zzcuwVar, Executor executor, zzdye zzdyeVar, zzedb zzedbVar) {
        this.zza = zzdxlVar;
        this.zzb = zzfcjVar;
        this.zzc = zzfgnVar;
        this.zzd = zzckyVar;
        this.zze = zzegxVar;
        this.zzf = zzdbaVar;
        this.zzg = zzfcaVar;
        this.zzh = zzdytVar;
        this.zzi = zzcuwVar;
        this.zzj = executor;
        this.zzk = zzdyeVar;
        this.zzl = zzedbVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfdk.zzb(th, this.zzl);
    }

    public final zzdba zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzfca zzd(zzfca zzfcaVar) throws Exception {
        this.zzd.zza(zzfcaVar);
        return zzfcaVar;
    }

    public final AI zze(final zzfed zzfedVar) {
        zzfft zzfftVarZza = this.zzc.zzb(zzfgh.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcrz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzf(zzfedVar, (zzbvk) obj);
            }
        }).zza();
        zzgch.zzr(zzfftVarZza, new zzcsb(this), this.zzj);
        return zzfftVarZza;
    }

    public final /* synthetic */ AI zzf(zzfed zzfedVar, zzbvk zzbvkVar) throws Exception {
        zzbvkVar.zzi = zzfedVar;
        return this.zzh.zza(zzbvkVar);
    }

    public final AI zzg(zzbvk zzbvkVar) {
        zzfft zzfftVarZza = this.zzc.zzb(zzfgh.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbvkVar)).zza();
        zzgch.zzr(zzfftVarZza, new zzcsc(this), this.zzj);
        return zzfftVarZza;
    }

    public final AI zzh(AI ai) {
        zzfgd zzfgdVarZzf = this.zzc.zzb(zzfgh.RENDERER, ai).zze(new zzffr() { // from class: com.google.android.gms.internal.ads.zzcry
            @Override // com.google.android.gms.internal.ads.zzffr
            public final Object zza(Object obj) throws Exception {
                zzfca zzfcaVar = (zzfca) obj;
                this.zza.zzd(zzfcaVar);
                return zzfcaVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfx)).booleanValue()) {
            zzfgdVarZzf = zzfgdVarZzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfy)).intValue(), TimeUnit.SECONDS);
        }
        return zzfgdVarZzf.zza();
    }

    public final AI zzi() {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzb.zzd;
        if (zzmVar.zzx == null && zzmVar.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfgn zzfgnVar = this.zzc;
        zzdxl zzdxlVar = this.zza;
        return zzffx.zzc(zzdxlVar.zza(), zzfgh.PRELOADED_LOADER, zzfgnVar).zza();
    }

    public final AI zzj(AI ai) {
        zzfca zzfcaVar = this.zzg;
        if (zzfcaVar != null) {
            zzfgn zzfgnVar = this.zzc;
            return zzffx.zzc(zzgch.zzh(zzfcaVar), zzfgh.SERVER_TRANSACTION, zzfgnVar).zza();
        }
        com.google.android.gms.ads.internal.zzv.zzc().zzj();
        zzfgd zzfgdVarZzb = this.zzc.zzb(zzfgh.SERVER_TRANSACTION, ai);
        final zzdye zzdyeVar = this.zzk;
        Objects.requireNonNull(zzdyeVar);
        return zzfgdVarZzb.zzf(new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcsa
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return zzdyeVar.zzb((zzbvk) obj);
            }
        }).zza();
    }

    public final void zzk(zzfca zzfcaVar) {
        this.zzg = zzfcaVar;
    }
}
