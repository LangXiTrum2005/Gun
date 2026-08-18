package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnl {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdrw zzd;
    private final Executor zze;
    private final zzava zzf;
    private final VersionInfoParcel zzg;
    private final zzebk zzi;
    private final zzfja zzj;
    private final zzebv zzk;
    private final zzfcn zzl;
    private AI zzm;
    private final zzdmy zza = new zzdmy();
    private final zzbkf zzh = new zzbkf();

    public zzdnl(zzdni zzdniVar) {
        this.zzc = zzdniVar.zzb;
        this.zze = zzdniVar.zze;
        this.zzf = zzdniVar.zzf;
        this.zzg = zzdniVar.zzg;
        this.zzb = zzdniVar.zza;
        this.zzi = zzdniVar.zzd;
        this.zzj = zzdniVar.zzh;
        this.zzd = zzdniVar.zzc;
        this.zzk = zzdniVar.zzi;
        this.zzl = zzdniVar.zzj;
    }

    public final /* synthetic */ zzcex zza(zzcex zzcexVar) {
        zzcexVar.zzag("/result", this.zzh);
        zzcgp zzcgpVarZzN = zzcexVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzebk zzebkVar = this.zzi;
        zzfja zzfjaVar = this.zzj;
        zzdrw zzdrwVar = this.zzd;
        zzdmy zzdmyVar = this.zza;
        zzcgpVarZzN.zzV(null, zzdmyVar, zzdmyVar, zzdmyVar, zzdmyVar, false, null, zzbVar, null, null, zzebkVar, zzfjaVar, zzdrwVar, null, null, null, null, null, null);
        return zzcexVar;
    }

    public final /* synthetic */ AI zzf(String str, JSONObject jSONObject, zzcex zzcexVar) throws Exception {
        return this.zzh.zzb(zzcexVar, str, jSONObject);
    }

    public final synchronized AI zzg(final String str, final JSONObject jSONObject) {
        AI ai = this.zzm;
        if (ai == null) {
            return zzgch.zzh(null);
        }
        return zzgch.zzn(ai, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdmz
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzf(str, jSONObject, (zzcex) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzh(zzfbo zzfboVar, zzfbr zzfbrVar, zzcmk zzcmkVar) {
        AI ai = this.zzm;
        if (ai == null) {
            return;
        }
        zzgch.zzr(ai, new zzdnf(this, zzfboVar, zzfbrVar, zzcmkVar), this.zze);
    }

    public final synchronized void zzi() {
        AI ai = this.zzm;
        if (ai == null) {
            return;
        }
        zzgch.zzr(ai, new zzdnb(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(String str, Map map) {
        AI ai = this.zzm;
        if (ai == null) {
            return;
        }
        zzgch.zzr(ai, new zzdne(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdQ);
        final Context context = this.zzc;
        final zzava zzavaVar = this.zzf;
        final VersionInfoParcel versionInfoParcel = this.zzg;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzebv zzebvVar = this.zzk;
        final zzfcn zzfcnVar = this.zzl;
        AI aiZzm = zzgch.zzm(zzgch.zzk(new zzgbn() { // from class: com.google.android.gms.internal.ads.zzcfi
            @Override // com.google.android.gms.internal.ads.zzgbn
            public final AI zza() throws zzcfj {
                com.google.android.gms.ads.internal.zzv.zzA();
                Context context2 = context;
                zzcgr zzcgrVarZza = zzcgr.zza();
                zzava zzavaVar2 = zzavaVar;
                zzebv zzebvVar2 = zzebvVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcex zzcexVarZza = zzcfk.zza(context2, zzcgrVarZza, "", false, false, zzavaVar2, null, versionInfoParcel, null, null, zzaVar2, zzbbj.zza(), null, null, zzebvVar2, zzfcnVar);
                final zzcaa zzcaaVarZza = zzcaa.zza(zzcexVarZza);
                zzcexVarZza.zzN().zzC(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzcfh
                    @Override // com.google.android.gms.internal.ads.zzcgn
                    public final void zza(boolean z, int i, String str2, String str3) {
                        zzcaaVarZza.zzb();
                    }
                });
                zzcexVarZza.loadUrl(str);
                return zzcaaVarZza;
            }
        }, zzbzw.zzf), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzdna
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                zzcex zzcexVar = (zzcex) obj;
                this.zza.zza(zzcexVar);
                return zzcexVar;
            }
        }, this.zze);
        this.zzm = aiZzm;
        zzbzz.zza(aiZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbjp zzbjpVar) {
        AI ai = this.zzm;
        if (ai == null) {
            return;
        }
        zzgch.zzr(ai, new zzdnc(this, str, zzbjpVar), this.zze);
    }

    public final void zzm(WeakReference weakReference, String str, zzbjp zzbjpVar) {
        zzl(str, new zzdnj(this, weakReference, str, zzbjpVar, null));
    }

    public final synchronized void zzn(String str, zzbjp zzbjpVar) {
        AI ai = this.zzm;
        if (ai == null) {
            return;
        }
        zzgch.zzr(ai, new zzdnd(this, str, zzbjpVar), this.zze);
    }
}
