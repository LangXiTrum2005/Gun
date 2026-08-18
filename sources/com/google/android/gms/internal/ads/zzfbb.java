package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfbb implements zzeld {
    private final Context zza;
    private final Executor zzb;
    private final zzcgx zzc;
    private final zzfar zzd;
    private final zzezf zze;
    private final zzfcb zzf;
    private final zzfhk zzg;
    private final zzfch zzh;
    private AI zzi;

    public zzfbb(Context context, Executor executor, zzcgx zzcgxVar, zzezf zzezfVar, zzfar zzfarVar, zzfch zzfchVar, zzfcb zzfcbVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgxVar;
        this.zze = zzezfVar;
        this.zzd = zzfarVar;
        this.zzh = zzfchVar;
        this.zzf = zzfcbVar;
        this.zzg = zzcgxVar.zzz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzdoe zzk(zzezd zzezdVar) {
        zzdoe zzdoeVarZzi = this.zzc.zzi();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zzf(this.zza);
        zzcvaVar.zzk(((zzfaz) zzezdVar).zza);
        zzcvaVar.zzj(this.zzf);
        zzdoeVarZzi.zzd(zzcvaVar.zzl());
        zzdoeVarZzi.zzc(new zzdbk().zzn());
        return zzdoeVarZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zza() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    @Override // com.google.android.gms.internal.ads.zzeld
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzelb zzelbVar, zzelc zzelcVar) throws RemoteException {
        zzfhh zzfhhVar;
        zzbwd zzbwdVar = new zzbwd(zzmVar, str);
        if (zzbwdVar.zzb == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfau
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
        } else {
            AI ai = this.zzi;
            if (ai == null || ai.isDone()) {
                if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
                    zzezf zzezfVar = this.zze;
                    if (zzezfVar.zzd() != null) {
                        zzfhh zzfhhVarZzh = ((zzdof) zzezfVar.zzd()).zzh();
                        zzfhhVarZzh.zzi(5);
                        zzfhhVarZzh.zzb(zzbwdVar.zza.zzp);
                        zzfhhVarZzh.zzf(zzbwdVar.zza.zzm);
                        zzfhhVar = zzfhhVarZzh;
                    } else {
                        zzfhhVar = null;
                    }
                } else {
                    zzfhhVar = null;
                }
                zzfdg.zza(this.zza, zzbwdVar.zza.zzf);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzbwdVar.zza.zzf) {
                    this.zzc.zzl().zzo(true);
                }
                Bundle bundleZza = zzdrg.zza(new Pair(zzdre.PUBLIC_API_CALL.zza(), Long.valueOf(zzbwdVar.zza.zzz)), new Pair(zzdre.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis())));
                zzfch zzfchVar = this.zzh;
                zzfchVar.zzt(zzbwdVar.zzb);
                zzfchVar.zzs(com.google.android.gms.ads.internal.client.zzs.zzd());
                zzfchVar.zzH(zzbwdVar.zza);
                zzfchVar.zzA(bundleZza);
                Context context = this.zza;
                zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
                zzfgw zzfgwVarZzb = zzfgv.zzb(context, zzfhg.zzf(zzfcjVarZzJ), 5, zzbwdVar.zza);
                zzfaz zzfazVar = new zzfaz(null);
                zzfazVar.zza = zzfcjVarZzJ;
                AI aiZzc = this.zze.zzc(new zzezg(zzfazVar, null), new zzeze() { // from class: com.google.android.gms.internal.ads.zzfav
                    @Override // com.google.android.gms.internal.ads.zzeze
                    public final zzcuy zza(zzezd zzezdVar) {
                        return this.zza.zzk(zzezdVar);
                    }
                }, null);
                this.zzi = aiZzc;
                zzgch.zzr(aiZzc, new zzfay(this, zzelcVar, zzfhhVar, zzfgwVarZzb, zzfazVar), this.zzb);
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void zzi() {
        this.zzd.zzdz(zzfdk.zzd(6, null, null));
    }

    public final void zzj(int i) {
        this.zzh.zzp().zza(i);
    }
}
