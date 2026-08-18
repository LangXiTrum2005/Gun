package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyl implements zzezf {
    private final zzezf zza;
    private final zzezf zzb;
    private final zzfes zzc;
    private final String zzd;
    private zzcuz zze;
    private final Executor zzf;

    public zzeyl(zzezf zzezfVar, zzezf zzezfVar2, zzfes zzfesVar, String str, Executor executor) {
        this.zza = zzezfVar;
        this.zzb = zzezfVar2;
        this.zzc = zzfesVar;
        this.zzd = str;
        this.zzf = executor;
    }

    private final AI zzg(zzfef zzfefVar, zzezg zzezgVar) {
        zzcuz zzcuzVar = zzfefVar.zza;
        this.zze = zzcuzVar;
        if (zzfefVar.zzc != null) {
            if (zzcuzVar.zzf() != null) {
                zzfefVar.zzc.zzp().zzl(zzfefVar.zza.zzf());
            }
            return zzgch.zzh(zzfefVar.zzc);
        }
        zzcuzVar.zzb().zzk(zzfefVar.zzb);
        return ((zzeyv) this.zza).zzb(zzezgVar, null, zzfefVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcuz zzd() {
        return this.zze;
    }

    public final /* synthetic */ AI zzb(zzezg zzezgVar, zzeyk zzeykVar, zzeze zzezeVar, zzcuz zzcuzVar, zzeyq zzeyqVar) throws Exception {
        if (zzeyqVar != null) {
            zzeyk zzeykVar2 = new zzeyk(zzeykVar.zza, zzeykVar.zzb, zzeykVar.zzc, zzeykVar.zzd, zzeykVar.zze, zzeykVar.zzf, zzeyqVar.zza);
            if (zzeyqVar.zzc != null) {
                this.zze = null;
                this.zzc.zze(zzeykVar2);
                return zzg(zzeyqVar.zzc, zzezgVar);
            }
            AI aiZza = this.zzc.zza(zzeykVar2);
            if (aiZza != null) {
                this.zze = null;
                return zzgch.zzn(aiZza, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzeyh
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final AI zza(Object obj) {
                        return this.zza.zze((zzfep) obj);
                    }
                }, this.zzf);
            }
            this.zzc.zze(zzeykVar2);
            zzezgVar = new zzezg(zzezgVar.zzb, zzeyqVar.zzb);
        }
        AI aiZzb = ((zzeyv) this.zza).zzb(zzezgVar, zzezeVar, zzcuzVar);
        this.zze = zzcuzVar;
        return aiZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ AI zzc(zzezg zzezgVar, zzeze zzezeVar, Object obj) {
        return zzf(zzezgVar, zzezeVar, null);
    }

    public final /* synthetic */ AI zze(zzfep zzfepVar) throws Exception {
        zzfer zzferVar;
        if (zzfepVar == null || zzfepVar.zza == null || (zzferVar = zzfepVar.zzb) == null) {
            throw new zzdvy(1, "Empty prefetch");
        }
        zzbbq.zzb.zzc zzcVarZzd = zzbbq.zzb.zzd();
        zzbbq.zzb.zza.C0139zza c0139zzaZza = zzbbq.zzb.zza.zza();
        c0139zzaZza.zzf(zzbbq.zzb.zzd.IN_MEMORY);
        c0139zzaZza.zzh(zzbbq.zzb.zze.zzi());
        zzcVarZzd.zzd(c0139zzaZza);
        zzfepVar.zza.zza.zzb().zzc().zzm(zzcVarZzd.zzbr());
        return zzg(zzfepVar.zza, ((zzeyk) zzferVar).zzb);
    }

    public final synchronized AI zzf(final zzezg zzezgVar, final zzeze zzezeVar, zzcuz zzcuzVar) {
        zzcuy zzcuyVarZza = zzezeVar.zza(zzezgVar.zzb);
        zzcuyVarZza.zza(new zzeym(this.zzd));
        final zzcuz zzcuzVar2 = (zzcuz) zzcuyVarZza.zzh();
        zzcuzVar2.zzg();
        zzcuzVar2.zzg();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzcuzVar2.zzg().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            zzfcj zzfcjVarZzg = zzcuzVar2.zzg();
            final zzeyk zzeykVar = new zzeyk(zzezeVar, zzezgVar, zzfcjVarZzg.zzd, zzfcjVarZzg.zzf, this.zzf, zzfcjVarZzg.zzj, null);
            return (zzgby) zzgch.zzn(zzgby.zzu(((zzeyr) this.zzb).zzb(zzezgVar, zzezeVar, zzcuzVar2)), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzeyi
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final AI zza(Object obj) {
                    return this.zza.zzb(zzezgVar, zzeykVar, zzezeVar, zzcuzVar2, (zzeyq) obj);
                }
            }, this.zzf);
        }
        this.zze = zzcuzVar2;
        return ((zzeyv) this.zza).zzb(zzezgVar, zzezeVar, zzcuzVar2);
    }
}
