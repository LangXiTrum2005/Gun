package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class zzgq implements Callable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgv zzc;

    public zzgq(zzgv zzgvVar, zzau zzauVar, String str) {
        this.zzc = zzgvVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlm zzlmVar;
        String str;
        zzaq zzaqVarZzc;
        long j;
        byte[] bArr;
        zzlh zzlhVar;
        this.zzc.zza.zzA();
        zzip zzipVarZzr = this.zzc.zza.zzr();
        zzau zzauVar = this.zza;
        String str2 = this.zzb;
        zzipVarZzr.zzg();
        zzgd.zzO();
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str2);
        if (!zzipVarZzr.zzt.zzf().zzs(str2, zzeg.zzU)) {
            zzipVarZzr.zzt.zzaA().zzc().zzb("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        }
        if (!"_iap".equals(zzauVar.zza) && !"_iapx".equals(zzauVar.zza)) {
            zzipVarZzr.zzt.zzaA().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str2, zzauVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.zzga zzgaVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
        zzipVarZzr.zzf.zzh().zzw();
        try {
            zzh zzhVarZzj = zzipVarZzr.zzf.zzh().zzj(str2);
            if (zzhVarZzj == null) {
                zzipVarZzr.zzt.zzaA().zzc().zzb("Log and bundle not available. package_name", str2);
                bArr = new byte[0];
                zzlhVar = zzipVarZzr.zzf;
            } else {
                if (zzhVarZzj.zzan()) {
                    com.google.android.gms.internal.measurement.zzgc zzgcVarZzu = com.google.android.gms.internal.measurement.zzgd.zzu();
                    zzgcVarZzu.zzad(1);
                    zzgcVarZzu.zzZ("android");
                    if (!TextUtils.isEmpty(zzhVarZzj.zzv())) {
                        zzgcVarZzu.zzD(zzhVarZzj.zzv());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzj.zzx())) {
                        zzgcVarZzu.zzF((String) Preconditions.checkNotNull(zzhVarZzj.zzx()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzj.zzy())) {
                        zzgcVarZzu.zzG((String) Preconditions.checkNotNull(zzhVarZzj.zzy()));
                    }
                    if (zzhVarZzj.zzb() != -2147483648L) {
                        zzgcVarZzu.zzH((int) zzhVarZzj.zzb());
                    }
                    zzgcVarZzu.zzV(zzhVarZzj.zzm());
                    zzgcVarZzu.zzP(zzhVarZzj.zzk());
                    String strZzA = zzhVarZzj.zzA();
                    String strZzt = zzhVarZzj.zzt();
                    if (!TextUtils.isEmpty(strZzA)) {
                        zzgcVarZzu.zzU(strZzA);
                    } else if (!TextUtils.isEmpty(strZzt)) {
                        zzgcVarZzu.zzC(strZzt);
                    }
                    zzpz.zzc();
                    if (zzipVarZzr.zzt.zzf().zzs(null, zzeg.zzaE)) {
                        zzgcVarZzu.zzaj(zzhVarZzj.zzr());
                    }
                    zzhb zzhbVarZzq = zzipVarZzr.zzf.zzq(str2);
                    zzgcVarZzu.zzM(zzhVarZzj.zzj());
                    if (zzipVarZzr.zzt.zzJ() && zzipVarZzr.zzt.zzf().zzt(zzgcVarZzu.zzaq()) && zzhbVarZzq.zzj(zzha.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzgcVarZzu.zzO(null);
                    }
                    zzgcVarZzu.zzL(zzhbVarZzq.zzi());
                    if (zzhbVarZzq.zzj(zzha.AD_STORAGE) && zzhVarZzj.zzam()) {
                        Pair pairZzd = zzipVarZzr.zzf.zzs().zzd(zzhVarZzj.zzv(), zzhbVarZzq);
                        if (zzhVarZzj.zzam() && !TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                            try {
                                zzgcVarZzu.zzae(zzip.zza((String) pairZzd.first, Long.toString(zzauVar.zzd)));
                                Object obj = pairZzd.second;
                                if (obj != null) {
                                    zzgcVarZzu.zzX(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e) {
                                zzipVarZzr.zzt.zzaA().zzc().zzb("Resettable device id encryption failed", e.getMessage());
                                bArr = new byte[0];
                                zzlhVar = zzipVarZzr.zzf;
                            }
                        }
                    }
                    zzipVarZzr.zzt.zzg().zzv();
                    zzgcVarZzu.zzN(Build.MODEL);
                    zzipVarZzr.zzt.zzg().zzv();
                    zzgcVarZzu.zzY(Build.VERSION.RELEASE);
                    zzgcVarZzu.zzak((int) zzipVarZzr.zzt.zzg().zzb());
                    zzgcVarZzu.zzao(zzipVarZzr.zzt.zzg().zzc());
                    try {
                        if (zzhbVarZzq.zzj(zzha.ANALYTICS_STORAGE) && zzhVarZzj.zzw() != null) {
                            zzgcVarZzu.zzE(zzip.zza((String) Preconditions.checkNotNull(zzhVarZzj.zzw()), Long.toString(zzauVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzhVarZzj.zzz())) {
                            zzgcVarZzu.zzT((String) Preconditions.checkNotNull(zzhVarZzj.zzz()));
                        }
                        String strZzv = zzhVarZzj.zzv();
                        List listZzu = zzipVarZzr.zzf.zzh().zzu(strZzv);
                        Iterator it = listZzu.iterator();
                        do {
                            if (!it.hasNext()) {
                                zzlmVar = null;
                                break;
                            }
                            zzlmVar = (zzlm) it.next();
                        } while (!"_lte".equals(zzlmVar.zzc));
                        if (zzlmVar == null || zzlmVar.zze == null) {
                            zzlm zzlmVar2 = new zzlm(strZzv, "auto", "_lte", zzipVarZzr.zzt.zzax().currentTimeMillis(), 0L);
                            listZzu.add(zzlmVar2);
                            zzipVarZzr.zzf.zzh().zzL(zzlmVar2);
                        }
                        zzlj zzljVarZzu = zzipVarZzr.zzf.zzu();
                        zzljVarZzu.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzljVarZzu.zzt.zzg().zze()) {
                            String strZzv2 = zzhVarZzj.zzv();
                            Preconditions.checkNotNull(strZzv2);
                            if (zzhVarZzj.zzam() && zzljVarZzu.zzf.zzm().zzn(strZzv2)) {
                                zzljVarZzu.zzt.zzaA().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it2 = listZzu.iterator();
                                while (it2.hasNext()) {
                                    if ("_npa".equals(((zzlm) it2.next()).zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                listZzu.add(new zzlm(strZzv2, "auto", "_npa", zzljVarZzu.zzt.zzax().currentTimeMillis(), 1L));
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgm[] zzgmVarArr = new com.google.android.gms.internal.measurement.zzgm[listZzu.size()];
                        for (int i = 0; i < listZzu.size(); i++) {
                            com.google.android.gms.internal.measurement.zzgl zzglVarZzd = com.google.android.gms.internal.measurement.zzgm.zzd();
                            zzglVarZzd.zzf(((zzlm) listZzu.get(i)).zzc);
                            zzglVarZzd.zzg(((zzlm) listZzu.get(i)).zzd);
                            zzipVarZzr.zzf.zzu().zzv(zzglVarZzd, ((zzlm) listZzu.get(i)).zze);
                            zzgmVarArr[i] = (com.google.android.gms.internal.measurement.zzgm) zzglVarZzd.zzaD();
                        }
                        zzgcVarZzu.zzj(Arrays.asList(zzgmVarArr));
                        zzeu zzeuVarZzb = zzeu.zzb(zzauVar);
                        zzipVarZzr.zzt.zzv().zzL(zzeuVarZzb.zzd, zzipVarZzr.zzf.zzh().zzi(str2));
                        zzipVarZzr.zzt.zzv().zzN(zzeuVarZzb, zzipVarZzr.zzt.zzf().zzd(str2));
                        Bundle bundle = zzeuVarZzb.zzd;
                        bundle.putLong("_c", 1L);
                        zzipVarZzr.zzt.zzaA().zzc().zza("Marking in-app purchase as real-time");
                        bundle.putLong("_r", 1L);
                        bundle.putString("_o", zzauVar.zzc);
                        if (zzipVarZzr.zzt.zzv().zzaf(zzgcVarZzu.zzaq())) {
                            zzipVarZzr.zzt.zzv().zzP(bundle, "_dbg", 1L);
                            zzipVarZzr.zzt.zzv().zzP(bundle, "_r", 1L);
                        }
                        zzaq zzaqVarZzn = zzipVarZzr.zzf.zzh().zzn(str2, zzauVar.zza);
                        if (zzaqVarZzn == null) {
                            str = null;
                            zzaqVarZzc = new zzaq(str2, zzauVar.zza, 0L, 0L, 0L, zzauVar.zzd, 0L, null, null, null, null);
                            j = 0;
                        } else {
                            str = null;
                            long j2 = zzaqVarZzn.zzf;
                            zzaqVarZzc = zzaqVarZzn.zzc(zzauVar.zzd);
                            j = j2;
                        }
                        zzipVarZzr.zzf.zzh().zzE(zzaqVarZzc);
                        zzap zzapVar = new zzap(zzipVarZzr.zzt, zzauVar.zzc, str2, zzauVar.zza, zzauVar.zzd, j, bundle);
                        com.google.android.gms.internal.measurement.zzfs zzfsVarZze = com.google.android.gms.internal.measurement.zzft.zze();
                        zzfsVarZze.zzm(zzapVar.zzd);
                        zzfsVarZze.zzi(zzapVar.zzb);
                        zzfsVarZze.zzl(zzapVar.zze);
                        zzar zzarVar = new zzar(zzapVar.zzf);
                        while (zzarVar.hasNext()) {
                            String next = zzarVar.next();
                            com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
                            zzfwVarZze.zzj(next);
                            Object objZzf = zzapVar.zzf.zzf(next);
                            if (objZzf != null) {
                                zzipVarZzr.zzf.zzu().zzu(zzfwVarZze, objZzf);
                                zzfsVarZze.zze(zzfwVarZze);
                            }
                        }
                        zzgcVarZzu.zzk(zzfsVarZze);
                        com.google.android.gms.internal.measurement.zzge zzgeVarZza = com.google.android.gms.internal.measurement.zzgg.zza();
                        com.google.android.gms.internal.measurement.zzfu zzfuVarZza = com.google.android.gms.internal.measurement.zzfv.zza();
                        zzfuVarZza.zza(zzaqVarZzc.zzc);
                        zzfuVarZza.zzb(zzauVar.zza);
                        zzgeVarZza.zza(zzfuVarZza);
                        zzgcVarZzu.zzaa(zzgeVarZza);
                        zzgcVarZzu.zzf(zzipVarZzr.zzf.zzf().zza(zzhVarZzj.zzv(), Collections.emptyList(), zzgcVarZzu.zzau(), Long.valueOf(zzfsVarZze.zzc()), Long.valueOf(zzfsVarZze.zzc())));
                        if (zzfsVarZze.zzq()) {
                            zzgcVarZzu.zzai(zzfsVarZze.zzc());
                            zzgcVarZzu.zzQ(zzfsVarZze.zzc());
                        }
                        long jZzn = zzhVarZzj.zzn();
                        if (jZzn != 0) {
                            zzgcVarZzu.zzab(jZzn);
                        }
                        long jZzp = zzhVarZzj.zzp();
                        if (jZzp != 0) {
                            zzgcVarZzu.zzac(jZzp);
                        } else if (jZzn != 0) {
                            zzgcVarZzu.zzac(jZzn);
                        }
                        String strZzD = zzhVarZzj.zzD();
                        zzqu.zzc();
                        if (zzipVarZzr.zzt.zzf().zzs(str2, zzeg.zzao) && strZzD != null) {
                            zzgcVarZzu.zzah(strZzD);
                        }
                        zzhVarZzj.zzG();
                        zzgcVarZzu.zzI((int) zzhVarZzj.zzo());
                        zzipVarZzr.zzt.zzf().zzh();
                        zzgcVarZzu.zzam(79000L);
                        zzgcVarZzu.zzal(zzipVarZzr.zzt.zzax().currentTimeMillis());
                        zzgcVarZzu.zzag(true);
                        if (zzipVarZzr.zzt.zzf().zzs(str, zzeg.zzas)) {
                            zzipVarZzr.zzf.zzC(zzgcVarZzu.zzaq(), zzgcVarZzu);
                        }
                        zzgaVarZza.zza(zzgcVarZzu);
                        zzhVarZzj.zzad(zzgcVarZzu.zzd());
                        zzhVarZzj.zzab(zzgcVarZzu.zzc());
                        zzipVarZzr.zzf.zzh().zzD(zzhVarZzj);
                        zzipVarZzr.zzf.zzh().zzC();
                        zzipVarZzr.zzf.zzh().zzx();
                        try {
                            return zzipVarZzr.zzf.zzu().zzz(((com.google.android.gms.internal.measurement.zzgb) zzgaVarZza.zzaD()).zzbx());
                        } catch (IOException e2) {
                            zzipVarZzr.zzt.zzaA().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzet.zzn(str2), e2);
                            return str;
                        }
                    } catch (SecurityException e3) {
                        zzipVarZzr.zzt.zzaA().zzc().zzb("app instance id encryption failed", e3.getMessage());
                        byte[] bArr2 = new byte[0];
                        zzipVarZzr.zzf.zzh().zzx();
                        return bArr2;
                    }
                }
                zzipVarZzr.zzt.zzaA().zzc().zzb("Log and bundle disabled. package_name", str2);
                bArr = new byte[0];
                zzlhVar = zzipVarZzr.zzf;
            }
            zzlhVar.zzh().zzx();
            return bArr;
        } catch (Throwable th) {
            zzipVarZzr.zzf.zzh().zzx();
            throw th;
        }
    }
}
