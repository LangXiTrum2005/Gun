package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
final class zzcig extends zzeuu {
    private final zzevx zza;
    private final zzcih zzb;
    private final zzhfa zzc;
    private final zzhfa zzd;
    private final zzhfa zze;
    private final zzhfa zzf;
    private final zzhfa zzg;
    private final zzhfa zzh;
    private final zzhfa zzi;
    private final zzhfa zzj;
    private final zzhfa zzk;
    private final zzhfa zzl;
    private final zzhfa zzm;
    private final zzhfa zzn;
    private final zzhfa zzo;
    private final zzhfa zzp;
    private final zzhfa zzq;
    private final zzhfa zzr;
    private final zzhfa zzs;
    private final zzhfa zzt;
    private final zzhfa zzu;
    private final zzhfa zzv;
    private final zzhfa zzw;
    private final zzhfa zzx;
    private final zzhfa zzy;

    public /* synthetic */ zzcig(zzcih zzcihVar, zzevx zzevxVar, zzcjm zzcjmVar) {
        this.zzb = zzcihVar;
        this.zza = zzevxVar;
        this.zzc = zzheq.zzc(new zzfhi(zzcihVar.zzz));
        zzevz zzevzVar = new zzevz(zzevxVar);
        this.zzd = zzevzVar;
        zzewa zzewaVar = new zzewa(zzevxVar);
        this.zze = zzewaVar;
        zzewc zzewcVar = new zzewc(zzevxVar);
        this.zzf = zzewcVar;
        this.zzg = new zzeut(zzcks.zza, zzcihVar.zzh, zzcihVar.zze, zzffh.zza(), zzevzVar, zzewaVar, zzewcVar);
        this.zzh = new zzevh(zzckm.zza, zzffh.zza(), zzcihVar.zzh);
        zzevy zzevyVar = new zzevy(zzevxVar);
        this.zzi = zzevyVar;
        this.zzj = new zzevp(zzcko.zza, zzffh.zza(), zzevyVar);
        this.zzk = new zzevw(zzckq.zza, zzcihVar.zze, zzcihVar.zzh);
        this.zzl = new zzewn(zzffh.zza());
        zzewb zzewbVar = new zzewb(zzevxVar);
        this.zzm = zzewbVar;
        this.zzn = new zzewj(zzcihVar.zzal, zzewbVar, zzewcVar, zzcku.zza, zzffh.zza(), zzevyVar, zzcihVar.zze);
        this.zzo = new zzevd(zzevyVar, zzckk.zza, zzcihVar.zzal, zzcihVar.zze, zzffh.zza());
        zzewd zzewdVar = new zzewd(zzevxVar);
        this.zzp = zzewdVar;
        zzhfa zzhfaVarZzc = zzheq.zzc(zzdqq.zza());
        this.zzq = zzhfaVarZzc;
        zzhfa zzhfaVarZzc2 = zzheq.zzc(zzdqo.zza());
        this.zzr = zzhfaVarZzc2;
        zzhfa zzhfaVarZzc3 = zzheq.zzc(zzdqs.zza());
        this.zzs = zzhfaVarZzc3;
        zzhfa zzhfaVarZzc4 = zzheq.zzc(zzdqu.zza());
        this.zzt = zzhfaVarZzc4;
        zzheu zzheuVarZzc = zzhev.zzc(4);
        zzheuVarZzc.zzb(zzfgh.GMS_SIGNALS, zzhfaVarZzc);
        zzheuVarZzc.zzb(zzfgh.BUILD_URL, zzhfaVarZzc2);
        zzheuVarZzc.zzb(zzfgh.HTTP, zzhfaVarZzc3);
        zzheuVarZzc.zzb(zzfgh.PRE_PROCESS, zzhfaVarZzc4);
        zzhev zzhevVarZzc = zzheuVarZzc.zzc();
        this.zzu = zzhevVarZzc;
        zzhfa zzhfaVarZzc5 = zzheq.zzc(new zzdqv(zzewdVar, zzcihVar.zzh, zzffh.zza(), zzhevVarZzc));
        this.zzv = zzhfaVarZzc5;
        zzhfe zzhfeVarZza = zzhff.zza(0, 1);
        zzhfeVarZza.zza(zzhfaVarZzc5);
        zzhff zzhffVarZzc = zzhfeVarZza.zzc();
        this.zzw = zzhffVarZzc;
        zzfgq zzfgqVar = new zzfgq(zzhffVarZzc);
        this.zzx = zzfgqVar;
        this.zzy = zzheq.zzc(new zzfgp(zzffh.zza(), zzcihVar.zze, zzfgqVar));
    }

    private final zzeux zze() {
        zzevx zzevxVar = this.zza;
        zzbzd zzbzdVarZza = zzckt.zza();
        zzgcs zzgcsVarZzc = zzffh.zzc();
        String strZzd = zzevxVar.zzd();
        zzevx zzevxVar2 = this.zza;
        return new zzeux(zzbzdVarZza, zzgcsVarZzc, strZzd, zzevxVar2.zzb(), zzevxVar2.zza());
    }

    private final zzevr zzf() {
        zzevx zzevxVar = this.zza;
        zzbbu zzbbuVarZza = zzcki.zza();
        zzgcs zzgcsVarZzc = zzffh.zzc();
        List listZzf = zzevxVar.zzf();
        zzhez.zzb(listZzf);
        return new zzevr(zzbbuVarZza, zzgcsVarZzc, listZzf);
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final zzetu zza() {
        Context contextZzc = zzche.zzc(this.zzb.zza);
        zzcih zzcihVar = this.zzb;
        zzbza zzbzaVarZza = zzckp.zza();
        zzbzb zzbzbVarZza = zzckv.zza();
        Object objZzb = zzcihVar.zzbo.zzb();
        zzhfa zzhfaVar = this.zzc;
        zzhfa zzhfaVar2 = this.zzo;
        zzhfa zzhfaVar3 = this.zzn;
        zzhfa zzhfaVar4 = this.zzl;
        zzhfa zzhfaVar5 = this.zzk;
        zzhfa zzhfaVar6 = this.zzj;
        zzhfa zzhfaVar7 = this.zzh;
        return zzewe.zza(contextZzc, zzbzaVarZza, zzbzbVarZza, objZzb, zze(), zzf(), zzheq.zza(this.zzg), zzheq.zza(zzhfaVar7), zzheq.zza(zzhfaVar6), zzheq.zza(zzhfaVar5), zzheq.zza(zzhfaVar4), zzheq.zza(zzhfaVar3), zzheq.zza(zzhfaVar2), zzffh.zzc(), (zzfhh) zzhfaVar.zzb(), (zzdrw) this.zzb.zzM.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final zzetu zzb() {
        Context contextZzc = zzche.zzc(this.zzb.zza);
        zzevx zzevxVar = this.zza;
        zzgcs zzgcsVarZzc = zzffh.zzc();
        zzesd zzesdVar = new zzesd(new zzevn(zzckp.zza(), zzffh.zzc(), zzevy.zzc(zzevxVar)), 0L, (ScheduledExecutorService) this.zzb.zze.zzb());
        zzesd zzesdVar2 = new zzesd(new zzevu(zzckr.zza(), (ScheduledExecutorService) this.zzb.zze.zzb(), zzche.zzc(this.zzb.zza)), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzek)).longValue(), (ScheduledExecutorService) this.zzb.zze.zzb());
        zzcih zzcihVar = this.zzb;
        zzbzd zzbzdVarZza = zzckt.zza();
        Context contextZzc2 = zzche.zzc(zzcihVar.zza);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zze.zzb();
        zzevx zzevxVar2 = this.zza;
        return new zzetu(contextZzc, zzgcsVarZzc, zzfxs.zzs(zzesdVar, zzesdVar2, new zzesd(zzeut.zza(zzbzdVarZza, contextZzc2, scheduledExecutorService, zzffh.zzc(), zzevxVar2.zza(), zzewa.zzc(zzevxVar2), zzewc.zzc(zzevxVar2)), 0L, (ScheduledExecutorService) this.zzb.zze.zzb()), new zzesd(new zzewl(zzffh.zzc()), 0L, (ScheduledExecutorService) this.zzb.zze.zzb()), new zzevf(zzckn.zza(), zzffh.zzc(), zzche.zzc(this.zzb.zza)), zzf(), zze(), (zzetr) this.zzb.zzbo.zzb(), zzevd.zza(zzevy.zzc(this.zza), zzckl.zza(), (zzbzm) this.zzb.zzal.zzb(), (ScheduledExecutorService) this.zzb.zze.zzb(), zzffh.zzc())), (zzfhh) this.zzc.zzb(), (zzdrw) this.zzb.zzM.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final zzfgn zzc() {
        return (zzfgn) this.zzy.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeuu
    public final zzfhh zzd() {
        return (zzfhh) this.zzc.zzb();
    }
}
