package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AdDataRefreshRequestKt;
import gatewayprotocol.v1.AdDataRefreshRequestOuterClass;
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
public final class AndroidGetAdDataRefreshRequest implements GetAdDataRefreshRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetAdDataRefreshRequest", f = "AndroidGetAdDataRefreshRequest.kt", l = {25, 34}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdDataRefreshRequest.this.invoke(null, null, this);
        }
    }

    public AndroidGetAdDataRefreshRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository) {
        AbstractC2995aW.q(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(campaignRepository, "campaignRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetAdDataRefreshRequest
    public Object invoke(ByteString byteString, ByteString byteString2, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AndroidGetAdDataRefreshRequest androidGetAdDataRefreshRequest;
        ByteString byteString3;
        ByteString byteString4;
        AdDataRefreshRequestKt.Dsl dsl;
        AdDataRefreshRequestKt.Dsl dsl2;
        AdDataRefreshRequestKt.Dsl dsl3;
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
        Object objInvoke = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                dsl = (AdDataRefreshRequestKt.Dsl) anonymousClass1.L$5;
                dsl2 = (AdDataRefreshRequestKt.Dsl) anonymousClass1.L$4;
                dsl3 = (AdDataRefreshRequestKt.Dsl) anonymousClass1.L$3;
                byteString4 = (ByteString) anonymousClass1.L$2;
                byteString3 = (ByteString) anonymousClass1.L$1;
                androidGetAdDataRefreshRequest = (AndroidGetAdDataRefreshRequest) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objInvoke);
            }
        }
        AbstractC3375el.b0(objInvoke);
        AdDataRefreshRequestKt.Dsl.Companion companion = AdDataRefreshRequestKt.Dsl.Companion;
        AdDataRefreshRequestOuterClass.AdDataRefreshRequest.Builder builderNewBuilder = AdDataRefreshRequestOuterClass.AdDataRefreshRequest.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AdDataRefreshRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setSessionCounters(this.sessionRepository.getSessionCounters());
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = byteString;
        anonymousClass1.L$2 = byteString2;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.label = 1;
        Object objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == enumC4602sk) {
            return enumC4602sk;
        }
        androidGetAdDataRefreshRequest = this;
        byteString3 = byteString;
        byteString4 = byteString2;
        dsl = dsl_create;
        dsl2 = dsl;
        objInvoke = objStaticDeviceInfo;
        dsl3 = dsl2;
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke);
        dsl2.setDynamicDeviceInfo(androidGetAdDataRefreshRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString3);
        dsl2.setCampaignState(androidGetAdDataRefreshRequest.campaignRepository.getCampaignState());
        if (!byteString4.isEmpty()) {
            dsl2.setAdDataRefreshToken(byteString4);
        }
        AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest_build = dsl3._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        AbstractC2995aW.p(builderNewBuilder2, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setAdDataRefreshRequest(adDataRefreshRequest_build);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetAdDataRefreshRequest.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.L$5 = null;
        anonymousClass1.label = 2;
        objInvoke = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
        return objInvoke == enumC4602sk ? enumC4602sk : objInvoke;
    }
}
