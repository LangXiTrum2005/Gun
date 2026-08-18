package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdgd implements zzcxh, com.google.android.gms.ads.internal.overlay.zzr, zzcwn {

    @Nullable
    @VisibleForTesting
    zzecr zza;
    private final Context zzb;

    @Nullable
    private final zzcex zzc;
    private final zzfbo zzd;
    private final VersionInfoParcel zze;
    private final zzbbq.zza.EnumC0136zza zzf;
    private final zzecp zzg;

    public zzdgd(Context context, @Nullable zzcex zzcexVar, zzfbo zzfboVar, VersionInfoParcel versionInfoParcel, zzbbq.zza.EnumC0136zza enumC0136zza, zzecp zzecpVar) {
        this.zzb = context;
        this.zzc = zzcexVar;
        this.zzd = zzfboVar;
        this.zze = versionInfoParcel;
        this.zzf = enumC0136zza;
        this.zzg = zzecpVar;
    }

    private final boolean zzg() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && this.zzg.zzd();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfk)).booleanValue() || this.zzc == null) {
            return;
        }
        if (this.zza != null || zzg()) {
            if (this.zza != null) {
                this.zzc.zzd("onSdkImpression", new ArrayMap());
            } else {
                this.zzg.zzb();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if (zzg()) {
            this.zzg.zzb();
            return;
        }
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfk)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new ArrayMap());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final void zzs() {
        zzeco zzecoVar;
        zzecn zzecnVar;
        zzbbq.zza.EnumC0136zza enumC0136zza;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfn)).booleanValue() || (enumC0136zza = this.zzf) == zzbbq.zza.EnumC0136zza.REWARD_BASED_VIDEO_AD || enumC0136zza == zzbbq.zza.EnumC0136zza.INTERSTITIAL || enumC0136zza == zzbbq.zza.EnumC0136zza.APP_OPEN) && this.zzd.zzT && this.zzc != null) {
            if (com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zzb)) {
                if (zzg()) {
                    this.zzg.zzc();
                    return;
                }
                VersionInfoParcel versionInfoParcel = this.zze;
                String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                zzfcm zzfcmVar = this.zzd.zzV;
                String strZza = zzfcmVar.zza();
                if (zzfcmVar.zzc() == 1) {
                    zzecnVar = zzecn.VIDEO;
                    zzecoVar = zzeco.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzecoVar = this.zzd.zzY == 2 ? zzeco.UNSPECIFIED : zzeco.BEGIN_TO_RENDER;
                    zzecnVar = zzecn.HTML_DISPLAY;
                }
                this.zza = com.google.android.gms.ads.internal.zzv.zzB().zza(str, this.zzc.zzG(), "", "javascript", strZza, zzecoVar, zzecnVar, this.zzd.zzal);
                View viewZzF = this.zzc.zzF();
                zzecr zzecrVar = this.zza;
                if (zzecrVar != null) {
                    zzfkp zzfkpVarZza = zzecrVar.zza();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfe)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzfkpVarZza, this.zzc.zzG());
                        Iterator it = this.zzc.zzV().iterator();
                        while (it.hasNext()) {
                            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzfkpVarZza, (View) it.next());
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzfkpVarZza, viewZzF);
                    }
                    this.zzc.zzat(this.zza);
                    com.google.android.gms.ads.internal.zzv.zzB().zzk(zzfkpVarZza);
                    this.zzc.zzd("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }
}
