package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzcgx implements zzckx {

    @Nullable
    private static zzcgx zza;

    private static synchronized zzcgx zzG(Context context, @Nullable zzbpe zzbpeVar, int i, boolean z, int i2, zzcid zzcidVar) {
        try {
            zzcgx zzcgxVar = zza;
            if (zzcgxVar != null) {
                return zzcgxVar;
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            zzbcl.zza(context);
            if (((Boolean) zzbed.zze.zze()).booleanValue()) {
                zzbbv.zzd(context);
            }
            zzfdf zzfdfVarZzd = zzfdf.zzd(context);
            VersionInfoParcel versionInfoParcelZzc = zzfdfVarZzd.zzc(244410000, false, i2);
            zzfdfVarZzd.zzf(zzbpeVar);
            zzcis zzcisVar = new zzcis(null);
            zzcgy zzcgyVar = new zzcgy();
            zzcgyVar.zzf(versionInfoParcelZzc);
            zzcgyVar.zze(context);
            zzcgyVar.zzd(jCurrentTimeMillis);
            zzcisVar.zzb(new zzcha(zzcgyVar, null));
            zzcisVar.zzc(new zzcjn(zzcidVar));
            zzcgx zzcgxVarZza = zzcisVar.zza();
            com.google.android.gms.ads.internal.zzv.zzp().zzu(context, versionInfoParcelZzc);
            com.google.android.gms.ads.internal.zzv.zzc().zzi(context);
            com.google.android.gms.ads.internal.zzv.zzq().zzm(context);
            com.google.android.gms.ads.internal.zzv.zzq().zzl(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzv.zzb().zzd(context);
            com.google.android.gms.ads.internal.zzv.zzw().zzb(context);
            zzcgxVarZza.zza().zzc();
            zzbyj.zzd(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaI)).booleanValue()) {
                    new zzeax(context, versionInfoParcelZzc, new zzbbj(new zzbbp(context)), new zzeac(new zzdzy(context), zzcgxVarZza.zzB())).zzb(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                }
            }
            zza = zzcgxVarZza;
            return zzcgxVarZza;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzcgx zzb(Context context, @Nullable zzbpe zzbpeVar, int i) {
        return zzG(context, zzbpeVar, 244410000, false, i, new zzcid());
    }

    public abstract zzfjj zzA();

    public abstract zzgcs zzB();

    public abstract Executor zzC();

    public abstract ScheduledExecutorService zzD();

    public abstract zzbzb zzE();

    @Override // com.google.android.gms.internal.ads.zzckx
    public final zzbzb zzF() {
        return zzE();
    }

    public abstract com.google.android.gms.ads.internal.util.zzcb zza();

    public abstract zzcjy zzc();

    public abstract zzcnz zzd();

    public abstract zzcpp zze();

    public abstract zzcyl zzf();

    public abstract zzdft zzg();

    public abstract zzdgp zzh();

    public abstract zzdoe zzi();

    public abstract zzdrw zzj();

    public abstract zzdtg zzk();

    public abstract zzduv zzl();

    public abstract zzdvs zzm();

    public abstract zzebv zzn();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzo();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzp();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzq();

    @Override // com.google.android.gms.internal.ads.zzckx
    public final zzeuu zzr(zzbvk zzbvkVar, int i) {
        return zzs(new zzevx(zzbvkVar, i));
    }

    public abstract zzeuu zzs(zzevx zzevxVar);

    public abstract zzewo zzt();

    public abstract zzeyc zzu();

    public abstract zzezt zzv();

    public abstract zzfbh zzw();

    public abstract zzfcy zzx();

    public abstract zzfdi zzy();

    public abstract zzfhk zzz();
}
