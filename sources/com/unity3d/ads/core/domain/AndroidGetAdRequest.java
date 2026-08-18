package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetAdRequest implements GetAdRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetAdRequest", f = "AndroidGetAdRequest.kt", l = {33, 40, 55}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdRequest.this.invoke(null, null, null, this);
        }
    }

    public AndroidGetAdRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository, WebviewConfigurationDataSource webviewConfigurationDataSource, TcfRepository tcfRepository) {
        AbstractC2995aW.q(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(campaignRepository, "campaignRepository");
        AbstractC2995aW.q(webviewConfigurationDataSource, "webViewConfigurationDataSource");
        AbstractC2995aW.q(tcfRepository, "tcfRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webviewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0100  */
    /* JADX WARN: Code duplicated, block: B:29:0x0106  */
    /* JADX WARN: Code duplicated, block: B:32:0x0116  */
    /* JADX WARN: Code duplicated, block: B:35:0x014b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    public Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AdRequestKt.Dsl dsl_create;
        ByteString byteString2;
        AdRequestOuterClass.BannerSize bannerSize2;
        AndroidGetAdRequest androidGetAdRequest;
        AdRequestKt.Dsl dsl;
        String str2;
        AdRequestKt.Dsl dsl2;
        AdRequestKt.Dsl dsl3;
        AdRequestKt.Dsl dsl4;
        AdRequestOuterClass.BannerSize bannerSize3;
        AdRequestKt.Dsl dsl5;
        AndroidGetAdRequest androidGetAdRequest2;
        String tcfString;
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
        Object objStaticDeviceInfo = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                dsl_create = (AdRequestKt.Dsl) anonymousClass1.L$6;
                dsl2 = (AdRequestKt.Dsl) anonymousClass1.L$5;
                AdRequestKt.Dsl dsl6 = (AdRequestKt.Dsl) anonymousClass1.L$4;
                bannerSize2 = (AdRequestOuterClass.BannerSize) anonymousClass1.L$3;
                ByteString byteString3 = (ByteString) anonymousClass1.L$2;
                str2 = (String) anonymousClass1.L$1;
                androidGetAdRequest = (AndroidGetAdRequest) anonymousClass1.L$0;
                AbstractC3375el.b0(objStaticDeviceInfo);
                dsl = dsl6;
                byteString2 = byteString3;
            } else if (i2 == 2) {
                dsl3 = (AdRequestKt.Dsl) anonymousClass1.L$4;
                dsl4 = (AdRequestKt.Dsl) anonymousClass1.L$3;
                dsl5 = (AdRequestKt.Dsl) anonymousClass1.L$2;
                bannerSize3 = (AdRequestOuterClass.BannerSize) anonymousClass1.L$1;
                androidGetAdRequest2 = (AndroidGetAdRequest) anonymousClass1.L$0;
                AbstractC3375el.b0(objStaticDeviceInfo);
                dsl3.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) objStaticDeviceInfo).getVersion());
                dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
                if (bannerSize3 == null) {
                    dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
                } else {
                    dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
                    dsl4.setBannerSize(bannerSize3);
                }
                tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
                if (tcfString != null) {
                    dsl4.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
                }
                AdRequestOuterClass.AdRequest adRequest_build = dsl5._build();
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
                UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion._create(builderNewBuilder);
                dsl_create2.setAdRequest(adRequest_build);
                UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetAdRequest2.getUniversalRequestForPayLoad;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 3;
                objStaticDeviceInfo = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
                if (objStaticDeviceInfo == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objStaticDeviceInfo);
            }
            return objStaticDeviceInfo;
        }
        AbstractC3375el.b0(objStaticDeviceInfo);
        AdRequestKt.Dsl.Companion companion2 = AdRequestKt.Dsl.Companion;
        AdRequestOuterClass.AdRequest.Builder builderNewBuilder2 = AdRequestOuterClass.AdRequest.newBuilder();
        AbstractC2995aW.p(builderNewBuilder2, "newBuilder()");
        dsl_create = companion2._create(builderNewBuilder2);
        dsl_create.setSessionCounters(this.sessionRepository.getSessionCounters());
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = str;
        byteString2 = byteString;
        anonymousClass1.L$2 = byteString2;
        bannerSize2 = bannerSize;
        anonymousClass1.L$3 = bannerSize2;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.L$6 = dsl_create;
        anonymousClass1.label = 1;
        objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == enumC4602sk) {
            return enumC4602sk;
        }
        androidGetAdRequest = this;
        dsl = dsl_create;
        str2 = str;
        dsl2 = dsl;
        dsl_create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl2.setDynamicDeviceInfo(androidGetAdRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString2);
        dsl2.setPlacementId(str2);
        dsl2.setRequestImpressionConfiguration(true);
        WebviewConfigurationDataSource webviewConfigurationDataSource = androidGetAdRequest.webViewConfigurationDataSource;
        anonymousClass1.L$0 = androidGetAdRequest;
        anonymousClass1.L$1 = bannerSize2;
        anonymousClass1.L$2 = dsl;
        anonymousClass1.L$3 = dsl2;
        anonymousClass1.L$4 = dsl2;
        anonymousClass1.L$5 = null;
        anonymousClass1.L$6 = null;
        anonymousClass1.label = 2;
        objStaticDeviceInfo = webviewConfigurationDataSource.get(anonymousClass1);
        if (objStaticDeviceInfo == enumC4602sk) {
            return enumC4602sk;
        }
        dsl3 = dsl2;
        dsl4 = dsl3;
        bannerSize3 = bannerSize2;
        dsl5 = dsl;
        androidGetAdRequest2 = androidGetAdRequest;
        dsl3.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) objStaticDeviceInfo).getVersion());
        dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
        if (bannerSize3 == null) {
            dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
        } else {
            dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
            dsl4.setBannerSize(bannerSize3);
        }
        tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
        if (tcfString != null) {
            dsl4.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
        }
        AdRequestOuterClass.AdRequest adRequest_build2 = dsl5._build();
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion3 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder3 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        AbstractC2995aW.p(builderNewBuilder3, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setAdRequest(adRequest_build2);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build2 = dsl_create3._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = androidGetAdRequest2.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 3;
        objStaticDeviceInfo = getUniversalRequestForPayLoad2.invoke(payload_build2, anonymousClass1);
        if (objStaticDeviceInfo == enumC4602sk) {
            return enumC4602sk;
        }
        return objStaticDeviceInfo;
    }
}
