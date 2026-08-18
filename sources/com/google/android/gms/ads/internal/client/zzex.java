package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbln;
import com.google.android.gms.internal.ads.zzblv;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbow;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzfve;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzex {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzex zzb;
    private zzcz zzi;
    private final Object zzc = new Object();
    private final Object zzd = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private final Object zzh = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzj = null;

    @NonNull
    private RequestConfiguration zzk = new RequestConfiguration.Builder().build();
    private final ArrayList zze = new ArrayList();

    private zzex() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzA(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbln zzblnVar = (zzbln) it.next();
            map.put(zzblnVar.zza, new zzblv(zzblnVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzblnVar.zzd, zzblnVar.zzc));
        }
        return new zzblw(map);
    }

    private final void zzB(Context context, @Nullable String str) {
        try {
            zzbow.zza().zzb(context, null);
            this.zzi.zzk();
            this.zzi.zzl(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    private final void zzC(Context context) {
        if (this.zzi == null) {
            this.zzi = (zzcz) new zzav(zzbc.zza(), context).zzd(context, false);
        }
    }

    private final void zzD(@NonNull RequestConfiguration requestConfiguration) {
        try {
            this.zzi.zzu(new zzfv(requestConfiguration));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set request configuration parcel.", e);
        }
    }

    public static zzex zzf() {
        zzex zzexVar;
        synchronized (zzex.class) {
            try {
                if (zzb == null) {
                    zzb = new zzex();
                }
                zzexVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzexVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.ads.internal.client.zzq] */
    public static /* bridge */ /* synthetic */ Optional zzk(zzex zzexVar, zzft zzftVar) {
        String str = zzftVar.zza;
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return Optional.empty();
        }
        zzm zzmVar = zzftVar.zzc;
        final AdRequest.Builder builder = new AdRequest.Builder();
        List list = zzmVar.zze;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                builder.addKeyword((String) it.next());
            }
        }
        builder.zzc(zzmVar.zzm);
        for (String str2 : zzmVar.zzn.keySet()) {
            builder.addCustomTargeting(str2, zzmVar.zzn.getString(str2));
        }
        builder.setAdString(zzmVar.zzx);
        Optional.ofNullable(zzmVar.zzl).ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                builder.setContentUrl((String) obj);
            }
        });
        builder.setNeighboringContentUrls(zzmVar.zzv);
        builder.setRequestAgent(zzmVar.zzp);
        AdRequest adRequestBuild = builder.build();
        PreloadConfiguration.Builder builder2 = new PreloadConfiguration.Builder(str, adFormat);
        builder2.setAdRequest(adRequestBuild);
        builder2.setBufferSize(zzftVar.zzd);
        return Optional.of(builder2.build());
    }

    public final float zza() {
        synchronized (this.zzh) {
            zzcz zzczVar = this.zzi;
            float fZze = 1.0f;
            if (zzczVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzczVar.zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app volume.", e);
            }
            return fZze;
        }
    }

    @NonNull
    public final RequestConfiguration zzc() {
        return this.zzk;
    }

    public final InitializationStatus zze() {
        InitializationStatus initializationStatusZzA;
        synchronized (this.zzh) {
            try {
                Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    initializationStatusZzA = zzA(this.zzi.zzg());
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzem
                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            HashMap map = new HashMap();
                            map.put("com.google.android.gms.ads.MobileAds", new zzet(this.zza));
                            return map;
                        }
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return initializationStatusZzA;
    }

    /* JADX WARN: Type inference failed for: r12v28, types: [com.google.android.gms.ads.internal.client.zzen] */
    public final Status zzg(@NonNull Context context, @NonNull List list, @NonNull PreloadCallback preloadCallback) {
        boolean z;
        Status status;
        int bufferSize;
        int iIntValue;
        int iIntValue2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String strI = DM.i(String.valueOf(preloadConfiguration.getAdFormat()), "#", preloadConfiguration.getAdUnitId());
            map.put(strI, Integer.valueOf(((Integer) map.getOrDefault(strI, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                z = true;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (zza.contains(preloadConfiguration2.getAdFormat())) {
                map2.compute(adFormat, new BiFunction() { // from class: com.google.android.gms.ads.internal.client.zzen
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        Integer num = (Integer) obj2;
                        Set set = zzex.zza;
                        return Integer.valueOf(num != null ? 1 + num.intValue() : 1);
                    }
                });
                if (preloadConfiguration2.getBufferSize() > 15) {
                    Locale locale = Locale.US;
                    hashSet.add("Preload configurations' buffer size exceeds the maximum limit 15 for " + adFormat.name());
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    Locale locale2 = Locale.US;
                    hashSet.add("Preload configurations' buffer size less than 0 for " + adFormat.name());
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            }
            z = true;
        }
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AdFormat.APP_OPEN_AD, (Integer) zzbe.zzc().zza(zzbcl.zzeB)), new AbstractMap.SimpleEntry(AdFormat.INTERSTITIAL, (Integer) zzbe.zzc().zza(zzbcl.zzez)), new AbstractMap.SimpleEntry(AdFormat.REWARDED, (Integer) zzbe.zzc().zza(zzbcl.zzeA))};
        HashMap map3 = new HashMap(3);
        for (int i = 0; i < 3; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map3.put(key, value) != null) {
                key.toString();
                throw new IllegalArgumentException("duplicate key: ".concat(String.valueOf(key)));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map3);
        for (Map.Entry entry2 : map2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry2.getKey();
            int iIntValue3 = ((Integer) entry2.getValue()).intValue();
            Integer num = (Integer) mapUnmodifiableMap.getOrDefault(adFormat2, 0);
            if (iIntValue3 > num.intValue()) {
                Locale locale3 = Locale.US;
                hashSet.add("Preload configurations' size exceeds the maximum limit " + num + " for " + adFormat2.name());
                z = true;
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb.append((String) it4.next());
                if (it4.hasNext()) {
                    sb.append(", ");
                }
            }
            String string = sb.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzg(string);
            status = new Status(13, string);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        zzbcl.zza(context);
        synchronized (this.zzd) {
            try {
                ArrayList arrayList = new ArrayList();
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    PreloadConfiguration preloadConfiguration3 = (PreloadConfiguration) it5.next();
                    zzm zzmVarZza = zzr.zza.zza(context, preloadConfiguration3.getAdRequest().zza());
                    zzmVarZza.zzc.putBoolean("is_sdk_preload", true);
                    if (preloadConfiguration3.getBufferSize() <= 0) {
                        int iOrdinal = preloadConfiguration3.getAdFormat().ordinal();
                        if (iOrdinal == 1) {
                            bufferSize = ((Integer) zzbe.zzc().zza(zzbcl.zzF)).intValue();
                        } else if (iOrdinal != 2) {
                            bufferSize = iOrdinal != 5 ? 1 : ((Integer) zzbe.zzc().zza(zzbcl.zzE)).intValue();
                        } else {
                            bufferSize = ((Integer) zzbe.zzc().zza(zzbcl.zzG)).intValue();
                        }
                    } else {
                        bufferSize = preloadConfiguration3.getBufferSize();
                    }
                    int iOrdinal2 = preloadConfiguration3.getAdFormat().ordinal();
                    if (iOrdinal2 == 1) {
                        iIntValue = ((Integer) zzbe.zzc().zza(zzbcl.zzC)).intValue();
                    } else if (iOrdinal2 != 2) {
                        iIntValue = iOrdinal2 != 5 ? 1 : ((Integer) zzbe.zzc().zza(zzbcl.zzB)).intValue();
                    } else {
                        iIntValue = ((Integer) zzbe.zzc().zza(zzbcl.zzD)).intValue();
                    }
                    int iMax = Math.max(Math.min(iIntValue, 15), 1);
                    int iOrdinal3 = preloadConfiguration3.getAdFormat().ordinal();
                    if (iOrdinal3 == 1) {
                        iIntValue2 = ((Integer) zzbe.zzc().zza(zzbcl.zzI)).intValue();
                    } else if (iOrdinal3 != 2) {
                        iIntValue2 = iOrdinal3 != 5 ? 1 : ((Integer) zzbe.zzc().zza(zzbcl.zzH)).intValue();
                    } else {
                        iIntValue2 = ((Integer) zzbe.zzc().zza(zzbcl.zzJ)).intValue();
                    }
                    arrayList.add(new zzft(preloadConfiguration3.getAdUnitId(), preloadConfiguration3.getAdFormat().getValue(), zzmVarZza, Math.max(Math.min(bufferSize, iMax), Math.min(iIntValue2, iMax))));
                }
                try {
                    com.google.android.gms.ads.zzb.zza(context).zzi(arrayList, new zzes(this, preloadCallback));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to start preload.", e);
                    return Status.RESULT_INTERNAL_ERROR;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return Status.RESULT_SUCCESS;
    }

    public final String zzi() {
        String strZzc;
        synchronized (this.zzh) {
            try {
                Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to getting version string.");
                try {
                    strZzc = zzfve.zzc(this.zzi.zzf());
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get internal version.", e);
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strZzc;
    }

    public final void zzn(Context context) {
        synchronized (this.zzh) {
            zzC(context);
            try {
                this.zzi.zzi();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:26:0x0034, B:28:0x0054, B:38:0x006d, B:40:0x007e, B:42:0x0090, B:49:0x00d3, B:43:0x00a0, B:45:0x00ae, B:47:0x00c0, B:48:0x00cb, B:35:0x0062, B:37:0x0068), top: B:57:0x0034, inners: #0 }] */
    public final void zzo(final Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzc) {
            try {
                if (this.zzf) {
                    if (onInitializationCompleteListener != null) {
                        this.zze.add(onInitializationCompleteListener);
                    }
                    return;
                }
                if (this.zzg) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.onInitializationComplete(zze());
                    }
                    return;
                }
                this.zzf = true;
                if (onInitializationCompleteListener != null) {
                    this.zze.add(onInitializationCompleteListener);
                }
                if (context == null) {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
                synchronized (this.zzh) {
                    zzew zzewVar = null;
                    byte b = 0;
                    byte b2 = 0;
                    try {
                        try {
                            zzC(context);
                            this.zzi.zzs(new zzev(this, zzewVar));
                            this.zzi.zzo(new zzbpa());
                            if (this.zzk.getTagForChildDirectedTreatment() != -1 || this.zzk.getTagForUnderAgeOfConsent() != -1) {
                                zzD(this.zzk);
                            }
                        } catch (RemoteException e) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzk("MobileAdsSettingManager initialization failed", e);
                        }
                        zzbcl.zza(context);
                        if (((Boolean) zzbej.zza.zze()).booleanValue()) {
                            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkZ)).booleanValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on bg thread");
                                ThreadPoolExecutor threadPoolExecutor = com.google.android.gms.ads.internal.util.client.zzb.zza;
                                final byte b3 = b2 == true ? 1 : 0;
                                threadPoolExecutor.execute(new Runnable(context, b3) { // from class: com.google.android.gms.ads.internal.client.zzeo
                                    public final /* synthetic */ Context zzb;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.zza.zzp(this.zzb, null);
                                    }
                                });
                            } else if (((Boolean) zzbej.zzb.zze()).booleanValue()) {
                                if (((Boolean) zzbe.zzc().zza(zzbcl.zzkZ)).booleanValue()) {
                                    ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                                    final byte b4 = b == true ? 1 : 0;
                                    executorService.execute(new Runnable(context, b4) { // from class: com.google.android.gms.ads.internal.client.zzep
                                        public final /* synthetic */ Context zzb;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzq(this.zzb, null);
                                        }
                                    });
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                                    zzB(context, null);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                                zzB(context, null);
                            }
                        } else if (((Boolean) zzbej.zzb.zze()).booleanValue()) {
                            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkZ)).booleanValue()) {
                                ExecutorService executorService2 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                                final String b5 = b == true ? 1 : 0;
                                executorService2.execute(new Runnable(context, b5) { // from class: com.google.android.gms.ads.internal.client.zzep
                                    public final /* synthetic */ Context zzb;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.zza.zzq(this.zzb, null);
                                    }
                                });
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                                zzB(context, null);
                            }
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Initializing on calling thread");
                            zzB(context, null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void zzp(Context context, String str) {
        synchronized (this.zzh) {
            zzB(context, null);
        }
    }

    public final /* synthetic */ void zzq(Context context, String str) {
        synchronized (this.zzh) {
            zzB(context, null);
        }
    }

    public final void zzr(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzh) {
            zzC(context);
            this.zzj = onAdInspectorClosedListener;
            try {
                this.zzi.zzm(new zzeu(null));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzs(Context context, String str) {
        synchronized (this.zzh) {
            Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzi.zzn(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzt(Class cls) {
        synchronized (this.zzh) {
            try {
                this.zzi.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzu(boolean z) {
        synchronized (this.zzh) {
            Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzi.zzp(z);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzv(float f) {
        boolean z = true;
        Preconditions.checkArgument(f >= 0.0f && f <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzh) {
            if (this.zzi == null) {
                z = false;
            }
            Preconditions.checkState(z, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzi.zzq(f);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzw(String str) {
        synchronized (this.zzh) {
            Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.zzi.zzt(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to set plugin.", e);
            }
        }
    }

    public final void zzx(@NonNull RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzh) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzk;
                this.zzk = requestConfiguration;
                if (this.zzi == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzD(requestConfiguration);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzy() {
        synchronized (this.zzh) {
            zzcz zzczVar = this.zzi;
            boolean zZzv = false;
            if (zzczVar == null) {
                return false;
            }
            try {
                zZzv = zzczVar.zzv();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to get app mute state.", e);
            }
            return zZzv;
        }
    }

    public final boolean zzz(boolean z) {
        synchronized (this.zzh) {
            try {
                Preconditions.checkState(this.zzi != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
                try {
                    this.zzi.zzj(z);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to " + (z ? "enable" : "disable") + " the publisher first-party ID.", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
