package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzduv implements zzdvw, zzdug {
    private final zzdvg zza;
    private final zzdvx zzb;
    private final zzduh zzc;
    private final zzduq zzd;
    private final zzduf zze;
    private final zzdvs zzf;
    private final zzdvc zzg;
    private final zzdvc zzh;
    private final String zzi;
    private final Context zzj;

    @Nullable
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private zzdur zzr = zzdur.NONE;
    private zzduu zzv = zzduu.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzduv(zzdvg zzdvgVar, zzdvx zzdvxVar, zzduh zzduhVar, Context context, VersionInfoParcel versionInfoParcel, zzduq zzduqVar, zzdvs zzdvsVar, zzdvc zzdvcVar, zzdvc zzdvcVar2, @Nullable String str) {
        this.zza = zzdvgVar;
        this.zzb = zzdvxVar;
        this.zzc = zzduhVar;
        this.zze = new zzduf(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzduqVar;
        this.zzf = zzdvsVar;
        this.zzg = zzdvcVar;
        this.zzh = zzdvcVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzv.zzt().zzg(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdur) Enum.valueOf(zzdur.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzduj zzdujVar : (List) entry.getValue()) {
                    if (zzdujVar.zzg()) {
                        jSONArray.put(zzdujVar.zzd());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void zzu() {
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbcc zzbccVar = zzbcl.zzjq;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).split(",")));
        }
        zzbcc zzbccVar2 = zzbcl.zzjr;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar2)).split(",")));
        }
        zzA(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk());
        this.zzx = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzl();
    }

    private final void zzv() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzB(zzd());
    }

    private final synchronized void zzw(zzdur zzdurVar, boolean z) {
        try {
            if (this.zzr != zzdurVar) {
                if (zzq()) {
                    zzy();
                }
                this.zzr = zzdurVar;
                if (zzq()) {
                    zzz();
                }
                if (z) {
                    zzv();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0033 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    private final synchronized void zzx(boolean z, boolean z2) {
        try {
            if (this.zzs != z) {
                this.zzs = z;
                if (z) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue() || !com.google.android.gms.ads.internal.zzv.zzt().zzl()) {
                        zzz();
                    } else if (!zzq()) {
                        zzy();
                    }
                } else if (!zzq()) {
                    zzy();
                }
                if (z2) {
                    zzv();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzy() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzz() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    public final zzdur zza() {
        return this.zzr;
    }

    public final synchronized AI zzb(String str) {
        zzcab zzcabVar;
        try {
            zzcabVar = new zzcab();
            if (this.zzm.containsKey(str)) {
                zzcabVar.zzc((zzduj) this.zzm.get(str));
            } else {
                if (!this.zzn.containsKey(str)) {
                    this.zzn.put(str, new ArrayList());
                }
                ((List) this.zzn.get(str)).add(zzcabVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzcabVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzq()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.zzk)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzk);
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zza());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
                    String strZzn = com.google.android.gms.ads.internal.zzv.zzp().zzn();
                    if (!TextUtils.isEmpty(strZzn)) {
                        jSONObject.put("plugin", strZzn);
                    }
                }
                if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                    this.zzo = "{}";
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzt());
                jSONObject.put("appInfo", this.zze.zza());
                String strZzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
                if (!TextUtils.isEmpty(strZzc)) {
                    jSONObject.put("cld", new JSONObject(strZzc));
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjd)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.zzp);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzv.zzt().zzl());
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzr());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjp)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjr))) {
                    jSONObject.put("gmaDisk", this.zzh.zza());
                }
                if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjq))) {
                    jSONObject.put("userDisk", this.zzg.zza());
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "Inspector.toJson");
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Ad inspector encountered an error", e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzduj zzdujVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziP)).intValue()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) this.zzl.get(str)).add(zzdujVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                String strZzc = zzdujVar.zzc();
                this.zzm.put(strZzc, zzdujVar);
                if (this.zzn.containsKey(strZzc)) {
                    List list = (List) this.zzn.get(strZzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcab) it.next()).zzc(zzdujVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
                zzu();
                return;
            }
            String strZzk = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk();
            if (TextUtils.isEmpty(strZzk)) {
                return;
            }
            try {
                if (new JSONObject(strZzk).optBoolean("isTestMode", false)) {
                    zzu();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzdl zzdlVar, zzduu zzduuVar) {
        if (!zzq()) {
            try {
                zzdlVar.zze(zzfdk.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
            this.zzv = zzduuVar;
            this.zza.zzj(zzdlVar, new zzbkj(this), new zzbkc(this.zzf), new zzbjq(this));
            return;
        } else {
            try {
                zzdlVar.zze(zzfdk.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
                return;
            }
        }
        throw th;
    }

    public final synchronized void zzi(String str, long j) {
        this.zzo = str;
        this.zzq = j;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzC(this.zzx);
    }

    public final synchronized void zzk(long j) {
        this.zzw += j;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    public final void zzl(boolean z) {
        if (this.zzu) {
            if (z) {
                if (!this.zzs) {
                    zzz();
                    return;
                }
            }
        } else if (z) {
            zzu();
            if (!this.zzs) {
                zzz();
                return;
            }
        }
        if (zzq()) {
            return;
        }
        zzy();
    }

    public final void zzm(zzdur zzdurVar) {
        zzw(zzdurVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z) {
        if (!this.zzu && z) {
            zzu();
        }
        zzx(z, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
            return this.zzs || com.google.android.gms.ads.internal.zzv.zzt().zzl();
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        return this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzji)).longValue();
    }
}
