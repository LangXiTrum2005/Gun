package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbxp implements zzbxu {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());

    @VisibleForTesting
    boolean zza;
    private final zzhbn zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxr zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxp(Context context, VersionInfoParcel versionInfoParcel, zzbxr zzbxrVar, @Nullable String str, zzbxq zzbxqVar) {
        Preconditions.checkNotNull(zzbxrVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxrVar;
        Iterator it = zzbxrVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhbn zzhbnVarZzc = zzhdm.zzc();
        zzhbnVarZzc.zzn(9);
        zzhbnVarZzc.zzj(str);
        zzhbnVarZzc.zzh(str);
        zzhbo zzhboVarZzc = zzhbp.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhboVarZzc.zza(str2);
        }
        zzhbnVarZzc.zzg((zzhbp) zzhboVarZzc.zzbr());
        zzhdd zzhddVarZzc = zzhde.zzc();
        zzhddVarZzc.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzhddVarZzc.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzhddVarZzc.zzb(apkVersion);
        }
        zzhbnVarZzc.zzf((zzhde) zzhddVarZzc.zzbr());
        this.zzd = zzhbnVarZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final zzbxr zza() {
        return this.zzi;
    }

    public final /* synthetic */ AI zzb(Map map) throws Exception {
        zzhdb zzhdbVar;
        AI aiZzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (this.zzj) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (this.zzj) {
                                    try {
                                        zzhdbVar = (zzhdb) this.zze.get(str);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (zzhdbVar == null) {
                                    zzbxt.zza("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        zzhdbVar.zza(jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type"));
                                    }
                                    this.zza = (length > 0) | this.zza;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbet.zza.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgch.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgch.zzh(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzc((zzhdc) ((zzhdb) it.next()).zzbr());
                }
                this.zzd.zza(this.zzf);
                this.zzd.zzb(this.zzg);
                if (zzbxt.zzb()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                    for (zzhdc zzhdcVar : this.zzd.zzm()) {
                        sb.append("    [");
                        sb.append(zzhdcVar.zzc());
                        sb.append("] ");
                        sb.append(zzhdcVar.zzg());
                    }
                    zzbxt.zza(sb.toString());
                }
                AI aiZzb = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhdm) this.zzd.zzbr()).zzaV());
                if (zzbxt.zzb()) {
                    aiZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbxt.zza("Pinged SB successfully.");
                        }
                    }, zzbzw.zza);
                }
                aiZzm = zzgch.zzm(aiZzb, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzbxn
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final Object apply(Object obj) {
                        int i2 = zzbxp.zzb;
                        return null;
                    }
                }, zzbzw.zzg);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return aiZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzhdb) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzhdb zzhdbVarZzd = zzhdc.zzd();
            int iZza = zzhda.zza(i);
            if (iZza != 0) {
                zzhdbVarZzd.zze(iZza);
            }
            zzhdbVarZzd.zzb(this.zze.size());
            zzhdbVarZzd.zzd(str);
            zzhca zzhcaVarZzc = zzhcd.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhby zzhbyVarZzc = zzhbz.zzc();
                        zzhbyVarZzc.zza(zzgwj.zzw(str2));
                        zzhbyVarZzc.zzb(zzgwj.zzw(str3));
                        zzhcaVarZzc.zza((zzhbz) zzhbyVarZzc.zzbr());
                    }
                }
            }
            zzhdbVarZzd.zzc((zzhcd) zzhcaVarZzc.zzbr());
            this.zze.put(str, zzhdbVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            AI aiZzh = zzgch.zzh(Collections.emptyMap());
            zzgbo zzgboVar = new zzgbo() { // from class: com.google.android.gms.internal.ads.zzbxk
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final AI zza(Object obj) {
                    return this.zza.zzb((Map) obj);
                }
            };
            zzgcs zzgcsVar = zzbzw.zzg;
            AI aiZzn = zzgch.zzn(aiZzh, zzgboVar, zzgcsVar);
            AI aiZzo = zzgch.zzo(aiZzn, 10L, TimeUnit.SECONDS, zzbzw.zzd);
            zzgch.zzr(aiZzn, new zzbxo(this, aiZzo), zzgcsVar);
            zzc.add(aiZzo);
        }
    }

    public final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgwh zzgwhVarZzt = zzgwj.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgwhVarZzt);
        synchronized (this.zzj) {
            zzhbn zzhbnVar = this.zzd;
            zzhcv zzhcvVarZzc = zzhcx.zzc();
            zzhcvVarZzc.zza(zzgwhVarZzt.zzb());
            zzhcvVarZzc.zzb("image/png");
            zzhcvVarZzc.zzc(2);
            zzhbnVar.zzi((zzhcx) zzhcvVarZzc.zzbr());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzg(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzv.zzq();
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzbxt.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzf(bitmap);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final void zzh(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzd();
                } else {
                    this.zzd.zze(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxu
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
