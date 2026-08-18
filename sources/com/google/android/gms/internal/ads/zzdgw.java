package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdgw implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;

    public zzdgw(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar5;
        this.zzf = zzhfjVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgx zzcgxVar = (zzcgx) this.zza.zzb();
        zzcva zzcvaVarZza = ((zzcvl) this.zzb).zza();
        zzdbm zzdbmVarZza = ((zzdcg) this.zzc).zza();
        zzdgl zzdglVarZza = ((zzdgn) this.zzd).zza();
        zzcyl zzcylVarZzb = ((zzcol) this.zze).zzb();
        zzegq zzegqVar = (zzegq) this.zzf.zzb();
        zzcpp zzcppVarZze = zzcgxVar.zze();
        zzcppVarZze.zzi(zzcvaVarZza.zzl());
        zzcppVarZze.zzf(zzdbmVarZza);
        zzcppVarZze.zzd(zzdglVarZza);
        zzcppVarZze.zze(new zzeiw(null));
        zzcppVarZze.zzg(new zzcqr(zzcylVarZzb, null));
        zzcppVarZze.zzc(new zzcoj(null));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdK)).booleanValue()) {
            zzcppVarZze.zzj(zzegz.zzb(zzegqVar));
        }
        zzcrc zzcrcVarZzc = zzcppVarZze.zzh().zzc();
        zzhez.zzb(zzcrcVarZzc);
        return zzcrcVarZzc;
    }
}
