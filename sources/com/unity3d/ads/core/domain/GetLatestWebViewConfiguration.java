package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GetLatestWebViewConfiguration {
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.GetLatestWebViewConfiguration", f = "GetLatestWebViewConfiguration.kt", l = {16, 31}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetLatestWebViewConfiguration.this.invoke(null, null, null, this);
        }
    }

    public GetLatestWebViewConfiguration(WebviewConfigurationDataSource webviewConfigurationDataSource) {
        AbstractC2995aW.q(webviewConfigurationDataSource, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object invoke$default(GetLatestWebViewConfiguration getLatestWebViewConfiguration, String str, Integer num, List list, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        return getLatestWebViewConfiguration.invoke(str, num, list, interfaceC2857Wj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(String str, Integer num, List<String> list, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        GetLatestWebViewConfiguration getLatestWebViewConfiguration;
        WebViewConfiguration webViewConfiguration;
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
        Object obj = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                list = (List) anonymousClass1.L$3;
                num = (Integer) anonymousClass1.L$2;
                str = (String) anonymousClass1.L$1;
                getLatestWebViewConfiguration = (GetLatestWebViewConfiguration) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                webViewConfiguration = (WebViewConfiguration) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
            }
            return webViewConfiguration;
        }
        AbstractC3375el.b0(obj);
        WebviewConfigurationDataSource webviewConfigurationDataSource = this.webviewConfigurationDataSource;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = str;
        anonymousClass1.L$2 = num;
        anonymousClass1.L$3 = list;
        anonymousClass1.label = 1;
        obj = webviewConfigurationDataSource.get(anonymousClass1);
        if (obj == enumC4602sk) {
            return enumC4602sk;
        }
        getLatestWebViewConfiguration = this;
        WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore = (WebviewConfigurationStore.WebViewConfigurationStore) obj;
        int version = webViewConfigurationStore.getVersion();
        String entryPoint = webViewConfigurationStore.getEntryPoint();
        AbstractC2995aW.p(entryPoint, "it.entryPoint");
        List<String> additionalFilesList = webViewConfigurationStore.getAdditionalFilesList();
        AbstractC2995aW.p(additionalFilesList, "it.additionalFilesList");
        WebViewConfiguration webViewConfiguration2 = new WebViewConfiguration(version, entryPoint, additionalFilesList);
        if (str == null && num == null && list == null) {
            return webViewConfiguration2;
        }
        int iIntValue = num != null ? num.intValue() : webViewConfiguration2.getVersion();
        if (str == null) {
            str = webViewConfiguration2.getEntryPoint();
        }
        if (list == null) {
            list = webViewConfiguration2.getAdditionalFiles();
        }
        WebViewConfiguration webViewConfiguration3 = new WebViewConfiguration(iIntValue, str, list);
        if (AbstractC2995aW.i(webViewConfiguration3, webViewConfiguration2)) {
            return webViewConfiguration3;
        }
        WebviewConfigurationDataSource webviewConfigurationDataSource2 = getLatestWebViewConfiguration.webviewConfigurationDataSource;
        WebviewConfigurationStore.WebViewConfigurationStore.Builder builderNewBuilder = WebviewConfigurationStore.WebViewConfigurationStore.newBuilder();
        builderNewBuilder.setVersion(webViewConfiguration3.getVersion());
        builderNewBuilder.setEntryPoint(webViewConfiguration3.getEntryPoint());
        builderNewBuilder.addAllAdditionalFiles(webViewConfiguration3.getAdditionalFiles());
        WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStoreBuild = builderNewBuilder.build();
        AbstractC2995aW.p(webViewConfigurationStoreBuild, "newBuilder().apply {\n   …                }.build()");
        anonymousClass1.L$0 = webViewConfiguration3;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        if (webviewConfigurationDataSource2.set(webViewConfigurationStoreBuild, anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        webViewConfiguration = webViewConfiguration3;
        return webViewConfiguration;
    }
}
