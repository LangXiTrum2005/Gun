package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdua {
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdpm zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsh zzl;
    private final VersionInfoParcel zzm;
    private final zzdcr zzo;
    private final zzfhk zzp;
    private boolean zza = false;
    private boolean zzb = false;

    @GuardedBy("this")
    private boolean zzc = false;
    private final zzcab zze = new zzcab();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;
    private final long zzd = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();

    public zzdua(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdpm zzdpmVar, ScheduledExecutorService scheduledExecutorService, zzdsh zzdshVar, VersionInfoParcel versionInfoParcel, zzdcr zzdcrVar, zzfhk zzfhkVar) {
        this.zzh = zzdpmVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdshVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdcrVar;
        this.zzp = zzfhkVar;
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* bridge */ /* synthetic */ void zzj(final zzdua zzduaVar, String str) {
        int i = 5;
        final zzfgw zzfgwVarZza = zzfgv.zza(zzduaVar.zzf, 5);
        zzfgwVarZza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfgw zzfgwVarZza2 = zzfgv.zza(zzduaVar.zzf, i);
                zzfgwVarZza2.zzi();
                zzfgwVarZza2.zzd(next);
                final Object obj = new Object();
                final zzcab zzcabVar = new zzcab();
                AI aiZzo = zzgch.zzo(zzcabVar, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbW)).longValue(), TimeUnit.SECONDS, zzduaVar.zzk);
                zzduaVar.zzl.zzc(next);
                zzduaVar.zzo.zzc(next);
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                aiZzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzq(obj, zzcabVar, next, jElapsedRealtime, zzfgwVarZza2);
                    }
                }, zzduaVar.zzi);
                arrayList.add(aiZzo);
                final zzdtz zzdtzVar = new zzdtz(zzduaVar, obj, next, jElapsedRealtime, zzfgwVarZza2, zzcabVar);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        int i2 = 0;
                        while (i2 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzblx(strOptString, bundle));
                            i2++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzduaVar.zzv(next, false, "", 0);
                try {
                    final zzfdh zzfdhVarZzc = zzduaVar.zzh.zzc(next, new JSONObject());
                    zzduaVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtv
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzn(next, zzdtzVar, zzfdhVarZzc, arrayList2);
                        }
                    });
                } catch (zzfcq e) {
                    try {
                        String str2 = "Failed to create Adapter.";
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmP)).booleanValue()) {
                            str2 = "Failed to create Adapter. " + e.getMessage();
                        }
                        zzdtzVar.zze(str2);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
                    }
                }
                i = 5;
            }
            zzgch.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdtr
                @Override // java.util.concurrent.Callable
                public final Object call() throws Exception {
                    this.zza.zzf(zzfgwVarZza);
                    return null;
                }
            }, zzduaVar.zzi);
        } catch (JSONException e3) {
            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e3);
            zzduaVar.zzo.zza("MalformedJson");
            zzduaVar.zzl.zza("MalformedJson");
            zzduaVar.zze.zzd(e3);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "AdapterInitializer.updateAdapterStatus");
            zzfhk zzfhkVar = zzduaVar.zzp;
            zzfgwVarZza.zzh(e3);
            zzfgwVarZza.zzg(false);
            zzfhkVar.zzb(zzfgwVarZza.zzm());
        }
    }

    private final synchronized AI zzu() {
        String strZzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return zzgch.zzh(strZzc);
        }
        final zzcab zzcabVar = new zzcab();
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdts
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo(zzcabVar);
            }
        });
        return zzcabVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z, String str2, int i) {
        this.zzn.put(str, new zzbln(str, z, i, str2));
    }

    public final /* synthetic */ Object zzf(zzfgw zzfgwVar) throws Exception {
        this.zze.zzc(Boolean.TRUE);
        zzfgwVar.zzg(true);
        this.zzp.zzb(zzfgwVar.zzm());
        return null;
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbln zzblnVar = (zzbln) this.zzn.get(str);
            arrayList.add(new zzbln(str, zzblnVar.zzb, zzblnVar.zzc, zzblnVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.zzq = false;
    }

    public final /* synthetic */ void zzm() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzd));
                this.zzl.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzn(String str, zzblr zzblrVar, zzfdh zzfdhVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzblrVar.zzf();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfdhVar.zzi(context, zzblrVar, list);
            } catch (RemoteException e) {
                throw new zzfvl(e);
            } catch (zzfcq unused) {
                zzblrVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
    }

    public final /* synthetic */ void zzo(final zzcab zzcabVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzdtu
            @Override // java.lang.Runnable
            public final void run() {
                String strZzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
                boolean zIsEmpty = TextUtils.isEmpty(strZzc);
                zzcab zzcabVar2 = zzcabVar;
                if (zIsEmpty) {
                    zzcabVar2.zzd(new Exception());
                } else {
                    zzcabVar2.zzc(strZzc);
                }
            }
        });
    }

    public final /* synthetic */ void zzp() {
        this.zzl.zze();
        this.zzo.zze();
        this.zzb = true;
    }

    public final /* synthetic */ void zzq(Object obj, zzcab zzcabVar, String str, long j, zzfgw zzfgwVar) {
        synchronized (obj) {
            try {
                if (!zzcabVar.isDone()) {
                    zzv(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j));
                    this.zzl.zzb(str, "timeout");
                    this.zzo.zzb(str, "timeout");
                    zzfhk zzfhkVar = this.zzp;
                    zzfgwVar.zzc(AndroidInitializeBoldSDK.MSG_TIMEOUT);
                    zzfgwVar.zzg(false);
                    zzfhkVar.zzb(zzfgwVar.zzm());
                    zzcabVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzr() {
        if (!((Boolean) zzber.zza.zze()).booleanValue()) {
            if (this.zzm.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbV)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zzf();
                        this.zzo.zzf();
                        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtw
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzp();
                            }
                        }, this.zzi);
                        this.zza = true;
                        AI aiZzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtp
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzm();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbX)).longValue(), TimeUnit.SECONDS);
                        zzgch.zzr(aiZzu, new zzdty(this), this.zzi);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzblu zzbluVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdtt
            @Override // java.lang.Runnable
            public final void run() {
                zzdua zzduaVar = this.zza;
                try {
                    zzbluVar.zzb(zzduaVar.zzg());
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
