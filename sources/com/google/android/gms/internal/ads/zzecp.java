package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecp {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzfbo zzc;

    @Nullable
    private final zzcex zzd;
    private final zzdrw zze;

    @Nullable
    private zzfla zzf;

    public zzecp(Context context, VersionInfoParcel versionInfoParcel, zzfbo zzfboVar, @Nullable zzcex zzcexVar, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfboVar;
        this.zzd = zzcexVar;
        this.zze = zzdrwVar;
    }

    public final synchronized void zza(View view) {
        zzfla zzflaVar = this.zzf;
        if (zzflaVar != null) {
            com.google.android.gms.ads.internal.zzv.zzB().zzh(zzflaVar, view);
        }
    }

    public final synchronized void zzb() {
        zzcex zzcexVar;
        if (this.zzf == null || (zzcexVar = this.zzd) == null) {
            return;
        }
        zzcexVar.zzd("onSdkImpression", zzfxq.zzd());
    }

    public final synchronized void zzc() {
        zzcex zzcexVar;
        try {
            zzfla zzflaVar = this.zzf;
            if (zzflaVar == null || (zzcexVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzcexVar.zzV().iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.zzv.zzB().zzh(zzflaVar, (View) it.next());
            }
            this.zzd.zzd("onSdkLoaded", zzfxq.zzd());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzd() {
        return this.zzf != null;
    }

    public final synchronized boolean zze(boolean z) {
        if (this.zzc.zzT) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfc)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && this.zzd != null) {
                    if (this.zzf != null) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!com.google.android.gms.ads.internal.zzv.zzB().zzl(this.zza)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to initialize omid.");
                        return false;
                    }
                    if (this.zzc.zzV.zzb()) {
                        zzfla zzflaVarZze = com.google.android.gms.ads.internal.zzv.zzB().zze(this.zzb, this.zzd.zzG(), true);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfg)).booleanValue()) {
                            zzdrw zzdrwVar = this.zze;
                            String str = zzflaVarZze != null ? "1" : "0";
                            zzdrv zzdrvVarZza = zzdrwVar.zza();
                            zzdrvVarZza.zzb("omid_js_session_success", str);
                            zzdrvVarZza.zzg();
                        }
                        if (zzflaVarZze == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Created omid javascript session service.");
                        this.zzf = zzflaVarZze;
                        this.zzd.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(zzcfo zzcfoVar) {
        zzfla zzflaVar = this.zzf;
        if (zzflaVar == null || this.zzd == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzm(zzflaVar, zzcfoVar);
        this.zzf = null;
        this.zzd.zzas(null);
    }
}
