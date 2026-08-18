package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TokenCountersKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", f = "AndroidBuildHeaderBiddingToken.kt", l = {34, 47, 50, 52}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidBuildHeaderBiddingToken.this.invoke(false, this);
        }
    }

    public AndroidBuildHeaderBiddingToken(GetByteStringId getByteStringId, GetClientInfo getClientInfo, GetSharedDataTimestamps getSharedDataTimestamps, GetLimitedSessionToken getLimitedSessionToken, GetInitializationData getInitializationData, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository, TcfRepository tcfRepository, AndroidTestDataInfo androidTestDataInfo) {
        AbstractC2995aW.q(getByteStringId, "generateId");
        AbstractC2995aW.q(getClientInfo, "getClientInfo");
        AbstractC2995aW.q(getSharedDataTimestamps, "getTimestamps");
        AbstractC2995aW.q(getLimitedSessionToken, "getLimitedSessionToken");
        AbstractC2995aW.q(getInitializationData, "getInitializationData");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(campaignRepository, "campaignRepository");
        AbstractC2995aW.q(tcfRepository, "tcfRepository");
        AbstractC2995aW.q(androidTestDataInfo, "testDataInfo");
        this.generateId = getByteStringId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getSharedDataTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = androidTestDataInfo;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    public Object invoke(boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        ByteString sessionToken;
        HeaderBiddingTokenKt.Dsl dsl_create;
        Object objInvoke;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken;
        TokenCounters tokenCounters;
        HeaderBiddingTokenKt.Dsl dsl;
        boolean z2;
        HeaderBiddingTokenKt.Dsl dsl2;
        HeaderBiddingTokenKt.Dsl dsl3;
        HeaderBiddingTokenKt.Dsl dsl4;
        TokenCounters tokenCounters2;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken2;
        HeaderBiddingTokenKt.Dsl dsl5;
        HeaderBiddingTokenKt.Dsl dsl6;
        HeaderBiddingTokenKt.Dsl dsl7;
        TokenCounters tokenCounters3;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken3;
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
        Object objInvoke2 = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z3 = anonymousClass1.Z$0;
                dsl_create = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$5;
                HeaderBiddingTokenKt.Dsl dsl8 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                dsl = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                sessionToken = (ByteString) anonymousClass1.L$2;
                tokenCounters = (TokenCounters) anonymousClass1.L$1;
                androidBuildHeaderBiddingToken = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke2);
                z2 = z3;
                dsl2 = dsl8;
                objInvoke = objInvoke2;
            } else if (i2 == 2) {
                dsl2 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                dsl3 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                dsl4 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                tokenCounters2 = (TokenCounters) anonymousClass1.L$1;
                androidBuildHeaderBiddingToken2 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke2);
                dsl2.setInitializationData((InitializationDataOuterClass.InitializationData) objInvoke2);
                dsl5 = dsl3;
                dsl6 = dsl4;
                DeviceInfoRepository deviceInfoRepository = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken2;
                anonymousClass1.L$1 = tokenCounters2;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = dsl5;
                anonymousClass1.L$4 = dsl5;
                anonymousClass1.label = 4;
                objInvoke2 = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
                if (objInvoke2 == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl7 = dsl5;
                tokenCounters3 = tokenCounters2;
                androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
            } else if (i2 == 3) {
                dsl2 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                dsl3 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                dsl4 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                tokenCounters2 = (TokenCounters) anonymousClass1.L$1;
                androidBuildHeaderBiddingToken2 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke2);
                dsl2.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objInvoke2);
                dsl5 = dsl3;
                dsl6 = dsl4;
                DeviceInfoRepository deviceInfoRepository2 = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken2;
                anonymousClass1.L$1 = tokenCounters2;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = dsl5;
                anonymousClass1.L$4 = dsl5;
                anonymousClass1.label = 4;
                objInvoke2 = deviceInfoRepository2.staticDeviceInfo(anonymousClass1);
                if (objInvoke2 == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl7 = dsl5;
                tokenCounters3 = tokenCounters2;
                androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl5 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                dsl7 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                dsl6 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                tokenCounters3 = (TokenCounters) anonymousClass1.L$1;
                androidBuildHeaderBiddingToken3 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke2);
            }
            dsl5.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke2);
            androidBuildHeaderBiddingToken = androidBuildHeaderBiddingToken3;
            dsl2 = dsl7;
            dsl = dsl6;
            tokenCounters = tokenCounters3;
            dsl2.setTestData(androidBuildHeaderBiddingToken.testDataInfo.invoke());
            TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
            HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
            AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
            TokenCountersKt.Dsl dsl_create2 = companion._create(builderNewBuilder);
            dsl_create2.setSeq(tokenCounters.getSeq());
            dsl_create2.setWins(tokenCounters.getWins());
            dsl_create2.setStarts(tokenCounters.getStarts());
            dsl2.setTokenCounters(dsl_create2._build());
            return dsl._build();
        }
        AbstractC3375el.b0(objInvoke2);
        TokenCounters tokenCounters4 = this.sessionRepository.getTokenCounters();
        sessionToken = this.sessionRepository.getSessionToken();
        this.sessionRepository.incrementTokenSequenceNumber();
        HeaderBiddingTokenKt.Dsl.Companion companion2 = HeaderBiddingTokenKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder2 = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
        AbstractC2995aW.p(builderNewBuilder2, "newBuilder()");
        dsl_create = companion2._create(builderNewBuilder2);
        dsl_create.setTokenId(this.generateId.invoke());
        dsl_create.setTokenNumber(this.sessionRepository.getHeaderBiddingTokenCounter());
        GetClientInfo getClientInfo = this.getClientInfo;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = tokenCounters4;
        anonymousClass1.L$2 = sessionToken;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.Z$0 = z;
        anonymousClass1.label = 1;
        objInvoke = getClientInfo.invoke(anonymousClass1);
        if (objInvoke == enumC4602sk) {
            return enumC4602sk;
        }
        androidBuildHeaderBiddingToken = this;
        tokenCounters = tokenCounters4;
        dsl = dsl_create;
        z2 = z;
        dsl2 = dsl;
        dsl_create.setClientInfo((ClientInfoOuterClass.ClientInfo) objInvoke);
        dsl2.setTimestamps(androidBuildHeaderBiddingToken.getTimestamps.invoke());
        dsl2.setSessionCounters(androidBuildHeaderBiddingToken.sessionRepository.getSessionCounters());
        dsl2.setDynamicDeviceInfo(androidBuildHeaderBiddingToken.deviceInfoRepository.getDynamicDeviceInfo());
        PiiOuterClass.Pii piiData = androidBuildHeaderBiddingToken.deviceInfoRepository.getPiiData();
        if (!piiData.getAdvertisingId().isEmpty() || !piiData.getOpenAdvertisingTrackingId().isEmpty()) {
            dsl2.setPii(piiData);
        }
        dsl2.setCampaignState(androidBuildHeaderBiddingToken.campaignRepository.getCampaignState());
        String tcfString = androidBuildHeaderBiddingToken.tcfRepository.getTcfString();
        if (tcfString != null) {
            dsl2.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
        }
        dsl2.setScarSignalsCollected(z2);
        if (sessionToken.isEmpty()) {
            String gameId = androidBuildHeaderBiddingToken.sessionRepository.getGameId();
            if (gameId == null || gameId.length() <= 0) {
                GetLimitedSessionToken getLimitedSessionToken = androidBuildHeaderBiddingToken.getLimitedSessionToken;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                anonymousClass1.L$1 = tokenCounters;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl2;
                anonymousClass1.L$4 = dsl2;
                anonymousClass1.L$5 = null;
                anonymousClass1.label = 3;
                objInvoke2 = getLimitedSessionToken.invoke(anonymousClass1);
                if (objInvoke2 == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl3 = dsl2;
                dsl4 = dsl;
                tokenCounters2 = tokenCounters;
                androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
                dsl2.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objInvoke2);
                dsl5 = dsl3;
                dsl6 = dsl4;
                DeviceInfoRepository deviceInfoRepository3 = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken2;
                anonymousClass1.L$1 = tokenCounters2;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = dsl5;
                anonymousClass1.L$4 = dsl5;
                anonymousClass1.label = 4;
                objInvoke2 = deviceInfoRepository3.staticDeviceInfo(anonymousClass1);
                if (objInvoke2 == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl7 = dsl5;
                tokenCounters3 = tokenCounters2;
                androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                dsl5.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke2);
                androidBuildHeaderBiddingToken = androidBuildHeaderBiddingToken3;
                dsl2 = dsl7;
                dsl = dsl6;
                tokenCounters = tokenCounters3;
            } else {
                GetInitializationData getInitializationData = androidBuildHeaderBiddingToken.getInitializationData;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
                anonymousClass1.L$1 = tokenCounters;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl2;
                anonymousClass1.L$4 = dsl2;
                anonymousClass1.L$5 = null;
                anonymousClass1.label = 2;
                objInvoke2 = getInitializationData.invoke(anonymousClass1);
                if (objInvoke2 == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl3 = dsl2;
                dsl4 = dsl;
                tokenCounters2 = tokenCounters;
                androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
                dsl2.setInitializationData((InitializationDataOuterClass.InitializationData) objInvoke2);
                dsl5 = dsl3;
                dsl6 = dsl4;
                DeviceInfoRepository deviceInfoRepository4 = androidBuildHeaderBiddingToken2.deviceInfoRepository;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken2;
                anonymousClass1.L$1 = tokenCounters2;
                anonymousClass1.L$2 = dsl6;
                anonymousClass1.L$3 = dsl5;
                anonymousClass1.L$4 = dsl5;
                anonymousClass1.label = 4;
                objInvoke2 = deviceInfoRepository4.staticDeviceInfo(anonymousClass1);
                if (objInvoke2 == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl7 = dsl5;
                tokenCounters3 = tokenCounters2;
                androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                dsl5.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke2);
                androidBuildHeaderBiddingToken = androidBuildHeaderBiddingToken3;
                dsl2 = dsl7;
                dsl = dsl6;
                tokenCounters = tokenCounters3;
            }
        } else {
            dsl2.setSessionToken(androidBuildHeaderBiddingToken.sessionRepository.getSessionToken());
            dsl2.setStaticDeviceInfo(androidBuildHeaderBiddingToken.deviceInfoRepository.cachedStaticDeviceInfo());
        }
        dsl2.setTestData(androidBuildHeaderBiddingToken.testDataInfo.invoke());
        TokenCountersKt.Dsl.Companion companion3 = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder3 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        AbstractC2995aW.p(builderNewBuilder3, "newBuilder()");
        TokenCountersKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setSeq(tokenCounters.getSeq());
        dsl_create3.setWins(tokenCounters.getWins());
        dsl_create3.setStarts(tokenCounters.getStarts());
        dsl2.setTokenCounters(dsl_create3._build());
        return dsl._build();
    }
}
