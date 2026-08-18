package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.webkit.ProxyConfig;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.umeng.analytics.pro.bc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@VisibleForTesting(otherwise = 3)
public class zzcff extends WebViewClient implements zzcgp {
    public static final /* synthetic */ int zzb = 0;

    @Nullable
    private zzdrw zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;

    @Nullable
    private final zzebv zzG;
    private View.OnAttachStateChangeListener zzH;

    @Nullable
    protected zzbxu zza;
    private final zzcex zzc;

    @Nullable
    private final zzbbj zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzcgn zzi;
    private zzcgo zzj;
    private zzbif zzk;
    private zzbih zzl;
    private zzdds zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzac zzw;

    @Nullable
    private zzbsh zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbsc zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfC)).split(",")));

    @VisibleForTesting
    public zzcff(zzcex zzcexVar, @Nullable zzbbj zzbbjVar, boolean z, zzbsh zzbshVar, @Nullable zzbsc zzbscVar, @Nullable zzebv zzebvVar) {
        this.zzd = zzbbjVar;
        this.zzc = zzcexVar;
        this.zzs = z;
        this.zzx = zzbshVar;
        this.zzG = zzebvVar;
    }

    @Nullable
    private static WebResourceResponse zzW() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaU)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Nullable
    private final WebResourceResponse zzX(String str, Map map) throws IOException {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = 0;
            while (true) {
                i++;
                if (i > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.zzv.zzq().zzf(this.zzc.getContext(), this.zzc.zzn().afmaVersion, false, httpURLConnection, false, MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
                WebResourceResponse webResourceResponseZzb = null;
                com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                zzlVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zze(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    String contentType = httpURLConnection.getContentType();
                    String strTrim = "";
                    String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    String contentType2 = httpURLConnection.getContentType();
                    if (!TextUtils.isEmpty(contentType2)) {
                        String[] strArrSplit = contentType2.split(";");
                        if (strArrSplit.length != 1) {
                            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                                if (strArrSplit[i2].trim().startsWith("charset")) {
                                    String[] strArrSplit2 = strArrSplit[i2].trim().split("=");
                                    if (strArrSplit2.length > 1) {
                                        strTrim = strArrSplit2[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String str2 = strTrim;
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    HashMap map2 = new HashMap(headerFields.size());
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                            map2.put(entry2.getKey(), entry2.getValue().get(0));
                        }
                    }
                    webResourceResponseZzb = com.google.android.gms.ads.internal.zzv.zzr().zzb(strTrim2, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), map2, httpURLConnection.getInputStream());
                } else {
                    String headerField = httpURLConnection.getHeaderField(HttpResponseHeader.Location);
                    if (headerField == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if (!headerField.startsWith("tel:")) {
                        URL url2 = new URL(url, headerField);
                        String protocol = url2.getProtocol();
                        if (protocol == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Protocol is null");
                            webResourceResponseZzb = zzW();
                        } else if (protocol.equals(ProxyConfig.MATCH_HTTP) || protocol.equals("https")) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Redirecting to " + headerField);
                            httpURLConnection.disconnect();
                            url = url2;
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unsupported scheme: " + protocol);
                            webResourceResponseZzb = zzW();
                        }
                    }
                }
                TrafficStats.clearThreadStatsTag();
                return webResourceResponseZzb;
            }
        } catch (Throwable th) {
            TrafficStats.clearThreadStatsTag();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzY(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbjp) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzZ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(final View view, final zzbxu zzbxuVar, final int i) {
        if (!zzbxuVar.zzi() || i <= 0) {
            return;
        }
        zzbxuVar.zzg(view);
        if (zzbxuVar.zzi()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcey
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzq(view, zzbxuVar, i);
                }
            }, 100L);
        }
    }

    private static final boolean zzab(zzcex zzcexVar) {
        return zzcexVar.zzD() != null && zzcexVar.zzD().zzb();
    }

    private static final boolean zzac(boolean z, zzcex zzcexVar) {
        return (!z || zzcexVar.zzO().zzi() || zzcexVar.zzU().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzk(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                if (this.zzc.zzaE()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    this.zzc.zzX();
                    return;
                }
                this.zzB = true;
                zzcgo zzcgoVar = this.zzj;
                if (zzcgoVar != null) {
                    zzcgoVar.zza();
                    this.zzj = null;
                }
                zzh();
                if (this.zzc.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlM)).booleanValue()) {
                        this.zzc.zzL().zzG(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.zzo = true;
        this.zzp = i;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzc.zzaD(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case Input.Keys.MEDIA_PLAY_PAUSE /* 85 */:
            case Input.Keys.MEDIA_STOP /* 86 */:
            case Input.Keys.MEDIA_NEXT /* 87 */:
            case Input.Keys.MEDIA_PREVIOUS /* 88 */:
            case 89:
            case Input.Keys.MEDIA_FAST_FORWARD /* 90 */:
            case Input.Keys.MUTE /* 91 */:
                return true;
            default:
                switch (keyCode) {
                    case ASSET_FAILED_INSUFFICIENT_SPACE_VALUE:
                    case ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZza = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZza.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZza.getHost())) {
            zzk(uriZza);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = uriZza.getScheme();
                if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbxu zzbxuVar = this.zza;
                        if (zzbxuVar != null) {
                            zzbxuVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzdds zzddsVar = this.zzm;
                    if (zzddsVar != null) {
                        zzddsVar.zzdd();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.zzc.zzG().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzava zzavaVarZzI = this.zzc.zzI();
                    zzfcn zzfcnVarZzS = this.zzc.zzS();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || zzfcnVarZzS == null) {
                        if (zzavaVarZzI != null && zzavaVarZzI.zzf(uriZza)) {
                            Context context = this.zzc.getContext();
                            zzcex zzcexVar = this.zzc;
                            uriZza = zzavaVarZzI.zza(uriZza, context, (View) zzcexVar, zzcexVar.zzi());
                        }
                    } else if (zzavaVarZzI != null && zzavaVarZzI.zzf(uriZza)) {
                        Context context2 = this.zzc.getContext();
                        zzcex zzcexVar2 = this.zzc;
                        uriZza = zzfcnVarZzS.zza(uriZza, context2, (View) zzcexVar2, zzcexVar2.zzi());
                    }
                } catch (zzavb unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzc()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZza.toString(), null, null, null, null, null, null);
                    zzcex zzcexVar3 = this.zzc;
                    zzv(zzcVar, true, false, zzcexVar3 != null ? zzcexVar3.zzr() : "");
                } else {
                    zzbVar.zzb(str);
                }
            }
        }
        return true;
    }

    public final void zzA(boolean z, int i, String str, boolean z2, boolean z3) {
        zzcex zzcexVar = this.zzc;
        boolean zZzaF = zzcexVar.zzaF();
        boolean zZzac = zzac(zZzaF, zzcexVar);
        boolean z4 = true;
        if (!zZzac && z2) {
            z4 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzac ? null : this.zzg;
        zzcfe zzcfeVar = zZzaF ? null : new zzcfe(this.zzc, this.zzh);
        zzbif zzbifVar = this.zzk;
        zzbih zzbihVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcex zzcexVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(zzaVar, zzcfeVar, zzbifVar, zzbihVar, zzacVar, zzcexVar2, z, i, str, zzcexVar2.zzn(), z4 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null, z3));
    }

    public final void zzB(String str, zzbjp zzbjpVar) {
        synchronized (this.zzf) {
            try {
                List copyOnWriteArrayList = (List) this.zze.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    this.zze.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzbjpVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzC(zzcgn zzcgnVar) {
        this.zzi = zzcgnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzD(int i, int i2) {
        zzbsc zzbscVar = this.zzz;
        if (zzbscVar != null) {
            zzbscVar.zze(i, i2);
        }
    }

    public final void zzE(boolean z) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzF(boolean z) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzG(boolean z) {
        synchronized (this.zzf) {
            this.zzv = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzH() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcez
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzI(boolean z) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzJ(zzcgo zzcgoVar) {
        this.zzj = zzcgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzK(zzcmk zzcmkVar, @Nullable zzebk zzebkVar, @Nullable zzfja zzfjaVar) {
        zzO("/click");
        if (zzebkVar == null || zzfjaVar == null) {
            zzB("/click", new zzbin(this.zzm, zzcmkVar));
        } else {
            zzB("/click", new zzfcr(this.zzm, zzcmkVar, zzfjaVar, zzebkVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzL(zzcmk zzcmkVar) {
        zzO("/click");
        zzB("/click", new zzbin(this.zzm, zzcmkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzM(zzcmk zzcmkVar, @Nullable zzebk zzebkVar, @Nullable zzdrw zzdrwVar) {
        zzO("/open");
        zzB("/open", new zzbkb(this.zzy, this.zzz, zzebkVar, zzdrwVar, zzcmkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzN(zzfbo zzfboVar) {
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zzc.getContext())) {
            zzO("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbjv(this.zzc.getContext(), zzfboVar.zzaw));
        }
    }

    public final void zzO(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzP(String str, zzbjp zzbjpVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzbjpVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzQ(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<zzbjp> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzbjp zzbjpVar : list) {
                    if (predicate.apply(zzbjpVar)) {
                        arrayList.add(zzbjpVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzR() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzS() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzv;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final boolean zzT() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzs;
        }
        return z;
    }

    public final boolean zzU() {
        boolean z;
        synchronized (this.zzf) {
            z = this.zzt;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzV(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbif zzbifVar, @Nullable com.google.android.gms.ads.internal.overlay.zzr zzrVar, @Nullable zzbih zzbihVar, @Nullable com.google.android.gms.ads.internal.overlay.zzac zzacVar, boolean z, @Nullable zzbjs zzbjsVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbsj zzbsjVar, @Nullable zzbxu zzbxuVar, @Nullable final zzebk zzebkVar, @Nullable final zzfja zzfjaVar, @Nullable zzdrw zzdrwVar, @Nullable zzbkj zzbkjVar, @Nullable zzdds zzddsVar, @Nullable zzbki zzbkiVar, @Nullable zzbkc zzbkcVar, @Nullable zzbjq zzbjqVar, @Nullable zzcmk zzcmkVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbxuVar, null) : zzbVar;
        this.zzz = new zzbsc(this.zzc, zzbsjVar);
        this.zza = zzbxuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbb)).booleanValue()) {
            zzB("/adMetadata", new zzbie(zzbifVar));
        }
        if (zzbihVar != null) {
            zzB("/appEvent", new zzbig(zzbihVar));
        }
        zzB("/backButton", zzbjo.zzj);
        zzB("/refresh", zzbjo.zzk);
        zzB("/canOpenApp", zzbjo.zzb);
        zzB("/canOpenURLs", zzbjo.zza);
        zzB("/canOpenIntents", zzbjo.zzc);
        zzB("/close", zzbjo.zzd);
        zzB("/customClose", zzbjo.zze);
        zzB("/instrument", zzbjo.zzn);
        zzB("/delayPageLoaded", zzbjo.zzp);
        zzB("/delayPageClosed", zzbjo.zzq);
        zzB("/getLocationInfo", zzbjo.zzr);
        zzB("/log", zzbjo.zzg);
        zzB("/mraid", new zzbjw(zzbVar2, this.zzz, zzbsjVar));
        zzbsh zzbshVar = this.zzx;
        if (zzbshVar != null) {
            zzB("/mraidLoaded", zzbshVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbkb(zzbVar2, this.zzz, zzebkVar, zzdrwVar, zzcmkVar));
        zzB("/precache", new zzcdf());
        zzB("/touch", zzbjo.zzi);
        zzB("/video", zzbjo.zzl);
        zzB("/videoMeta", zzbjo.zzm);
        if (zzebkVar == null || zzfjaVar == null) {
            zzB("/click", new zzbin(zzddsVar, zzcmkVar));
            zzB("/httpTrack", zzbjo.zzf);
        } else {
            zzB("/click", new zzfcr(zzddsVar, zzcmkVar, zzfjaVar, zzebkVar));
            zzB("/httpTrack", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzfcs
                @Override // com.google.android.gms.internal.ads.zzbjp
                public final void zza(Object obj, Map map) {
                    zzceo zzceoVar = (zzceo) obj;
                    String str = (String) map.get(bc.aN);
                    if (str == null) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
                        return;
                    }
                    zzfbo zzfboVarZzD = zzceoVar.zzD();
                    if (zzfboVarZzD != null && !zzfboVarZzD.zzai) {
                        zzfjaVar.zzd(str, zzfboVarZzD.zzax, null);
                        return;
                    }
                    zzfbr zzfbrVarZzR = ((zzcga) zzceoVar).zzR();
                    if (zzfbrVarZzR != null) {
                        zzebkVar.zzd(new zzebm(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), zzfbrVarZzR.zzb, str, 2));
                    } else {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                    }
                }
            });
        }
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zzc.getContext())) {
            Map map = new HashMap();
            if (this.zzc.zzD() != null) {
                map = this.zzc.zzD().zzaw;
            }
            zzB("/logScionEvent", new zzbjv(this.zzc.getContext(), map));
        }
        if (zzbjsVar != null) {
            zzB("/setInterstitialProperties", new zzbjr(zzbjsVar));
        }
        if (zzbkjVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbkjVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjg)).booleanValue() && zzbkiVar != null) {
            zzB("/shareSheet", zzbkiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue() && zzbkcVar != null) {
            zzB("/inspectorOutOfContextTest", zzbkcVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjp)).booleanValue() && zzbjqVar != null) {
            zzB("/inspectorStorage", zzbjqVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlr)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbjo.zzu);
            zzB("/presentPlayStoreOverlay", zzbjo.zzv);
            zzB("/expandPlayStoreOverlay", zzbjo.zzw);
            zzB("/collapsePlayStoreOverlay", zzbjo.zzx);
            zzB("/closePlayStoreOverlay", zzbjo.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdr)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbjo.zzA);
            zzB("/resetPAID", zzbjo.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlL)).booleanValue()) {
            zzcex zzcexVar = this.zzc;
            if (zzcexVar.zzD() != null && zzcexVar.zzD().zzar) {
                zzB("/writeToLocalStorage", zzbjo.zzB);
                zzB("/clearLocalStorageKeys", zzbjo.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbifVar;
        this.zzl = zzbihVar;
        this.zzw = zzacVar;
        this.zzy = zzbVar3;
        this.zzm = zzddsVar;
        this.zzA = zzdrwVar;
        this.zzn = z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ad A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00b9, B:30:0x00d1, B:32:0x00ea, B:77:0x01ba, B:49:0x0173, B:97:0x0298, B:85:0x0222, B:86:0x0248, B:84:0x01fd, B:48:0x014f, B:31:0x00de, B:87:0x0249, B:89:0x0253, B:91:0x0259, B:93:0x028c, B:99:0x02a7, B:101:0x02ad, B:103:0x02bb), top: B:112:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02c0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f2 A[Catch: all -> 0x01ae, TryCatch #6 {all -> 0x01ae, blocks: (B:70:0x0193, B:72:0x01a5, B:76:0x01b0, B:80:0x01e0, B:82:0x01f2, B:83:0x01f9), top: B:111:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0298 A[Catch: NoClassDefFoundError -> 0x0022, Exception -> 0x0025, TryCatch #13 {Exception -> 0x0025, NoClassDefFoundError -> 0x0022, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0028, B:12:0x003a, B:14:0x0041, B:16:0x004d, B:18:0x0069, B:20:0x0082, B:22:0x0099, B:23:0x009c, B:25:0x009f, B:28:0x00b9, B:30:0x00d1, B:32:0x00ea, B:77:0x01ba, B:49:0x0173, B:97:0x0298, B:85:0x0222, B:86:0x0248, B:84:0x01fd, B:48:0x014f, B:31:0x00de, B:87:0x0249, B:89:0x0253, B:91:0x0259, B:93:0x028c, B:99:0x02a7, B:101:0x02ad, B:103:0x02bb), top: B:112:0x000c }] */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final WebResourceResponse zzc(String str, Map map) throws Throwable {
        int i;
        InputStream inputStreamZza;
        Long l;
        final boolean z;
        InputStream inputStreamZzc;
        final boolean z2;
        final boolean z3;
        String str2;
        try {
            Map map2 = new HashMap();
            if (this.zzc.zzD() != null) {
                map2 = this.zzc.zzD().zzaw;
            }
            String strZzc = zzbyk.zzc(str, this.zzc.getContext(), this.zzE, map2);
            if (!strZzc.equals(str)) {
                return zzX(strZzc, map);
            }
            zzbav zzbavVarZza = zzbav.zza(Uri.parse(str));
            if (zzbavVarZza != null) {
                HashMap map3 = new HashMap();
                map3.put(HttpResponseHeader.AccessControlAllowOrigin, ProxyConfig.MATCH_ALL_SCHEMES);
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listZzf = zzfvc.zzb(zzfty.zzc('-')).zzf(uri.getQueryParameter("range"));
                    if (listZzf.size() == 2) {
                        int i2 = Integer.parseInt((String) listZzf.get(0));
                        int i3 = Integer.parseInt((String) listZzf.get(1)) + 1;
                        if (i2 > 0) {
                            zzbavVarZza.zzh = i2;
                        }
                        i = i3 - i2;
                    } else {
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                String str3 = "X-Afma-Gcache-CachedBytes";
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeq)).booleanValue()) {
                    zzbavVarZza.zzi = zzfve.zzc(this.zzc.zzr());
                    zzbavVarZza.zzj = this.zzc.zzf();
                    if (zzbavVarZza.zzg) {
                        l = (Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzes);
                    } else {
                        l = (Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzer);
                    }
                    try {
                        long jLongValue = l.longValue();
                        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                        com.google.android.gms.ads.internal.zzv.zzd();
                        Future futureZza = zzbbg.zza(this.zzc.getContext(), zzbavVarZza);
                        try {
                            zzbbh zzbbhVar = (zzbbh) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbbhVar.zzd()));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbbhVar.zzf()));
                                    map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbbhVar.zze()));
                                    map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbbhVar.zza()));
                                    inputStreamZzc = zzbbhVar.zzc();
                                    if (i != -1) {
                                        try {
                                            inputStreamZzc = zzgad.zza(inputStreamZzc, i);
                                        } catch (InterruptedException e) {
                                            e = e;
                                            z3 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzev)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            Thread.currentThread().interrupt();
                                            final long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.zza.zzp(z3, jElapsedRealtime2);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime2 + "ms";
                                        } catch (ExecutionException e2) {
                                            e = e2;
                                            z2 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzev)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.zza.zzp(z2, jElapsedRealtime3);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime3 + "ms";
                                        } catch (TimeoutException e3) {
                                            e = e3;
                                            z2 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzev)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    this.zza.zzp(z2, jElapsedRealtime4);
                                                }
                                            });
                                            str2 = "Cache connection took " + jElapsedRealtime4 + "ms";
                                        }
                                    }
                                    final long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                    final boolean z4 = true;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzp(z4, jElapsedRealtime5);
                                        }
                                    });
                                    str2 = "Cache connection took " + jElapsedRealtime5 + "ms";
                                } catch (InterruptedException e4) {
                                    e = e4;
                                    inputStreamZzc = null;
                                } catch (ExecutionException e5) {
                                    e = e5;
                                    inputStreamZzc = null;
                                    z2 = true;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzev)).booleanValue()) {
                                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                    }
                                    futureZza.cancel(true);
                                    final long jElapsedRealtime6 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzp(z2, jElapsedRealtime6);
                                        }
                                    });
                                    str2 = "Cache connection took " + jElapsedRealtime6 + "ms";
                                    com.google.android.gms.ads.internal.util.zze.zza(str2);
                                    inputStreamZza = inputStreamZzc;
                                    if (inputStreamZza != null) {
                                        return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                        return null;
                                    }
                                    return null;
                                } catch (TimeoutException e6) {
                                    e = e6;
                                    inputStreamZzc = null;
                                    z2 = true;
                                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzev)).booleanValue()) {
                                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                                    }
                                    futureZza.cancel(true);
                                    final long jElapsedRealtime7 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzp(z2, jElapsedRealtime7);
                                        }
                                    });
                                    str2 = "Cache connection took " + jElapsedRealtime7 + "ms";
                                    com.google.android.gms.ads.internal.util.zze.zza(str2);
                                    inputStreamZza = inputStreamZzc;
                                    if (inputStreamZza != null) {
                                        return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                                    }
                                    if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                        return null;
                                    }
                                    return null;
                                }
                                com.google.android.gms.ads.internal.util.zze.zza(str2);
                                inputStreamZza = inputStreamZzc;
                            } catch (Throwable th) {
                                th = th;
                                z = 1;
                                final long jElapsedRealtime8 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.zza.zzp(z, jElapsedRealtime8);
                                    }
                                });
                                com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime8 + "ms");
                                throw th;
                            }
                        } catch (InterruptedException e7) {
                            e = e7;
                            inputStreamZzc = null;
                            z3 = false;
                        } catch (ExecutionException e8) {
                            e = e8;
                            inputStreamZzc = null;
                            z2 = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzev)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime9 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzp(z2, jElapsedRealtime9);
                                }
                            });
                            str2 = "Cache connection took " + jElapsedRealtime9 + "ms";
                            com.google.android.gms.ads.internal.util.zze.zza(str2);
                            inputStreamZza = inputStreamZzc;
                            if (inputStreamZza != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                return null;
                            }
                            return null;
                        } catch (TimeoutException e9) {
                            e = e9;
                            inputStreamZzc = null;
                            z2 = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzev)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest.gcache");
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime10 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.zza.zzp(z2, jElapsedRealtime10);
                                }
                            });
                            str2 = "Cache connection took " + jElapsedRealtime10 + "ms";
                            com.google.android.gms.ads.internal.util.zze.zza(str2);
                            inputStreamZza = inputStreamZzc;
                            if (inputStreamZza != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
                                return null;
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            z = 0;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = str3;
                    }
                } else {
                    zzbas zzbasVarZzb = com.google.android.gms.ads.internal.zzv.zzc().zzb(zzbavVarZza);
                    if (zzbasVarZzb == null || !zzbasVarZzb.zze()) {
                        inputStreamZza = null;
                    } else {
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbasVarZzb.zzd()));
                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbasVarZzb.zzg()));
                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbasVarZzb.zzf()));
                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbasVarZzb.zza()));
                        InputStream inputStreamZzc2 = zzbasVarZzb.zzc();
                        inputStreamZza = i != -1 ? zzgad.zza(inputStreamZzc2, i) : inputStreamZzc2;
                    }
                }
                if (inputStreamZza != null) {
                    return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZza);
                }
            }
            if (com.google.android.gms.ads.internal.util.client.zzl.zzk() || !((Boolean) zzbeh.zzb.zze()).booleanValue()) {
                return null;
            }
            return zzX(str, map);
        } catch (Exception e10) {
            e = e10;
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest");
            return zzW();
        } catch (NoClassDefFoundError e11) {
            e = e11;
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdWebViewClient.interceptRequest");
            return zzW();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzdds zzddsVar = this.zzm;
        if (zzddsVar != null) {
            zzddsVar.zzdd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final zzdrw zze() {
        return this.zzA;
    }

    public final void zzh() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && this.zzc.zzm() != null) {
                zzbcs.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcgn zzcgnVar = this.zzi;
            boolean z = false;
            if (!this.zzC && !this.zzo) {
                z = true;
            }
            zzcgnVar.zza(z, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzaf();
    }

    public final void zzi() {
        zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            zzbxuVar.zze();
            this.zza = null;
        }
        zzZ();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbsc zzbscVar = this.zzz;
                if (zzbscVar != null) {
                    zzbscVar.zza(true);
                    this.zzz = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzj(boolean z) {
        this.zzE = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzk(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgB)).booleanValue() || com.google.android.gms.ads.internal.zzv.zzp().zzg() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfa
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    int i = zzcff.zzb;
                    com.google.android.gms.ads.internal.zzv.zzp().zzg().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfB)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfD)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgch.zzr(com.google.android.gms.ads.internal.zzv.zzq().zzb(uri), new zzcfd(this, list, path, uri), zzbzw.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        zzY(com.google.android.gms.ads.internal.util.zzs.zzP(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzl() {
        zzbbj zzbbjVar = this.zzd;
        if (zzbbjVar != null) {
            zzbbjVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzh();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzm() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzn() {
        this.zzD--;
        zzh();
    }

    public final /* synthetic */ void zzo() {
        this.zzc.zzad();
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = this.zzc.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzz();
        }
    }

    public final /* synthetic */ void zzp(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    public final /* synthetic */ void zzq(View view, zzbxu zzbxuVar, int i) {
        zzaa(view, zzbxuVar, i - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzr(int i, int i2, boolean z) {
        zzbsh zzbshVar = this.zzx;
        if (zzbshVar != null) {
            zzbshVar.zzb(i, i2);
        }
        zzbsc zzbscVar = this.zzz;
        if (zzbscVar != null) {
            zzbscVar.zzd(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgp
    public final void zzs() {
        zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            WebView webViewZzG = this.zzc.zzG();
            if (ViewCompat.isAttachedToWindow(webViewZzG)) {
                zzaa(webViewZzG, zzbxuVar, 10);
                return;
            }
            zzZ();
            zzcfc zzcfcVar = new zzcfc(this, zzbxuVar);
            this.zzH = zzcfcVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcfcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzdds zzddsVar = this.zzm;
        if (zzddsVar != null) {
            zzddsVar.zzu();
        }
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z, boolean z2, String str) {
        zzcex zzcexVar = this.zzc;
        boolean zZzaF = zzcexVar.zzaF();
        boolean z3 = zzac(zZzaF, zzcexVar) || z2;
        boolean z4 = z3 || !z;
        com.google.android.gms.ads.internal.client.zza zzaVar = z3 ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = zZzaF ? null : this.zzh;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcex zzcexVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcVar, zzaVar, zzrVar, zzacVar, zzcexVar2.zzn(), zzcexVar2, z4 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i) {
        zzebv zzebvVar = this.zzG;
        zzcex zzcexVar = this.zzc;
        zzy(new AdOverlayInfoParcel(zzcexVar, zzcexVar.zzn(), str, str2, 14, zzebvVar));
    }

    public final void zzx(boolean z, int i, boolean z2) {
        zzcex zzcexVar = this.zzc;
        boolean zZzac = zzac(zzcexVar.zzaF(), zzcexVar);
        boolean z3 = true;
        if (!zZzac && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzac ? null : this.zzg;
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcex zzcexVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(zzaVar, zzrVar, zzacVar, zzcexVar2, z, i, zzcexVar2.zzn(), z3 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null));
    }

    public final void zzy(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbsc zzbscVar = this.zzz;
        boolean zZzf = zzbscVar != null ? zzbscVar.zzf() : false;
        com.google.android.gms.ads.internal.zzv.zzj();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzc.getContext(), adOverlayInfoParcel, !zZzf, this.zzA);
        zzbxu zzbxuVar = this.zza;
        if (zzbxuVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbxuVar.zzh(str);
        }
    }

    public final void zzz(boolean z, int i, String str, String str2, boolean z2) {
        zzcex zzcexVar = this.zzc;
        boolean zZzaF = zzcexVar.zzaF();
        boolean zZzac = zzac(zZzaF, zzcexVar);
        boolean z3 = true;
        if (!zZzac && z2) {
            z3 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzac ? null : this.zzg;
        zzcfe zzcfeVar = zZzaF ? null : new zzcfe(this.zzc, this.zzh);
        zzbif zzbifVar = this.zzk;
        zzbih zzbihVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zzw;
        zzcex zzcexVar2 = this.zzc;
        zzy(new AdOverlayInfoParcel(zzaVar, zzcfeVar, zzbifVar, zzbihVar, zzacVar, zzcexVar2, z, i, str, str2, zzcexVar2.zzn(), z3 ? null : this.zzm, zzab(this.zzc) ? this.zzG : null));
    }
}
