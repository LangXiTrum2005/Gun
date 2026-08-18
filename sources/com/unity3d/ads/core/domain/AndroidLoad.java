package com.unity3d.ads.core.domain;

import android.content.Context;
import com.badlogic.gdx.Input;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.AdPlayerConfigResponseOuterClass;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.AdResponseKt;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gatewayprotocol.v1.WebviewConfiguration;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLoad implements Load {
    private final AdRepository adRepository;
    private final AbstractC3899kk defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    private final GetAdRequest getAdRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final HandleGatewayAdResponse handleGatewayAdResponse;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidLoad$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidLoad$invoke$2", f = "AndroidLoad.kt", l = {Input.Keys.SHIFT_LEFT, Input.Keys.TAB, 66, Input.Keys.GRAVE, Input.Keys.MUTE, 94}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ AdRequestOuterClass.BannerSize $bannerSize;
        final /* synthetic */ Context $context;
        final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup $headerBiddingAdMarkup;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $placement;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdRequestOuterClass.BannerSize bannerSize, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, String str, ByteString byteString, UnityAdsLoadOptions unityAdsLoadOptions, Context context, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$bannerSize = bannerSize;
            this.$headerBiddingAdMarkup = headerBiddingAdMarkup;
            this.$placement = str;
            this.$opportunityId = byteString;
            this.$loadOptions = unityAdsLoadOptions;
            this.$context = context;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidLoad.this.new AnonymousClass2(this.$bannerSize, this.$headerBiddingAdMarkup, this.$placement, this.$opportunityId, this.$loadOptions, this.$context, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:53:0x0144 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:54:0x0145  */
        /* JADX WARN: Code duplicated, block: B:57:0x014e A[Catch: UnityAdsNetworkException -> 0x001a, TryCatch #0 {UnityAdsNetworkException -> 0x001a, blocks: (B:6:0x0013, B:75:0x0225, B:77:0x0229, B:78:0x023f, B:9:0x001d, B:70:0x020d, B:72:0x0213, B:79:0x0246, B:82:0x024b, B:83:0x0251, B:12:0x002a, B:55:0x0146, B:57:0x014e, B:59:0x016b, B:61:0x01d4, B:62:0x01e0, B:63:0x01e6, B:67:0x01fe, B:15:0x0038, B:51:0x011d, B:18:0x0047, B:45:0x00e5, B:21:0x0055, B:41:0x00bc, B:24:0x0060, B:26:0x006c, B:28:0x0081, B:33:0x008a, B:35:0x008f, B:37:0x009c, B:47:0x00f3, B:34:0x008d), top: B:86:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x016b A[Catch: UnityAdsNetworkException -> 0x001a, TryCatch #0 {UnityAdsNetworkException -> 0x001a, blocks: (B:6:0x0013, B:75:0x0225, B:77:0x0229, B:78:0x023f, B:9:0x001d, B:70:0x020d, B:72:0x0213, B:79:0x0246, B:82:0x024b, B:83:0x0251, B:12:0x002a, B:55:0x0146, B:57:0x014e, B:59:0x016b, B:61:0x01d4, B:62:0x01e0, B:63:0x01e6, B:67:0x01fe, B:15:0x0038, B:51:0x011d, B:18:0x0047, B:45:0x00e5, B:21:0x0055, B:41:0x00bc, B:24:0x0060, B:26:0x006c, B:28:0x0081, B:33:0x008a, B:35:0x008f, B:37:0x009c, B:47:0x00f3, B:34:0x008d), top: B:86:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:61:0x01d4 A[Catch: UnityAdsNetworkException -> 0x001a, TryCatch #0 {UnityAdsNetworkException -> 0x001a, blocks: (B:6:0x0013, B:75:0x0225, B:77:0x0229, B:78:0x023f, B:9:0x001d, B:70:0x020d, B:72:0x0213, B:79:0x0246, B:82:0x024b, B:83:0x0251, B:12:0x002a, B:55:0x0146, B:57:0x014e, B:59:0x016b, B:61:0x01d4, B:62:0x01e0, B:63:0x01e6, B:67:0x01fe, B:15:0x0038, B:51:0x011d, B:18:0x0047, B:45:0x00e5, B:21:0x0055, B:41:0x00bc, B:24:0x0060, B:26:0x006c, B:28:0x0081, B:33:0x008a, B:35:0x008f, B:37:0x009c, B:47:0x00f3, B:34:0x008d), top: B:86:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:65:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:66:0x01fd  */
        /* JADX WARN: Code duplicated, block: B:69:0x020c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:72:0x0213 A[Catch: UnityAdsNetworkException -> 0x001a, TryCatch #0 {UnityAdsNetworkException -> 0x001a, blocks: (B:6:0x0013, B:75:0x0225, B:77:0x0229, B:78:0x023f, B:9:0x001d, B:70:0x020d, B:72:0x0213, B:79:0x0246, B:82:0x024b, B:83:0x0251, B:12:0x002a, B:55:0x0146, B:57:0x014e, B:59:0x016b, B:61:0x01d4, B:62:0x01e0, B:63:0x01e6, B:67:0x01fe, B:15:0x0038, B:51:0x011d, B:18:0x0047, B:45:0x00e5, B:21:0x0055, B:41:0x00bc, B:24:0x0060, B:26:0x006c, B:28:0x0081, B:33:0x008a, B:35:0x008f, B:37:0x009c, B:47:0x00f3, B:34:0x008d), top: B:86:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:74:0x0224 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:77:0x0229 A[Catch: UnityAdsNetworkException -> 0x001a, TryCatch #0 {UnityAdsNetworkException -> 0x001a, blocks: (B:6:0x0013, B:75:0x0225, B:77:0x0229, B:78:0x023f, B:9:0x001d, B:70:0x020d, B:72:0x0213, B:79:0x0246, B:82:0x024b, B:83:0x0251, B:12:0x002a, B:55:0x0146, B:57:0x014e, B:59:0x016b, B:61:0x01d4, B:62:0x01e0, B:63:0x01e6, B:67:0x01fe, B:15:0x0038, B:51:0x011d, B:18:0x0047, B:45:0x00e5, B:21:0x0055, B:41:0x00bc, B:24:0x0060, B:26:0x006c, B:28:0x0081, B:33:0x008a, B:35:0x008f, B:37:0x009c, B:47:0x00f3, B:34:0x008d), top: B:86:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:78:0x023f A[Catch: UnityAdsNetworkException -> 0x001a, TryCatch #0 {UnityAdsNetworkException -> 0x001a, blocks: (B:6:0x0013, B:75:0x0225, B:77:0x0229, B:78:0x023f, B:9:0x001d, B:70:0x020d, B:72:0x0213, B:79:0x0246, B:82:0x024b, B:83:0x0251, B:12:0x002a, B:55:0x0146, B:57:0x014e, B:59:0x016b, B:61:0x01d4, B:62:0x01e0, B:63:0x01e6, B:67:0x01fe, B:15:0x0038, B:51:0x011d, B:18:0x0047, B:45:0x00e5, B:21:0x0055, B:41:0x00bc, B:24:0x0060, B:26:0x006c, B:28:0x0081, B:33:0x008a, B:35:0x008f, B:37:0x009c, B:47:0x00f3, B:34:0x008d), top: B:86:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x0246 A[Catch: UnityAdsNetworkException -> 0x001a, TryCatch #0 {UnityAdsNetworkException -> 0x001a, blocks: (B:6:0x0013, B:75:0x0225, B:77:0x0229, B:78:0x023f, B:9:0x001d, B:70:0x020d, B:72:0x0213, B:79:0x0246, B:82:0x024b, B:83:0x0251, B:12:0x002a, B:55:0x0146, B:57:0x014e, B:59:0x016b, B:61:0x01d4, B:62:0x01e0, B:63:0x01e6, B:67:0x01fe, B:15:0x0038, B:51:0x011d, B:18:0x0047, B:45:0x00e5, B:21:0x0055, B:41:0x00bc, B:24:0x0060, B:26:0x006c, B:28:0x0081, B:33:0x008a, B:35:0x008f, B:37:0x009c, B:47:0x00f3, B:34:0x008d), top: B:86:0x0008 }] */
        /* JADX WARN: Code duplicated, block: B:81:0x024a  */
        /* JADX WARN: Code duplicated, block: B:82:0x024b A[Catch: UnityAdsNetworkException -> 0x001a, TryCatch #0 {UnityAdsNetworkException -> 0x001a, blocks: (B:6:0x0013, B:75:0x0225, B:77:0x0229, B:78:0x023f, B:9:0x001d, B:70:0x020d, B:72:0x0213, B:79:0x0246, B:82:0x024b, B:83:0x0251, B:12:0x002a, B:55:0x0146, B:57:0x014e, B:59:0x016b, B:61:0x01d4, B:62:0x01e0, B:63:0x01e6, B:67:0x01fe, B:15:0x0038, B:51:0x011d, B:18:0x0047, B:45:0x00e5, B:21:0x0055, B:41:0x00bc, B:24:0x0060, B:26:0x006c, B:28:0x0081, B:33:0x008a, B:35:0x008f, B:37:0x009c, B:47:0x00f3, B:34:0x008d), top: B:86:0x0008 }] */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            Object objInvoke;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType;
            int i;
            Object objInvoke2;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
            Object objRequest$default;
            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
            AdResponseOuterClass.AdResponse adResponse;
            Object objRequest$default2;
            boolean z;
            Object objInvoke3;
            UniversalResponseOuterClass.UniversalResponse universalResponse;
            AdPlayerConfigResponseOuterClass.AdPlayerConfigResponse adPlayerConfigResponse;
            AdResponseKt.Dsl dsl_create;
            LoadResult loadResult;
            Object ad;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            try {
                switch (this.label) {
                    case 0:
                        AbstractC3375el.b0(obj);
                        if (!AndroidLoad.this.sessionRepository.isSdkInitialized()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, null, null, "not_initialized", null, false, 54, null);
                        }
                        boolean z2 = this.$bannerSize != null;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4 = z2 ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
                        int i2 = !this.$headerBiddingAdMarkup.getAdData().isEmpty() ? 1 : 0;
                        if (i2 == 0) {
                            AndroidLoad.this.incrementLoadRequestCount(z2);
                            GetAdRequest getAdRequest = AndroidLoad.this.getAdRequest;
                            String str = this.$placement;
                            ByteString byteString = this.$opportunityId;
                            AdRequestOuterClass.BannerSize bannerSize = this.$bannerSize;
                            this.L$0 = diagnosticAdType4;
                            this.I$0 = i2;
                            this.label = 1;
                            objInvoke2 = getAdRequest.invoke(str, byteString, bannerSize, this);
                            if (objInvoke2 == enumC4602sk) {
                                return enumC4602sk;
                            }
                            diagnosticAdType2 = diagnosticAdType4;
                            i = i2;
                            UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) objInvoke2;
                            RequestPolicy requestPolicyInvoke = AndroidLoad.this.getRequestPolicy.invoke();
                            GatewayClient gatewayClient = AndroidLoad.this.gatewayClient;
                            OperationType operationType = OperationType.LOAD;
                            this.L$0 = diagnosticAdType2;
                            this.I$0 = i;
                            this.label = 2;
                            objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, this, 1, null);
                            if (objRequest$default == enumC4602sk) {
                                return enumC4602sk;
                            }
                            diagnosticAdType3 = diagnosticAdType2;
                            adResponse = ((UniversalResponseOuterClass.UniversalResponse) objRequest$default).getPayload().getAdResponse();
                            AdResponseOuterClass.AdResponse adResponse2 = adResponse;
                            DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType5 = diagnosticAdType3;
                            HandleGatewayAdResponse handleGatewayAdResponse = AndroidLoad.this.handleGatewayAdResponse;
                            UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                            ByteString byteString2 = this.$opportunityId;
                            AbstractC2995aW.p(adResponse2, "response");
                            Context context = this.$context;
                            String str2 = this.$placement;
                            if (i != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.L$0 = null;
                            this.label = 5;
                            objInvoke3 = handleGatewayAdResponse.invoke(unityAdsLoadOptions, byteString2, adResponse2, context, str2, diagnosticAdType5, z, this);
                            if (objInvoke3 == enumC4602sk) {
                                return enumC4602sk;
                            }
                            loadResult = (LoadResult) objInvoke3;
                            if (!(loadResult instanceof LoadResult.Success)) {
                                if (loadResult instanceof LoadResult.Failure) {
                                    return loadResult;
                                }
                                throw new C3770jF(7, 0);
                            }
                            AdRepository adRepository = AndroidLoad.this.adRepository;
                            ByteString byteString3 = this.$opportunityId;
                            this.label = 6;
                            ad = adRepository.getAd(byteString3, this);
                            if (ad == enumC4602sk) {
                                return enumC4602sk;
                            }
                            AdObject adObject = (AdObject) ad;
                            return adObject == null ? new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_AD_OBJECT, null, "ad_object_not_found", null, false, 52, null) : new LoadResult.Success(adObject);
                        }
                        AndroidLoad.this.incrementLoadRequestAdmCount(z2);
                        GetAdPlayerConfigRequest getAdPlayerConfigRequest = AndroidLoad.this.getAdPlayerConfigRequest;
                        String str3 = this.$placement;
                        ByteString byteString4 = this.$opportunityId;
                        ByteString configurationToken = this.$headerBiddingAdMarkup.getConfigurationToken();
                        AbstractC2995aW.p(configurationToken, "headerBiddingAdMarkup.configurationToken");
                        this.L$0 = diagnosticAdType4;
                        this.I$0 = i2;
                        this.label = 3;
                        objInvoke = getAdPlayerConfigRequest.invoke(str3, byteString4, configurationToken, this);
                        if (objInvoke == enumC4602sk) {
                            return enumC4602sk;
                        }
                        diagnosticAdType = diagnosticAdType4;
                        i = i2;
                        UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                        RequestPolicy requestPolicyInvoke2 = AndroidLoad.this.getRequestPolicy.invoke();
                        GatewayClient gatewayClient2 = AndroidLoad.this.gatewayClient;
                        OperationType operationType2 = OperationType.LOAD_HEADER_BIDDING;
                        this.L$0 = diagnosticAdType;
                        this.I$0 = i;
                        this.label = 4;
                        objRequest$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, requestPolicyInvoke2, operationType2, this, 1, null);
                        if (objRequest$default2 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        diagnosticAdType3 = diagnosticAdType;
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objRequest$default2;
                        if (universalResponse.hasError()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                        }
                        adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup = this.$headerBiddingAdMarkup;
                        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
                        AdResponseOuterClass.AdResponse.Builder builderNewBuilder = AdResponseOuterClass.AdResponse.newBuilder();
                        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
                        dsl_create = companion._create(builderNewBuilder);
                        ByteString adData = headerBiddingAdMarkup.getAdData();
                        AbstractC2995aW.p(adData, "headerBiddingAdMarkup.adData");
                        dsl_create.setAdData(adData);
                        dsl_create.setAdDataVersion(headerBiddingAdMarkup.getAdDataVersion());
                        ByteString trackingToken = adPlayerConfigResponse.getTrackingToken();
                        AbstractC2995aW.p(trackingToken, "response.trackingToken");
                        dsl_create.setTrackingToken(trackingToken);
                        ByteString impressionConfiguration = adPlayerConfigResponse.getImpressionConfiguration();
                        AbstractC2995aW.p(impressionConfiguration, "response.impressionConfiguration");
                        dsl_create.setImpressionConfiguration(impressionConfiguration);
                        dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                        WebviewConfiguration.WebViewConfiguration webviewConfiguration = adPlayerConfigResponse.getWebviewConfiguration();
                        AbstractC2995aW.p(webviewConfiguration, "response.webviewConfiguration");
                        dsl_create.setWebviewConfiguration(webviewConfiguration);
                        ByteString adDataRefreshToken = adPlayerConfigResponse.getAdDataRefreshToken();
                        AbstractC2995aW.p(adDataRefreshToken, "response.adDataRefreshToken");
                        dsl_create.setAdDataRefreshToken(adDataRefreshToken);
                        if (adPlayerConfigResponse.hasError()) {
                            ErrorOuterClass.Error error = adPlayerConfigResponse.getError();
                            AbstractC2995aW.p(error, "response.error");
                            dsl_create.setError(error);
                        }
                        adResponse = dsl_create._build();
                        AdResponseOuterClass.AdResponse adResponse3 = adResponse;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType6 = diagnosticAdType3;
                        HandleGatewayAdResponse handleGatewayAdResponse2 = AndroidLoad.this.handleGatewayAdResponse;
                        UnityAdsLoadOptions unityAdsLoadOptions2 = this.$loadOptions;
                        ByteString byteString5 = this.$opportunityId;
                        AbstractC2995aW.p(adResponse3, "response");
                        Context context2 = this.$context;
                        String str4 = this.$placement;
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.L$0 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse2.invoke(unityAdsLoadOptions2, byteString5, adResponse3, context2, str4, diagnosticAdType6, z, this);
                        if (objInvoke3 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        loadResult = (LoadResult) objInvoke3;
                        if (!(loadResult instanceof LoadResult.Success)) {
                            if (loadResult instanceof LoadResult.Failure) {
                                return loadResult;
                            }
                            throw new C3770jF(7, 0);
                        }
                        AdRepository adRepository2 = AndroidLoad.this.adRepository;
                        ByteString byteString6 = this.$opportunityId;
                        this.label = 6;
                        ad = adRepository2.getAd(byteString6, this);
                        if (ad == enumC4602sk) {
                            return enumC4602sk;
                        }
                        AdObject adObject2 = (AdObject) ad;
                        if (adObject2 == null) {
                        }
                    case 1:
                        int i3 = this.I$0;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType7 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                        AbstractC3375el.b0(obj);
                        i = i3;
                        diagnosticAdType2 = diagnosticAdType7;
                        objInvoke2 = obj;
                        UniversalRequestOuterClass.UniversalRequest universalRequest3 = (UniversalRequestOuterClass.UniversalRequest) objInvoke2;
                        RequestPolicy requestPolicyInvoke3 = AndroidLoad.this.getRequestPolicy.invoke();
                        GatewayClient gatewayClient3 = AndroidLoad.this.gatewayClient;
                        OperationType operationType3 = OperationType.LOAD;
                        this.L$0 = diagnosticAdType2;
                        this.I$0 = i;
                        this.label = 2;
                        objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient3, null, universalRequest3, requestPolicyInvoke3, operationType3, this, 1, null);
                        if (objRequest$default == enumC4602sk) {
                            return enumC4602sk;
                        }
                        diagnosticAdType3 = diagnosticAdType2;
                        adResponse = ((UniversalResponseOuterClass.UniversalResponse) objRequest$default).getPayload().getAdResponse();
                        AdResponseOuterClass.AdResponse adResponse4 = adResponse;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType8 = diagnosticAdType3;
                        HandleGatewayAdResponse handleGatewayAdResponse3 = AndroidLoad.this.handleGatewayAdResponse;
                        UnityAdsLoadOptions unityAdsLoadOptions3 = this.$loadOptions;
                        ByteString byteString7 = this.$opportunityId;
                        AbstractC2995aW.p(adResponse4, "response");
                        Context context3 = this.$context;
                        String str5 = this.$placement;
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.L$0 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse3.invoke(unityAdsLoadOptions3, byteString7, adResponse4, context3, str5, diagnosticAdType8, z, this);
                        if (objInvoke3 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        loadResult = (LoadResult) objInvoke3;
                        if (!(loadResult instanceof LoadResult.Success)) {
                            if (loadResult instanceof LoadResult.Failure) {
                                return loadResult;
                            }
                            throw new C3770jF(7, 0);
                        }
                        AdRepository adRepository3 = AndroidLoad.this.adRepository;
                        ByteString byteString8 = this.$opportunityId;
                        this.label = 6;
                        ad = adRepository3.getAd(byteString8, this);
                        if (ad == enumC4602sk) {
                            return enumC4602sk;
                        }
                        AdObject adObject3 = (AdObject) ad;
                        if (adObject3 == null) {
                        }
                    case 2:
                        int i4 = this.I$0;
                        diagnosticAdType3 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                        AbstractC3375el.b0(obj);
                        i = i4;
                        objRequest$default = obj;
                        adResponse = ((UniversalResponseOuterClass.UniversalResponse) objRequest$default).getPayload().getAdResponse();
                        AdResponseOuterClass.AdResponse adResponse5 = adResponse;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType9 = diagnosticAdType3;
                        HandleGatewayAdResponse handleGatewayAdResponse4 = AndroidLoad.this.handleGatewayAdResponse;
                        UnityAdsLoadOptions unityAdsLoadOptions4 = this.$loadOptions;
                        ByteString byteString9 = this.$opportunityId;
                        AbstractC2995aW.p(adResponse5, "response");
                        Context context4 = this.$context;
                        String str6 = this.$placement;
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.L$0 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse4.invoke(unityAdsLoadOptions4, byteString9, adResponse5, context4, str6, diagnosticAdType9, z, this);
                        if (objInvoke3 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        loadResult = (LoadResult) objInvoke3;
                        if (!(loadResult instanceof LoadResult.Success)) {
                            if (loadResult instanceof LoadResult.Failure) {
                                return loadResult;
                            }
                            throw new C3770jF(7, 0);
                        }
                        AdRepository adRepository4 = AndroidLoad.this.adRepository;
                        ByteString byteString10 = this.$opportunityId;
                        this.label = 6;
                        ad = adRepository4.getAd(byteString10, this);
                        if (ad == enumC4602sk) {
                            return enumC4602sk;
                        }
                        AdObject adObject4 = (AdObject) ad;
                        if (adObject4 == null) {
                        }
                    case 3:
                        int i5 = this.I$0;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType10 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                        AbstractC3375el.b0(obj);
                        i = i5;
                        diagnosticAdType = diagnosticAdType10;
                        objInvoke = obj;
                        UniversalRequestOuterClass.UniversalRequest universalRequest4 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                        RequestPolicy requestPolicyInvoke4 = AndroidLoad.this.getRequestPolicy.invoke();
                        GatewayClient gatewayClient4 = AndroidLoad.this.gatewayClient;
                        OperationType operationType4 = OperationType.LOAD_HEADER_BIDDING;
                        this.L$0 = diagnosticAdType;
                        this.I$0 = i;
                        this.label = 4;
                        objRequest$default2 = GatewayClient.DefaultImpls.request$default(gatewayClient4, null, universalRequest4, requestPolicyInvoke4, operationType4, this, 1, null);
                        if (objRequest$default2 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        diagnosticAdType3 = diagnosticAdType;
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objRequest$default2;
                        if (universalResponse.hasError()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                        }
                        adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2 = this.$headerBiddingAdMarkup;
                        AdResponseKt.Dsl.Companion companion2 = AdResponseKt.Dsl.Companion;
                        AdResponseOuterClass.AdResponse.Builder builderNewBuilder2 = AdResponseOuterClass.AdResponse.newBuilder();
                        AbstractC2995aW.p(builderNewBuilder2, "newBuilder()");
                        dsl_create = companion2._create(builderNewBuilder2);
                        ByteString adData2 = headerBiddingAdMarkup2.getAdData();
                        AbstractC2995aW.p(adData2, "headerBiddingAdMarkup.adData");
                        dsl_create.setAdData(adData2);
                        dsl_create.setAdDataVersion(headerBiddingAdMarkup2.getAdDataVersion());
                        ByteString trackingToken2 = adPlayerConfigResponse.getTrackingToken();
                        AbstractC2995aW.p(trackingToken2, "response.trackingToken");
                        dsl_create.setTrackingToken(trackingToken2);
                        ByteString impressionConfiguration2 = adPlayerConfigResponse.getImpressionConfiguration();
                        AbstractC2995aW.p(impressionConfiguration2, "response.impressionConfiguration");
                        dsl_create.setImpressionConfiguration(impressionConfiguration2);
                        dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                        WebviewConfiguration.WebViewConfiguration webviewConfiguration2 = adPlayerConfigResponse.getWebviewConfiguration();
                        AbstractC2995aW.p(webviewConfiguration2, "response.webviewConfiguration");
                        dsl_create.setWebviewConfiguration(webviewConfiguration2);
                        ByteString adDataRefreshToken2 = adPlayerConfigResponse.getAdDataRefreshToken();
                        AbstractC2995aW.p(adDataRefreshToken2, "response.adDataRefreshToken");
                        dsl_create.setAdDataRefreshToken(adDataRefreshToken2);
                        if (adPlayerConfigResponse.hasError()) {
                            ErrorOuterClass.Error error2 = adPlayerConfigResponse.getError();
                            AbstractC2995aW.p(error2, "response.error");
                            dsl_create.setError(error2);
                        }
                        adResponse = dsl_create._build();
                        AdResponseOuterClass.AdResponse adResponse6 = adResponse;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType11 = diagnosticAdType3;
                        HandleGatewayAdResponse handleGatewayAdResponse5 = AndroidLoad.this.handleGatewayAdResponse;
                        UnityAdsLoadOptions unityAdsLoadOptions5 = this.$loadOptions;
                        ByteString byteString11 = this.$opportunityId;
                        AbstractC2995aW.p(adResponse6, "response");
                        Context context5 = this.$context;
                        String str7 = this.$placement;
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.L$0 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse5.invoke(unityAdsLoadOptions5, byteString11, adResponse6, context5, str7, diagnosticAdType11, z, this);
                        if (objInvoke3 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        loadResult = (LoadResult) objInvoke3;
                        if (!(loadResult instanceof LoadResult.Success)) {
                            if (loadResult instanceof LoadResult.Failure) {
                                return loadResult;
                            }
                            throw new C3770jF(7, 0);
                        }
                        AdRepository adRepository5 = AndroidLoad.this.adRepository;
                        ByteString byteString12 = this.$opportunityId;
                        this.label = 6;
                        ad = adRepository5.getAd(byteString12, this);
                        if (ad == enumC4602sk) {
                            return enumC4602sk;
                        }
                        AdObject adObject5 = (AdObject) ad;
                        if (adObject5 == null) {
                        }
                    case 4:
                        int i6 = this.I$0;
                        diagnosticAdType3 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) this.L$0;
                        AbstractC3375el.b0(obj);
                        i = i6;
                        objRequest$default2 = obj;
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objRequest$default2;
                        if (universalResponse.hasError()) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "gateway", universalResponse.getError().getErrorText(), false, 36, null);
                        }
                        adPlayerConfigResponse = universalResponse.getPayload().getAdPlayerConfigResponse();
                        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = this.$headerBiddingAdMarkup;
                        AdResponseKt.Dsl.Companion companion3 = AdResponseKt.Dsl.Companion;
                        AdResponseOuterClass.AdResponse.Builder builderNewBuilder3 = AdResponseOuterClass.AdResponse.newBuilder();
                        AbstractC2995aW.p(builderNewBuilder3, "newBuilder()");
                        dsl_create = companion3._create(builderNewBuilder3);
                        ByteString adData3 = headerBiddingAdMarkup3.getAdData();
                        AbstractC2995aW.p(adData3, "headerBiddingAdMarkup.adData");
                        dsl_create.setAdData(adData3);
                        dsl_create.setAdDataVersion(headerBiddingAdMarkup3.getAdDataVersion());
                        ByteString trackingToken3 = adPlayerConfigResponse.getTrackingToken();
                        AbstractC2995aW.p(trackingToken3, "response.trackingToken");
                        dsl_create.setTrackingToken(trackingToken3);
                        ByteString impressionConfiguration3 = adPlayerConfigResponse.getImpressionConfiguration();
                        AbstractC2995aW.p(impressionConfiguration3, "response.impressionConfiguration");
                        dsl_create.setImpressionConfiguration(impressionConfiguration3);
                        dsl_create.setImpressionConfigurationVersion(adPlayerConfigResponse.getImpressionConfigurationVersion());
                        WebviewConfiguration.WebViewConfiguration webviewConfiguration3 = adPlayerConfigResponse.getWebviewConfiguration();
                        AbstractC2995aW.p(webviewConfiguration3, "response.webviewConfiguration");
                        dsl_create.setWebviewConfiguration(webviewConfiguration3);
                        ByteString adDataRefreshToken3 = adPlayerConfigResponse.getAdDataRefreshToken();
                        AbstractC2995aW.p(adDataRefreshToken3, "response.adDataRefreshToken");
                        dsl_create.setAdDataRefreshToken(adDataRefreshToken3);
                        if (adPlayerConfigResponse.hasError()) {
                            ErrorOuterClass.Error error3 = adPlayerConfigResponse.getError();
                            AbstractC2995aW.p(error3, "response.error");
                            dsl_create.setError(error3);
                        }
                        adResponse = dsl_create._build();
                        AdResponseOuterClass.AdResponse adResponse7 = adResponse;
                        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType12 = diagnosticAdType3;
                        HandleGatewayAdResponse handleGatewayAdResponse6 = AndroidLoad.this.handleGatewayAdResponse;
                        UnityAdsLoadOptions unityAdsLoadOptions6 = this.$loadOptions;
                        ByteString byteString13 = this.$opportunityId;
                        AbstractC2995aW.p(adResponse7, "response");
                        Context context6 = this.$context;
                        String str8 = this.$placement;
                        if (i != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.L$0 = null;
                        this.label = 5;
                        objInvoke3 = handleGatewayAdResponse6.invoke(unityAdsLoadOptions6, byteString13, adResponse7, context6, str8, diagnosticAdType12, z, this);
                        if (objInvoke3 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        loadResult = (LoadResult) objInvoke3;
                        if (!(loadResult instanceof LoadResult.Success)) {
                            if (loadResult instanceof LoadResult.Failure) {
                                return loadResult;
                            }
                            throw new C3770jF(7, 0);
                        }
                        AdRepository adRepository6 = AndroidLoad.this.adRepository;
                        ByteString byteString14 = this.$opportunityId;
                        this.label = 6;
                        ad = adRepository6.getAd(byteString14, this);
                        if (ad == enumC4602sk) {
                            return enumC4602sk;
                        }
                        AdObject adObject6 = (AdObject) ad;
                        if (adObject6 == null) {
                        }
                    case 5:
                        AbstractC3375el.b0(obj);
                        objInvoke3 = obj;
                        loadResult = (LoadResult) objInvoke3;
                        if (!(loadResult instanceof LoadResult.Success)) {
                            if (loadResult instanceof LoadResult.Failure) {
                                return loadResult;
                            }
                            throw new C3770jF(7, 0);
                        }
                        AdRepository adRepository7 = AndroidLoad.this.adRepository;
                        ByteString byteString15 = this.$opportunityId;
                        this.label = 6;
                        ad = adRepository7.getAd(byteString15, this);
                        if (ad == enumC4602sk) {
                            return enumC4602sk;
                        }
                        AdObject adObject7 = (AdObject) ad;
                        if (adObject7 == null) {
                        }
                    case 6:
                        AbstractC3375el.b0(obj);
                        ad = obj;
                        AdObject adObject8 = (AdObject) ad;
                        if (adObject8 == null) {
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (UnityAdsNetworkException e) {
                return AndroidLoad.this.handleGatewayException(e);
            }
        }
    }

    public AndroidLoad(AbstractC3899kk abstractC3899kk, GetAdRequest getAdRequest, GetAdPlayerConfigRequest getAdPlayerConfigRequest, GetRequestPolicy getRequestPolicy, HandleGatewayAdResponse handleGatewayAdResponse, SessionRepository sessionRepository, GatewayClient gatewayClient, AdRepository adRepository) {
        AbstractC2995aW.q(abstractC3899kk, "defaultDispatcher");
        AbstractC2995aW.q(getAdRequest, "getAdRequest");
        AbstractC2995aW.q(getAdPlayerConfigRequest, "getAdPlayerConfigRequest");
        AbstractC2995aW.q(getRequestPolicy, "getRequestPolicy");
        AbstractC2995aW.q(handleGatewayAdResponse, "handleGatewayAdResponse");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(gatewayClient, "gatewayClient");
        AbstractC2995aW.q(adRepository, "adRepository");
        this.defaultDispatcher = abstractC3899kk;
        this.getAdRequest = getAdRequest;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.handleGatewayAdResponse = handleGatewayAdResponse;
        this.sessionRepository = sessionRepository;
        this.gatewayClient = gatewayClient;
        this.adRepository = adRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadResult.Failure handleGatewayException(UnityAdsNetworkException unityAdsNetworkException) {
        boolean z = unityAdsNetworkException instanceof NetworkTimeoutException;
        return new LoadResult.Failure(z ? UnityAds.UnityAdsLoadError.TIMEOUT : UnityAds.UnityAdsLoadError.INTERNAL_ERROR, z ? LoadResult.MSG_TIMEOUT : LoadResult.MSG_COMMUNICATION_FAILURE, unityAdsNetworkException, z ? "timeout" : "gateway", unityAdsNetworkException.getMessage(), false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean z) {
        if (z) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean z) {
        if (z) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    @Override // com.unity3d.ads.core.domain.Load
    public Object invoke(Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new AnonymousClass2(bannerSize, headerBiddingAdMarkup, str, byteString, unityAdsLoadOptions, context, null), this.defaultDispatcher, interfaceC2857Wj);
    }
}
