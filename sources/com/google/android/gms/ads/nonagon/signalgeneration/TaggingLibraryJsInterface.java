package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzfcn;
import com.google.android.gms.internal.ads.zzfja;
import com.google.android.gms.internal.ads.zzgcs;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzava zzc;
    private final zzfcn zzd;
    private final int zze;
    private final zzdsb zzf;
    private final boolean zzg;
    private final zzgcs zzh = zzbzw.zzf;
    private final zzfja zzi;
    private final zzo zzj;
    private final zzf zzk;
    private final zzj zzl;

    public TaggingLibraryJsInterface(WebView webView, zzava zzavaVar, zzdsb zzdsbVar, zzfja zzfjaVar, zzfcn zzfcnVar, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzavaVar;
        this.zzf = zzdsbVar;
        zzbcl.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjv)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjw)).booleanValue();
        this.zzi = zzfjaVar;
        this.zzd = zzfcnVar;
        this.zzj = zzoVar;
        this.zzk = zzfVar;
        this.zzl = zzjVar;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignals(@NonNull String str) {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            String strZzd = this.zzc.zzc().zzd(this.zza, str, this.zzb);
            if (this.zzg) {
                zzaa.zzd(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzd;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getClickSignalsWithTimeout(@NonNull final String str, int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzbzw.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzv.zzq();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final zzbu zzbuVar = new zzbu(this, string);
        if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
            this.zzj.zzg(this.zzb, zzbuVar);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjy)).booleanValue()) {
                this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze(bundle, zzbuVar);
                    }
                });
            } else {
                QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), zzbuVar);
            }
        }
        return string;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            String strZzh = this.zzc.zzc().zzh(this.zza, this.zzb, null);
            if (this.zzg) {
                zzaa.zzd(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jCurrentTimeMillis)));
            }
            return strZzh;
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) zzbzw.zza.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void recordClick(@NonNull final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjA)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbp
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzf(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    @TargetApi(21)
    public void reportTouchEvent(@NonNull String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i2 = jSONObject.getInt("x");
            int i3 = jSONObject.getInt("y");
            int i4 = jSONObject.getInt("duration_ms");
            float f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else if (i5 != 2) {
                i = i5 != 3 ? -1 : 3;
            } else {
                i = 2;
            }
            try {
                this.zzc.zzd(MotionEvent.obtain(0L, i4, i, i2, i3, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            } catch (JSONException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to parse the touch string. ", e);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e3) {
            e = e3;
        }
    }

    public final /* synthetic */ void zze(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager cookieManagerZza = com.google.android.gms.ads.internal.zzv.zzr().zza(this.zza);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzf(String str) {
        zzfcn zzfcnVar;
        Uri uriZza = Uri.parse(str);
        try {
            uriZza = (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || (zzfcnVar = this.zzd) == null) ? this.zzc.zza(uriZza, this.zza, this.zzb, null) : zzfcnVar.zza(uriZza, this.zza, this.zzb, null);
        } catch (zzavb e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzd(uriZza.toString(), null, null);
    }
}
