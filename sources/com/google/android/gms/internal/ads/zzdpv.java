package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpv implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzdpv(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextZza = ((zzche) this.zza).zza();
        final String strZzb = ((zzdws) this.zzb).zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzchs) this.zzc).zza();
        final zzbbq.zza.EnumC0136zza enumC0136zza = (zzbbq.zza.EnumC0136zza) this.zzd.zzb();
        final String str = (String) this.zze.zzb();
        zzbbj zzbbjVar = new zzbbj(new zzbbp(contextZza));
        zzbbq.zzar.zza zzaVarZzd = zzbbq.zzar.zzd();
        zzaVarZzd.zzg(versionInfoParcelZza.buddyApkVersion);
        zzaVarZzd.zzi(versionInfoParcelZza.clientJarVersion);
        zzaVarZzd.zzh(true != versionInfoParcelZza.isClientJar ? 2 : 0);
        final zzbbq.zzar zzarVarZzbr = zzaVarZzd.zzbr();
        zzbbjVar.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzdpu
            @Override // com.google.android.gms.internal.ads.zzbbi
            public final void zza(zzbbq.zzt.zza zzaVar) {
                zzbbq.zza.zzb zzbVarZzbM = zzaVar.zze().zzbM();
                zzbVarZzbM.zzH(enumC0136zza);
                zzaVar.zzG(zzbVarZzbM);
                zzbbq.zzm.zza zzaVarZzbM = zzaVar.zzg().zzbM();
                zzaVarZzbM.zzm(strZzb);
                zzaVarZzbM.zzw(zzarVarZzbr);
                zzaVar.zzK(zzaVarZzbM);
                zzaVar.zzO(str);
            }
        });
        return zzbbjVar;
    }
}
