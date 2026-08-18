package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdsb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzo {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Context zzc;
    private final zzdsb zzd;
    private final ExecutorService zze;

    public zzo(Context context, zzdsb zzdsbVar, ExecutorService executorService) {
        this.zzc = context;
        this.zzd = zzdsbVar;
        this.zze = executorService;
    }

    private final void zzh(final boolean z) {
        Map map = this.zzb;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        this.zzb.put(boolValueOf, new ArrayList());
        this.zze.submit(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(z);
            }
        });
    }

    private final void zzi(zzq zzqVar, Pair pair, boolean z) {
        zzqVar.zzd();
        QueryInfo queryInfoZzb = zzqVar.zzb();
        if (queryInfoZzb != null) {
            ((QueryInfoGenerationCallback) pair.first).onSuccess(queryInfoZzb);
        } else {
            ((QueryInfoGenerationCallback) pair.first).onFailure(zzqVar.zzc());
        }
        zzdsb zzdsbVar = this.zzd;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        pairArr[4] = new Pair("lat_ms", Long.toString(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - ((Long) pair.second).longValue()));
        pairArr[5] = new Pair("sgpc_h", Boolean.toString(z));
        pairArr[6] = new Pair("sgpc_rs", Boolean.toString(zzqVar.zzb() != null));
        zzaa.zzd(zzdsbVar, null, "sgpcr", pairArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzd(boolean z, boolean z2) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            bundle.putBoolean("accept_3p_cookie", z);
            Map map = this.zza;
            Boolean boolValueOf = Boolean.valueOf(z);
            zzq zzqVar = (zzq) map.get(boolValueOf);
            int iZza = (!z2 || zzqVar == null) ? 0 : zzqVar.zza() + 1;
            zzq zzqVar2 = (zzq) this.zza.get(boolValueOf);
            final zzp zzpVar = new zzp(this, z, iZza, zzqVar2 == null ? null : Boolean.valueOf(zzqVar2.zzf()), this.zzd);
            final AdRequest adRequestBuild = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkV)).booleanValue()) {
                this.zze.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zza(adRequestBuild, zzpVar);
                    }
                });
            } else {
                QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequestBuild, zzpVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ Object zza(AdRequest adRequest, zzp zzpVar) throws Exception {
        QueryInfo.generate(this.zzc, AdFormat.BANNER, adRequest, zzpVar);
        return Boolean.TRUE;
    }

    public final synchronized void zzb() {
        zzh(true);
        zzh(false);
    }

    public final /* synthetic */ void zzc(boolean z) {
        zzd(z, false);
    }

    public final /* synthetic */ void zze(Object obj, Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzv.zzr().zza(this.zzc);
            if (cookieManagerZza != null) {
                zAcceptThirdPartyCookies = cookieManagerZza.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.zza;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        zzq zzqVar = (zzq) map.get(boolValueOf);
        if (zzqVar != null && !zzqVar.zze()) {
            zzi(zzqVar, pair, true);
            return;
        }
        List arrayList = (List) this.zzb.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.zzb.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    public final synchronized void zzf(final boolean z, zzq zzqVar) {
        try {
            Map map = this.zza;
            Boolean boolValueOf = Boolean.valueOf(z);
            zzq zzqVar2 = (zzq) map.get(boolValueOf);
            if (zzqVar2 == null || zzqVar2.zze() || zzqVar2.zzb() == null || zzqVar.zzb() != null) {
                this.zza.put(boolValueOf, zzqVar);
            }
            long jLongValue = (zzqVar.zzb() != null ? (Long) zzbeq.zzd.zze() : (Long) zzbeq.zze.zze()).longValue();
            final boolean z2 = zzqVar.zzb() == null;
            zzbzw.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzd(z, z2);
                }
            }, jLongValue, TimeUnit.SECONDS);
            List list = (List) this.zzb.get(boolValueOf);
            this.zzb.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzi(zzqVar, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzg(final Object obj, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        final Pair pair = new Pair(queryInfoGenerationCallback, Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
        zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze(obj, pair);
            }
        });
    }
}
