package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {
    private final DeveloperConsentRepository developerConsentRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData", f = "AndroidGetUniversalRequestSharedData.kt", l = {24}, m = "invoke")
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
            return AndroidGetUniversalRequestSharedData.this.invoke(this);
        }
    }

    public AndroidGetUniversalRequestSharedData(GetSharedDataTimestamps getSharedDataTimestamps, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, GetLimitedSessionToken getLimitedSessionToken, DeveloperConsentRepository developerConsentRepository) {
        AbstractC2995aW.q(getSharedDataTimestamps, "getSharedDataTimestamps");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(getLimitedSessionToken, "getLimitedSessionToken");
        AbstractC2995aW.q(developerConsentRepository, "developerConsentRepository");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        UniversalRequestKt.SharedDataKt.Dsl dsl_create;
        UniversalRequestKt.SharedDataKt.Dsl dsl;
        UniversalRequestKt.SharedDataKt.Dsl dsl2;
        UniversalRequestKt.SharedDataKt.Dsl dsl3;
        AndroidGetUniversalRequestSharedData androidGetUniversalRequestSharedData;
        PiiOuterClass.Pii piiData;
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
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
            UniversalRequestKt.SharedDataKt.Dsl.Companion companion = UniversalRequestKt.SharedDataKt.Dsl.Companion;
            UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
            AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            ByteString sessionToken = this.sessionRepository.getSessionToken();
            if (sessionToken.isEmpty()) {
                GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = dsl_create;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 1;
                Object objInvoke = getLimitedSessionToken.invoke(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl = dsl_create;
                dsl2 = dsl;
                dsl3 = dsl2;
                obj = objInvoke;
                androidGetUniversalRequestSharedData = this;
            } else {
                dsl_create.setSessionToken(sessionToken);
                androidGetUniversalRequestSharedData = this;
                dsl3 = dsl_create;
            }
            dsl_create.setTimestamps(androidGetUniversalRequestSharedData.getSharedDataTimestamps.invoke());
            dsl_create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
            dsl_create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
            dsl_create.setDeveloperConsent(androidGetUniversalRequestSharedData.developerConsentRepository.getDeveloperConsent());
            piiData = androidGetUniversalRequestSharedData.deviceInfoRepository.getPiiData();
            if (piiData.getAdvertisingId().isEmpty() || !piiData.getOpenAdvertisingTrackingId().isEmpty()) {
                dsl_create.setPii(piiData);
            }
            return dsl3._build();
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dsl = (UniversalRequestKt.SharedDataKt.Dsl) anonymousClass1.L$3;
        dsl2 = (UniversalRequestKt.SharedDataKt.Dsl) anonymousClass1.L$2;
        dsl3 = (UniversalRequestKt.SharedDataKt.Dsl) anonymousClass1.L$1;
        androidGetUniversalRequestSharedData = (AndroidGetUniversalRequestSharedData) anonymousClass1.L$0;
        AbstractC3375el.b0(obj);
        dsl.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
        dsl_create = dsl2;
        dsl_create.setTimestamps(androidGetUniversalRequestSharedData.getSharedDataTimestamps.invoke());
        dsl_create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
        dsl_create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
        dsl_create.setDeveloperConsent(androidGetUniversalRequestSharedData.developerConsentRepository.getDeveloperConsent());
        piiData = androidGetUniversalRequestSharedData.deviceInfoRepository.getPiiData();
        if (piiData.getAdvertisingId().isEmpty()) {
            dsl_create.setPii(piiData);
        } else {
            dsl_create.setPii(piiData);
        }
        return dsl3._build();
    }
}
