package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.bytedance.sdk.component.embedapplog.BuildConfig;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.mbridge.msdk.foundation.entity.b;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk$MetricBatch;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import com.vungle.ads.internal.protos.Sdk$SDKErrorBatch;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2283Ag;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2361Dg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2439Gg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2517Jg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2528Jr;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2543Kg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2551Ko;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2577Lo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2634Nu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2919Yt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2961a4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3105bi0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3282di0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3300du;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3336eJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3457fi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3458fi0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3546gi0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3756j50;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3808ji0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3887ke;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3896ki0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3984li0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4072mi0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4126nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4155ng;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4160ni0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4248oi0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4419qg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4455r30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4599si0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4662tS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4664tU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4682tg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4750uS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4838vS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4848vb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4917wJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5021xZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5034xg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5036xh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5071y30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5109yZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5115yc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5160z4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Eg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4323pc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5106yW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fi0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ID;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2435Gc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5016xU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MV;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OV;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X3;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XA;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ZA;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class VungleApiClient {
    private static final String TAG = "VungleApiClient";
    private L3 advertisingInfo;
    private VungleApi api;
    private G5 appBody;
    private final Context applicationContext;
    private C2577Lo baseDeviceInfo;
    private final C2919Yt filePreferences;
    private VungleApi gzipApi;
    private Boolean isGooglePlayServicesAvailable;
    private final InterfaceC5016xU platform;
    private JD responseInterceptor;
    private Map<String, Long> retryAfterDataMap;
    private final InterfaceC3069bH signalManager$delegate;
    private String uaString;
    public static final C3546gi0 Companion = new C3546gi0(null);
    private static final String BASE_URL = "https://config.ads.vungle.com/";
    private static final Set<JD> networkInterceptors = new HashSet();
    private static final Set<JD> logInterceptors = new HashSet();
    private static final VE json = WD.b(C3458fi0.INSTANCE);

    public VungleApiClient(Context context, InterfaceC5016xU interfaceC5016xU, C2919Yt c2919Yt) {
        AbstractC2995aW.q(context, "applicationContext");
        AbstractC2995aW.q(interfaceC5016xU, "platform");
        AbstractC2995aW.q(c2919Yt, "filePreferences");
        this.applicationContext = context;
        this.platform = interfaceC5016xU;
        this.filePreferences = c2919Yt;
        this.uaString = System.getProperty("http.agent");
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        this.signalManager$delegate = AbstractC2340Cl.H(EnumC4124nH.f4736a, new C4248oi0(context));
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new JD() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ei0
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JD
            public final C5021xZ intercept(ID id) {
                return VungleApiClient.m99responseInterceptor$lambda0(this.f4331a, (MX) id);
            }
        };
        C4750uS c4750uS = new C4750uS();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c4750uS.b(60L, timeUnit);
        c4750uS.a(60L, timeUnit);
        JD jd = this.responseInterceptor;
        AbstractC2995aW.q(jd, "interceptor");
        ArrayList arrayList = c4750uS.c;
        arrayList.add(jd);
        C3896ki0 c3896ki0 = new C3896ki0();
        if (!AbstractC2995aW.i(c3896ki0, c4750uS.n)) {
            c4750uS.D = null;
        }
        c4750uS.n = c3896ki0;
        C4838vS c4838vS = new C4838vS(c4750uS);
        arrayList.add(new C3808ji0());
        C4838vS c4838vS2 = new C4838vS(c4750uS);
        this.api = new C4599si0(c4838vS);
        this.gzipApi = new C4599si0(c4838vS2);
    }

    private final String bodyToString(NY ny) {
        try {
            C4848vb c4848vb = new C4848vb();
            if (ny == null) {
                return "";
            }
            ny.writeTo(c4848vb);
            return c4848vb.t();
        } catch (Exception unused) {
            return "";
        }
    }

    private final C5021xZ defaultErrorResponse(HY hy) {
        C5036xh c5036xh = new C5036xh();
        AbstractC2995aW.q(hy, J0.REQUEST_KEY_EXTRA);
        EnumC5106yW enumC5106yW = EnumC5106yW.HTTP_1_1;
        BZ bz = CZ.Companion;
        Pattern pattern = RO.c;
        RO roU = C3887ke.u("application/json; charset=utf-8");
        bz.getClass();
        return new C5021xZ(hy, enumC5106yW, "Server is busy", 500, null, c5036xh.e(), BZ.b("{\"Error\":\"Server is busy\"}", roU), null, null, null, 0L, 0L, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final C2577Lo getBasicDeviceBody(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String str = Build.MANUFACTURER;
        AbstractC2995aW.p(str, "MANUFACTURER");
        String str2 = Build.MODEL;
        AbstractC2995aW.p(str2, "MODEL");
        String str3 = Build.VERSION.RELEASE;
        AbstractC2995aW.p(str3, "RELEASE");
        C2577Lo c2577Lo = new C2577Lo(str, str2, str3, C5160z4.Companion.getCarrierName$vungle_ads_release(context), AbstractC2995aW.i("Amazon", str) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (C2551Ko) null, 1792, (AbstractC2471Hm) null);
        try {
            String userAgent = ((C5160z4) this.platform).getUserAgent();
            this.uaString = userAgent;
            c2577Lo.setUa(userAgent);
            initUserAgentLazy();
            L3 advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = ((C5160z4) this.platform).getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e.getLocalizedMessage());
        }
        return c2577Lo;
    }

    private final String getConnectionType() {
        if (PermissionChecker.checkCallingOrSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NONE";
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return "MOBILE";
        }
        if (type == 1 || type == 6) {
            return "WIFI";
        }
        if (type != 7) {
            return type != 9 ? "UNKNOWN" : "ETHERNET";
        }
        return "BLUETOOTH";
    }

    private final C2577Lo getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    private final C2361Dg getExtBody(boolean z) {
        String strGenerateSignals;
        String configExtension = C3457fi.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.filePreferences.getString("config_extension");
        }
        if (z) {
            try {
                strGenerateSignals = getSignalManager().generateSignals();
            } catch (Exception e) {
                C4917wJ.Companion.e(TAG, "Couldn't convert signals for sending. Error: " + e.getMessage());
                strGenerateSignals = null;
            }
        } else {
            strGenerateSignals = null;
        }
        if ((configExtension == null || configExtension.length() == 0) && (strGenerateSignals == null || strGenerateSignals.length() == 0)) {
            return null;
        }
        return new C2361Dg(configExtension, strGenerateSignals, Long.valueOf(C3457fi.INSTANCE.configLastValidatedTimestamp()));
    }

    public static /* synthetic */ C2361Dg getExtBody$default(VungleApiClient vungleApiClient, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return vungleApiClient.getExtBody(z);
    }

    @VisibleForTesting
    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    private final String getPlacementID(NY ny) {
        List<String> placements;
        String str;
        try {
            VE ve = json;
            C2439Gg request = ((C2543Kg) ve.a(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C2543Kg.class)), bodyToString(ny))).getRequest();
            return (request == null || (placements = request.getPlacements()) == null || (str = placements.get(0)) == null) ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    private final L60 getSignalManager() {
        return (L60) this.signalManager$delegate.getValue();
    }

    private final C2517Jg getUserBody(boolean z) {
        C2517Jg c2517Jg = new C2517Jg((C5034xg) null, (C4419qg) null, (C4682tg) null, (C2634Nu) null, (C2283Ag) null, 31, (AbstractC2471Hm) null);
        OV ov = OV.INSTANCE;
        c2517Jg.setGdpr(new C5034xg(ov.getConsentStatus(), ov.getConsentSource(), ov.getConsentTimestamp(), ov.getConsentMessageVersion()));
        c2517Jg.setCcpa(new C4419qg(ov.getCcpaStatus()));
        if (ov.getCoppaStatus() != EnumC4323pc.COPPA_NOTSET) {
            c2517Jg.setCoppa(new C4682tg(ov.getCoppaStatus().getValue()));
        }
        if (ov.shouldSendTCFString()) {
            c2517Jg.setIab(new C2283Ag(ov.getIABTCFString()));
        }
        if (z) {
            c2517Jg.setFpd(C3282di0.firstPartyData);
        }
        return c2517Jg;
    }

    public static /* synthetic */ C2517Jg getUserBody$default(VungleApiClient vungleApiClient, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return vungleApiClient.getUserBody(z);
    }

    private final void initUserAgentLazy() {
        final C5115yc0 c5115yc0 = new C5115yc0(B30.USER_AGENT_LOAD_DURATION_MS);
        c5115yc0.markStart();
        ((C5160z4) this.platform).getUserAgentLazy(new Consumer<String>() { // from class: com.vungle.ads.internal.network.VungleApiClient.initUserAgentLazy.1
            @Override // androidx.core.util.Consumer
            public void accept(String str) {
                if (str == null) {
                    C4917wJ.Companion.e(VungleApiClient.TAG, "Cannot Get UserAgent. Setting Default Device UserAgent");
                    new Eg0().logErrorNoReturnValue$vungle_ads_release();
                } else {
                    c5115yc0.markEnd();
                    C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, c5115yc0, (C4126nJ) null, (String) null, 6, (Object) null);
                    this.uaString = str;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2528Jr pingTPAT$default(VungleApiClient vungleApiClient, String str, Map map, String str2, XA xa, C4126nJ c4126nJ, int i, Object obj) {
        Map map2 = (i & 2) != 0 ? null : map;
        String str3 = (i & 4) != 0 ? null : str2;
        if ((i & 8) != 0) {
            xa = XA.GET;
        }
        return vungleApiClient.pingTPAT(str, map2, str3, xa, (i & 16) != 0 ? null : c4126nJ);
    }

    public static /* synthetic */ C2543Kg requestBody$default(VungleApiClient vungleApiClient, boolean z, boolean z2, int i, Object obj) throws IllegalStateException {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return vungleApiClient.requestBody(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final C5021xZ m99responseInterceptor$lambda0(VungleApiClient vungleApiClient, ID id) {
        AbstractC2995aW.q(vungleApiClient, "this$0");
        AbstractC2995aW.q(id, "chain");
        HY hy = ((MX) id).e;
        try {
            try {
                C5021xZ c5021xZB = ((MX) id).b(hy);
                String strA = c5021xZB.f.a(HttpResponseHeader.RetryAfter);
                if (strA != null && strA.length() != 0) {
                    try {
                        long j = Long.parseLong(strA);
                        if (j > 0) {
                            String strB = hy.f3175a.b();
                            long jCurrentTimeMillis = (j * ((long) 1000)) + System.currentTimeMillis();
                            if (strB.endsWith(b.JSON_KEY_ADS)) {
                                String placementID = vungleApiClient.getPlacementID(hy.d);
                                if (placementID.length() > 0) {
                                    vungleApiClient.retryAfterDataMap.put(placementID, Long.valueOf(jCurrentTimeMillis));
                                }
                            }
                        }
                    } catch (Exception unused) {
                        C4917wJ.Companion.d(TAG, "Retry-After value is not an valid value");
                    }
                }
                return c5021xZB;
            } catch (OutOfMemoryError unused2) {
                C4917wJ.Companion.e(TAG, "OOM for " + hy.f3175a);
                return vungleApiClient.defaultErrorResponse(hy);
            }
        } catch (Exception e) {
            C4917wJ.Companion.e(TAG, "Exception: " + e.getMessage() + " for " + hy.f3175a);
            return vungleApiClient.defaultErrorResponse(hy);
        }
    }

    @VisibleForTesting
    public final void addPlaySvcAvailabilityInCookie(boolean z) {
        this.filePreferences.put("isPlaySvcAvailable", z).apply();
    }

    public final boolean checkIsRetryAfterActive(String str) {
        AbstractC2995aW.q(str, VungleConstants.KEY_PLACEMENT_ID);
        Long l = this.retryAfterDataMap.get(str);
        if ((l != null ? l.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(str);
        return false;
    }

    public final InterfaceC2435Gc config() throws IOException {
        G5 g5 = this.appBody;
        if (g5 == null) {
            return null;
        }
        C2543Kg c2543Kg = new C2543Kg(getDeviceBody$vungle_ads_release(true), g5, getUserBody$default(this, false, 1, null), (C2361Dg) null, (C2439Gg) null, 24, (AbstractC2471Hm) null);
        C2361Dg extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            c2543Kg.setExt(extBody$default);
        }
        C3300du c3300du = C3300du.INSTANCE;
        String strConcat = BASE_URL;
        if (!c3300du.isValidUrl(strConcat)) {
            strConcat = "https://config.ads.vungle.com/";
        }
        if (!AbstractC3089ba0.n0(strConcat, "/")) {
            strConcat = strConcat.concat("/");
        }
        return this.api.config(Fi0.INSTANCE.getHeaderUa(), strConcat + "config", c2543Kg);
    }

    public final G5 getAppBody$vungle_ads_release() {
        return this.appBody;
    }

    public final String getConnectionTypeDetail(int i) {
        if (i == 1) {
            return "gprs";
        }
        if (i == 2) {
            return "edge";
        }
        if (i == 20) {
            return NetworkUtil.NETWORK_CLASS_5G;
        }
        switch (i) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (i) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    public final String getConnectionTypeDetail$vungle_ads_release() {
        if (PermissionChecker.checkCallingOrSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : "unknown";
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01e0  */
    @VisibleForTesting
    public final synchronized C2577Lo getDeviceBody$vungle_ads_release(boolean z) throws IllegalStateException {
        C2577Lo c2577LoCopy;
        C2551Ko c2551Ko;
        String str;
        try {
            C2577Lo basicDeviceBody = this.baseDeviceInfo;
            if (basicDeviceBody == null) {
                basicDeviceBody = getBasicDeviceBody(this.applicationContext);
                this.baseDeviceInfo = basicDeviceBody;
            }
            C2577Lo c2577Lo = basicDeviceBody;
            c2577LoCopy = c2577Lo.copy((2047 & 1) != 0 ? c2577Lo.make : null, (2047 & 2) != 0 ? c2577Lo.model : null, (2047 & 4) != 0 ? c2577Lo.osv : null, (2047 & 8) != 0 ? c2577Lo.carrier : null, (2047 & 16) != 0 ? c2577Lo.os : null, (2047 & 32) != 0 ? c2577Lo.w : 0, (2047 & 64) != 0 ? c2577Lo.h : 0, (2047 & 128) != 0 ? c2577Lo.ua : null, (2047 & 256) != 0 ? c2577Lo.ifa : null, (2047 & 512) != 0 ? c2577Lo.lmt : null, (2047 & 1024) != 0 ? c2577Lo.ext : null);
            C2551Ko c2551Ko2 = new C2551Ko(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, 262143, (AbstractC2471Hm) null);
            L3 advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = ((C5160z4) this.platform).getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
            L3 l3 = this.advertisingInfo;
            Boolean boolValueOf = l3 != null ? Boolean.valueOf(l3.getLimitAdTracking()) : null;
            OV ov = OV.INSTANCE;
            if (!ov.shouldSendAdIds()) {
                c2551Ko = c2551Ko2;
            } else if (advertisingId != null) {
                if (AbstractC2995aW.i("Amazon", Build.MANUFACTURER)) {
                    c2551Ko = c2551Ko2;
                    c2551Ko.setAmazonAdvertisingId(advertisingId);
                } else {
                    c2551Ko = c2551Ko2;
                    c2551Ko.setGaid(advertisingId);
                }
                c2577LoCopy.setIfa(advertisingId);
            } else {
                c2551Ko = c2551Ko2;
                c2577LoCopy.setIfa("");
            }
            if (z || !ov.shouldSendAdIds()) {
                c2577LoCopy.setIfa(null);
                c2551Ko.setGaid(null);
                c2551Ko.setAmazonAdvertisingId(null);
            }
            Boolean bool = Boolean.TRUE;
            boolean zHasSystemFeature = false;
            c2577LoCopy.setLmt(AbstractC2995aW.i(boolValueOf, bool) ? 1 : 0);
            c2551Ko.setGooglePlayServicesAvailable(AbstractC2995aW.i(bool, isGooglePlayServicesAvailable()));
            if (ov.allowDeviceIDFromTCF() != MV.DISABLE_ID) {
                String appSetId = ((C5160z4) this.platform).getAppSetId();
                if (appSetId != null) {
                    c2551Ko.setAppSetId(appSetId);
                }
                Integer appSetIdScope = ((C5160z4) this.platform).getAppSetIdScope();
                if (appSetIdScope != null) {
                    c2551Ko.setAppSetIdScope(Integer.valueOf(appSetIdScope.intValue()));
                }
            }
            Intent intentRegisterReceiver = this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    c2551Ko.setBatteryLevel(intExtra / intExtra2);
                }
                int intExtra3 = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
                if (intExtra3 == -1) {
                    str = "UNKNOWN";
                } else if (intExtra3 == 2 || intExtra3 == 5) {
                    int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                    if (intExtra4 == 1) {
                        str = "BATTERY_PLUGGED_AC";
                    } else if (intExtra4 != 2) {
                        str = intExtra4 != 4 ? "BATTERY_PLUGGED_OTHERS" : "BATTERY_PLUGGED_WIRELESS";
                    } else {
                        str = "BATTERY_PLUGGED_USB";
                    }
                } else {
                    str = "NOT_CHARGING";
                }
            } else {
                str = "UNKNOWN";
            }
            c2551Ko.setBatteryState(str);
            Object systemService = this.applicationContext.getSystemService("power");
            AbstractC2995aW.o(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            int i = Build.VERSION.SDK_INT;
            c2551Ko.setBatterySaverEnabled(((PowerManager) systemService).isPowerSaveMode() ? 1 : 0);
            String connectionType = getConnectionType();
            if (connectionType != null) {
                c2551Ko.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                c2551Ko.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            c2551Ko.setLocale(Locale.getDefault().toString());
            c2551Ko.setLanguage(Locale.getDefault().getLanguage());
            c2551Ko.setTimeZone(TimeZone.getDefault().getID());
            c2551Ko.setVolumeLevel(((C5160z4) this.platform).getVolumeLevel());
            c2551Ko.setSoundEnabled(((C5160z4) this.platform).isSoundEnabled() ? 1 : 0);
            if (AbstractC2995aW.i("Amazon", Build.MANUFACTURER)) {
                zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else if (i >= 23) {
                Object systemService2 = this.applicationContext.getSystemService("uimode");
                AbstractC2995aW.o(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
                    zHasSystemFeature = true;
                }
            } else if (this.applicationContext.getPackageManager().hasSystemFeature("com.google.android.tv") || !this.applicationContext.getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                zHasSystemFeature = true;
            }
            c2551Ko.setTv(zHasSystemFeature);
            c2551Ko.setSideloadEnabled(((C5160z4) this.platform).isSideLoaded());
            c2551Ko.setSdCardAvailable(((C5160z4) this.platform).isSdCardPresent() ? 1 : 0);
            c2577LoCopy.setUa(this.uaString);
            c2577LoCopy.setExt(c2551Ko);
        } catch (Throwable th) {
            throw th;
        }
        return c2577LoCopy;
    }

    public final VungleApi getGzipApi$vungle_ads_release() {
        return this.gzipApi;
    }

    @VisibleForTesting
    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            AbstractC2995aW.p(googleApiAvailabilityLight, "getInstance()");
            boolean z = googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0;
            boolValueOf = Boolean.valueOf(z);
            addPlaySvcAvailabilityInCookie(z);
            return boolValueOf;
        } catch (Exception unused) {
            C4917wJ.Companion.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            C4917wJ.Companion.w(TAG, "Play services Not available");
            Boolean bool = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
                return bool;
            } catch (Exception unused3) {
                C4917wJ.Companion.w(TAG, "Failure to write GPS availability to DB");
                return bool;
            }
        }
    }

    @VisibleForTesting
    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean("isPlaySvcAvailable");
    }

    public final JD getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(String str) {
        AbstractC2995aW.q(str, VungleConstants.KEY_PLACEMENT_ID);
        Long l = this.retryAfterDataMap.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final synchronized void initialize(String str) {
        PackageInfo packageInfo;
        try {
            AbstractC2995aW.q(str, "appId");
            this.api.setAppId(str);
            this.gzipApi.setAppId(str);
            String str2 = BuildConfig.VERSION_NAME;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                    AbstractC2995aW.p(packageInfo, "{\n                    ap…      )\n                }");
                } else {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                    AbstractC2995aW.p(packageInfo, "{\n                    ap…      )\n                }");
                }
                String str3 = packageInfo.versionName;
                AbstractC2995aW.p(str3, "packageInfo.versionName");
                str2 = str3;
            } catch (Exception unused) {
            }
            this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
            String packageName = this.applicationContext.getPackageName();
            AbstractC2995aW.p(packageName, "applicationContext.packageName");
            this.appBody = new G5(packageName, str2, str);
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072 A[Catch: Exception -> 0x006c, TryCatch #1 {Exception -> 0x006c, blocks: (B:21:0x0064, B:29:0x0072, B:31:0x0086, B:33:0x0097, B:38:0x00a1, B:40:0x00a7, B:42:0x00af, B:44:0x00e1, B:46:0x00ef, B:48:0x0102, B:49:0x0106), top: B:64:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[Catch: Exception -> 0x006c, TryCatch #1 {Exception -> 0x006c, blocks: (B:21:0x0064, B:29:0x0072, B:31:0x0086, B:33:0x0097, B:38:0x00a1, B:40:0x00a7, B:42:0x00af, B:44:0x00e1, B:46:0x00ef, B:48:0x0102, B:49:0x0106), top: B:64:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ef A[Catch: Exception -> 0x006c, TryCatch #1 {Exception -> 0x006c, blocks: (B:21:0x0064, B:29:0x0072, B:31:0x0086, B:33:0x0097, B:38:0x00a1, B:40:0x00a7, B:42:0x00af, B:44:0x00e1, B:46:0x00ef, B:48:0x0102, B:49:0x0106), top: B:64:0x0064 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0102 A[Catch: Exception -> 0x006c, TryCatch #1 {Exception -> 0x006c, blocks: (B:21:0x0064, B:29:0x0072, B:31:0x0086, B:33:0x0097, B:38:0x00a1, B:40:0x00a7, B:42:0x00af, B:44:0x00e1, B:46:0x00ef, B:48:0x0102, B:49:0x0106), top: B:64:0x0064 }] */
    public final C2528Jr pingTPAT(String str, Map<String, String> map, String str2, XA xa, C4126nJ c4126nJ) {
        boolean zIsCleartextTrafficPermitted;
        String str3;
        LY lyA;
        C5109yZ c5109yZExecute;
        Integer numValueOf;
        C5021xZ c5021xZRaw;
        AbstractC2995aW.q(str, "url");
        AbstractC2995aW.q(xa, "requestType");
        if (str.length() != 0) {
            char[] cArr = ZA.k;
            if (C3336eJ.r(str) != null) {
                try {
                    String host = new URL(str).getHost();
                    int i = Build.VERSION.SDK_INT;
                    try {
                        if (i < 24) {
                            if (i >= 23) {
                                zIsCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                            }
                            str3 = this.uaString;
                            if (str3 == null) {
                                str3 = "";
                            }
                            String str4 = str3;
                            if (str2 != null) {
                                MY my = NY.Companion;
                                Pattern pattern = RO.c;
                                RO roU = C3887ke.u("application/json");
                                my.getClass();
                                lyA = MY.a(str2, roU);
                            } else {
                                lyA = null;
                            }
                            c5109yZExecute = ((C4662tS) this.api.pingTPAT(str4, str, xa, map, lyA)).execute();
                            if (c5109yZExecute != null && c5109yZExecute.isSuccessful()) {
                                return null;
                            }
                            if (c5109yZExecute != null || (c5021xZRaw = c5109yZExecute.raw()) == null) {
                                numValueOf = null;
                            } else {
                                numValueOf = Integer.valueOf(c5021xZRaw.d);
                            }
                            if (AbstractC2853Wf.d0(AbstractC2340Cl.K(301, 302, 307, 308), numValueOf)) {
                                C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, B30.NOTIFICATION_REDIRECT, 0L, c4126nJ, str, 2, null);
                                return null;
                            }
                            EnumC4719u30 enumC4719u30 = EnumC4719u30.TPAT_ERROR;
                            StringBuilder sb = new StringBuilder("Tpat failed with error: ");
                            sb.append(numValueOf);
                            sb.append(", message: ");
                            sb.append(c5109yZExecute != null ? c5109yZExecute.message() : null);
                            return new C2528Jr(enumC4719u30, sb.toString(), false, 4, null);
                        }
                        zIsCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(host);
                        str3 = this.uaString;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str5 = str3;
                        if (str2 != null) {
                            MY my2 = NY.Companion;
                            Pattern pattern2 = RO.c;
                            RO roU2 = C3887ke.u("application/json");
                            my2.getClass();
                            lyA = MY.a(str2, roU2);
                        } else {
                            lyA = null;
                        }
                        c5109yZExecute = ((C4662tS) this.api.pingTPAT(str5, str, xa, map, lyA)).execute();
                        if (c5109yZExecute != null) {
                            return null;
                        }
                        if (c5109yZExecute != null) {
                            numValueOf = null;
                        } else {
                            numValueOf = null;
                        }
                        if (AbstractC2853Wf.d0(AbstractC2340Cl.K(301, 302, 307, 308), numValueOf)) {
                            C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, B30.NOTIFICATION_REDIRECT, 0L, c4126nJ, str, 2, null);
                            return null;
                        }
                        EnumC4719u30 enumC4719u31 = EnumC4719u30.TPAT_ERROR;
                        StringBuilder sb2 = new StringBuilder("Tpat failed with error: ");
                        sb2.append(numValueOf);
                        sb2.append(", message: ");
                        sb2.append(c5109yZExecute != null ? c5109yZExecute.message() : null);
                        return new C2528Jr(enumC4719u31, sb2.toString(), false, 4, null);
                    } catch (Exception e) {
                        EnumC4719u30 enumC4719u32 = EnumC4719u30.TPAT_ERROR;
                        String localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = "IOException";
                        }
                        return new C2528Jr(enumC4719u32, localizedMessage, false, 4, null);
                    }
                    if (!zIsCleartextTrafficPermitted && URLUtil.isHttpUrl(str)) {
                        return new C2528Jr(EnumC4719u30.TPAT_ERROR, "Clear Text Traffic is blocked", false, 4, null);
                    }
                } catch (MalformedURLException e2) {
                    EnumC4719u30 enumC4719u33 = EnumC4719u30.TPAT_ERROR;
                    String localizedMessage2 = e2.getLocalizedMessage();
                    if (localizedMessage2 == null) {
                        localizedMessage2 = "MalformedURLException";
                    }
                    return new C2528Jr(enumC4719u33, localizedMessage2, true);
                }
            }
        }
        return new C2528Jr(EnumC4719u30.TPAT_ERROR, "Invalid URL : ".concat(str), true);
    }

    public final void reportErrors(BlockingQueue<C4455r30> blockingQueue, X3 x3) {
        AbstractC2995aW.q(blockingQueue, "errors");
        AbstractC2995aW.q(x3, "requestListener");
        String errorLoggingEndpoint = C3457fi.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint.length() == 0) {
            x3.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (C4455r30 c4455r30 : blockingQueue) {
            c4455r30.setSessionId(getSignalManager().getUuid());
            C4664tU placement = C3457fi.INSTANCE.getPlacement(c4455r30.getPlacementReferenceId());
            if (placement != null) {
                c4455r30.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                c4455r30.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                c4455r30.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                c4455r30.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk$SDKError sdk$SDKError = (Sdk$SDKError) c4455r30.build();
            C4917wJ.Companion.e(TAG, "Sending Error: " + sdk$SDKError.getReason());
            linkedBlockingQueue.add(sdk$SDKError);
        }
        Sdk$SDKErrorBatch sdk$SDKErrorBatch = (Sdk$SDKErrorBatch) Sdk$SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        MY my = NY.Companion;
        byte[] byteArray = sdk$SDKErrorBatch.toByteArray();
        AbstractC2995aW.p(byteArray, "batch.toByteArray()");
        Pattern pattern = RO.c;
        RO roU = C3887ke.u(CommonGatewayClient.HEADER_PROTOBUF);
        int length = sdk$SDKErrorBatch.toByteArray().length;
        my.getClass();
        ((C4662tS) this.api.sendErrors(Fi0.INSTANCE.getHeaderUa(), errorLoggingEndpoint, MY.b(byteArray, roU, 0, length))).enqueue(new C3984li0(x3));
    }

    public final void reportMetrics(BlockingQueue<C5071y30> blockingQueue, X3 x3) {
        AbstractC2995aW.q(blockingQueue, "metrics");
        AbstractC2995aW.q(x3, "requestListener");
        String metricsEndpoint = C3457fi.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint.length() == 0) {
            x3.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (C5071y30 c5071y30 : blockingQueue) {
            c5071y30.setSessionId(getSignalManager().getUuid());
            C4664tU placement = C3457fi.INSTANCE.getPlacement(c5071y30.getPlacementReferenceId());
            if (placement != null) {
                c5071y30.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                c5071y30.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                c5071y30.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                c5071y30.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk$SDKMetric sdk$SDKMetric = (Sdk$SDKMetric) c5071y30.build();
            C4917wJ.Companion.e(TAG, "Sending Metric: " + sdk$SDKMetric.getType());
            linkedBlockingQueue.add(sdk$SDKMetric);
        }
        Sdk$MetricBatch sdk$MetricBatch = (Sdk$MetricBatch) Sdk$MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        MY my = NY.Companion;
        Pattern pattern = RO.c;
        RO roU = C3887ke.u(CommonGatewayClient.HEADER_PROTOBUF);
        byte[] byteArray = sdk$MetricBatch.toByteArray();
        AbstractC2995aW.p(byteArray, "batch.toByteArray()");
        ((C4662tS) this.api.sendMetrics(Fi0.INSTANCE.getHeaderUa(), metricsEndpoint, MY.c(my, roU, byteArray, 0, 12))).enqueue(new C4072mi0(x3));
    }

    public final InterfaceC2435Gc requestAd(String str, C3105bi0 c3105bi0) throws IllegalStateException {
        AbstractC2995aW.q(str, "placement");
        C3457fi c3457fi = C3457fi.INSTANCE;
        String adsEndpoint = c3457fi.getAdsEndpoint();
        C2543Kg c2543KgRequestBody = requestBody(!c3457fi.signalsDisabled(), c3457fi.fpdEnabled());
        C2439Gg c2439Gg = new C2439Gg(AbstractC2340Cl.J(str), (C4155ng) null, (Long) null, (String) null, (String) null, (String) null, 62, (AbstractC2471Hm) null);
        if (c3105bi0 != null) {
            c2439Gg.setAdSize(new C4155ng(c3105bi0.getWidth(), c3105bi0.getHeight()));
        }
        c2543KgRequestBody.setRequest(c2439Gg);
        return this.gzipApi.ads(Fi0.INSTANCE.getHeaderUa(), adsEndpoint, c2543KgRequestBody);
    }

    public final C2543Kg requestBody(boolean z, boolean z2) throws IllegalStateException {
        C2543Kg c2543Kg = new C2543Kg(getDeviceBody(), this.appBody, getUserBody(z2), (C2361Dg) null, (C2439Gg) null, 24, (AbstractC2471Hm) null);
        C2361Dg extBody = getExtBody(z);
        if (extBody != null) {
            c2543Kg.setExt(extBody);
        }
        return c2543Kg;
    }

    public final InterfaceC2435Gc ri(C2439Gg c2439Gg) {
        G5 g5;
        AbstractC2995aW.q(c2439Gg, J0.REQUEST_KEY_EXTRA);
        String riEndpoint = C3457fi.INSTANCE.getRiEndpoint();
        if (riEndpoint == null || riEndpoint.length() == 0 || (g5 = this.appBody) == null) {
            return null;
        }
        C2543Kg c2543Kg = new C2543Kg(getDeviceBody(), g5, getUserBody$default(this, false, 1, null), (C2361Dg) null, (C2439Gg) null, 24, (AbstractC2471Hm) null);
        c2543Kg.setRequest(c2439Gg);
        C2361Dg extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            c2543Kg.setExt(extBody$default);
        }
        return this.api.ri(Fi0.INSTANCE.getHeaderUa(), riEndpoint, c2543Kg);
    }

    public final void sendAdMarkup(String str, String str2) {
        AbstractC2995aW.q(str, LegacyLoadUseCase.KEY_AD_MARKUP);
        AbstractC2995aW.q(str2, "endpoint");
        VungleApi vungleApi = this.api;
        MY my = NY.Companion;
        Pattern pattern = RO.c;
        RO roU = C3887ke.u("application/json");
        my.getClass();
        ((C4662tS) vungleApi.sendAdMarkup(str2, MY.a(str, roU))).enqueue(new C4160ni0());
    }

    public final void setAppBody$vungle_ads_release(G5 g5) {
        this.appBody = g5;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        AbstractC2995aW.q(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(JD jd) {
        AbstractC2995aW.q(jd, "<set-?>");
        this.responseInterceptor = jd;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(Map<String, Long> map) {
        AbstractC2995aW.q(map, "<set-?>");
        this.retryAfterDataMap = map;
    }
}
