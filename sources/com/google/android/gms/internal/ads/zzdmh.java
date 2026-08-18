package com.google.android.gms.internal.ads;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdmh {
    private final zzfcj zza;
    private final Executor zzb;
    private final zzdow zzc;
    private final zzdnr zzd;
    private final Context zze;
    private final zzdrw zzf;
    private final zzfja zzg;
    private final zzebk zzh;

    public zzdmh(zzfcj zzfcjVar, Executor executor, zzdow zzdowVar, Context context, zzdrw zzdrwVar, zzfja zzfjaVar, zzebk zzebkVar, zzdnr zzdnrVar) {
        this.zza = zzfcjVar;
        this.zzb = executor;
        this.zzc = zzdowVar;
        this.zze = context;
        this.zzf = zzdrwVar;
        this.zzg = zzfjaVar;
        this.zzh = zzebkVar;
        this.zzd = zzdnrVar;
    }

    private final void zzh(zzcex zzcexVar) {
        zzj(zzcexVar);
        zzcexVar.zzag("/video", zzbjo.zzl);
        zzcexVar.zzag("/videoMeta", zzbjo.zzm);
        zzcexVar.zzag("/precache", new zzcdf());
        zzcexVar.zzag("/delayPageLoaded", zzbjo.zzp);
        zzcexVar.zzag("/instrument", zzbjo.zzn);
        zzcexVar.zzag("/log", zzbjo.zzg);
        zzcexVar.zzag("/click", new zzbin(null, 0 == true ? 1 : 0));
        if (this.zza.zzb != null) {
            zzcexVar.zzN().zzG(true);
            zzcexVar.zzag("/open", new zzbkb(null, null, null, null, null));
        } else {
            zzcexVar.zzN().zzG(false);
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(zzcexVar.getContext())) {
            Map map = new HashMap();
            if (zzcexVar.zzD() != null) {
                map = zzcexVar.zzD().zzaw;
            }
            zzcexVar.zzag("/logScionEvent", new zzbjv(zzcexVar.getContext(), map));
        }
    }

    private final void zzi(zzcex zzcexVar, zzcaa zzcaaVar) {
        if (this.zza.zza != null && zzcexVar.zzq() != null) {
            zzcexVar.zzq().zzs(this.zza.zza);
        }
        zzcaaVar.zzb();
    }

    private static final void zzj(zzcex zzcexVar) {
        zzcexVar.zzag("/videoClicked", zzbjo.zzh);
        zzcexVar.zzN().zzI(true);
        zzcexVar.zzag("/getNativeAdViewSignals", zzbjo.zzs);
        zzcexVar.zzag("/getNativeClickMeta", zzbjo.zzt);
    }

    public final AI zza(final JSONObject jSONObject) {
        return zzgch.zzn(zzgch.zzn(zzgch.zzh(null), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdly
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zze(obj);
            }
        }, this.zzb), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlx
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzcex) obj);
            }
        }, this.zzb);
    }

    public final AI zzb(final String str, final String str2, final zzfbo zzfboVar, final zzfbr zzfbrVar, final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        return zzgch.zzn(zzgch.zzh(null), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlw
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzd(zzsVar, zzfboVar, zzfbrVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ AI zzc(JSONObject jSONObject, final zzcex zzcexVar) throws Exception {
        zzblz zzblzVar = this.zza.zzb;
        final zzcaa zzcaaVarZza = zzcaa.zza(zzcexVar);
        if (zzblzVar != null) {
            zzcexVar.zzaj(zzcgr.zzd());
        } else {
            zzcexVar.zzaj(zzcgr.zze());
        }
        zzcexVar.zzN().zzC(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzdma
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, String str, String str2) {
                this.zza.zzf(zzcexVar, zzcaaVarZza, z, i, str, str2);
            }
        });
        zzcexVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcaaVarZza;
    }

    public final /* synthetic */ AI zzd(com.google.android.gms.ads.internal.client.zzs zzsVar, zzfbo zzfboVar, zzfbr zzfbrVar, String str, String str2, Object obj) throws Exception {
        final zzcex zzcexVarZza = this.zzc.zza(zzsVar, zzfboVar, zzfbrVar);
        final zzcaa zzcaaVarZza = zzcaa.zza(zzcexVarZza);
        if (this.zza.zzb != null) {
            zzh(zzcexVarZza);
            zzcexVarZza.zzaj(zzcgr.zzd());
        } else {
            zzdno zzdnoVarZzb = this.zzd.zzb();
            zzcexVarZza.zzN().zzV(zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzh, this.zzg, this.zzf, null, zzdnoVarZzb, null, null, null, null);
            zzj(zzcexVarZza);
        }
        zzcexVarZza.zzN().zzC(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzdmb
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, String str3, String str4) {
                this.zza.zzg(zzcexVarZza, zzcaaVarZza, z, i, str3, str4);
            }
        });
        zzcexVarZza.zzae(str, str2, null);
        return zzcaaVarZza;
    }

    public final /* synthetic */ AI zze(Object obj) throws Exception {
        zzcex zzcexVarZza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        final zzcaa zzcaaVarZza = zzcaa.zza(zzcexVarZza);
        zzh(zzcexVarZza);
        zzcexVarZza.zzN().zzJ(new zzcgo() { // from class: com.google.android.gms.internal.ads.zzdlz
            @Override // com.google.android.gms.internal.ads.zzcgo
            public final void zza() {
                zzcaaVarZza.zzb();
            }
        });
        zzcexVarZza.loadUrl((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdR));
        return zzcaaVarZza;
    }

    public final /* synthetic */ void zzf(zzcex zzcexVar, zzcaa zzcaaVar, boolean z, int i, String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdZ)).booleanValue()) {
            zzi(zzcexVar, zzcaaVar);
            return;
        }
        if (z) {
            zzi(zzcexVar, zzcaaVar);
            return;
        }
        zzcaaVar.zzd(new zzegu(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    public final /* synthetic */ void zzg(zzcex zzcexVar, zzcaa zzcaaVar, boolean z, int i, String str, String str2) {
        if (z) {
            if (this.zza.zza != null && zzcexVar.zzq() != null) {
                zzcexVar.zzq().zzs(this.zza.zza);
            }
            zzcaaVar.zzb();
            return;
        }
        zzcaaVar.zzd(new zzegu(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
