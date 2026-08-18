package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzos;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgd implements zzgy {
    private static volatile zzgd zzd;
    private zzek zzA;
    private Boolean zzC;
    private long zzD;
    private volatile Boolean zzE;
    private volatile boolean zzF;
    private int zzG;

    @VisibleForTesting
    protected Boolean zza;

    @VisibleForTesting
    protected Boolean zzb;

    @VisibleForTesting
    final long zzc;
    private final Context zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private final zzab zzj;
    private final zzag zzk;
    private final zzfi zzl;
    private final zzet zzm;
    private final zzga zzn;
    private final zzkp zzo;
    private final zzlp zzp;
    private final zzeo zzq;
    private final Clock zzr;
    private final zziz zzs;
    private final zzik zzt;
    private final zzd zzu;
    private final zzio zzv;
    private final String zzw;
    private zzem zzx;
    private zzjz zzy;
    private zzao zzz;
    private boolean zzB = false;
    private final AtomicInteger zzH = new AtomicInteger(0);

    public zzgd(zzhi zzhiVar) {
        Bundle bundle;
        Preconditions.checkNotNull(zzhiVar);
        Context context = zzhiVar.zza;
        zzab zzabVar = new zzab(context);
        this.zzj = zzabVar;
        zzed.zza = zzabVar;
        this.zze = context;
        this.zzf = zzhiVar.zzb;
        this.zzg = zzhiVar.zzc;
        this.zzh = zzhiVar.zzd;
        this.zzi = zzhiVar.zzh;
        this.zzE = zzhiVar.zze;
        this.zzw = zzhiVar.zzj;
        this.zzF = true;
        com.google.android.gms.internal.measurement.zzcl zzclVar = zzhiVar.zzg;
        if (zzclVar != null && (bundle = zzclVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zza = (Boolean) obj;
            }
            Object obj2 = zzclVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzb = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzib.zzd(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzr = defaultClock;
        Long l = zzhiVar.zzi;
        this.zzc = l != null ? l.longValue() : defaultClock.currentTimeMillis();
        this.zzk = new zzag(this);
        zzfi zzfiVar = new zzfi(this);
        zzfiVar.zzw();
        this.zzl = zzfiVar;
        zzet zzetVar = new zzet(this);
        zzetVar.zzw();
        this.zzm = zzetVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzw();
        this.zzp = zzlpVar;
        this.zzq = new zzeo(new zzhh(zzhiVar, this));
        this.zzu = new zzd(this);
        zziz zzizVar = new zziz(this);
        zzizVar.zzb();
        this.zzs = zzizVar;
        zzik zzikVar = new zzik(this);
        zzikVar.zzb();
        this.zzt = zzikVar;
        zzkp zzkpVar = new zzkp(this);
        zzkpVar.zzb();
        this.zzo = zzkpVar;
        zzio zzioVar = new zzio(this);
        zzioVar.zzw();
        this.zzv = zzioVar;
        zzga zzgaVar = new zzga(this);
        zzgaVar.zzw();
        this.zzn = zzgaVar;
        com.google.android.gms.internal.measurement.zzcl zzclVar2 = zzhiVar.zzg;
        boolean z = zzclVar2 == null || zzclVar2.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            zzik zzikVarZzq = zzq();
            if (zzikVarZzq.zzt.zze.getApplicationContext() instanceof Application) {
                Application application = (Application) zzikVarZzq.zzt.zze.getApplicationContext();
                if (zzikVarZzq.zza == null) {
                    zzikVarZzq.zza = new zzij(zzikVarZzq);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(zzikVarZzq.zza);
                    application.registerActivityLifecycleCallbacks(zzikVarZzq.zza);
                    AbstractC3888ke0.p(zzikVarZzq.zzt, "Registered activity lifecycle callback");
                }
            }
        } else {
            DM.C(this, "Application context is not an Application");
        }
        zzgaVar.zzp(new zzgc(this, zzhiVar));
    }

    public static /* bridge */ /* synthetic */ void zzA(zzgd zzgdVar, zzhi zzhiVar) {
        zzgdVar.zzaB().zzg();
        zzgdVar.zzk.zzn();
        zzao zzaoVar = new zzao(zzgdVar);
        zzaoVar.zzw();
        zzgdVar.zzz = zzaoVar;
        zzek zzekVar = new zzek(zzgdVar, zzhiVar.zzf);
        zzekVar.zzb();
        zzgdVar.zzA = zzekVar;
        zzem zzemVar = new zzem(zzgdVar);
        zzemVar.zzb();
        zzgdVar.zzx = zzemVar;
        zzjz zzjzVar = new zzjz(zzgdVar);
        zzjzVar.zzb();
        zzgdVar.zzy = zzjzVar;
        zzgdVar.zzp.zzx();
        zzgdVar.zzl.zzx();
        zzgdVar.zzA.zzc();
        zzer zzerVarZzi = zzgdVar.zzaA().zzi();
        zzgdVar.zzk.zzh();
        zzerVarZzi.zzb("App measurement initialized, version", 79000L);
        zzgdVar.zzaA().zzi().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strZzl = zzekVar.zzl();
        if (TextUtils.isEmpty(zzgdVar.zzf)) {
            if (zzgdVar.zzv().zzaf(strZzl)) {
                zzgdVar.zzaA().zzi().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzgdVar.zzaA().zzi().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strZzl)));
            }
        }
        zzgdVar.zzaA().zzc().zza("Debug-level message logging enabled");
        if (zzgdVar.zzG != zzgdVar.zzH.get()) {
            zzgdVar.zzaA().zzd().zzc("Not all components initialized", Integer.valueOf(zzgdVar.zzG), Integer.valueOf(zzgdVar.zzH.get()));
        }
        zzgdVar.zzB = true;
    }

    public static final void zzO() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    private static final void zzP(zzgw zzgwVar) {
        if (zzgwVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static final void zzQ(zzf zzfVar) {
        if (zzfVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzfVar.zze()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzfVar.getClass())));
        }
    }

    private static final void zzR(zzgx zzgxVar) {
        if (zzgxVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!zzgxVar.zzy()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzgxVar.getClass())));
        }
    }

    public static zzgd zzp(Context context, com.google.android.gms.internal.measurement.zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.zze == null || zzclVar.zzf == null)) {
            zzclVar = new com.google.android.gms.internal.measurement.zzcl(zzclVar.zza, zzclVar.zzb, zzclVar.zzc, zzclVar.zzd, null, null, zzclVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzd == null) {
            synchronized (zzgd.class) {
                try {
                    if (zzd == null) {
                        zzd = new zzgd(new zzhi(context, zzclVar, l));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzd);
            zzd.zzE = Boolean.valueOf(zzclVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzd);
        return zzd;
    }

    public final void zzB() {
        this.zzH.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    public final /* synthetic */ void zzC(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> listQueryIntentActivities;
        if (i == 200 || i == 204) {
            if (th == null) {
                zzm().zzn.zza(true);
                if (bArr != null || bArr.length == 0) {
                    zzaA().zzc().zza("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", "");
                    String strOptString2 = jSONObject.optString("gclid", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(strOptString)) {
                        zzaA().zzc().zza("Deferred Deep Link is empty.");
                        return;
                    }
                    zzlp zzlpVarZzv = zzv();
                    zzgd zzgdVar = zzlpVarZzv.zzt;
                    if (!TextUtils.isEmpty(strOptString) && (listQueryIntentActivities = zzlpVarZzv.zzt.zze.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) != null && !listQueryIntentActivities.isEmpty()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        this.zzt.zzG("auto", "_cmp", bundle);
                        zzlp zzlpVarZzv2 = zzv();
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = zzlpVarZzv2.zzt.zze.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                zzlpVarZzv2.zzt.zze.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                                return;
                            }
                            return;
                        } catch (RuntimeException e) {
                            zzlpVarZzv2.zzt.zzaA().zzd().zzb("Failed to persist Deferred Deep Link. exception", e);
                            return;
                        }
                    }
                    zzaA().zzk().zzc("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                    return;
                } catch (JSONException e2) {
                    zzaA().zzd().zzb("Failed to parse the Deferred Deep Link response. exception", e2);
                    return;
                }
            }
        } else if (i == 304) {
            i = 304;
            if (th == null) {
                zzm().zzn.zza(true);
                if (bArr != null) {
                }
                zzaA().zzc().zza("Deferred Deep Link response empty.");
                return;
            }
        }
        zzaA().zzk().zzc("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    public final void zzD() {
        this.zzG++;
    }

    @WorkerThread
    public final void zzE() {
        zzaB().zzg();
        zzR(zzr());
        String strZzl = zzh().zzl();
        Pair pairZzb = zzm().zzb(strZzl);
        if (!this.zzk.zzr() || ((Boolean) pairZzb.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairZzb.first)) {
            zzaA().zzc().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        zzio zzioVarZzr = zzr();
        zzioVarZzr.zzv();
        ConnectivityManager connectivityManager = (ConnectivityManager) zzioVarZzr.zzt.zze.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            DM.C(this, "Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        zzlp zzlpVarZzv = zzv();
        zzh().zzt.zzk.zzh();
        URL urlZzE = zzlpVarZzv.zzE(79000L, strZzl, (String) pairZzb.first, (-1) + zzm().zzo.zza());
        if (urlZzE != null) {
            zzio zzioVarZzr2 = zzr();
            zzgb zzgbVar = new zzgb(this);
            zzioVarZzr2.zzg();
            zzioVarZzr2.zzv();
            Preconditions.checkNotNull(urlZzE);
            Preconditions.checkNotNull(zzgbVar);
            zzioVarZzr2.zzt.zzaB().zzo(new zzin(zzioVarZzr2, strZzl, urlZzE, null, null, zzgbVar));
        }
    }

    @WorkerThread
    public final void zzF(boolean z) {
        this.zzE = Boolean.valueOf(z);
    }

    @WorkerThread
    public final void zzG(boolean z) {
        zzaB().zzg();
        this.zzF = z;
    }

    @WorkerThread
    public final void zzH(com.google.android.gms.internal.measurement.zzcl zzclVar) {
        zzhb zzhbVar;
        zzaB().zzg();
        zzhb zzhbVarZzc = zzm().zzc();
        int iZza = zzhbVarZzc.zza();
        zzag zzagVar = this.zzk;
        zzgd zzgdVar = zzagVar.zzt;
        Boolean boolZzk = zzagVar.zzk("google_analytics_default_allow_ad_storage");
        zzag zzagVar2 = this.zzk;
        zzgd zzgdVar2 = zzagVar2.zzt;
        Boolean boolZzk2 = zzagVar2.zzk("google_analytics_default_allow_analytics_storage");
        if (!(boolZzk == null && boolZzk2 == null) && zzm().zzl(-10)) {
            zzhbVar = new zzhb(boolZzk, boolZzk2, -10);
        } else {
            if (!TextUtils.isEmpty(zzh().zzm()) && (iZza == 0 || iZza == 30 || iZza == 10 || iZza == 30 || iZza == 30 || iZza == 40)) {
                zzq().zzR(new zzhb(null, null, -10), this.zzc);
            } else if (TextUtils.isEmpty(zzh().zzm()) && zzclVar != null && zzclVar.zzg != null && zzm().zzl(30)) {
                zzhbVar = zzhb.zzb(zzclVar.zzg, 30);
                if (!zzhbVar.zzl()) {
                }
            }
            zzhbVar = null;
        }
        if (zzhbVar != null) {
            zzq().zzR(zzhbVar, this.zzc);
            zzhbVarZzc = zzhbVar;
        }
        zzq().zzV(zzhbVarZzc);
        if (zzm().zzc.zza() == 0) {
            zzaA().zzj().zzb("Persisting first open", Long.valueOf(this.zzc));
            zzm().zzc.zzb(this.zzc);
        }
        zzq().zzb.zzc();
        if (zzM()) {
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                zzlp zzlpVarZzv = zzv();
                String strZzm = zzh().zzm();
                zzfi zzfiVarZzm = zzm();
                zzfiVarZzm.zzg();
                String string = zzfiVarZzm.zza().getString("gmp_app_id", null);
                String strZzk = zzh().zzk();
                zzfi zzfiVarZzm2 = zzm();
                zzfiVarZzm2.zzg();
                if (zzlpVarZzv.zzao(strZzm, string, strZzk, zzfiVarZzm2.zza().getString("admob_app_id", null))) {
                    zzaA().zzi().zza("Rechecking which service to use due to a GMP App Id change");
                    zzfi zzfiVarZzm3 = zzm();
                    zzfiVarZzm3.zzg();
                    Boolean boolZzd = zzfiVarZzm3.zzd();
                    SharedPreferences.Editor editorEdit = zzfiVarZzm3.zza().edit();
                    editorEdit.clear();
                    editorEdit.apply();
                    if (boolZzd != null) {
                        zzfiVarZzm3.zzh(boolZzd);
                    }
                    zzi().zzj();
                    this.zzy.zzs();
                    this.zzy.zzr();
                    zzm().zzc.zzb(this.zzc);
                    zzm().zze.zzb(null);
                }
                zzfi zzfiVarZzm4 = zzm();
                String strZzm2 = zzh().zzm();
                zzfiVarZzm4.zzg();
                SharedPreferences.Editor editorEdit2 = zzfiVarZzm4.zza().edit();
                editorEdit2.putString("gmp_app_id", strZzm2);
                editorEdit2.apply();
                zzfi zzfiVarZzm5 = zzm();
                String strZzk2 = zzh().zzk();
                zzfiVarZzm5.zzg();
                SharedPreferences.Editor editorEdit3 = zzfiVarZzm5.zza().edit();
                editorEdit3.putString("admob_app_id", strZzk2);
                editorEdit3.apply();
            }
            if (!zzm().zzc().zzj(zzha.ANALYTICS_STORAGE)) {
                zzm().zze.zzb(null);
            }
            zzq().zzO(zzm().zze.zza());
            zzos.zzc();
            if (this.zzk.zzs(null, zzeg.zzae)) {
                try {
                    zzv().zzt.zze.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(zzm().zzp.zza())) {
                        zzaA().zzk().zza("Remote config removed with active feature rollouts");
                        zzm().zzp.zzb(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(zzh().zzm()) || !TextUtils.isEmpty(zzh().zzk())) {
                boolean zZzJ = zzJ();
                if (!zzm().zzj() && !this.zzk.zzv()) {
                    zzm().zzi(!zZzJ);
                }
                if (zZzJ) {
                    zzq().zzz();
                }
                zzu().zza.zza();
                zzt().zzu(new AtomicReference());
                zzt().zzH(zzm().zzs.zza());
            }
        } else if (zzJ()) {
            if (!zzv().zzae("android.permission.INTERNET")) {
                DM.w(this, "App is missing INTERNET permission");
            }
            if (!zzv().zzae("android.permission.ACCESS_NETWORK_STATE")) {
                DM.w(this, "App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!Wrappers.packageManager(this.zze).isCallerInstantApp() && !this.zzk.zzx()) {
                if (!zzlp.zzal(this.zze)) {
                    DM.w(this, "AppMeasurementReceiver not registered/enabled");
                }
                if (!zzlp.zzam(this.zze, false)) {
                    DM.w(this, "AppMeasurementService not registered/enabled");
                }
            }
            DM.w(this, "Uploading is not possible. App measurement disabled");
        }
        zzm().zzi.zza(true);
    }

    @WorkerThread
    public final boolean zzI() {
        return this.zzE != null && this.zzE.booleanValue();
    }

    @WorkerThread
    public final boolean zzJ() {
        return zza() == 0;
    }

    @WorkerThread
    public final boolean zzK() {
        zzaB().zzg();
        return this.zzF;
    }

    public final boolean zzL() {
        return TextUtils.isEmpty(this.zzf);
    }

    @WorkerThread
    public final boolean zzM() {
        if (!this.zzB) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzaB().zzg();
        Boolean bool = this.zzC;
        if (bool == null || this.zzD == 0 || (!bool.booleanValue() && Math.abs(this.zzr.elapsedRealtime() - this.zzD) > 1000)) {
            this.zzD = this.zzr.elapsedRealtime();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(zzv().zzae("android.permission.INTERNET") && zzv().zzae("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zze).isCallerInstantApp() || this.zzk.zzx() || (zzlp.zzal(this.zze) && zzlp.zzam(this.zze, false))));
            this.zzC = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!zzv().zzY(zzh().zzm(), zzh().zzk()) && TextUtils.isEmpty(zzh().zzk())) {
                    z = false;
                }
                this.zzC = Boolean.valueOf(z);
            }
        }
        return this.zzC.booleanValue();
    }

    public final boolean zzN() {
        return this.zzi;
    }

    @WorkerThread
    public final int zza() {
        zzaB().zzg();
        if (this.zzk.zzv()) {
            return 1;
        }
        Boolean bool = this.zzb;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        zzaB().zzg();
        if (!this.zzF) {
            return 8;
        }
        Boolean boolZzd = zzm().zzd();
        if (boolZzd != null) {
            return boolZzd.booleanValue() ? 0 : 3;
        }
        zzag zzagVar = this.zzk;
        zzab zzabVar = zzagVar.zzt.zzj;
        Boolean boolZzk = zzagVar.zzk("firebase_analytics_collection_enabled");
        if (boolZzk != null) {
            return boolZzk.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zza;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        return (this.zzE == null || this.zzE.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzet zzaA() {
        zzR(this.zzm);
        return this.zzm;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzga zzaB() {
        zzR(this.zzn);
        return this.zzn;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Context zzaw() {
        return this.zze;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Clock zzax() {
        return this.zzr;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzab zzay() {
        return this.zzj;
    }

    public final zzd zzd() {
        zzd zzdVar = this.zzu;
        if (zzdVar != null) {
            return zzdVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final zzag zzf() {
        return this.zzk;
    }

    public final zzao zzg() {
        zzR(this.zzz);
        return this.zzz;
    }

    public final zzek zzh() {
        zzQ(this.zzA);
        return this.zzA;
    }

    public final zzem zzi() {
        zzQ(this.zzx);
        return this.zzx;
    }

    public final zzeo zzj() {
        return this.zzq;
    }

    public final zzet zzl() {
        zzet zzetVar = this.zzm;
        if (zzetVar == null || !zzetVar.zzy()) {
            return null;
        }
        return zzetVar;
    }

    public final zzfi zzm() {
        zzP(this.zzl);
        return this.zzl;
    }

    public final zzga zzo() {
        return this.zzn;
    }

    public final zzik zzq() {
        zzQ(this.zzt);
        return this.zzt;
    }

    public final zzio zzr() {
        zzR(this.zzv);
        return this.zzv;
    }

    public final zziz zzs() {
        zzQ(this.zzs);
        return this.zzs;
    }

    public final zzjz zzt() {
        zzQ(this.zzy);
        return this.zzy;
    }

    public final zzkp zzu() {
        zzQ(this.zzo);
        return this.zzo;
    }

    public final zzlp zzv() {
        zzP(this.zzp);
        return this.zzp;
    }

    public final String zzw() {
        return this.zzf;
    }

    public final String zzx() {
        return this.zzg;
    }

    public final String zzy() {
        return this.zzh;
    }

    public final String zzz() {
        return this.zzw;
    }
}
