package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzezr implements zzeld {
    private final Context zza;
    private final Executor zzb;
    private final zzcgx zzc;
    private final zzekn zzd;
    private final zzfar zze;

    @Nullable
    private zzbdg zzf;
    private final zzfhk zzg;
    private final zzfch zzh;
    private AI zzi;

    public zzezr(Context context, Executor executor, zzcgx zzcgxVar, zzekn zzeknVar, zzfar zzfarVar, zzfch zzfchVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgxVar;
        this.zzd = zzeknVar;
        this.zzh = zzfchVar;
        this.zze = zzfarVar;
        this.zzg = zzcgxVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        AI ai = this.zzi;
        return (ai == null || ai.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelb zzelbVar, zzelc zzelcVar) {
        zzdfu zzdfuVarZzf;
        zzfhh zzfhhVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzmVar.zzf) {
            this.zzc.zzl().zzo(true);
        }
        com.google.android.gms.ads.internal.client.zzs zzsVar = ((zzezk) zzelbVar).zza;
        Bundle bundleZza = zzdrg.zza(new Pair(zzdre.PUBLIC_API_CALL.zza(), Long.valueOf(zzmVar.zzz)), new Pair(zzdre.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
        zzfch zzfchVar = this.zzh;
        zzfchVar.zzt(str);
        zzfchVar.zzs(zzsVar);
        zzfchVar.zzH(zzmVar);
        zzfchVar.zzA(bundleZza);
        Context context = this.zza;
        zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
        zzfgw zzfgwVarZzb = zzfgv.zzb(context, zzfhg.zzf(zzfcjVarZzJ), 4, zzmVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzib)).booleanValue()) {
            zzdft zzdftVarZzg = this.zzc.zzg();
            zzcva zzcvaVar = new zzcva();
            zzcvaVar.zzf(this.zza);
            zzcvaVar.zzk(zzfcjVarZzJ);
            zzdftVarZzg.zze(zzcvaVar.zzl());
            zzdbk zzdbkVar = new zzdbk();
            zzdbkVar.zzj(this.zzd, this.zzb);
            zzdbkVar.zzk(this.zzd, this.zzb);
            zzdftVarZzg.zzd(zzdbkVar.zzn());
            zzdftVarZzg.zzc(new zzeiw(this.zzf));
            zzdfuVarZzf = zzdftVarZzg.zzh();
        } else {
            zzdbk zzdbkVar2 = new zzdbk();
            zzfar zzfarVar = this.zze;
            if (zzfarVar != null) {
                zzdbkVar2.zze(zzfarVar, this.zzb);
                zzdbkVar2.zzf(this.zze, this.zzb);
                zzdbkVar2.zzb(this.zze, this.zzb);
            }
            zzdft zzdftVarZzg2 = this.zzc.zzg();
            zzcva zzcvaVar2 = new zzcva();
            zzcvaVar2.zzf(this.zza);
            zzcvaVar2.zzk(zzfcjVarZzJ);
            zzdftVarZzg2.zze(zzcvaVar2.zzl());
            zzdbkVar2.zzj(this.zzd, this.zzb);
            zzdbkVar2.zze(this.zzd, this.zzb);
            zzdbkVar2.zzf(this.zzd, this.zzb);
            zzdbkVar2.zzb(this.zzd, this.zzb);
            zzdbkVar2.zza(this.zzd, this.zzb);
            zzdbkVar2.zzl(this.zzd, this.zzb);
            zzdbkVar2.zzk(this.zzd, this.zzb);
            zzdbkVar2.zzi(this.zzd, this.zzb);
            zzdbkVar2.zzc(this.zzd, this.zzb);
            zzdftVarZzg2.zzd(zzdbkVar2.zzn());
            zzdftVarZzg2.zzc(new zzeiw(this.zzf));
            zzdfuVarZzf = zzdftVarZzg2.zzh();
        }
        zzdfu zzdfuVar = zzdfuVarZzf;
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            zzfhh zzfhhVarZzf = zzdfuVar.zzf();
            zzfhhVarZzf.zzi(4);
            zzfhhVarZzf.zzb(zzmVar.zzp);
            zzfhhVarZzf.zzf(zzmVar.zzm);
            zzfhhVar = zzfhhVarZzf;
        } else {
            zzfhhVar = null;
        }
        zzcsd zzcsdVarZza = zzdfuVar.zza();
        AI aiZzh = zzcsdVarZza.zzh(zzcsdVarZza.zzi());
        this.zzi = aiZzh;
        zzgch.zzr(aiZzh, new zzezq(this, zzelcVar, zzfhhVar, zzfgwVarZzb, zzdfuVar), this.zzb);
        return true;
    }

    public final /* synthetic */ void zzh() {
        this.zzd.zzdz(zzfdk.zzd(6, null, null));
    }

    public final void zzi(zzbdg zzbdgVar) {
        this.zzf = zzbdgVar;
    }
}
