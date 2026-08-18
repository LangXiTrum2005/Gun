package com.unity3d.ads.core.domain;

import android.content.Context;
import android.util.Base64;
import com.badlogic.gdx.Input;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.AdResponseOuterClass;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.CampaignKt;
import gatewayprotocol.v1.CampaignStateOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3086bY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MR;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.net.URI;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidHandleGatewayAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {200, 206}, m = "cleanup")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
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
            return AndroidHandleGatewayAdResponse.this.cleanup(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", l = {Input.Keys.MEDIA_PLAY_PAUSE, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, Input.Keys.NUMPAD_9, Input.Keys.NUMPAD_LEFT_PAREN, 165, 178, 182}, m = "invoke")
    public static final class C22071 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C22071(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleGatewayAdResponse.this.invoke(null, null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", l = {123}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ C3086bY $adPlayer;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C3086bY c3086bY, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$adPlayer = c3086bY;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$adPlayer, interfaceC2857Wj);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(AllowedPiiOuterClass.AllowedPii allowedPii, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(allowedPii, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                AllowedPiiOuterClass.AllowedPii allowedPii = (AllowedPiiOuterClass.AllowedPii) this.L$0;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f4172a;
                byte[] byteArray = allowedPii.toByteArray();
                AbstractC2995aW.p(byteArray, "it.toByteArray()");
                this.label = 1;
                if (adPlayer.onAllowedPiiChange(byteArray, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ String $placementId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ByteString byteString, String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$opportunityId = byteString;
            this.$placementId = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass3 anonymousClass3 = AndroidHandleGatewayAdResponse.this.new AnonymousClass3(this.$opportunityId, this.$placementId, interfaceC2857Wj);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(C4839vT c4839vT, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass3) create(c4839vT, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0051  */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            CampaignStateOuterClass.Campaign campaign_build;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            C4839vT c4839vT = (C4839vT) this.L$0;
            byte[] bArr = (byte[]) c4839vT.f5132a;
            int iIntValue = ((Number) c4839vT.b).intValue();
            CampaignStateOuterClass.Campaign campaign = AndroidHandleGatewayAdResponse.this.campaignRepository.getCampaign(this.$opportunityId);
            if (campaign != null) {
                CampaignKt.Dsl.Companion companion = CampaignKt.Dsl.Companion;
                CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
                AbstractC2995aW.p(builder, "this.toBuilder()");
                CampaignKt.Dsl dsl_create = companion._create(builder);
                dsl_create.setData(ProtobufExtensionsKt.fromBase64$default(new String(bArr, AbstractC2307Be.f2881a), false, 1, null));
                dsl_create.setDataVersion(iIntValue);
                campaign_build = dsl_create._build();
                if (campaign_build == null) {
                    String str = this.$placementId;
                    ByteString byteString = this.$opportunityId;
                    CampaignKt.Dsl.Companion companion2 = CampaignKt.Dsl.Companion;
                    CampaignStateOuterClass.Campaign.Builder builderNewBuilder = CampaignStateOuterClass.Campaign.newBuilder();
                    AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
                    CampaignKt.Dsl dsl_create2 = companion2._create(builderNewBuilder);
                    dsl_create2.setData(ProtobufExtensionsKt.fromBase64$default(new String(bArr, AbstractC2307Be.f2881a), false, 1, null));
                    dsl_create2.setDataVersion(iIntValue);
                    dsl_create2.setPlacementId(str);
                    dsl_create2.setImpressionOpportunityId(byteString);
                    campaign_build = dsl_create2._build();
                }
            } else {
                String str2 = this.$placementId;
                ByteString byteString2 = this.$opportunityId;
                CampaignKt.Dsl.Companion companion3 = CampaignKt.Dsl.Companion;
                CampaignStateOuterClass.Campaign.Builder builderNewBuilder2 = CampaignStateOuterClass.Campaign.newBuilder();
                AbstractC2995aW.p(builderNewBuilder2, "newBuilder()");
                CampaignKt.Dsl dsl_create3 = companion3._create(builderNewBuilder2);
                dsl_create3.setData(ProtobufExtensionsKt.fromBase64$default(new String(bArr, AbstractC2307Be.f2881a), false, 1, null));
                dsl_create3.setDataVersion(iIntValue);
                dsl_create3.setPlacementId(str2);
                dsl_create3.setImpressionOpportunityId(byteString2);
                campaign_build = dsl_create3._build();
            }
            AndroidHandleGatewayAdResponse.this.campaignRepository.setCampaign(this.$opportunityId, campaign_build);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", l = {Input.Keys.NUMPAD_COMMA}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends Ea0 implements InterfaceC2766Sw {
        final /* synthetic */ String $webViewUrl;
        final /* synthetic */ AndroidWebViewContainer $webviewContainer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AndroidWebViewContainer androidWebViewContainer, String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(1, interfaceC2857Wj);
            this.$webviewContainer = androidWebViewContainer;
            this.$webViewUrl = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass4(this.$webviewContainer, this.$webViewUrl, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public final Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass4) create(interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                AndroidWebViewContainer androidWebViewContainer = this.$webviewContainer;
                String str = this.$webViewUrl;
                this.label = 1;
                if (androidWebViewContainer.loadUrl(str, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", l = {166}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ C3086bY $adPlayer;
        final /* synthetic */ LoadEvent $loadEvent;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(LoadEvent loadEvent, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, C3086bY c3086bY, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = c3086bY;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass5(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass5) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                Error error = new Error(((LoadEvent.Error) this.$loadEvent).getMessage());
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f4172a;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(error, byteString, adResponse, adPlayer, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$6, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$6", f = "AndroidHandleGatewayAdResponse.kt", l = {Input.Keys.F13}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ C3086bY $adPlayer;
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ AdResponseOuterClass.AdResponse $response;
        final /* synthetic */ CancellationException $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(CancellationException cancellationException, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, C3086bY c3086bY, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = c3086bY;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidHandleGatewayAdResponse.this.new AnonymousClass6(this.$t, this.$opportunityId, this.$response, this.$adPlayer, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass6) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse = AndroidHandleGatewayAdResponse.this;
                CancellationException cancellationException = this.$t;
                ByteString byteString = this.$opportunityId;
                AdResponseOuterClass.AdResponse adResponse = this.$response;
                AdPlayer adPlayer = (AdPlayer) this.$adPlayer.f4172a;
                this.label = 1;
                if (androidHandleGatewayAdResponse.cleanup(cancellationException, byteString, adResponse, adPlayer, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    public AndroidHandleGatewayAdResponse(AdRepository adRepository, AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridgeUseCase, DeviceInfoRepository deviceInfoRepository, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, CampaignRepository campaignRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetLatestWebViewConfiguration getLatestWebViewConfiguration, AdPlayerScope adPlayerScope, GetAdPlayer getAdPlayer) {
        AbstractC2995aW.q(adRepository, "adRepository");
        AbstractC2995aW.q(androidGetWebViewContainerUseCase, "getWebViewContainerUseCase");
        AbstractC2995aW.q(getWebViewBridgeUseCase, "getWebViewBridge");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(handleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        AbstractC2995aW.q(campaignRepository, "campaignRepository");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(getOperativeEventApi, "getOperativeEventApi");
        AbstractC2995aW.q(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        AbstractC2995aW.q(adPlayerScope, "adPlayerScope");
        AbstractC2995aW.q(getAdPlayer, "getAdPlayer");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = androidGetWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridgeUseCase;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = handleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object cleanup(Throwable th, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, AdPlayer adPlayer, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        String message;
        AdPlayer adPlayer2;
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
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i2 != 0) {
            if (i2 == 1) {
                AdPlayer adPlayer3 = (AdPlayer) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
                adPlayer2 = adPlayer3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return c5033xf0;
        }
        AbstractC3375el.b0(obj);
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
        Throwable cause = th.getCause();
        if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
            message = "";
        }
        dsl_create.setMessage(message);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
        ByteString trackingToken = adResponse.getTrackingToken();
        AbstractC2995aW.p(trackingToken, "response.trackingToken");
        ByteString byteString2 = operativeEventErrorData_build.toByteString();
        AbstractC2995aW.p(byteString2, "operativeEventErrorData.toByteString()");
        adPlayer2 = adPlayer;
        anonymousClass1.L$0 = adPlayer2;
        anonymousClass1.label = 1;
        if (GetOperativeEventApi.invoke$default(getOperativeEventApi, operativeEventType, byteString, trackingToken, byteString2, null, anonymousClass1, 16, null) == enumC4602sk) {
            return enumC4602sk;
        }
        if (adPlayer2 != null) {
            anonymousClass1.L$0 = null;
            anonymousClass1.label = 2;
            if (adPlayer2.destroy(anonymousClass1) == enumC4602sk) {
                return enumC4602sk;
            }
        }
        return c5033xf0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03dd A[Catch: CancellationException -> 0x03d9, TRY_ENTER, TryCatch #3 {CancellationException -> 0x03d9, blocks: (B:104:0x03f8, B:89:0x0381, B:91:0x0387, B:101:0x03dd, B:86:0x0358), top: B:140:0x0358 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x03f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:129:0x046b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:133:0x0473  */
    /* JADX WARN: Code duplicated, block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d8 A[Catch: CancellationException -> 0x01f0, TRY_ENTER, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x01f0, blocks: (B:64:0x01d8, B:73:0x020a), top: B:152:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01f5 A[Catch: CancellationException -> 0x0406, TRY_ENTER, TRY_LEAVE, TryCatch #16 {CancellationException -> 0x0406, blocks: (B:62:0x01cc, B:68:0x01f5, B:75:0x0213), top: B:163:0x01cc }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0207  */
    /* JADX WARN: Code duplicated, block: B:73:0x020a A[Catch: CancellationException -> 0x01f0, TRY_ENTER, TRY_LEAVE, TryCatch #10 {CancellationException -> 0x01f0, blocks: (B:64:0x01d8, B:73:0x020a), top: B:152:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0265 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x0266  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x0355 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0356  */
    /* JADX WARN: Code duplicated, block: B:88:0x0380 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x0387 A[Catch: CancellationException -> 0x03d9, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x03d9, blocks: (B:104:0x03f8, B:89:0x0381, B:91:0x0387, B:101:0x03dd, B:86:0x0358), top: B:140:0x0358 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x03b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x03b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r38v1, types: [gatewayprotocol.v1.AdResponseOuterClass$AdResponse] */
    /* JADX WARN: Type inference failed for: r39v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bY] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    public Object invoke(UnityAdsLoadOptions unityAdsLoadOptions, ByteString byteString, AdResponseOuterClass.AdResponse adResponse, Context context, String str, DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C22071 c22071;
        CancellationException cancellationException;
        ?? r13;
        ?? r14;
        ByteString byteString2;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse;
        ?? r5;
        MR mr;
        AnonymousClass6 anonymousClass6;
        ByteString byteString3;
        ?? r6;
        Throwable cause;
        AdResponseOuterClass.AdResponse adResponse2;
        UnityAdsLoadOptions unityAdsLoadOptions2;
        boolean z2;
        String str2;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse2;
        AdResponseOuterClass.AdResponse adResponse3;
        C3086bY c3086bY;
        AdResponseOuterClass.AdResponse adResponse4;
        C3086bY c3086bY2;
        WebViewConfiguration webViewConfiguration;
        String configUrl;
        String str3;
        String strEncodeToString;
        Object objInvoke;
        boolean z3;
        DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        UnityAdsLoadOptions unityAdsLoadOptions3;
        AdResponseOuterClass.AdResponse adResponse5;
        C3086bY c3086bY3;
        AdResponseOuterClass.AdResponse adResponse6;
        C3086bY c3086bY4;
        AdObject adObject;
        AdObject adObject2;
        AdResponseOuterClass.AdResponse adResponse7;
        C3086bY c3086bY5;
        AdResponseOuterClass.AdResponse adResponse8;
        C3086bY c3086bY6;
        LoadEvent loadEvent;
        AdRepository adRepository;
        MR mr2;
        AnonymousClass5 anonymousClass5;
        C3086bY c3086bY7;
        AdObject adObject3;
        LoadEvent loadEvent2;
        AdResponseOuterClass.AdResponse adResponse9;
        if (interfaceC2857Wj instanceof C22071) {
            c22071 = (C22071) interfaceC2857Wj;
            int i = c22071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22071.label = i - Integer.MIN_VALUE;
            } else {
                c22071 = new C22071(interfaceC2857Wj);
            }
        } else {
            c22071 = new C22071(interfaceC2857Wj);
        }
        Object objInvoke2 = c22071.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c22071.label;
        try {
            switch (i2) {
                case 0:
                    AbstractC3375el.b0(objInvoke2);
                    C3086bY c3086bY8 = new C3086bY();
                    try {
                        try {
                            if (adResponse.hasError()) {
                                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_COMMUNICATION_FAILURE, null, "gateway", adResponse.getError().getErrorText(), false, 36, null);
                            }
                            if (adResponse.getAdData().isEmpty()) {
                                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.NO_FILL, LoadResult.MSG_NO_FILL, null, "no_fill", null, false, 52, null);
                            }
                            GetLatestWebViewConfiguration getLatestWebViewConfiguration = this.getLatestWebViewConfiguration;
                            String entryPoint = adResponse.getWebviewConfiguration().getEntryPoint();
                            try {
                                Integer num = new Integer(adResponse.getWebviewConfiguration().getVersion());
                                List<String> additionalFilesList = adResponse.getWebviewConfiguration().getAdditionalFilesList();
                                c22071.L$0 = this;
                                unityAdsLoadOptions2 = unityAdsLoadOptions;
                                c22071.L$1 = unityAdsLoadOptions2;
                                byteString2 = byteString;
                                try {
                                    c22071.L$2 = byteString2;
                                    adResponse2 = adResponse;
                                    try {
                                        c22071.L$3 = adResponse2;
                                        c22071.L$4 = str;
                                        c22071.L$5 = diagnosticAdType;
                                        c22071.L$6 = c3086bY8;
                                        z2 = z;
                                        c22071.Z$0 = z2;
                                        c22071.label = 1;
                                        objInvoke2 = getLatestWebViewConfiguration.invoke(entryPoint, num, additionalFilesList, c22071);
                                        if (objInvoke2 == enumC4602sk) {
                                            return enumC4602sk;
                                        }
                                        str2 = str;
                                        diagnosticAdType2 = diagnosticAdType;
                                        androidHandleGatewayAdResponse2 = this;
                                        c3086bY2 = c3086bY8;
                                        adResponse4 = adResponse2;
                                        try {
                                            webViewConfiguration = (WebViewConfiguration) objInvoke2;
                                            try {
                                                if (webViewConfiguration.getEntryPoint().length() == 0) {
                                                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_COMMUNICATION_FAILURE, null, "no_webview_entry_point", null, false, 52, null);
                                                }
                                                configUrl = SdkProperties.getConfigUrl();
                                                AbstractC2995aW.p(configUrl, "it");
                                                if (!configUrl.endsWith(".html")) {
                                                    configUrl = null;
                                                }
                                                if (configUrl == null) {
                                                    configUrl = webViewConfiguration.getEntryPoint();
                                                }
                                                try {
                                                    str3 = AbstractC3089ba0.U0(configUrl, "?") + (UnityAdsConstants.DefaultUrls.AD_PLAYER_QUERY_PARAMS + new URI(configUrl).getQuery());
                                                    strEncodeToString = Base64.encodeToString(adResponse4.getImpressionConfiguration().toByteArray(), 2);
                                                    AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                                                    AdPlayerScope adPlayerScope = androidHandleGatewayAdResponse2.adPlayerScope;
                                                    c22071.L$0 = androidHandleGatewayAdResponse2;
                                                    c22071.L$1 = unityAdsLoadOptions2;
                                                    c22071.L$2 = byteString2;
                                                    c22071.L$3 = adResponse4;
                                                    c22071.L$4 = str2;
                                                    c22071.L$5 = diagnosticAdType2;
                                                    c22071.L$6 = c3086bY2;
                                                    c22071.L$7 = str3;
                                                    c22071.L$8 = strEncodeToString;
                                                    c22071.Z$0 = z2;
                                                    c22071.label = 2;
                                                    objInvoke = androidGetWebViewContainerUseCase.invoke(adPlayerScope, c22071);
                                                    if (objInvoke == enumC4602sk) {
                                                        return enumC4602sk;
                                                    }
                                                    z3 = z2;
                                                    diagnosticAdType3 = diagnosticAdType2;
                                                    unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                    c3086bY4 = c3086bY2;
                                                    adResponse6 = adResponse4;
                                                    try {
                                                        AndroidWebViewContainer androidWebViewContainer = (AndroidWebViewContainer) objInvoke;
                                                        WebViewBridge webViewBridgeInvoke = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                        c3086bY4.f4172a = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke, androidWebViewContainer, byteString2);
                                                        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass2(c3086bY4, null), androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii()), ((AdPlayer) c3086bY4.f4172a).getScope());
                                                        AbstractC3375el.K(AbstractC3375el.Q(androidHandleGatewayAdResponse.new AnonymousClass3(byteString2, str2, null), ((AdPlayer) c3086bY4.f4172a).getUpdateCampaignState()), ((AdPlayer) c3086bY4.f4172a).getScope());
                                                        ByteString trackingToken = adResponse6.getTrackingToken();
                                                        AdPlayer adPlayer = (AdPlayer) c3086bY4.f4172a;
                                                        AbstractC2995aW.p(trackingToken, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                                                        adObject = new AdObject(byteString2, str2, trackingToken, false, null, null, null, adPlayer, null, unityAdsLoadOptions3, z3, diagnosticAdType3, 376, null);
                                                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObject, 14, null);
                                                        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                                                        InterfaceC4286p60 onInvocation = webViewBridgeInvoke.getOnInvocation();
                                                        ByteString adData = adResponse6.getAdData();
                                                        AbstractC2995aW.p(adData, "response.adData");
                                                        String base64$default = ProtobufExtensionsKt.toBase64$default(adData, false, 1, null);
                                                        ByteString adDataRefreshToken = adResponse6.getAdDataRefreshToken();
                                                        AbstractC2995aW.p(adDataRefreshToken, "response.adDataRefreshToken");
                                                        try {
                                                            String base64$default2 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null);
                                                            AbstractC2995aW.p(strEncodeToString, "base64ImpressionConfiguration");
                                                            AnonymousClass4 anonymousClass4 = new AnonymousClass4(androidWebViewContainer, str3, null);
                                                            c22071.L$0 = androidHandleGatewayAdResponse;
                                                            c22071.L$1 = byteString2;
                                                            c22071.L$2 = adResponse6;
                                                            c22071.L$3 = c3086bY4;
                                                            c22071.L$4 = adObject;
                                                            c22071.L$5 = null;
                                                            c22071.L$6 = null;
                                                            c22071.L$7 = null;
                                                            c22071.L$8 = null;
                                                            c22071.label = 3;
                                                            objInvoke2 = handleInvocationsFromAdViewer.invoke(onInvocation, base64$default, base64$default2, strEncodeToString, adObject, anonymousClass4, c22071);
                                                            enumC4602sk = enumC4602sk;
                                                            if (objInvoke2 == enumC4602sk) {
                                                                return enumC4602sk;
                                                            }
                                                            adObject2 = adObject;
                                                            byteString3 = byteString2;
                                                            c3086bY5 = c3086bY4;
                                                            adResponse7 = adResponse6;
                                                            try {
                                                                AbstractC3375el.K((InterfaceC4443qv) objInvoke2, ((AdPlayer) c3086bY5.f4172a).getScope());
                                                                InterfaceC4443qv onLoadEvent = ((AdPlayer) c3086bY5.f4172a).getOnLoadEvent();
                                                                c22071.L$0 = androidHandleGatewayAdResponse;
                                                                c22071.L$1 = byteString3;
                                                                c22071.L$2 = adResponse7;
                                                                c22071.L$3 = c3086bY5;
                                                                c22071.L$4 = adObject2;
                                                                c22071.label = 4;
                                                                objInvoke2 = AbstractC3375el.Y(onLoadEvent, c22071);
                                                                c3086bY6 = c3086bY5;
                                                                adResponse8 = adResponse7;
                                                                if (objInvoke2 == enumC4602sk) {
                                                                    return enumC4602sk;
                                                                }
                                                                loadEvent = (LoadEvent) objInvoke2;
                                                                if (!(loadEvent instanceof LoadEvent.Error)) {
                                                                    androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                                                                    adRepository = androidHandleGatewayAdResponse.adRepository;
                                                                    c22071.L$0 = androidHandleGatewayAdResponse;
                                                                    c22071.L$1 = byteString3;
                                                                    c22071.L$2 = adResponse8;
                                                                    c22071.L$3 = c3086bY6;
                                                                    c22071.L$4 = adObject2;
                                                                    c22071.label = 6;
                                                                    if (adRepository.addAd(byteString3, adObject2, c22071) == enumC4602sk) {
                                                                        return enumC4602sk;
                                                                    }
                                                                    return new LoadResult.Success(adObject2);
                                                                }
                                                                mr2 = MR.f3404a;
                                                                anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, c3086bY6, null);
                                                                c22071.L$0 = androidHandleGatewayAdResponse;
                                                                c22071.L$1 = byteString3;
                                                                c22071.L$2 = adResponse8;
                                                                c22071.L$3 = c3086bY6;
                                                                c22071.L$4 = adObject2;
                                                                c22071.L$5 = loadEvent;
                                                                c22071.label = 5;
                                                                if (WD.X(anonymousClass5, mr2, c22071) == enumC4602sk) {
                                                                    return enumC4602sk;
                                                                }
                                                                c3086bY7 = c3086bY6;
                                                                adObject3 = adObject2;
                                                                loadEvent2 = loadEvent;
                                                                adResponse9 = adResponse8;
                                                                try {
                                                                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject3.isScarAd(), 4, null);
                                                                } catch (CancellationException e) {
                                                                    cancellationException = e;
                                                                    r6 = c3086bY7;
                                                                    r13 = adResponse9;
                                                                    byteString2 = byteString3;
                                                                    r5 = r6;
                                                                    r14 = r13;
                                                                    mr = MR.f3404a;
                                                                    anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass6(cancellationException, byteString2, r14, r5, null);
                                                                    c22071.L$0 = cancellationException;
                                                                    c22071.L$1 = null;
                                                                    c22071.L$2 = null;
                                                                    c22071.L$3 = null;
                                                                    c22071.L$4 = null;
                                                                    c22071.L$5 = null;
                                                                    c22071.L$6 = null;
                                                                    c22071.L$7 = null;
                                                                    c22071.L$8 = null;
                                                                    c22071.label = 7;
                                                                    if (WD.X(anonymousClass6, mr, c22071) == enumC4602sk) {
                                                                        return enumC4602sk;
                                                                    }
                                                                    cause = cancellationException.getCause();
                                                                    if (cause == null) {
                                                                        throw cancellationException;
                                                                    }
                                                                    throw cause;
                                                                }
                                                            } catch (CancellationException e2) {
                                                                cancellationException = e2;
                                                                r6 = c3086bY5;
                                                                r13 = adResponse7;
                                                                byteString2 = byteString3;
                                                                r5 = r6;
                                                                r14 = r13;
                                                                mr = MR.f3404a;
                                                                anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass6(cancellationException, byteString2, r14, r5, null);
                                                                c22071.L$0 = cancellationException;
                                                                c22071.L$1 = null;
                                                                c22071.L$2 = null;
                                                                c22071.L$3 = null;
                                                                c22071.L$4 = null;
                                                                c22071.L$5 = null;
                                                                c22071.L$6 = null;
                                                                c22071.L$7 = null;
                                                                c22071.L$8 = null;
                                                                c22071.label = 7;
                                                                if (WD.X(anonymousClass6, mr, c22071) == enumC4602sk) {
                                                                    return enumC4602sk;
                                                                }
                                                                cause = cancellationException.getCause();
                                                                if (cause == null) {
                                                                    throw cancellationException;
                                                                }
                                                                throw cause;
                                                            }
                                                        } catch (CancellationException e3) {
                                                            e = e3;
                                                            enumC4602sk = enumC4602sk;
                                                            c3086bY3 = c3086bY4;
                                                            adResponse5 = adResponse6;
                                                        }
                                                    } catch (CancellationException e4) {
                                                        e = e4;
                                                        enumC4602sk = enumC4602sk;
                                                        c3086bY3 = c3086bY4;
                                                        adResponse5 = adResponse6;
                                                    }
                                                } catch (Throwable unused) {
                                                    try {
                                                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_COMMUNICATION_FAILURE, null, "invalid_url", configUrl, false, 36, null);
                                                    } catch (CancellationException e5) {
                                                        e = e5;
                                                    }
                                                }
                                            } catch (CancellationException e6) {
                                                cancellationException = e6;
                                                enumC4602sk = enumC4602sk;
                                                c3086bY = c3086bY2;
                                                adResponse3 = adResponse4;
                                            }
                                        } catch (CancellationException e7) {
                                            e = e7;
                                        }
                                        cancellationException = e;
                                        c3086bY = c3086bY2;
                                        adResponse3 = adResponse4;
                                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                        r5 = c3086bY;
                                        r14 = adResponse3;
                                        mr = MR.f3404a;
                                        anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass6(cancellationException, byteString2, r14, r5, null);
                                        c22071.L$0 = cancellationException;
                                        c22071.L$1 = null;
                                        c22071.L$2 = null;
                                        c22071.L$3 = null;
                                        c22071.L$4 = null;
                                        c22071.L$5 = null;
                                        c22071.L$6 = null;
                                        c22071.L$7 = null;
                                        c22071.L$8 = null;
                                        c22071.label = 7;
                                        if (WD.X(anonymousClass6, mr, c22071) == enumC4602sk) {
                                            return enumC4602sk;
                                        }
                                        cause = cancellationException.getCause();
                                        if (cause == null) {
                                            throw cancellationException;
                                        }
                                        throw cause;
                                    } catch (CancellationException e8) {
                                        e = e8;
                                        enumC4602sk = enumC4602sk;
                                        androidHandleGatewayAdResponse = this;
                                        c3086bY3 = c3086bY8;
                                        adResponse5 = adResponse2;
                                    }
                                } catch (CancellationException e9) {
                                    e = e9;
                                    adResponse2 = adResponse;
                                }
                            } catch (CancellationException e10) {
                                e = e10;
                                byteString2 = byteString;
                                adResponse2 = adResponse;
                            }
                        } catch (CancellationException e11) {
                            byteString2 = byteString;
                            r14 = adResponse;
                            cancellationException = e11;
                            androidHandleGatewayAdResponse = this;
                            enumC4602sk = enumC4602sk;
                            r5 = c3086bY8;
                        }
                    } catch (CancellationException e12) {
                        e = e12;
                        byteString2 = byteString;
                    }
                    adResponse2 = adResponse;
                    enumC4602sk = enumC4602sk;
                    androidHandleGatewayAdResponse = this;
                    c3086bY3 = c3086bY8;
                    adResponse5 = adResponse2;
                    cancellationException = e;
                    r5 = c3086bY3;
                    r14 = adResponse5;
                    mr = MR.f3404a;
                    anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass6(cancellationException, byteString2, r14, r5, null);
                    c22071.L$0 = cancellationException;
                    c22071.L$1 = null;
                    c22071.L$2 = null;
                    c22071.L$3 = null;
                    c22071.L$4 = null;
                    c22071.L$5 = null;
                    c22071.L$6 = null;
                    c22071.L$7 = null;
                    c22071.L$8 = null;
                    c22071.label = 7;
                    if (WD.X(anonymousClass6, mr, c22071) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    cause = cancellationException.getCause();
                    if (cause == null) {
                        throw cancellationException;
                    }
                    throw cause;
                case 1:
                    boolean z4 = c22071.Z$0;
                    C3086bY c3086bY9 = (C3086bY) c22071.L$6;
                    diagnosticAdType2 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) c22071.L$5;
                    str2 = (String) c22071.L$4;
                    AdResponseOuterClass.AdResponse adResponse10 = (AdResponseOuterClass.AdResponse) c22071.L$3;
                    byteString2 = (ByteString) c22071.L$2;
                    UnityAdsLoadOptions unityAdsLoadOptions4 = (UnityAdsLoadOptions) c22071.L$1;
                    androidHandleGatewayAdResponse2 = (AndroidHandleGatewayAdResponse) c22071.L$0;
                    try {
                        AbstractC3375el.b0(objInvoke2);
                        z2 = z4;
                        c3086bY2 = c3086bY9;
                        adResponse4 = adResponse10;
                        unityAdsLoadOptions2 = unityAdsLoadOptions4;
                        webViewConfiguration = (WebViewConfiguration) objInvoke2;
                        if (webViewConfiguration.getEntryPoint().length() == 0) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_COMMUNICATION_FAILURE, null, "no_webview_entry_point", null, false, 52, null);
                        }
                        configUrl = SdkProperties.getConfigUrl();
                        AbstractC2995aW.p(configUrl, "it");
                        if (!configUrl.endsWith(".html")) {
                            configUrl = null;
                        }
                        if (configUrl == null) {
                            configUrl = webViewConfiguration.getEntryPoint();
                        }
                        str3 = AbstractC3089ba0.U0(configUrl, "?") + (UnityAdsConstants.DefaultUrls.AD_PLAYER_QUERY_PARAMS + new URI(configUrl).getQuery());
                        strEncodeToString = Base64.encodeToString(adResponse4.getImpressionConfiguration().toByteArray(), 2);
                        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase2 = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                        AdPlayerScope adPlayerScope2 = androidHandleGatewayAdResponse2.adPlayerScope;
                        c22071.L$0 = androidHandleGatewayAdResponse2;
                        c22071.L$1 = unityAdsLoadOptions2;
                        c22071.L$2 = byteString2;
                        c22071.L$3 = adResponse4;
                        c22071.L$4 = str2;
                        c22071.L$5 = diagnosticAdType2;
                        c22071.L$6 = c3086bY2;
                        c22071.L$7 = str3;
                        c22071.L$8 = strEncodeToString;
                        c22071.Z$0 = z2;
                        c22071.label = 2;
                        objInvoke = androidGetWebViewContainerUseCase2.invoke(adPlayerScope2, c22071);
                        if (objInvoke == enumC4602sk) {
                            return enumC4602sk;
                        }
                        z3 = z2;
                        diagnosticAdType3 = diagnosticAdType2;
                        unityAdsLoadOptions3 = unityAdsLoadOptions2;
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                        c3086bY4 = c3086bY2;
                        adResponse6 = adResponse4;
                        AndroidWebViewContainer androidWebViewContainer2 = (AndroidWebViewContainer) objInvoke;
                        WebViewBridge webViewBridgeInvoke2 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer2, androidHandleGatewayAdResponse.adPlayerScope);
                        c3086bY4.f4172a = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke2, androidWebViewContainer2, byteString2);
                        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass2(c3086bY4, null), androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii()), ((AdPlayer) c3086bY4.f4172a).getScope());
                        AbstractC3375el.K(AbstractC3375el.Q(androidHandleGatewayAdResponse.new AnonymousClass3(byteString2, str2, null), ((AdPlayer) c3086bY4.f4172a).getUpdateCampaignState()), ((AdPlayer) c3086bY4.f4172a).getScope());
                        ByteString trackingToken2 = adResponse6.getTrackingToken();
                        AdPlayer adPlayer2 = (AdPlayer) c3086bY4.f4172a;
                        AbstractC2995aW.p(trackingToken2, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                        adObject = new AdObject(byteString2, str2, trackingToken2, false, null, null, null, adPlayer2, null, unityAdsLoadOptions3, z3, diagnosticAdType3, 376, null);
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObject, 14, null);
                        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                        InterfaceC4286p60 onInvocation2 = webViewBridgeInvoke2.getOnInvocation();
                        ByteString adData2 = adResponse6.getAdData();
                        AbstractC2995aW.p(adData2, "response.adData");
                        String base64$default3 = ProtobufExtensionsKt.toBase64$default(adData2, false, 1, null);
                        ByteString adDataRefreshToken2 = adResponse6.getAdDataRefreshToken();
                        AbstractC2995aW.p(adDataRefreshToken2, "response.adDataRefreshToken");
                        String base64$default4 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2, false, 1, null);
                        AbstractC2995aW.p(strEncodeToString, "base64ImpressionConfiguration");
                        AnonymousClass4 anonymousClass7 = new AnonymousClass4(androidWebViewContainer2, str3, null);
                        c22071.L$0 = androidHandleGatewayAdResponse;
                        c22071.L$1 = byteString2;
                        c22071.L$2 = adResponse6;
                        c22071.L$3 = c3086bY4;
                        c22071.L$4 = adObject;
                        c22071.L$5 = null;
                        c22071.L$6 = null;
                        c22071.L$7 = null;
                        c22071.L$8 = null;
                        c22071.label = 3;
                        objInvoke2 = handleInvocationsFromAdViewer2.invoke(onInvocation2, base64$default3, base64$default4, strEncodeToString, adObject, anonymousClass7, c22071);
                        enumC4602sk = enumC4602sk;
                        if (objInvoke2 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        adObject2 = adObject;
                        byteString3 = byteString2;
                        c3086bY5 = c3086bY4;
                        adResponse7 = adResponse6;
                        AbstractC3375el.K((InterfaceC4443qv) objInvoke2, ((AdPlayer) c3086bY5.f4172a).getScope());
                        InterfaceC4443qv onLoadEvent2 = ((AdPlayer) c3086bY5.f4172a).getOnLoadEvent();
                        c22071.L$0 = androidHandleGatewayAdResponse;
                        c22071.L$1 = byteString3;
                        c22071.L$2 = adResponse7;
                        c22071.L$3 = c3086bY5;
                        c22071.L$4 = adObject2;
                        c22071.label = 4;
                        objInvoke2 = AbstractC3375el.Y(onLoadEvent2, c22071);
                        c3086bY6 = c3086bY5;
                        adResponse8 = adResponse7;
                        if (objInvoke2 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        loadEvent = (LoadEvent) objInvoke2;
                        if (!(loadEvent instanceof LoadEvent.Error)) {
                            androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                            adRepository = androidHandleGatewayAdResponse.adRepository;
                            c22071.L$0 = androidHandleGatewayAdResponse;
                            c22071.L$1 = byteString3;
                            c22071.L$2 = adResponse8;
                            c22071.L$3 = c3086bY6;
                            c22071.L$4 = adObject2;
                            c22071.label = 6;
                            if (adRepository.addAd(byteString3, adObject2, c22071) == enumC4602sk) {
                                return enumC4602sk;
                            }
                            return new LoadResult.Success(adObject2);
                        }
                        mr2 = MR.f3404a;
                        anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, c3086bY6, null);
                        c22071.L$0 = androidHandleGatewayAdResponse;
                        c22071.L$1 = byteString3;
                        c22071.L$2 = adResponse8;
                        c22071.L$3 = c3086bY6;
                        c22071.L$4 = adObject2;
                        c22071.L$5 = loadEvent;
                        c22071.label = 5;
                        if (WD.X(anonymousClass5, mr2, c22071) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        c3086bY7 = c3086bY6;
                        adObject3 = adObject2;
                        loadEvent2 = loadEvent;
                        adResponse9 = adResponse8;
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject3.isScarAd(), 4, null);
                        cancellationException = e;
                        c3086bY = c3086bY2;
                        adResponse3 = adResponse4;
                    } catch (CancellationException e13) {
                        cancellationException = e13;
                        enumC4602sk = enumC4602sk;
                        c3086bY = c3086bY9;
                        adResponse3 = adResponse10;
                    }
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                    r5 = c3086bY;
                    r14 = adResponse3;
                    mr = MR.f3404a;
                    anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass6(cancellationException, byteString2, r14, r5, null);
                    c22071.L$0 = cancellationException;
                    c22071.L$1 = null;
                    c22071.L$2 = null;
                    c22071.L$3 = null;
                    c22071.L$4 = null;
                    c22071.L$5 = null;
                    c22071.L$6 = null;
                    c22071.L$7 = null;
                    c22071.L$8 = null;
                    c22071.label = 7;
                    if (WD.X(anonymousClass6, mr, c22071) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    cause = cancellationException.getCause();
                    if (cause == null) {
                        throw cancellationException;
                    }
                    throw cause;
                case 2:
                    boolean z5 = c22071.Z$0;
                    String str4 = (String) c22071.L$8;
                    str3 = (String) c22071.L$7;
                    C3086bY c3086bY10 = (C3086bY) c22071.L$6;
                    DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4 = (DiagnosticEventRequestOuterClass.DiagnosticAdType) c22071.L$5;
                    String str5 = (String) c22071.L$4;
                    AdResponseOuterClass.AdResponse adResponse11 = (AdResponseOuterClass.AdResponse) c22071.L$3;
                    ByteString byteString4 = (ByteString) c22071.L$2;
                    UnityAdsLoadOptions unityAdsLoadOptions5 = (UnityAdsLoadOptions) c22071.L$1;
                    AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse3 = (AndroidHandleGatewayAdResponse) c22071.L$0;
                    try {
                        AbstractC3375el.b0(objInvoke2);
                        z3 = z5;
                        diagnosticAdType3 = diagnosticAdType4;
                        str2 = str5;
                        unityAdsLoadOptions3 = unityAdsLoadOptions5;
                        objInvoke = objInvoke2;
                        strEncodeToString = str4;
                        c3086bY4 = c3086bY10;
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse3;
                        adResponse6 = adResponse11;
                        byteString2 = byteString4;
                        AndroidWebViewContainer androidWebViewContainer3 = (AndroidWebViewContainer) objInvoke;
                        WebViewBridge webViewBridgeInvoke3 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer3, androidHandleGatewayAdResponse.adPlayerScope);
                        c3086bY4.f4172a = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke3, androidWebViewContainer3, byteString2);
                        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass2(c3086bY4, null), androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii()), ((AdPlayer) c3086bY4.f4172a).getScope());
                        AbstractC3375el.K(AbstractC3375el.Q(androidHandleGatewayAdResponse.new AnonymousClass3(byteString2, str2, null), ((AdPlayer) c3086bY4.f4172a).getUpdateCampaignState()), ((AdPlayer) c3086bY4.f4172a).getScope());
                        ByteString trackingToken3 = adResponse6.getTrackingToken();
                        AdPlayer adPlayer3 = (AdPlayer) c3086bY4.f4172a;
                        AbstractC2995aW.p(trackingToken3, HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
                        adObject = new AdObject(byteString2, str2, trackingToken3, false, null, null, null, adPlayer3, null, unityAdsLoadOptions3, z3, diagnosticAdType3, 376, null);
                        SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObject, 14, null);
                        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer3 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                        InterfaceC4286p60 onInvocation3 = webViewBridgeInvoke3.getOnInvocation();
                        ByteString adData3 = adResponse6.getAdData();
                        AbstractC2995aW.p(adData3, "response.adData");
                        String base64$default5 = ProtobufExtensionsKt.toBase64$default(adData3, false, 1, null);
                        ByteString adDataRefreshToken3 = adResponse6.getAdDataRefreshToken();
                        AbstractC2995aW.p(adDataRefreshToken3, "response.adDataRefreshToken");
                        String base64$default6 = ProtobufExtensionsKt.toBase64$default(adDataRefreshToken3, false, 1, null);
                        AbstractC2995aW.p(strEncodeToString, "base64ImpressionConfiguration");
                        AnonymousClass4 anonymousClass8 = new AnonymousClass4(androidWebViewContainer3, str3, null);
                        c22071.L$0 = androidHandleGatewayAdResponse;
                        c22071.L$1 = byteString2;
                        c22071.L$2 = adResponse6;
                        c22071.L$3 = c3086bY4;
                        c22071.L$4 = adObject;
                        c22071.L$5 = null;
                        c22071.L$6 = null;
                        c22071.L$7 = null;
                        c22071.L$8 = null;
                        c22071.label = 3;
                        objInvoke2 = handleInvocationsFromAdViewer3.invoke(onInvocation3, base64$default5, base64$default6, strEncodeToString, adObject, anonymousClass8, c22071);
                        enumC4602sk = enumC4602sk;
                        if (objInvoke2 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        adObject2 = adObject;
                        byteString3 = byteString2;
                        c3086bY5 = c3086bY4;
                        adResponse7 = adResponse6;
                        AbstractC3375el.K((InterfaceC4443qv) objInvoke2, ((AdPlayer) c3086bY5.f4172a).getScope());
                        InterfaceC4443qv onLoadEvent3 = ((AdPlayer) c3086bY5.f4172a).getOnLoadEvent();
                        c22071.L$0 = androidHandleGatewayAdResponse;
                        c22071.L$1 = byteString3;
                        c22071.L$2 = adResponse7;
                        c22071.L$3 = c3086bY5;
                        c22071.L$4 = adObject2;
                        c22071.label = 4;
                        objInvoke2 = AbstractC3375el.Y(onLoadEvent3, c22071);
                        c3086bY6 = c3086bY5;
                        adResponse8 = adResponse7;
                        if (objInvoke2 == enumC4602sk) {
                            return enumC4602sk;
                        }
                        loadEvent = (LoadEvent) objInvoke2;
                        if (!(loadEvent instanceof LoadEvent.Error)) {
                            androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                            adRepository = androidHandleGatewayAdResponse.adRepository;
                            c22071.L$0 = androidHandleGatewayAdResponse;
                            c22071.L$1 = byteString3;
                            c22071.L$2 = adResponse8;
                            c22071.L$3 = c3086bY6;
                            c22071.L$4 = adObject2;
                            c22071.label = 6;
                            if (adRepository.addAd(byteString3, adObject2, c22071) == enumC4602sk) {
                                return enumC4602sk;
                            }
                            return new LoadResult.Success(adObject2);
                        }
                        mr2 = MR.f3404a;
                        anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, c3086bY6, null);
                        c22071.L$0 = androidHandleGatewayAdResponse;
                        c22071.L$1 = byteString3;
                        c22071.L$2 = adResponse8;
                        c22071.L$3 = c3086bY6;
                        c22071.L$4 = adObject2;
                        c22071.L$5 = loadEvent;
                        c22071.label = 5;
                        if (WD.X(anonymousClass5, mr2, c22071) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        c3086bY7 = c3086bY6;
                        adObject3 = adObject2;
                        loadEvent2 = loadEvent;
                        adResponse9 = adResponse8;
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject3.isScarAd(), 4, null);
                    } catch (CancellationException e14) {
                        cancellationException = e14;
                        enumC4602sk = enumC4602sk;
                        r5 = c3086bY10;
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse3;
                        r14 = adResponse11;
                        byteString2 = byteString4;
                    }
                    break;
                case 3:
                    adObject2 = (AdObject) c22071.L$4;
                    C3086bY c3086bY11 = (C3086bY) c22071.L$3;
                    AdResponseOuterClass.AdResponse adResponse12 = (AdResponseOuterClass.AdResponse) c22071.L$2;
                    byteString3 = (ByteString) c22071.L$1;
                    androidHandleGatewayAdResponse = (AndroidHandleGatewayAdResponse) c22071.L$0;
                    AbstractC3375el.b0(objInvoke2);
                    enumC4602sk = enumC4602sk;
                    adResponse7 = adResponse12;
                    c3086bY5 = c3086bY11;
                    AbstractC3375el.K((InterfaceC4443qv) objInvoke2, ((AdPlayer) c3086bY5.f4172a).getScope());
                    InterfaceC4443qv onLoadEvent4 = ((AdPlayer) c3086bY5.f4172a).getOnLoadEvent();
                    c22071.L$0 = androidHandleGatewayAdResponse;
                    c22071.L$1 = byteString3;
                    c22071.L$2 = adResponse7;
                    c22071.L$3 = c3086bY5;
                    c22071.L$4 = adObject2;
                    c22071.label = 4;
                    objInvoke2 = AbstractC3375el.Y(onLoadEvent4, c22071);
                    c3086bY6 = c3086bY5;
                    adResponse8 = adResponse7;
                    if (objInvoke2 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    loadEvent = (LoadEvent) objInvoke2;
                    if (!(loadEvent instanceof LoadEvent.Error)) {
                        androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                        adRepository = androidHandleGatewayAdResponse.adRepository;
                        c22071.L$0 = androidHandleGatewayAdResponse;
                        c22071.L$1 = byteString3;
                        c22071.L$2 = adResponse8;
                        c22071.L$3 = c3086bY6;
                        c22071.L$4 = adObject2;
                        c22071.label = 6;
                        if (adRepository.addAd(byteString3, adObject2, c22071) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        return new LoadResult.Success(adObject2);
                    }
                    mr2 = MR.f3404a;
                    anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, c3086bY6, null);
                    c22071.L$0 = androidHandleGatewayAdResponse;
                    c22071.L$1 = byteString3;
                    c22071.L$2 = adResponse8;
                    c22071.L$3 = c3086bY6;
                    c22071.L$4 = adObject2;
                    c22071.L$5 = loadEvent;
                    c22071.label = 5;
                    if (WD.X(anonymousClass5, mr2, c22071) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    c3086bY7 = c3086bY6;
                    adObject3 = adObject2;
                    loadEvent2 = loadEvent;
                    adResponse9 = adResponse8;
                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject3.isScarAd(), 4, null);
                case 4:
                    adObject2 = (AdObject) c22071.L$4;
                    C3086bY c3086bY12 = (C3086bY) c22071.L$3;
                    AdResponseOuterClass.AdResponse adResponse13 = (AdResponseOuterClass.AdResponse) c22071.L$2;
                    byteString3 = (ByteString) c22071.L$1;
                    androidHandleGatewayAdResponse = (AndroidHandleGatewayAdResponse) c22071.L$0;
                    AbstractC3375el.b0(objInvoke2);
                    enumC4602sk = enumC4602sk;
                    adResponse8 = adResponse13;
                    c3086bY6 = c3086bY12;
                    loadEvent = (LoadEvent) objInvoke2;
                    if (!(loadEvent instanceof LoadEvent.Error)) {
                        androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                        adRepository = androidHandleGatewayAdResponse.adRepository;
                        c22071.L$0 = androidHandleGatewayAdResponse;
                        c22071.L$1 = byteString3;
                        c22071.L$2 = adResponse8;
                        c22071.L$3 = c3086bY6;
                        c22071.L$4 = adObject2;
                        c22071.label = 6;
                        if (adRepository.addAd(byteString3, adObject2, c22071) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        return new LoadResult.Success(adObject2);
                    }
                    mr2 = MR.f3404a;
                    anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, c3086bY6, null);
                    c22071.L$0 = androidHandleGatewayAdResponse;
                    c22071.L$1 = byteString3;
                    c22071.L$2 = adResponse8;
                    c22071.L$3 = c3086bY6;
                    c22071.L$4 = adObject2;
                    c22071.L$5 = loadEvent;
                    c22071.label = 5;
                    if (WD.X(anonymousClass5, mr2, c22071) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    c3086bY7 = c3086bY6;
                    adObject3 = adObject2;
                    loadEvent2 = loadEvent;
                    adResponse9 = adResponse8;
                    return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject3.isScarAd(), 4, null);
                case 5:
                    loadEvent2 = (LoadEvent) c22071.L$5;
                    adObject3 = (AdObject) c22071.L$4;
                    C3086bY c3086bY13 = (C3086bY) c22071.L$3;
                    AdResponseOuterClass.AdResponse adResponse14 = (AdResponseOuterClass.AdResponse) c22071.L$2;
                    ByteString byteString5 = (ByteString) c22071.L$1;
                    AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse4 = (AndroidHandleGatewayAdResponse) c22071.L$0;
                    try {
                        AbstractC3375el.b0(objInvoke2);
                        enumC4602sk = enumC4602sk;
                        adResponse9 = adResponse14;
                        byteString3 = byteString5;
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                        c3086bY7 = c3086bY13;
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((LoadEvent.Error) loadEvent2).getMessage(), adObject3.isScarAd(), 4, null);
                    } catch (CancellationException e15) {
                        cancellationException = e15;
                        enumC4602sk = enumC4602sk;
                        r5 = c3086bY13;
                        r14 = adResponse14;
                        byteString2 = byteString5;
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse4;
                    }
                    break;
                case 6:
                    adObject2 = (AdObject) c22071.L$4;
                    AbstractC3375el.b0(objInvoke2);
                    return new LoadResult.Success(adObject2);
                case 7:
                    cancellationException = (CancellationException) c22071.L$0;
                    AbstractC3375el.b0(objInvoke2);
                    cause = cancellationException.getCause();
                    if (cause == null) {
                        throw cancellationException;
                    }
                    throw cause;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e16) {
            cancellationException = e16;
            enumC4602sk = enumC4602sk;
            r13 = 1;
            r6 = i2;
        }
    }
}
