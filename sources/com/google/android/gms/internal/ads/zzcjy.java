package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcjy extends com.google.android.gms.ads.internal.client.zzcy {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdpm zzc;
    private final zzecy zzd;
    private final zzejj zze;
    private final zzdua zzf;
    private final zzbyi zzg;
    private final zzdpr zzh;
    private final zzduv zzi;
    private final zzbfe zzj;
    private final zzfhk zzk;
    private final zzfdf zzl;
    private final zzctj zzm;
    private final zzdrw zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());

    @VisibleForTesting
    public zzcjy(Context context, VersionInfoParcel versionInfoParcel, zzdpm zzdpmVar, zzecy zzecyVar, zzejj zzejjVar, zzdua zzduaVar, zzbyi zzbyiVar, zzdpr zzdprVar, zzduv zzduvVar, zzbfe zzbfeVar, zzfhk zzfhkVar, zzfdf zzfdfVar, zzctj zzctjVar, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdpmVar;
        this.zzd = zzecyVar;
        this.zze = zzejjVar;
        this.zzf = zzduaVar;
        this.zzg = zzbyiVar;
        this.zzh = zzdprVar;
        this.zzi = zzduvVar;
        this.zzj = zzbfeVar;
        this.zzk = zzfhkVar;
        this.zzl = zzfdfVar;
        this.zzm = zzctjVar;
        this.zzn = zzdrwVar;
    }

    @VisibleForTesting
    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
            String strZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzi();
            if (com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, strZzi, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(false);
            com.google.android.gms.ads.internal.zzv.zzp().zzi().zzw("");
        }
    }

    @VisibleForTesting
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapZze = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zze();
        if (mapZze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap map = new HashMap();
            Iterator it = mapZze.values().iterator();
            while (it.hasNext()) {
                for (zzbox zzboxVar : ((zzboy) it.next()).zza) {
                    String str = zzboxVar.zzb;
                    for (String str2 : zzboxVar.zza) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzecz zzeczVarZza = this.zzd.zza(str3, jSONObject);
                    if (zzeczVarZza != null) {
                        zzfdh zzfdhVar = (zzfdh) zzeczVarZza.zzb;
                        if (!zzfdhVar.zzC() && zzfdhVar.zzB()) {
                            zzfdhVar.zzj(this.zza, (zzeet) zzeczVarZza.zzc, (List) entry.getValue());
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfcq e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfdn.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzv.zzs().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws RemoteException {
        try {
            zzfrb.zza(this.zza).zzc(z);
            if (z) {
                return;
            }
            try {
                if (this.zza.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
                } else {
                    throw new IOException("Failed to remove query_info_shared_prefs");
                }
            } catch (IOException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "clearStorageOnGpidPubDisable_scar");
            }
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbcl.zza(this.zza);
        com.google.android.gms.ads.internal.zzv.zzp().zzu(this.zza, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzv.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzed)).booleanValue()) {
            this.zzh.zzd();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkO)).booleanValue()) {
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdb)).booleanValue()) {
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeG)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeH)).booleanValue()) {
                zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzw();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) {
        String strZzq;
        Runnable runnable;
        zzbcl.zza(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzei)).booleanValue()) {
            try {
                com.google.android.gms.ads.internal.zzv.zzq();
                strZzq = com.google.android.gms.ads.internal.util.zzs.zzq(this.zza);
            } catch (RemoteException | RuntimeException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "NonagonMobileAdsSettingManager_AppId");
                strZzq = "";
            }
        } else {
            strZzq = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strZzq) ? str : strZzq;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeb)).booleanValue();
        zzbcc zzbccVar = zzbcl.zzba;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjx
                @Override // java.lang.Runnable
                public final void run() {
                    zzgcs zzgcsVar = zzbzw.zzf;
                    final zzcjy zzcjyVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzgcsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjs
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcjyVar.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzv.zza().zza(this.zza, this.zzb, str2, runnable3, this.zzk, this.zzn, this.zzp);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(com.google.android.gms.ads.internal.client.zzdl zzdlVar) throws RemoteException {
        this.zzi.zzh(zzdlVar, zzduu.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.zzb.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpe zzbpeVar) throws RemoteException {
        this.zzl.zzf(zzbpeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzp(boolean z) {
        com.google.android.gms.ads.internal.zzv.zzs().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzq(float f) {
        com.google.android.gms.ads.internal.zzv.zzs().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzr(String str) {
        zzbcl.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zza().zza(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzblu zzbluVar) throws RemoteException {
        this.zzf.zzs(zzbluVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(com.google.android.gms.ads.internal.client.zzfv zzfvVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzfvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzv.zzs().zze();
    }

    public final /* synthetic */ void zzw() {
        com.google.android.gms.ads.internal.zzv.zzf().zzb(this.zza, this.zzn);
    }

    public final /* synthetic */ void zzx() {
        this.zzj.zza(new zzbum());
    }
}
