package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelk implements zzeld {
    private final zzfch zza;
    private final zzcgx zzb;
    private final Context zzc;
    private final zzela zzd;
    private final zzfhk zze;

    @Nullable
    private zzcro zzf;

    public zzelk(zzcgx zzcgxVar, Context context, zzela zzelaVar, zzfch zzfchVar) {
        this.zzb = zzcgxVar;
        this.zzc = context;
        this.zzd = zzelaVar;
        this.zza = zzfchVar;
        this.zze = zzcgxVar.zzz();
        zzfchVar.zzv(zzelaVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        zzcro zzcroVar = this.zzf;
        return zzcroVar != null && zzcroVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelb zzelbVar, zzelc zzelcVar) throws RemoteException {
        zzfhh zzfhhVar;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zzc) && zzmVar.zzs == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
            return false;
        }
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzelg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzg();
                }
            });
            return false;
        }
        zzfdg.zza(this.zzc, zzmVar.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzmVar.zzf) {
            this.zzb.zzl().zzo(true);
        }
        int i = ((zzele) zzelbVar).zza;
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        String strZza = zzdre.PUBLIC_API_CALL.zza();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Bundle bundleZza = zzdrg.zza(new Pair(strZza, lValueOf), new Pair(zzdre.DYNAMITE_ENTER.zza(), lValueOf));
        zzfch zzfchVar = this.zza;
        zzfchVar.zzH(zzmVar);
        zzfchVar.zzA(bundleZza);
        zzfchVar.zzC(i);
        Context context = this.zzc;
        zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
        zzfgw zzfgwVarZzb = zzfgv.zzb(context, zzfhg.zzf(zzfcjVarZzJ), 8, zzmVar);
        com.google.android.gms.ads.internal.client.zzcm zzcmVar = zzfcjVarZzJ.zzn;
        if (zzcmVar != null) {
            this.zzd.zzd().zzm(zzcmVar);
        }
        zzdgp zzdgpVarZzh = this.zzb.zzh();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zzf(this.zzc);
        zzcvaVar.zzk(zzfcjVarZzJ);
        zzdgpVarZzh.zzf(zzcvaVar.zzl());
        zzdbk zzdbkVar = new zzdbk();
        zzdbkVar.zzk(this.zzd.zzd(), this.zzb.zzC());
        zzdgpVarZzh.zze(zzdbkVar.zzn());
        zzdgpVarZzh.zzd(this.zzd.zzc());
        zzdgpVarZzh.zzc(new zzcoj(null));
        zzdgq zzdgqVarZzg = zzdgpVarZzh.zzg();
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            zzfhh zzfhhVarZzf = zzdgqVarZzg.zzf();
            zzfhhVarZzf.zzi(8);
            zzfhhVarZzf.zzb(zzmVar.zzp);
            zzfhhVarZzf.zzf(zzmVar.zzm);
            zzfhhVar = zzfhhVarZzf;
        } else {
            zzfhhVar = null;
        }
        this.zzb.zzy().zzc(1);
        zzcgx zzcgxVar = this.zzb;
        zzgcs zzgcsVarZzc = zzffh.zzc();
        ScheduledExecutorService scheduledExecutorServiceZzD = zzcgxVar.zzD();
        zzcsd zzcsdVarZza = zzdgqVarZzg.zza();
        zzcro zzcroVar = new zzcro(zzgcsVarZzc, scheduledExecutorServiceZzD, zzcsdVarZza.zzh(zzcsdVarZza.zzi()));
        this.zzf = zzcroVar;
        zzcroVar.zze(new zzelj(this, zzelcVar, zzfhhVar, zzfgwVarZzb, zzdgqVarZzg));
        return true;
    }

    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzdz(zzfdk.zzd(4, null, null));
    }

    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzdz(zzfdk.zzd(6, null, null));
    }
}
