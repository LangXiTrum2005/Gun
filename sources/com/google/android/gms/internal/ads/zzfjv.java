package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjv {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfki zzc;
    private final zzfjp zzd;
    private final Context zze;

    @Nullable
    private volatile ConnectivityManager zzf;
    private final Clock zzg;
    private AtomicInteger zzh;

    public zzfjv(zzfki zzfkiVar, zzfjp zzfjpVar, Context context, Clock clock) {
        this.zzc = zzfkiVar;
        this.zzd = zzfjpVar;
        this.zze = context;
        this.zzg = clock;
    }

    public static String zzd(String str, @Nullable AdFormat adFormat) {
        return DM.i(str, "#", adFormat == null ? "NULL" : adFormat.name());
    }

    @Nullable
    private final synchronized zzfkh zzn(String str, AdFormat adFormat) {
        return (zzfkh) this.zza.get(zzd(str, adFormat));
    }

    private final synchronized List zzo(List list) {
        ArrayList arrayList;
        try {
            HashSet hashSet = new HashSet();
            arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.ads.internal.client.zzft zzftVar = (com.google.android.gms.ads.internal.client.zzft) it.next();
                String strZzd = zzd(zzftVar.zza, AdFormat.getAdFormat(zzftVar.zzb));
                hashSet.add(strZzd);
                zzfkh zzfkhVar = (zzfkh) this.zza.get(strZzd);
                if (zzfkhVar != null) {
                    if (zzfkhVar.zze.equals(zzftVar)) {
                        zzfkhVar.zzs(zzftVar.zzd);
                    } else {
                        this.zzb.put(strZzd, zzfkhVar);
                        this.zza.remove(strZzd);
                    }
                } else if (this.zzb.containsKey(strZzd)) {
                    zzfkh zzfkhVar2 = (zzfkh) this.zzb.get(strZzd);
                    if (zzfkhVar2.zze.equals(zzftVar)) {
                        zzfkhVar2.zzs(zzftVar.zzd);
                        zzfkhVar2.zzp();
                        this.zza.put(strZzd, zzfkhVar2);
                        this.zzb.remove(strZzd);
                    }
                } else {
                    arrayList.add(zzftVar);
                }
            }
            Iterator it2 = this.zza.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains((String) entry.getKey())) {
                    this.zzb.put((String) entry.getKey(), (zzfkh) entry.getValue());
                    it2.remove();
                }
            }
            Iterator it3 = this.zzb.entrySet().iterator();
            while (it3.hasNext()) {
                zzfkh zzfkhVar3 = (zzfkh) ((Map.Entry) it3.next()).getValue();
                zzfkhVar3.zzr();
                if (!zzfkhVar3.zzt()) {
                    it3.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzfjr] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzfjs] */
    private final synchronized Optional zzp(final Class cls, String str, final AdFormat adFormat) {
        this.zzd.zzd(adFormat, this.zzg.currentTimeMillis());
        zzfkh zzfkhVarZzn = zzn(str, adFormat);
        if (zzfkhVarZzn == null) {
            return Optional.empty();
        }
        try {
            final Optional optionalZzf = zzfkhVarZzn.zzf();
            Optional optionalOfNullable = Optional.ofNullable(zzfkhVarZzn.zze());
            Objects.requireNonNull(cls);
            Optional map = optionalOfNullable.map(new Function() { // from class: com.google.android.gms.internal.ads.zzfjr
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return cls.cast(obj);
                }
            });
            map.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.zzfjs
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.zza.zzg(adFormat, optionalZzf, obj);
                }
            });
            return map;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return Optional.empty();
        }
    }

    private final synchronized void zzq(String str, zzfkh zzfkhVar) {
        zzfkhVar.zzc();
        this.zza.put(str, zzfkhVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzr(boolean z) {
        try {
            if (z) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfkh) it.next()).zzp();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfkh) it2.next()).zzf.set(false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzs(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzt)).booleanValue()) {
            zzr(z);
        }
    }

    private final synchronized boolean zzt(String str, AdFormat adFormat) {
        boolean z;
        try {
            long jCurrentTimeMillis = this.zzg.currentTimeMillis();
            zzfkh zzfkhVarZzn = zzn(str, adFormat);
            z = false;
            if (zzfkhVarZzn != null && zzfkhVarZzn.zzt()) {
                z = true;
            }
            this.zzd.zza(adFormat, jCurrentTimeMillis, z ? Optional.of(Long.valueOf(this.zzg.currentTimeMillis())) : Optional.empty(), zzfkhVarZzn == null ? Optional.empty() : zzfkhVarZzn.zzf());
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    @Nullable
    public final synchronized zzbad zza(String str) {
        return (zzbad) zzp(zzbad.class, str, AdFormat.APP_OPEN_AD).orElse(null);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzby zzb(String str) {
        return (com.google.android.gms.ads.internal.client.zzby) zzp(com.google.android.gms.ads.internal.client.zzby.class, str, AdFormat.INTERSTITIAL).orElse(null);
    }

    @Nullable
    public final synchronized zzbwp zzc(String str) {
        return (zzbwp) zzp(zzbwp.class, str, AdFormat.REWARDED).orElse(null);
    }

    public final /* synthetic */ void zzg(AdFormat adFormat, Optional optional, Object obj) {
        this.zzd.zze(adFormat, this.zzg.currentTimeMillis(), optional);
    }

    public final void zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    try {
                        this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                    } catch (ClassCastException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get connectivity manager", e);
                    }
                }
            }
        }
        if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
            this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzy)).intValue());
            return;
        }
        try {
            this.zzf.registerDefaultNetworkCallback(new zzfju(this));
        } catch (RuntimeException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to register network callback", e2);
            this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzy)).intValue());
        }
    }

    public final void zzi(zzbpe zzbpeVar) {
        this.zzc.zzb(zzbpeVar);
    }

    public final synchronized void zzj(List list, com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        try {
            List<com.google.android.gms.ads.internal.client.zzft> listZzo = zzo(list);
            EnumMap enumMap = new EnumMap(AdFormat.class);
            for (com.google.android.gms.ads.internal.client.zzft zzftVar : listZzo) {
                String str = zzftVar.zza;
                AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
                zzfkh zzfkhVarZza = this.zzc.zza(zzftVar, zzcfVar);
                if (adFormat != null && zzfkhVarZza != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzfkhVarZza.zzo(atomicInteger.get());
                    }
                    zzfkhVarZza.zzq(this.zzd);
                    zzq(zzd(str, adFormat), zzfkhVarZza);
                    enumMap.put(adFormat, Integer.valueOf(((Integer) enumMap.getOrDefault(adFormat, 0)).intValue() + 1));
                }
            }
            this.zzd.zzf(enumMap, this.zzg.currentTimeMillis());
            com.google.android.gms.ads.internal.zzv.zzb().zzc(new zzfjt(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzk(String str) {
        return zzt(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzl(String str) {
        return zzt(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized boolean zzm(String str) {
        return zzt(str, AdFormat.REWARDED);
    }
}
