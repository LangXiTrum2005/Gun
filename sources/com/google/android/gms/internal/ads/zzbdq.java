package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdq {
    private final ScheduledExecutorService zza;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzo zzb;
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzf zzc;
    private final zzdsb zzd;
    private Runnable zze;
    private zzbdn zzf;
    private CustomTabsSession zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    @VisibleForTesting
    public zzbdq(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.ads.nonagon.signalgeneration.zzo zzoVar, com.google.android.gms.ads.nonagon.signalgeneration.zzf zzfVar, zzdsb zzdsbVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzoVar;
        this.zzc = zzfVar;
        this.zzd = zzdsbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjJ)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzbdn r0 = r5.zzf
            if (r0 != 0) goto La
            java.lang.String r0 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r0)
            return
        La:
            java.lang.Boolean r0 = r0.zza()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r5.zzh
            if (r0 == 0) goto L70
            androidx.browser.customtabs.CustomTabsSession r0 = r5.zzg
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            if (r0 == 0) goto L70
            long r0 = r5.zzi
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()
            long r0 = r0.elapsedRealtime()
            long r2 = r5.zzi
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L39
            goto L4b
        L39:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzjJ
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            androidx.browser.customtabs.CustomTabsSession r0 = r5.zzg
            java.lang.String r1 = r5.zzh
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.requestPostMessageChannel(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r5.zza
            java.lang.Runnable r1 = r5.zze
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzjK
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r2, r4)
            return
        L70:
            java.lang.String r0 = "PACT max retry connection duration timed out"
            com.google.android.gms.ads.internal.util.zze.zza(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdq.zzj():void");
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjM));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error fetching the PACT active eids JSON: ", e);
        }
    }

    @Nullable
    public final CustomTabsSession zzb() {
        return this.zzg;
    }

    @VisibleForTesting
    public final JSONObject zzc(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbeq.zzc.zze()).booleanValue() ? ((Long) zzbeq.zzf.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    @VisibleForTesting
    public final JSONObject zzd(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbeq.zzc.zze()).booleanValue() ? ((Long) zzbeq.zzf.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.zza());
        }
        return jSONObject;
    }

    public final void zzf() {
        this.zzi = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjI)).intValue());
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(@Nonnull Context context, @Nonnull CustomTabsClient customTabsClient, @Nonnull String str, @Nullable CustomTabsCallback customTabsCallback) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (customTabsClient == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzbdn zzbdnVar = new zzbdn(this, customTabsCallback, this.zzd);
        this.zzf = zzbdnVar;
        CustomTabsSession customTabsSessionNewSession = customTabsClient.newSession(zzbdnVar);
        this.zzg = customTabsSessionNewSession;
        if (customTabsSessionNewSession == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("CustomTabsClient failed to create new session.");
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(this.zzd, null, "pact_action", new Pair("pe", "pact_init"));
    }

    public final void zzh(String str) {
        try {
            CustomTabsSession customTabsSession = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.zza());
            }
            customTabsSession.postMessage(jSONObject.toString(), null);
            zzbdp zzbdpVar = new zzbdp(this, str);
            if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
                this.zzb.zzg(this.zzg, zzbdpVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            QueryInfo.generate(this.zzl, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbdpVar);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating JSON: ", e);
        }
    }

    public final void zzi(long j) {
        this.zzj = j;
    }
}
