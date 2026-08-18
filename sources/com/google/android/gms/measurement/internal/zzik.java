package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.measurement.zzos;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzik extends zzf {

    @VisibleForTesting
    protected zzij zza;
    final zzs zzb;

    @VisibleForTesting
    protected boolean zzc;
    private zzhf zzd;
    private final Set zze;
    private boolean zzf;
    private final AtomicReference zzg;
    private final Object zzh;

    @GuardedBy("consentLock")
    private zzhb zzi;
    private final AtomicLong zzj;
    private long zzk;
    private final zzlo zzl;

    public zzik(zzgd zzgdVar) {
        super(zzgdVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzl = new zzhz(this);
        this.zzg = new AtomicReference();
        this.zzi = zzhb.zza;
        this.zzk = -1L;
        this.zzj = new AtomicLong(0L);
        this.zzb = new zzs(zzgdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzaa(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzt.zzm().zzh(bool);
        if (z) {
            zzfi zzfiVarZzm = this.zzt.zzm();
            zzgd zzgdVar = zzfiVarZzm.zzt;
            zzfiVarZzm.zzg();
            SharedPreferences.Editor editorEdit = zzfiVarZzm.zza().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.zzt.zzK() || !(bool == null || bool.booleanValue())) {
            zzab();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzab() {
        zzg();
        String strZza = this.zzt.zzm().zzh.zza();
        if (strZza != null) {
            if ("unset".equals(strZza)) {
                zzY(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", null, this.zzt.zzax().currentTimeMillis());
            } else {
                zzY(MBridgeConstans.DYNAMIC_VIEW_WX_APP, "_npa", Long.valueOf(true != "true".equals(strZza) ? 0L : 1L), this.zzt.zzax().currentTimeMillis());
            }
        }
        if (!this.zzt.zzJ() || !this.zzc) {
            this.zzt.zzaA().zzc().zza("Updating Scion state (FE)");
            this.zzt.zzt().zzI();
            return;
        }
        this.zzt.zzaA().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzz();
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzaf)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzt.zzaB().zzp(new zzhn(this));
    }

    public static /* bridge */ /* synthetic */ void zzv(zzik zzikVar, zzhb zzhbVar, zzhb zzhbVar2) {
        boolean z;
        zzha[] zzhaVarArr = {zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            zzha zzhaVar = zzhaVarArr[i];
            if (!zzhbVar2.zzj(zzhaVar) && zzhbVar.zzj(zzhaVar)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zZzn = zzhbVar.zzn(zzhbVar2, zzha.ANALYTICS_STORAGE, zzha.AD_STORAGE);
        if (z || zZzn) {
            zzikVar.zzt.zzh().zzo();
        }
    }

    public static /* synthetic */ void zzw(zzik zzikVar, zzhb zzhbVar, long j, boolean z, boolean z2) {
        zzikVar.zzg();
        zzikVar.zza();
        zzhb zzhbVarZzc = zzikVar.zzt.zzm().zzc();
        if (j <= zzikVar.zzk && zzhb.zzk(zzhbVarZzc.zza(), zzhbVar.zza())) {
            zzikVar.zzt.zzaA().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzhbVar);
            return;
        }
        zzfi zzfiVarZzm = zzikVar.zzt.zzm();
        zzgd zzgdVar = zzfiVarZzm.zzt;
        zzfiVarZzm.zzg();
        int iZza = zzhbVar.zza();
        if (!zzfiVarZzm.zzl(iZza)) {
            zzikVar.zzt.zzaA().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(zzhbVar.zza()));
            return;
        }
        SharedPreferences.Editor editorEdit = zzfiVarZzm.zza().edit();
        editorEdit.putString("consent_settings", zzhbVar.zzi());
        editorEdit.putInt("consent_source", iZza);
        editorEdit.apply();
        zzikVar.zzk = j;
        zzikVar.zzt.zzt().zzF(z);
        if (z2) {
            zzikVar.zzt.zzt().zzu(new AtomicReference());
        }
    }

    public final void zzA(String str, String str2, Bundle bundle) {
        long jCurrentTimeMillis = this.zzt.zzax().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzt.zzaB().zzp(new zzhu(this, bundle2));
    }

    public final void zzB() {
        if (!(this.zzt.zzaw().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzt.zzaw().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzt.zzm().zzs.zzb(new Bundle());
            return;
        }
        Bundle bundleZza = this.zzt.zzm().zzs.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzt.zzv().zzag(obj)) {
                    this.zzt.zzv().zzO(this.zzl, null, 27, null, null, 0);
                }
                this.zzt.zzaA().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzlp.zzaj(str)) {
                this.zzt.zzaA().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                bundleZza.remove(str);
            } else {
                zzlp zzlpVarZzv = this.zzt.zzv();
                this.zzt.zzf();
                if (zzlpVarZzv.zzab("param", str, 100, obj)) {
                    this.zzt.zzv().zzP(bundleZza, str, obj);
                }
            }
        }
        this.zzt.zzv();
        int iZzc = this.zzt.zzf().zzc();
        if (bundleZza.size() > iZzc) {
            int i = 0;
            for (String str2 : new TreeSet(bundleZza.keySet())) {
                i++;
                if (i > iZzc) {
                    bundleZza.remove(str2);
                }
            }
            this.zzt.zzv().zzO(this.zzl, null, 26, null, null, 0);
            this.zzt.zzaA().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzt.zzm().zzs.zzb(bundleZza);
        this.zzt.zzt().zzH(bundleZza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.zzt.zzs().zzx(bundle2, j);
        } else {
            zzM(str == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : str, str2, j, bundle2, z2, !z2 || this.zzd == null || zzlp.zzaj(str2), z, null);
        }
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzgd.zzO();
        zzM("auto", str2, this.zzt.zzax().currentTimeMillis(), bundle, false, true, true, str3);
    }

    @WorkerThread
    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzt.zzax().currentTimeMillis(), bundle);
    }

    @WorkerThread
    public final void zzH(String str, String str2, long j, Bundle bundle) {
        zzg();
        zzI(str, str2, j, bundle, true, this.zzd == null || zzlp.zzaj(str2), true, null);
    }

    @WorkerThread
    public final void zzI(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        long j2;
        Bundle[] bundleArr;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzt.zzJ()) {
            this.zzt.zzaA().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List listZzn = this.zzt.zzh().zzn();
        if (listZzn != null && !listZzn.contains(str2)) {
            this.zzt.zzaA().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzt.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzt.zzaw().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, Context.class).invoke(null, this.zzt.zzaw());
                } catch (Exception e) {
                    this.zzt.zzaA().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.zzt.zzaA().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzt.zzay();
            zzY("auto", "_lgclid", bundle.getString("gclid"), this.zzt.zzax().currentTimeMillis());
        }
        this.zzt.zzay();
        if (z && zzlp.zzan(str2)) {
            this.zzt.zzv().zzL(bundle, this.zzt.zzm().zzs.zza());
        }
        if (!z3) {
            this.zzt.zzay();
            if (!"_iap".equals(str2)) {
                zzlp zzlpVarZzv = this.zzt.zzv();
                int i = 2;
                if (zzlpVarZzv.zzad(NotificationCompat.CATEGORY_EVENT, str2)) {
                    if (zzlpVarZzv.zzaa(NotificationCompat.CATEGORY_EVENT, zzhc.zza, zzhc.zzb, str2)) {
                        zzlpVarZzv.zzt.zzf();
                        if (zzlpVarZzv.zzZ(NotificationCompat.CATEGORY_EVENT, 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                }
                if (i != 0) {
                    this.zzt.zzaA().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                    zzlp zzlpVarZzv2 = this.zzt.zzv();
                    this.zzt.zzf();
                    this.zzt.zzv().zzO(this.zzl, null, i, "_ev", zzlpVarZzv2.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.zzt.zzay();
        zzir zzirVarZzj = this.zzt.zzs().zzj(false);
        if (zzirVarZzj != null && !bundle.containsKey("_sc")) {
            zzirVarZzj.zzd = true;
        }
        zzlp.zzK(zzirVarZzj, bundle, z && !z3);
        boolean zEquals = "am".equals(str);
        boolean zZzaj = zzlp.zzaj(str2);
        if (!z || this.zzd == null || zZzaj) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                this.zzt.zzaA().zzc().zzc("Passing event to registered event handler (FE)", this.zzt.zzj().zzd(str2), this.zzt.zzj().zzb(bundle));
                Preconditions.checkNotNull(this.zzd);
                this.zzd.interceptEvent(str, str2, bundle, j);
                return;
            }
            z4 = true;
        }
        if (this.zzt.zzM()) {
            int iZzh = this.zzt.zzv().zzh(str2);
            if (iZzh != 0) {
                this.zzt.zzaA().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzt.zzj().zzd(str2));
                zzlp zzlpVarZzv3 = this.zzt.zzv();
                this.zzt.zzf();
                this.zzt.zzv().zzO(this.zzl, str3, iZzh, "_ev", zzlpVarZzv3.zzD(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleZzu = this.zzt.zzv().zzu(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(bundleZzu);
            this.zzt.zzay();
            if (this.zzt.zzs().zzj(false) != null && "_ae".equals(str2)) {
                zzkn zzknVar = this.zzt.zzu().zzb;
                long jElapsedRealtime = zzknVar.zzc.zzt.zzax().elapsedRealtime();
                long j3 = jElapsedRealtime - zzknVar.zzb;
                zzknVar.zzb = jElapsedRealtime;
                if (j3 > 0) {
                    this.zzt.zzv().zzI(bundleZzu, j3);
                }
            }
            zzos.zzc();
            if (this.zzt.zzf().zzs(null, zzeg.zzae)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    zzlp zzlpVarZzv4 = this.zzt.zzv();
                    String string = bundleZzu.getString("_ffr");
                    if (Strings.isEmptyOrWhitespace(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (zzln.zza(string, zzlpVarZzv4.zzt.zzm().zzp.zza())) {
                        zzlpVarZzv4.zzt.zzaA().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzlpVarZzv4.zzt.zzm().zzp.zzb(string);
                } else if ("_ae".equals(str2)) {
                    String strZza = this.zzt.zzv().zzt.zzm().zzp.zza();
                    if (!TextUtils.isEmpty(strZza)) {
                        bundleZzu.putString("_ffr", strZza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleZzu);
            boolean zZzo = this.zzt.zzf().zzs(null, zzeg.zzaG) ? this.zzt.zzu().zzo() : this.zzt.zzm().zzm.zzb();
            if (this.zzt.zzm().zzj.zza() > 0 && this.zzt.zzm().zzk(j) && zZzo) {
                AbstractC3888ke0.p(this.zzt, "Current session is expired, remove the session number, ID, and engagement time");
                j2 = 0;
                zzY("auto", "_sid", null, this.zzt.zzax().currentTimeMillis());
                zzY("auto", "_sno", null, this.zzt.zzax().currentTimeMillis());
                zzY("auto", "_se", null, this.zzt.zzax().currentTimeMillis());
                this.zzt.zzm().zzk.zzb(0L);
            } else {
                j2 = 0;
            }
            if (bundleZzu.getLong("extend_session", j2) == 1) {
                AbstractC3888ke0.p(this.zzt, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzt.zzu().zza.zzb(j, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleZzu.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str4 = (String) arrayList2.get(i2);
                if (str4 != null) {
                    this.zzt.zzv();
                    Object obj = bundleZzu.get(str4);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleZzu.putParcelableArray(str4, bundleArr);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                Bundle bundleZzt = (Bundle) arrayList.get(i3);
                String str5 = i3 != 0 ? "_ep" : str2;
                bundleZzt.putString("_o", str);
                if (z2) {
                    bundleZzt = this.zzt.zzv().zzt(bundleZzt);
                }
                Bundle bundle2 = bundleZzt;
                this.zzt.zzt().zzA(new zzau(str5, new zzas(bundle2), str, j), str3);
                if (!z4) {
                    Iterator it = this.zze.iterator();
                    while (it.hasNext()) {
                        ((zzhg) it.next()).onEvent(str, str2, new Bundle(bundle2), j);
                    }
                }
                i3++;
            }
            this.zzt.zzay();
            if (this.zzt.zzs().zzj(false) == null || !"_ae".equals(str2)) {
                return;
            }
            this.zzt.zzu().zzb.zzd(true, true, this.zzt.zzax().elapsedRealtime());
        }
    }

    public final void zzJ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.add(zzhgVar)) {
            return;
        }
        DM.C(this.zzt, "OnEventListener already registered");
    }

    public final void zzK(long j) {
        this.zzg.set(null);
        this.zzt.zzaB().zzp(new zzhs(this, j));
    }

    public final void zzL(long j, boolean z) {
        zzg();
        zza();
        this.zzt.zzaA().zzc().zza("Resetting analytics data (FE)");
        zzkp zzkpVarZzu = this.zzt.zzu();
        zzkpVarZzu.zzg();
        zzkpVarZzu.zzb.zza();
        zzqu.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzan)) {
            this.zzt.zzh().zzo();
        }
        boolean zZzJ = this.zzt.zzJ();
        zzfi zzfiVarZzm = this.zzt.zzm();
        zzfiVarZzm.zzc.zzb(j);
        if (!TextUtils.isEmpty(zzfiVarZzm.zzt.zzm().zzp.zza())) {
            zzfiVarZzm.zzp.zzb(null);
        }
        zzph.zzc();
        zzag zzagVarZzf = zzfiVarZzm.zzt.zzf();
        zzef zzefVar = zzeg.zzaf;
        if (zzagVarZzf.zzs(null, zzefVar)) {
            zzfiVarZzm.zzj.zzb(0L);
        }
        zzfiVarZzm.zzk.zzb(0L);
        if (!zzfiVarZzm.zzt.zzf().zzv()) {
            zzfiVarZzm.zzi(!zZzJ);
        }
        zzfiVarZzm.zzq.zzb(null);
        zzfiVarZzm.zzr.zzb(0L);
        zzfiVarZzm.zzs.zzb(null);
        if (z) {
            this.zzt.zzt().zzC();
        }
        zzph.zzc();
        if (this.zzt.zzf().zzs(null, zzefVar)) {
            this.zzt.zzu().zza.zza();
        }
        this.zzc = !zZzJ;
    }

    public final void zzM(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.zzt.zzaB().zzp(new zzhp(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void zzN(String str, String str2, long j, Object obj) {
        this.zzt.zzaB().zzp(new zzhq(this, str, str2, obj, j));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzt.zzax().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            DM.C(this.zzt, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgz.zza(bundle2, "app_id", String.class, null);
        zzgz.zza(bundle2, "origin", String.class, null);
        zzgz.zza(bundle2, "name", String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgz.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString("origin"));
        Preconditions.checkNotNull(bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (this.zzt.zzv().zzl(string) != 0) {
            this.zzt.zzaA().zzd().zzb("Invalid conditional user property name", this.zzt.zzj().zzf(string));
            return;
        }
        if (this.zzt.zzv().zzd(string, obj) != 0) {
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        Object objZzB = this.zzt.zzv().zzB(string, obj);
        if (objZzB == null) {
            this.zzt.zzaA().zzd().zzc("Unable to normalize conditional user property value", this.zzt.zzj().zzf(string), obj);
            return;
        }
        zzgz.zzb(bundle2, objZzB);
        long j2 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
        if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
            this.zzt.zzf();
            if (j2 > 15552000000L || j2 < 1) {
                this.zzt.zzaA().zzd().zzc("Invalid conditional user property timeout", this.zzt.zzj().zzf(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
        this.zzt.zzf();
        if (j3 > 15552000000L || j3 < 1) {
            this.zzt.zzaA().zzd().zzc("Invalid conditional user property time to live", this.zzt.zzj().zzf(string), Long.valueOf(j3));
        } else {
            this.zzt.zzaB().zzp(new zzht(this, bundle2));
        }
    }

    public final void zzR(zzhb zzhbVar, long j) {
        zzhb zzhbVar2;
        boolean z;
        zzhb zzhbVar3;
        boolean z2;
        boolean zZzm;
        zza();
        int iZza = zzhbVar.zza();
        if (iZza != -10 && zzhbVar.zzf() == null && zzhbVar.zzg() == null) {
            this.zzt.zzaA().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            try {
                zzhbVar2 = this.zzi;
                z = false;
                if (zzhb.zzk(iZza, zzhbVar2.zza())) {
                    zZzm = zzhbVar.zzm(this.zzi);
                    zzha zzhaVar = zzha.ANALYTICS_STORAGE;
                    if (zzhbVar.zzj(zzhaVar) && !this.zzi.zzj(zzhaVar)) {
                        z = true;
                    }
                    zzhb zzhbVarZze = zzhbVar.zze(this.zzi);
                    this.zzi = zzhbVarZze;
                    zzhbVar3 = zzhbVarZze;
                    z2 = z;
                    z = true;
                } else {
                    zzhbVar3 = zzhbVar;
                    z2 = false;
                    zZzm = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            this.zzt.zzaA().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzhbVar3);
            return;
        }
        long andIncrement = this.zzj.getAndIncrement();
        if (zZzm) {
            this.zzg.set(null);
            this.zzt.zzaB().zzq(new zzif(this, zzhbVar3, j, andIncrement, z2, zzhbVar2));
            return;
        }
        zzig zzigVar = new zzig(this, zzhbVar3, andIncrement, z2, zzhbVar2);
        if (iZza == 30 || iZza == -10) {
            this.zzt.zzaB().zzq(zzigVar);
        } else {
            this.zzt.zzaB().zzp(zzigVar);
        }
    }

    public final void zzS(Bundle bundle, int i, long j) {
        zza();
        String strZzh = zzhb.zzh(bundle);
        if (strZzh != null) {
            this.zzt.zzaA().zzl().zzb("Ignoring invalid consent setting", strZzh);
            this.zzt.zzaA().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzR(zzhb.zzb(bundle, i), j);
    }

    @WorkerThread
    public final void zzT(zzhf zzhfVar) {
        zzhf zzhfVar2;
        zzg();
        zza();
        if (zzhfVar != null && zzhfVar != (zzhfVar2 = this.zzd)) {
            Preconditions.checkState(zzhfVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzhfVar;
    }

    public final void zzU(Boolean bool) {
        zza();
        this.zzt.zzaB().zzp(new zzie(this, bool));
    }

    @WorkerThread
    public final void zzV(zzhb zzhbVar) {
        zzg();
        boolean z = (zzhbVar.zzj(zzha.ANALYTICS_STORAGE) && zzhbVar.zzj(zzha.AD_STORAGE)) || this.zzt.zzt().zzM();
        if (z != this.zzt.zzK()) {
            this.zzt.zzG(z);
            zzfi zzfiVarZzm = this.zzt.zzm();
            zzgd zzgdVar = zzfiVarZzm.zzt;
            zzfiVarZzm.zzg();
            Boolean boolValueOf = zzfiVarZzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzfiVarZzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                zzaa(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzW(String str, String str2, Object obj, boolean z) {
        zzX("auto", "_ldl", obj, true, this.zzt.zzax().currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    public final void zzX(String str, String str2, Object obj, boolean z, long j) {
        int iZzl;
        if (z) {
            iZzl = this.zzt.zzv().zzl(str2);
        } else {
            zzlp zzlpVarZzv = this.zzt.zzv();
            if (!zzlpVarZzv.zzad("user property", str2)) {
                iZzl = 6;
            } else if (zzlpVarZzv.zzaa("user property", zzhe.zza, null, str2)) {
                zzlpVarZzv.zzt.zzf();
                if (zzlpVarZzv.zzZ("user property", 24, str2)) {
                    iZzl = 0;
                } else {
                    iZzl = 6;
                }
            } else {
                iZzl = 15;
            }
        }
        if (iZzl != 0) {
            zzlp zzlpVarZzv2 = this.zzt.zzv();
            this.zzt.zzf();
            this.zzt.zzv().zzO(this.zzl, null, iZzl, "_ev", zzlpVarZzv2.zzD(str2, 24, true), str2 != null ? str2.length() : 0);
            return;
        }
        String str3 = str == null ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : str;
        if (obj == null) {
            zzN(str3, str2, j, null);
            return;
        }
        int iZzd = this.zzt.zzv().zzd(str2, obj);
        if (iZzd != 0) {
            zzlp zzlpVarZzv3 = this.zzt.zzv();
            this.zzt.zzf();
            this.zzt.zzv().zzO(this.zzl, null, iZzd, "_ev", zzlpVarZzv3.zzD(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
        } else {
            Object objZzB = this.zzt.zzv().zzB(str2, obj);
            if (objZzB != null) {
                zzN(str3, str2, j, objZzB);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    @WorkerThread
    public final void zzY(String str, String str2, Object obj, long j) {
        String str3;
        Object obj2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zza();
        if (!"allow_personalized_ads".equals(str2)) {
            str3 = str2;
            obj2 = obj;
        } else if (obj instanceof String) {
            String str4 = (String) obj;
            if (!TextUtils.isEmpty(str4)) {
                long j2 = true != "false".equals(str4.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                Long lValueOf = Long.valueOf(j2);
                this.zzt.zzm().zzh.zzb(j2 == 1 ? "true" : "false");
                str3 = "_npa";
                obj2 = lValueOf;
            } else if (obj == null) {
                this.zzt.zzm().zzh.zzb("unset");
                obj2 = obj;
                str3 = "_npa";
            } else {
                str3 = str2;
                obj2 = obj;
            }
        } else if (obj == null) {
            this.zzt.zzm().zzh.zzb("unset");
            obj2 = obj;
            str3 = "_npa";
        } else {
            str3 = str2;
            obj2 = obj;
        }
        if (!this.zzt.zzJ()) {
            AbstractC3888ke0.p(this.zzt, "User property not set since app measurement is disabled");
        } else if (this.zzt.zzM()) {
            this.zzt.zzt().zzK(new zzlk(str3, j, obj2, str));
        }
    }

    public final void zzZ(zzhg zzhgVar) {
        zza();
        Preconditions.checkNotNull(zzhgVar);
        if (this.zze.remove(zzhgVar)) {
            return;
        }
        DM.C(this.zzt, "OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzt.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzt.zzaB().zzd(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "boolean test flag value", new zzhw(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzt.zzaB().zzd(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "double test flag value", new zzid(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzt.zzaB().zzd(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "int test flag value", new zzic(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzt.zzaB().zzd(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "long test flag value", new zzib(this, atomicReference));
    }

    public final String zzo() {
        return (String) this.zzg.get();
    }

    public final String zzp() {
        zzir zzirVarZzi = this.zzt.zzs().zzi();
        if (zzirVarZzi != null) {
            return zzirVarZzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzir zzirVarZzi = this.zzt.zzs().zzi();
        if (zzirVarZzi != null) {
            return zzirVarZzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzt.zzaB().zzd(atomicReference, MBInterstitialActivity.WEB_LOAD_TIME, "String test flag value", new zzia(this, atomicReference));
    }

    public final ArrayList zzs(String str, String str2) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get conditional user properties", new zzhv(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return zzlp.zzH(list);
        }
        this.zzt.zzaA().zzd().zzb("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final List zzt(boolean z) {
        zza();
        AbstractC3888ke0.p(this.zzt, "Getting user properties (FE)");
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhr(this, atomicReference, z));
        List list = (List) atomicReference.get();
        if (list != null) {
            return list;
        }
        this.zzt.zzaA().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
        return Collections.emptyList();
    }

    public final Map zzu(String str, String str2, boolean z) {
        if (this.zzt.zzaB().zzs()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzt.zzay();
        if (zzab.zza()) {
            this.zzt.zzaA().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzt.zzaB().zzd(atomicReference, 5000L, "get user properties", new zzhx(this, atomicReference, null, str, str2, z));
        List<zzlk> list = (List) atomicReference.get();
        if (list == null) {
            this.zzt.zzaA().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (zzlk zzlkVar : list) {
            Object objZza = zzlkVar.zza();
            if (objZza != null) {
                arrayMap.put(zzlkVar.zzb, objZza);
            }
        }
        return arrayMap;
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zza();
        if (this.zzt.zzM()) {
            if (this.zzt.zzf().zzs(null, zzeg.zzZ)) {
                zzag zzagVarZzf = this.zzt.zzf();
                zzagVarZzf.zzt.zzay();
                Boolean boolZzk = zzagVarZzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (boolZzk != null && boolZzk.booleanValue()) {
                    this.zzt.zzaA().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhm
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzik zzikVar = this.zza;
                            zzikVar.zzg();
                            if (zzikVar.zzt.zzm().zzn.zzb()) {
                                zzikVar.zzt.zzaA().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jZza = zzikVar.zzt.zzm().zzo.zza();
                            zzikVar.zzt.zzm().zzo.zzb(1 + jZza);
                            zzikVar.zzt.zzf();
                            if (jZza < 5) {
                                zzikVar.zzt.zzE();
                            } else {
                                DM.C(zzikVar.zzt, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                zzikVar.zzt.zzm().zzn.zza(true);
                            }
                        }
                    });
                }
            }
            this.zzt.zzt().zzq();
            this.zzc = false;
            zzfi zzfiVarZzm = this.zzt.zzm();
            zzfiVarZzm.zzg();
            String string = zzfiVarZzm.zza().getString("previous_os_version", null);
            zzfiVarZzm.zzt.zzg().zzv();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = zzfiVarZzm.zza().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzt.zzg().zzv();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG("auto", "_ou", bundle);
        }
    }
}
