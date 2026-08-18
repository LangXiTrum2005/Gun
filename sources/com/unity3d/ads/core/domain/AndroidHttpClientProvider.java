package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.MBridgeConstans;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IExperiments;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4350pq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4838vS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4613sq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.File;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private final AlternativeFlowReader alternativeFlowReader;
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", l = {45}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(this);
        }
    }

    public AndroidHttpClientProvider(ConfigFileFromLocalStorage configFileFromLocalStorage, AlternativeFlowReader alternativeFlowReader, ISDKDispatchers iSDKDispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory) {
        AbstractC2995aW.q(configFileFromLocalStorage, "configFileFromLocalStorage");
        AbstractC2995aW.q(alternativeFlowReader, "alternativeFlowReader");
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = iSDKDispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x007a, please report this as an issue */
    public final String buildCronetCachePath(Context context) {
        int length;
        String string;
        File file;
        int iS0;
        File filesDir = context.getFilesDir();
        AbstractC2995aW.p(filesDir, "context.filesDir");
        File file2 = new File(UnityAdsConstants.DefaultUrls.HTTP_CACHE_DIR_NAME);
        String path = file2.getPath();
        AbstractC2995aW.p(path, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        char c = File.separatorChar;
        int iS1 = AbstractC3089ba0.s0(path, c, 0, false, 4);
        if (iS1 == 0) {
            if (path.length() > 1 && path.charAt(1) == c && (iS0 = AbstractC3089ba0.s0(path, c, 2, false, 4)) >= 0) {
                int iS2 = AbstractC3089ba0.s0(path, c, iS0 + 1, false, 4);
                length = iS2 >= 0 ? iS2 + 1 : path.length();
            }
            if (!file2.exists()) {
                file2.mkdirs();
            }
            String absolutePath = file2.getAbsolutePath();
            AbstractC2995aW.p(absolutePath, "cacheDir.absolutePath");
            return absolutePath;
        }
        if (iS1 <= 0 || path.charAt(iS1 - 1) != ':') {
            if (iS1 == -1 && AbstractC3089ba0.m0(path, ':')) {
                length = path.length();
            } else {
                string = filesDir.toString();
                AbstractC2995aW.p(string, "this.toString()");
                if (string.length() == 0 && !AbstractC3089ba0.m0(string, c)) {
                    file = new File(string + c + file2);
                } else {
                    file = new File(string + file2);
                }
                file2 = file;
            }
            if (!file2.exists()) {
                file2.mkdirs();
            }
            String absolutePath2 = file2.getAbsolutePath();
            AbstractC2995aW.p(absolutePath2, "cacheDir.absolutePath");
            return absolutePath2;
        }
        length = iS1 + 1;
        if (length <= 0) {
            string = filesDir.toString();
            AbstractC2995aW.p(string, "this.toString()");
            if (string.length() == 0) {
                file = new File(string + file2);
            } else {
                file = new File(string + c + file2);
            }
            file2 = file;
        }
        if (!file2.exists()) {
            file2.mkdirs();
        }
        String absolutePath3 = file2.getAbsolutePath();
        AbstractC2995aW.p(absolutePath3, "cacheDir.absolutePath");
        return absolutePath3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, InterfaceC2857Wj interfaceC2857Wj) {
        final C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        CronetProviderInstaller.installProvider(context).addOnCompleteListener(new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> task) {
                AbstractC2995aW.q(task, "it");
                if (!task.isSuccessful()) {
                    c2798Uc.resumeWith(new OkHttp3Client(iSDKDispatchers, new C4838vS()));
                    return;
                }
                try {
                    CronetEngine cronetEngineBuild = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context).setStoragePath(this.this$0.buildCronetCachePath(context)).enableHttpCache(3, ServiceProvider.HTTP_CACHE_DISK_SIZE).enableQuic(true).addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443).addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443).build();
                    InterfaceC2772Tc interfaceC2772Tc = c2798Uc;
                    AbstractC2995aW.p(cronetEngineBuild, "cronetEngine");
                    interfaceC2772Tc.resumeWith(new CronetClient(cronetEngineBuild, iSDKDispatchers));
                } catch (Throwable unused) {
                    c2798Uc.resumeWith(new OkHttp3Client(iSDKDispatchers, new C4838vS()));
                }
            }
        });
        return c2798Uc.s();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        AnonymousClass1 anonymousClass1;
        IExperiments experiments;
        AndroidHttpClientProvider androidHttpClientProvider;
        long j;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
        }
        Object objF0 = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objF0);
            if (!this.alternativeFlowReader.invoke()) {
                Configuration configuration = (Configuration) WD.R(C2734Rq.f3684a, new AndroidHttpClientProvider$invoke$config$1(this, null));
                return (configuration == null || (experiments = configuration.getExperiments()) == null || !experiments.isOkHttpEnabled()) ? new LegacyHttpClient(this.dispatchers) : new OkHttp3Client(this.dispatchers, new C4838vS());
            }
            long jA = IP.a();
            AndroidHttpClientProvider$invoke$client$1 androidHttpClientProvider$invoke$client$1 = new AndroidHttpClientProvider$invoke$client$1(this, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.J$0 = jA;
            anonymousClass1.label = 1;
            objF0 = AbstractC2995aW.F0(500L, androidHttpClientProvider$invoke$client$1, anonymousClass1);
            if (objF0 == enumC4602sk) {
                return enumC4602sk;
            }
            androidHttpClientProvider = this;
            j = jA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = anonymousClass1.J$0;
            androidHttpClientProvider = (AndroidHttpClientProvider) anonymousClass1.L$0;
            AbstractC3375el.b0(objF0);
        }
        HttpClient httpClient = (HttpClient) objF0;
        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHttpClientProvider.sendDiagnosticEvent, httpClient == null ? "native_cronet_failure_time" : "native_cronet_success_time", new Double(C4350pq.g(Bc0.a(j), EnumC4613sq.MILLISECONDS)), null, null, null, 28, null);
        return httpClient == null ? new OkHttp3Client(androidHttpClientProvider.dispatchers, new C4838vS()) : httpClient;
    }
}
