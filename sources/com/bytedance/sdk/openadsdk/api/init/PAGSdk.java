package com.bytedance.sdk.openadsdk.api.init;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.bytedance.sdk.component.LD;
import com.bytedance.sdk.component.OY.JXs;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.OY.QAg;
import com.bytedance.sdk.component.OY.lc;
import com.bytedance.sdk.component.OY.nBu;
import com.bytedance.sdk.component.QAg.ZU;
import com.bytedance.sdk.component.QAg.lk;
import com.bytedance.sdk.component.ebl.lk.Lxb;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.core.IeN;
import com.bytedance.sdk.openadsdk.core.NXR;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.foI;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.core.settings.sLN;
import com.bytedance.sdk.openadsdk.eK.LD.ebl;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.brP;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4496rb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4918wK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ro0;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    private static long Lxb;

    public interface PAGInitCallback {
        void fail(int i, String str);

        void success();
    }

    static {
        try {
            LD.Lxb(new LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
                @Override // com.bytedance.sdk.component.LD.Lxb
                public ExecutorService getExecutorService() {
                    return hg.ZU();
                }
            });
            hg.Lxb(new OY("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    PAGInitHelper.initAPM();
                    PAGInitHelper.initMemoryData();
                }
            });
            STP.Lxb(System.currentTimeMillis());
            STP.LD();
            ZU.setWebViewProvider(new ZU.lk() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // com.bytedance.sdk.component.QAg.ZU.lk
                public WebView createWebView(Context context, AttributeSet attributeSet, int i) {
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i == 0 ? new lk(context, attributeSet) : new lk(context, attributeSet, i);
                    } catch (Exception unused) {
                        return i == 0 ? new lk(context, attributeSet) : new lk(context, attributeSet, i);
                    }
                }
            });
        } catch (Throwable th) {
            th.getMessage();
        }
        Lxb = 0L;
    }

    private static void JXs(Context context, InitConfig initConfig) {
        if (sLN.Lxb()) {
            lc.lk(-1);
            JXs.Lxb(new nBu() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7
                @Override // com.bytedance.sdk.component.OY.nBu
                public QAg createThreadFactory(int i, String str) {
                    return new QAg(i, str) { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7.1
                        @Override // com.bytedance.sdk.component.OY.QAg, java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            int iBG = VVE.TA().bG();
                            if (iBG < -524288 || iBG >= 0) {
                                return super.newThread(runnable);
                            }
                            Thread thread = new Thread(this.Lxb, runnable, this.LD, iBG);
                            if (thread.isDaemon()) {
                                thread.setDaemon(false);
                            }
                            int i2 = this.lk;
                            if (i2 > 10 || i2 <= 0) {
                                this.lk = 5;
                            }
                            thread.setPriority(this.lk);
                            return thread;
                        }
                    };
                }
            });
            com.bytedance.sdk.openadsdk.multipro.lk.Lxb(context);
            Lxb.Lxb(new com.bytedance.sdk.component.ebl.lk.lk() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8
                @Override // com.bytedance.sdk.component.ebl.lk.lk
                public ExecutorService getThreadPool() {
                    return hg.ZU();
                }
            });
            com.bytedance.sdk.openadsdk.ebl.LD.lk();
            STP.LD.set(true);
            try {
                com.bytedance.sdk.component.adexpress.Lxb.Lxb.Lxb.Lxb().Lxb(new com.bytedance.sdk.openadsdk.QAg.Lxb());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.PAGSdk", e.getMessage());
            }
            lk(initConfig);
            lk(context, initConfig);
            Ro0.f3682a = context;
            Ro0.b = null;
            Ro0.e = 2;
            Ro0.c = initConfig.isSupportMultiProcess();
            Ro0.d = com.bytedance.sdk.openadsdk.kqm.lk.Lxb().LD().JXs();
            int i = Build.VERSION.SDK_INT;
            if (i < 23) {
                context.getClass();
                AbstractC2871Wx.f3947a = context;
                if (i < 23) {
                    LK lk = AbstractC4918wK.f5175a;
                }
            }
        }
    }

    private static void ZU(Context context, InitConfig initConfig) {
        if (TextUtils.isEmpty(initConfig.getPackageName())) {
            tD.Lxb((String) null);
            com.bytedance.adsdk.ugeno.ebl.ZU.Lxb((String) null);
        } else {
            tD.Lxb(initConfig.getPackageName());
            com.bytedance.adsdk.ugeno.ebl.ZU.Lxb(initConfig.getPackageName());
        }
        kqm.LD(context);
        if (initConfig.isSupportMultiProcess()) {
            com.bytedance.sdk.openadsdk.multipro.LD.Lxb();
        } else {
            com.bytedance.sdk.openadsdk.multipro.LD.LD();
        }
        com.bytedance.sdk.openadsdk.core.OY.sLN.Lxb();
        com.bytedance.sdk.openadsdk.core.JVA.LD.Lxb(context);
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && STP.ZU() == 0) {
            PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
        }
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.multipro.lk.Lxb();
    }

    public static String getApplicationName(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static String getBiddingToken(Context context, String str) {
        if (com.bytedance.sdk.openadsdk.common.JXs.Lxb()) {
            return null;
        }
        kqm.LD(context);
        return getBiddingToken(str);
    }

    public static String getSDKVersion() {
        return foI.Lxb() != null ? foI.Lxb().ZU() : "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.13
            @Override // java.lang.Runnable
            public void run() {
                PAGSdk.LD(context, pAGConfig, pAGInitCallback);
            }
        });
        STP.OY();
    }

    public static boolean isInitSuccess() {
        return STP.ZU() == 1;
    }

    private static void lc(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        hg.Lxb(new OY("init_sync") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9
            @Override // java.lang.Runnable
            public void run() {
                STP.Lxb(initConfig.getData());
                com.bytedance.sdk.openadsdk.DY.Lxb.Lxb(context, initConfig.getAppId());
                com.bytedance.sdk.openadsdk.DY.Lxb.Lxb();
                com.bytedance.sdk.openadsdk.VVE.lk.Lxb();
                com.bytedance.sdk.openadsdk.VVE.lk.LD();
                new com.bytedance.sdk.openadsdk.utils.STP();
                com.bytedance.sdk.component.adexpress.Lxb.LD.lc.Lxb(brP.Lxb() * 10);
                com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(context, initConfig.isSupportMultiProcess());
                IeN.Lxb().LD();
                com.bytedance.sdk.openadsdk.core.QAg.lk.Lxb();
                com.bytedance.sdk.openadsdk.HD.Lxb.Lxb(new com.bytedance.sdk.openadsdk.HD.Lxb.InterfaceC0071Lxb() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9.1
                    public void onGdprChanged(int i) {
                        PAGConfig.setGDPRConsent(i);
                    }
                });
                VVE.ZU = VVE.lk(context);
                ebl.LD();
                JSONObject jSONObjectLXE = kqm.ZU().LXE();
                if (jSONObjectLXE != null) {
                    try {
                        AbstractC4496rb.l = jSONObjectLXE.optInt("splash", 10);
                        AbstractC4496rb.m = jSONObjectLXE.optInt("reward", 10);
                        AbstractC4496rb.n = jSONObjectLXE.optInt("brand", 10);
                        int iOptInt = jSONObjectLXE.optInt("other", 10);
                        AbstractC4496rb.o = iOptInt;
                        if (AbstractC4496rb.l < 0) {
                            AbstractC4496rb.l = 10;
                        }
                        if (AbstractC4496rb.m < 0) {
                            AbstractC4496rb.m = 10;
                        }
                        if (AbstractC4496rb.n < 0) {
                            AbstractC4496rb.n = 10;
                        }
                        if (iOptInt < 0) {
                            AbstractC4496rb.o = 10;
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                AbstractC4496rb.k = CacheDirFactory.getICacheDir(0);
                com.bytedance.sdk.openadsdk.core.settings.lc lcVarZU = kqm.ZU();
                if (!lcVarZU.JZE()) {
                    synchronized (lcVarZU) {
                        try {
                            if (!lcVarZU.JZE()) {
                                lcVarZU.LD();
                                lcVarZU.Ivz();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                DeviceUtils.nBu();
                PAGInitHelper.maybeAsyncInitTask(context);
                PAGSdk.getBiddingToken();
                lc.Lxb(true);
                lc.Lxb(new com.bytedance.sdk.openadsdk.STP.LD.Lxb());
                DeviceUtils.Lxb(context);
                DeviceUtils.nBu(context);
                DeviceUtils.JVA(context);
                com.bytedance.sdk.openadsdk.STP.Lxb.Lxb();
                com.bytedance.sdk.openadsdk.core.settings.ZU.Lxb();
                com.bytedance.sdk.openadsdk.STP.lk.ZU();
                nJ.NXR(context);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb();
                PAGSdk.lk();
                com.bytedance.sdk.openadsdk.core.QAg.lk.LD();
                com.bytedance.sdk.openadsdk.core.ZU.Lxb.Lxb().LD();
                com.bytedance.sdk.component.OY.lk.lk.Lxb(STP.LD());
                com.bytedance.sdk.component.utils.LD.Lxb(new com.bytedance.sdk.component.utils.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9.2
                    @Override // com.bytedance.sdk.component.utils.LD.Lxb
                    public ExecutorService getAsyncStartActivityThreadPool() {
                        return hg.OY();
                    }

                    @Override // com.bytedance.sdk.component.utils.LD.Lxb
                    public boolean isEnableAsyncStartActivity() {
                        return com.bytedance.sdk.openadsdk.DY.Lxb.Lxb("start_activity_async", 0) == 1;
                    }
                });
            }
        });
    }

    private static void lk(Context context, InitConfig initConfig) {
        STP.Lxb = true;
        foI.Lxb().Lxb(initConfig.getAppId()).LD(initConfig.getCoppa()).lk(initConfig.getGdpr()).ZU(initConfig.getCcpa()).lc(initConfig.getAppIconId()).Lxb(initConfig.getTitleBarTheme());
        com.bytedance.sdk.openadsdk.core.QAg.eK();
        if (initConfig instanceof PAGConfig) {
            foI.Lxb().JXs(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (LD(initConfig)) {
                foI.Lxb().Lxb();
                com.bytedance.sdk.openadsdk.utils.VVE.Lxb();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.ebl.Lxb();
    }

    public static boolean onlyVerityPlayable(String str, int i, String str2, String str3, String str4) {
        if (foI.Lxb() != null) {
            return foI.Lxb().Lxb(str, i, str2, str3, str4);
        }
        return false;
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        tD.Lxb(str);
        com.bytedance.adsdk.ugeno.ebl.ZU.Lxb(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && kqm.ZU().brP() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z) {
        com.bytedance.sdk.openadsdk.common.JXs.Lxb(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(final Context context, final InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        Lxb = SystemClock.elapsedRealtime();
        kqm.LD(context);
        if (pAGInitCallback != null) {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (STP.ZU() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.JXs.Lxb()) {
            LD(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (isInitSuccess()) {
            ZU();
            return;
        }
        STP.Lxb(3);
        if (context == null) {
            LD(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        if (initConfig == null) {
            LD(4000, "PAGConfig is null, please check.");
            return;
        }
        ZU(context, initConfig);
        ApmHelper.initApm(context, initConfig);
        try {
            com.bytedance.sdk.openadsdk.core.QAg.Lxb(new NXR() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                @Override // com.bytedance.sdk.openadsdk.core.NXR
                public void fail(int i, String str) {
                    PAGSdk.LD(i, str);
                }

                public void success() {
                    PAGSdk.ZU();
                }
            });
            try {
                tD.Lxb(kqm.Lxb(), "tt_ad_logo_txt");
                if (tD.ZU(context, "tt_ad_logo") == 0) {
                    Lxb(initConfig, pAGInitCallback);
                    return;
                }
                if (isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        ZU();
                        return;
                    }
                    return;
                }
                final com.bytedance.sdk.openadsdk.JXs.Lxb lxb = new com.bytedance.sdk.openadsdk.JXs.Lxb();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return lxb;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    LD(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb().Lxb(new com.bytedance.sdk.openadsdk.multipro.aidl.LD() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.LD
                        public void onServiceConnected() {
                            STP.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    PAGSdk.LD(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb().lk();
                }
            } catch (Throwable unused) {
                Lxb(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            LD(4000, "Internal Error, setting exception. ");
        }
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.JXs.Lxb()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            hg.JXs(new OY("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.14
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                }
            });
        }
    }

    private static void Lxb(InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        STP.Lxb(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                LD(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                LD(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.JXs.Lxb()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            hg.JXs(new OY("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.15
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                }
            });
        }
    }

    private static void Lxb(final Context context, final boolean z, final InitConfig initConfig, final long j, final long j2) {
        com.bytedance.sdk.openadsdk.STP.lk.Lxb();
        com.bytedance.sdk.openadsdk.STP.lk.Lxb("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.10
            @Override // com.bytedance.sdk.openadsdk.STP.LD
            public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zLk = com.bytedance.sdk.openadsdk.core.QAg.LD().lk();
                    jSONObject.put("duration", j);
                    jSONObject.put("sdk_init_time", j2);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", PAGSdk.LD(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zLk);
                    jSONObject.put("minSdkVersion", nJ.JVA(context));
                    jSONObject.put("targetSdkVersion", nJ.nBu(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z);
                    com.bytedance.sdk.openadsdk.core.QAg.LD().LD(false);
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.PAGSdk", "run: ", e);
                }
                return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("pangle_sdk_init").LD(jSONObject.toString());
            }
        });
    }

    public static String getBiddingToken(String str) {
        if (com.bytedance.sdk.openadsdk.common.JXs.Lxb()) {
            return null;
        }
        return (kqm.Lxb() == null || foI.Lxb() == null) ? "" : foI.Lxb().lk(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ZU() {
        STP.Lxb(1);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                try {
                    Iterator<PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.bytedance.sdk.openadsdk.VVE.lk.LD(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.11
                @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                    return AbstractC3950lJ.l("init");
                }
            });
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.sLN.LD(th2.getMessage());
        }
    }

    public static String getBiddingToken(Context context) {
        if (com.bytedance.sdk.openadsdk.common.JXs.Lxb()) {
            return null;
        }
        kqm.LD(context);
        return getBiddingToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lk() {
        ShortcutManager shortcutManagerB;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextLxb = kqm.Lxb();
                if (contextLxb == null || (shortcutManagerB = B60.b(contextLxb.getSystemService(B60.c()))) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.QAg.LD().Lxb(shortcutManagerB.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    public static String getBiddingToken() {
        if (com.bytedance.sdk.openadsdk.common.JXs.Lxb()) {
            return null;
        }
        return (kqm.Lxb() == null || foI.Lxb() == null) ? "" : foI.Lxb().JXs();
    }

    private static void lk(InitConfig initConfig) {
        if (!TextUtils.isEmpty(initConfig.getData())) {
            com.bytedance.sdk.openadsdk.core.QAg.LD().lk(initConfig.getData());
        }
        com.bytedance.sdk.openadsdk.core.QAg.LD().lk(LD(initConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(Context context, InitConfig initConfig) {
        long j;
        try {
            if (isInitSuccess()) {
                ZU();
                return;
            }
            JXs(context, initConfig);
            VVE.TA().Sfi();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - Lxb;
            ZU();
            lc(context, initConfig);
            j = jElapsedRealtime;
            Lxb(context, isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - Lxb, j);
        } catch (Throwable th) {
            th.getMessage();
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.PAGSdk", th.getMessage());
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - Lxb;
            LD(4000, th.getMessage());
            j = jElapsedRealtime2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean LD(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(int i, String str) {
        STP.Lxb(2);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                try {
                    Iterator<PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i, str);
                        }
                    }
                    com.bytedance.sdk.openadsdk.VVE.lk.lk(new com.bytedance.sdk.openadsdk.VVE.ZU() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.12
                        @Override // com.bytedance.sdk.openadsdk.VVE.ZU
                        public com.bytedance.sdk.openadsdk.VVE.LD.Lxb generatorModel() {
                            return AbstractC3950lJ.l("init");
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.sLN.LD(th2.getMessage());
        }
    }
}
