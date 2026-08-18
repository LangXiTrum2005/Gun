package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesx implements zzetr {
    public static final /* synthetic */ int zzb = 0;
    private static final zzesy zzc = new zzesy(new JSONArray().toString(), new Bundle());
    final String zza;
    private final zzgcs zzd;
    private final ScheduledExecutorService zze;
    private final zzejj zzf;
    private final Context zzg;
    private final zzfcj zzh;
    private final zzejf zzi;
    private final zzdpm zzj;
    private final zzduc zzk;
    private final int zzl;

    public zzesx(zzgcs zzgcsVar, ScheduledExecutorService scheduledExecutorService, String str, zzejj zzejjVar, Context context, zzfcj zzfcjVar, zzejf zzejfVar, zzdpm zzdpmVar, zzduc zzducVar, int i) {
        this.zzd = zzgcsVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzejjVar;
        this.zzg = context;
        this.zzh = zzfcjVar;
        this.zzi = zzejfVar;
        this.zzj = zzdpmVar;
        this.zzk = zzducVar;
        this.zzl = i;
    }

    public static /* synthetic */ AI zzc(zzesx zzesxVar) {
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkM)).booleanValue() ? zzesxVar.zzh.zzf.toLowerCase(Locale.ROOT) : zzesxVar.zzh.zzf;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbL)).booleanValue() ? zzesxVar.zzk.zzg() : new Bundle();
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbU)).booleanValue()) {
            zzesxVar.zzi(arrayList, zzesxVar.zzf.zza(zzesxVar.zza, lowerCase));
        } else {
            for (Map.Entry entry : ((zzfxq) zzesxVar.zzf.zzb(zzesxVar.zza, lowerCase)).entrySet()) {
                String str = (String) entry.getKey();
                arrayList.add(zzesxVar.zzg(str, (List) entry.getValue(), zzesxVar.zzf(str), true, true));
            }
            zzesxVar.zzi(arrayList, zzesxVar.zzf.zzc());
        }
        return zzgch.zzb(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzess
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i = zzesx.zzb;
                JSONArray jSONArray = new JSONArray();
                for (AI ai : arrayList) {
                    if (((JSONObject) ai.get()) != null) {
                        jSONArray.put(ai.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzesy(jSONArray.toString(), bundleZzg);
            }
        }, zzesxVar.zzd);
    }

    @Nullable
    private final Bundle zzf(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgby zzg(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzgby zzgbyVarZzu = zzgby.zzu(zzgch.zzk(new zzgbn() { // from class: com.google.android.gms.internal.ads.zzesu
            @Override // com.google.android.gms.internal.ads.zzgbn
            public final AI zza() {
                return this.zza.zzd(str, list, bundle, z, z2);
            }
        }, this.zzd));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbH)).booleanValue()) {
            zzgbyVarZzu = (zzgby) zzgch.zzo(zzgbyVarZzu, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbA)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgby) zzgch.zze(zzgbyVarZzu, Throwable.class, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                String str2 = str;
                Throwable th = (Throwable) obj;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmR)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, this.zzd);
    }

    private final void zzh(zzbrd zzbrdVar, Bundle bundle, @NonNull List list, zzejm zzejmVar) throws RemoteException {
        zzbrdVar.zzh(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zze, zzejmVar);
    }

    private final void zzi(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzejn zzejnVar = (zzejn) ((Map.Entry) it.next()).getValue();
            String str = zzejnVar.zza;
            list.add(zzg(str, Collections.singletonList(zzejnVar.zze), zzf(str), zzejnVar.zzb, zzejnVar.zzc));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        if (this.zzl == 2) {
            return zzgch.zzh(zzc);
        }
        zzfcj zzfcjVar = this.zzh;
        if (zzfcjVar.zzr) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbN)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfcjVar.zzd)))) {
                return zzgch.zzh(zzc);
            }
        }
        return zzgch.zzk(new zzgbn() { // from class: com.google.android.gms.internal.ads.zzesr
            @Override // com.google.android.gms.internal.ads.zzgbn
            public final AI zza() {
                return zzesx.zzc(this.zza);
            }
        }, this.zzd);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final /* synthetic */ AI zzd(String str, final List list, final Bundle bundle, boolean z, boolean z2) throws Exception {
        zzbrd zzbrdVarZzb;
        final zzcab zzcabVar = new zzcab();
        if (z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbM)).booleanValue()) {
                try {
                    zzbrdVarZzb = this.zzj.zzb(str);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e);
                    zzbrdVarZzb = null;
                }
            } else {
                this.zzi.zzb(str);
                zzbrdVarZzb = this.zzi.zza(str);
            }
        } else {
            zzbrdVarZzb = this.zzj.zzb(str);
        }
        if (zzbrdVarZzb == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbC)).booleanValue()) {
                throw null;
            }
            zzejm.zzb(str, zzcabVar);
        } else {
            final zzejm zzejmVar = new zzejm(str, zzbrdVarZzb, zzcabVar, com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbH)).booleanValue()) {
                this.zze.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzesw
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzejmVar.zzc();
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbA)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (z) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbO)).booleanValue()) {
                    final zzbrd zzbrdVar = zzbrdVarZzb;
                    this.zzd.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzest
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze(zzbrdVar, bundle, list, zzejmVar, zzcabVar);
                        }
                    });
                } else {
                    zzh(zzbrdVarZzb, bundle, list, zzejmVar);
                }
            } else {
                zzejmVar.zzd();
            }
        }
        return zzcabVar;
    }

    public final /* synthetic */ void zze(zzbrd zzbrdVar, Bundle bundle, List list, zzejm zzejmVar, zzcab zzcabVar) {
        try {
            zzh(zzbrdVar, bundle, list, zzejmVar);
        } catch (RemoteException e) {
            zzcabVar.zzd(e);
        }
    }
}
