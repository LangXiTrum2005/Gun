package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzef {
    private static volatile zzef zzc;
    protected final Clock zza;
    protected final ExecutorService zzb;
    private final String zzd;
    private final AppMeasurementSdk zze;

    @GuardedBy("listenerList")
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final String zzi;
    private volatile zzcc zzj;

    public zzef(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !zzW(str2, str3)) {
            this.zzd = "FA";
        } else {
            this.zzd = str;
        }
        this.zza = DefaultClock.getInstance();
        zzbx.zza();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzdi(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzb = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.zziq.zzc(context, "google_app_id", com.google.android.gms.measurement.internal.zzfv.zza(context)) != null && !zzS()) {
                this.zzi = null;
                this.zzh = true;
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (zzW(str2, str3)) {
            this.zzi = str2;
        } else {
            this.zzi = "fa";
        }
        zzV(new zzcx(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new zzee(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT(Exception exc, boolean z, boolean z2) {
        this.zzh |= z;
        if (!z && z2) {
            zzB(5, "Error with data collection. Data lost.", exc, null, null);
        }
    }

    private final void zzU(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        zzV(new zzds(this, l, str, str2, bundle, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzV(zzdu zzduVar) {
        this.zzb.execute(zzduVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzW(String str, String str2) {
        return (str2 == null || str == null || zzS()) ? false : true;
    }

    public static zzef zzg(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (zzef.class) {
                try {
                    if (zzc == null) {
                        zzc = new zzef(context, str, str2, str3, bundle);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzc;
    }

    public final void zzA(String str, String str2, Bundle bundle, long j) {
        zzU(str, str2, bundle, true, false, Long.valueOf(j));
    }

    public final void zzB(int i, String str, Object obj, Object obj2, Object obj3) {
        zzV(new zzdg(this, false, 5, str, obj, null, null));
    }

    public final void zzC(com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        Preconditions.checkNotNull(zzhgVar);
        synchronized (this.zzf) {
            for (int i = 0; i < this.zzf.size(); i++) {
                try {
                    if (zzhgVar.equals(((Pair) this.zzf.get(i)).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdw zzdwVar = new zzdw(zzhgVar);
            this.zzf.add(new Pair(zzhgVar, zzdwVar));
            if (this.zzj != null) {
                try {
                    this.zzj.registerOnMeasurementEventListener(zzdwVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            zzV(new zzdq(this, zzdwVar));
        }
    }

    public final void zzD() {
        zzV(new zzcv(this));
    }

    public final void zzE(Bundle bundle) {
        zzV(new zzcn(this, bundle));
    }

    public final void zzF(Bundle bundle) {
        zzV(new zzct(this, bundle));
    }

    public final void zzG(Bundle bundle) {
        zzV(new zzcu(this, bundle));
    }

    public final void zzH(Activity activity, String str, String str2) {
        zzV(new zzcr(this, activity, str, str2));
    }

    public final void zzI(boolean z) {
        zzV(new zzdn(this, z));
    }

    public final void zzJ(Bundle bundle) {
        zzV(new zzdo(this, bundle));
    }

    public final void zzK(com.google.android.gms.measurement.internal.zzhf zzhfVar) {
        zzdv zzdvVar = new zzdv(zzhfVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzdvVar);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        zzV(new zzdp(this, zzdvVar));
    }

    public final void zzL(Boolean bool) {
        zzV(new zzcs(this, bool));
    }

    public final void zzM(long j) {
        zzV(new zzcw(this, j));
    }

    public final void zzN(String str) {
        zzV(new zzcq(this, str));
    }

    public final void zzO(String str, String str2, Object obj, boolean z) {
        zzV(new zzdt(this, str, str2, obj, z));
    }

    public final void zzP(com.google.android.gms.measurement.internal.zzhg zzhgVar) {
        Pair pair;
        Preconditions.checkNotNull(zzhgVar);
        synchronized (this.zzf) {
            int i = 0;
            while (true) {
                try {
                    if (i >= this.zzf.size()) {
                        pair = null;
                        break;
                    } else {
                        if (zzhgVar.equals(((Pair) this.zzf.get(i)).first)) {
                            pair = (Pair) this.zzf.get(i);
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (pair == null) {
                return;
            }
            this.zzf.remove(pair);
            zzdw zzdwVar = (zzdw) pair.second;
            if (this.zzj != null) {
                try {
                    this.zzj.unregisterOnMeasurementEventListener(zzdwVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            zzV(new zzdr(this, zzdwVar));
        }
    }

    public final boolean zzS() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, zzef.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int zza(String str) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdj(this, str, zzbzVar));
        Integer num = (Integer) zzbz.zzf(zzbzVar.zzb(WorkRequest.MIN_BACKOFF_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long zzb() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdc(this, zzbzVar));
        Long lZzc = zzbzVar.zzc(500L);
        if (lZzc != null) {
            return lZzc.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i = this.zzg + 1;
        this.zzg = i;
        return jNextLong + ((long) i);
    }

    public final Bundle zzc(Bundle bundle, boolean z) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdh(this, bundle, zzbzVar));
        if (z) {
            return zzbzVar.zzb(5000L);
        }
        return null;
    }

    public final AppMeasurementSdk zzd() {
        return this.zze;
    }

    public final zzcc zzf(Context context, boolean z) {
        try {
            return zzcb.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            zzT(e, true, false);
            return null;
        }
    }

    @WorkerThread
    public final Long zzh() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdl(this, zzbzVar));
        return zzbzVar.zzc(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final Object zzi(int i) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdm(this, zzbzVar, i));
        return zzbz.zzf(zzbzVar.zzb(MBInterstitialActivity.WEB_LOAD_TIME), Object.class);
    }

    public final String zzk() {
        return this.zzi;
    }

    @WorkerThread
    public final String zzl() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdk(this, zzbzVar));
        return zzbzVar.zzd(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
    }

    public final String zzm() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdb(this, zzbzVar));
        return zzbzVar.zzd(50L);
    }

    public final String zzn() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzde(this, zzbzVar));
        return zzbzVar.zzd(500L);
    }

    public final String zzo() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdd(this, zzbzVar));
        return zzbzVar.zzd(500L);
    }

    public final String zzp() {
        zzbz zzbzVar = new zzbz();
        zzV(new zzda(this, zzbzVar));
        return zzbzVar.zzd(500L);
    }

    public final List zzq(String str, String str2) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzcp(this, str, str2, zzbzVar));
        List list = (List) zzbz.zzf(zzbzVar.zzb(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map zzr(String str, String str2, boolean z) {
        zzbz zzbzVar = new zzbz();
        zzV(new zzdf(this, str, str2, z, zzbzVar));
        Bundle bundleZzb = zzbzVar.zzb(5000L);
        if (bundleZzb == null || bundleZzb.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleZzb.size());
        for (String str3 : bundleZzb.keySet()) {
            Object obj = bundleZzb.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void zzv(String str) {
        zzV(new zzcy(this, str));
    }

    public final void zzw(String str, String str2, Bundle bundle) {
        zzV(new zzco(this, str, str2, bundle));
    }

    public final void zzx(String str) {
        zzV(new zzcz(this, str));
    }

    public final void zzy(@NonNull String str, Bundle bundle) {
        zzU(null, str, bundle, false, true, null);
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        zzU(str, str2, bundle, true, true, null);
    }
}
