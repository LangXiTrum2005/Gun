package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {
    private final DeviceInfoRepository deviceInfoRepository;
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken", f = "AndroidGetLimitedSessionToken.kt", l = {19, 20, 21, 22}, m = "invoke")
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
            return AndroidGetLimitedSessionToken.this.invoke(this);
        }
    }

    public AndroidGetLimitedSessionToken(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, MediationRepository mediationRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(mediationRepository, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:34:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0122  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        LimitedSessionTokenKt.Dsl dsl_create;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken;
        LimitedSessionTokenKt.Dsl dsl;
        LimitedSessionTokenKt.Dsl dsl2;
        LimitedSessionTokenKt.Dsl dsl3;
        LimitedSessionTokenKt.Dsl dsl4;
        LimitedSessionTokenKt.Dsl dsl5;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken2;
        LimitedSessionTokenKt.Dsl dsl6;
        LimitedSessionTokenKt.Dsl dsl7;
        LimitedSessionTokenKt.Dsl dsl8;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken3;
        LimitedSessionTokenKt.Dsl dsl9;
        LimitedSessionTokenKt.Dsl dsl10;
        LimitedSessionTokenKt.Dsl dsl11;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken4;
        String gameId;
        String name;
        String version;
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
                dsl_create = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl2 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objStaticDeviceInfo);
            } else if (i2 == 2) {
                dsl3 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl4 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl5 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken2 = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objStaticDeviceInfo);
                String deviceModel = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceModel();
                AbstractC2995aW.p(deviceModel, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
                dsl3.setDeviceModel(deviceModel);
                DeviceInfoRepository deviceInfoRepository = androidGetLimitedSessionToken2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl4;
                anonymousClass1.L$3 = dsl4;
                anonymousClass1.label = 3;
                objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
                if (objStaticDeviceInfo == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl6 = dsl4;
                dsl7 = dsl6;
                dsl8 = dsl5;
                androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
                String osVersion = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
                AbstractC2995aW.p(osVersion, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl6.setOsVersion(osVersion);
                DeviceInfoRepository deviceInfoRepository2 = androidGetLimitedSessionToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken3;
                anonymousClass1.L$1 = dsl8;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl7;
                anonymousClass1.label = 4;
                objStaticDeviceInfo = deviceInfoRepository2.getIdfi(anonymousClass1);
                if (objStaticDeviceInfo == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl9 = dsl7;
                dsl10 = dsl9;
                dsl11 = dsl8;
                androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
            } else if (i2 == 3) {
                dsl6 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl7 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl8 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken3 = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objStaticDeviceInfo);
                String osVersion2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
                AbstractC2995aW.p(osVersion2, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl6.setOsVersion(osVersion2);
                DeviceInfoRepository deviceInfoRepository3 = androidGetLimitedSessionToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken3;
                anonymousClass1.L$1 = dsl8;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl7;
                anonymousClass1.label = 4;
                objStaticDeviceInfo = deviceInfoRepository3.getIdfi(anonymousClass1);
                if (objStaticDeviceInfo == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl9 = dsl7;
                dsl10 = dsl9;
                dsl11 = dsl8;
                androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl9 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl10 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl11 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken4 = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objStaticDeviceInfo);
            }
            dsl9.setIdfi((String) objStaticDeviceInfo);
            dsl10.setSdkVersion(41301);
            dsl10.setSdkVersionName("4.13.1");
            gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
            if (gameId != null) {
                dsl10.setGameId(gameId);
            }
            dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
            dsl10.setMediationProvider((ClientInfoOuterClass.MediationProvider) androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
            name = androidGetLimitedSessionToken4.mediationRepository.getName();
            if (name != null && dsl10.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
                dsl10.setCustomMediationName(name);
            }
            version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
            if (version != null) {
                dsl10.setMediationVersion(version);
            }
            return dsl11._build();
        }
        AbstractC3375el.b0(objStaticDeviceInfo);
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builderNewBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        dsl_create.setSessionId(this.sessionRepository.getSessionId());
        DeviceInfoRepository deviceInfoRepository4 = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 1;
        objStaticDeviceInfo = deviceInfoRepository4.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == enumC4602sk) {
            return enumC4602sk;
        }
        androidGetLimitedSessionToken = this;
        dsl = dsl_create;
        dsl2 = dsl;
        String deviceMake = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceMake();
        AbstractC2995aW.p(deviceMake, "deviceInfoRepository.staticDeviceInfo().deviceMake");
        dsl_create.setDeviceMake(deviceMake);
        DeviceInfoRepository deviceInfoRepository5 = androidGetLimitedSessionToken.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken;
        anonymousClass1.L$1 = dsl2;
        anonymousClass1.L$2 = dsl;
        anonymousClass1.L$3 = dsl;
        anonymousClass1.label = 2;
        objStaticDeviceInfo = deviceInfoRepository5.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == enumC4602sk) {
            return enumC4602sk;
        }
        dsl3 = dsl;
        dsl4 = dsl3;
        dsl5 = dsl2;
        androidGetLimitedSessionToken2 = androidGetLimitedSessionToken;
        String deviceModel2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceModel();
        AbstractC2995aW.p(deviceModel2, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
        dsl3.setDeviceModel(deviceModel2);
        DeviceInfoRepository deviceInfoRepository6 = androidGetLimitedSessionToken2.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken2;
        anonymousClass1.L$1 = dsl5;
        anonymousClass1.L$2 = dsl4;
        anonymousClass1.L$3 = dsl4;
        anonymousClass1.label = 3;
        objStaticDeviceInfo = deviceInfoRepository6.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == enumC4602sk) {
            return enumC4602sk;
        }
        dsl6 = dsl4;
        dsl7 = dsl6;
        dsl8 = dsl5;
        androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
        String osVersion3 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
        AbstractC2995aW.p(osVersion3, "deviceInfoRepository.staticDeviceInfo().osVersion");
        dsl6.setOsVersion(osVersion3);
        DeviceInfoRepository deviceInfoRepository7 = androidGetLimitedSessionToken3.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken3;
        anonymousClass1.L$1 = dsl8;
        anonymousClass1.L$2 = dsl7;
        anonymousClass1.L$3 = dsl7;
        anonymousClass1.label = 4;
        objStaticDeviceInfo = deviceInfoRepository7.getIdfi(anonymousClass1);
        if (objStaticDeviceInfo == enumC4602sk) {
            return enumC4602sk;
        }
        dsl9 = dsl7;
        dsl10 = dsl9;
        dsl11 = dsl8;
        androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
        dsl9.setIdfi((String) objStaticDeviceInfo);
        dsl10.setSdkVersion(41301);
        dsl10.setSdkVersionName("4.13.1");
        gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
        if (gameId != null) {
            dsl10.setGameId(gameId);
        }
        dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        dsl10.setMediationProvider((ClientInfoOuterClass.MediationProvider) androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
        name = androidGetLimitedSessionToken4.mediationRepository.getName();
        if (name != null) {
            dsl10.setCustomMediationName(name);
        }
        version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
        if (version != null) {
            dsl10.setMediationVersion(version);
        }
        return dsl11._build();
    }
}
