package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetClientInfo implements GetClientInfo {
    private final MediationRepository mediationRepository;
    private final OmidManager omidManager;
    private final ScarManager scarManager;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetClientInfo", f = "AndroidGetClientInfo.kt", l = {36}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetClientInfo.this.invoke(this);
        }
    }

    public AndroidGetClientInfo(SessionRepository sessionRepository, MediationRepository mediationRepository, OmidManager omidManager, ScarManager scarManager) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(mediationRepository, "mediationRepository");
        AbstractC2995aW.q(omidManager, "omidManager");
        AbstractC2995aW.q(scarManager, "scarManager");
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.scarManager = scarManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        ClientInfoKt.Dsl dsl;
        ClientInfoKt.Dsl dsl2;
        AndroidGetClientInfo androidGetClientInfo;
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
            ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
            ClientInfoOuterClass.ClientInfo.Builder builderNewBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
            AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
            ClientInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
            dsl_create.setSdkVersion(41301);
            dsl_create.setSdkVersionName("4.13.1");
            String gameId = this.sessionRepository.getGameId();
            if (gameId != null) {
                dsl_create.setGameId(gameId);
            }
            dsl_create.setTest(this.sessionRepository.isTestModeEnabled());
            dsl_create.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
            dsl_create.setMediationProvider((ClientInfoOuterClass.MediationProvider) this.mediationRepository.getMediationProvider().invoke());
            String name = this.mediationRepository.getName();
            if (name != null && dsl_create.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
                dsl_create.setCustomMediationName(name);
            }
            String version = this.mediationRepository.getVersion();
            if (version != null) {
                dsl_create.setMediationVersion(version);
            }
            ScarManager scarManager = this.scarManager;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = dsl_create;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.label = 1;
            Object version2 = scarManager.getVersion(anonymousClass1);
            if (version2 == enumC4602sk) {
                return enumC4602sk;
            }
            dsl = dsl_create;
            dsl2 = dsl;
            obj = version2;
            androidGetClientInfo = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl = (ClientInfoKt.Dsl) anonymousClass1.L$2;
            dsl2 = (ClientInfoKt.Dsl) anonymousClass1.L$1;
            androidGetClientInfo = (AndroidGetClientInfo) anonymousClass1.L$0;
            AbstractC3375el.b0(obj);
        }
        String str = (String) obj;
        if (str != null) {
            dsl.setScarVersionName(str);
        }
        dsl.setOmidVersion(androidGetClientInfo.omidManager.getVersion());
        dsl.setOmidPartnerVersion("1");
        dsl.setSdkDevelopmentPlatform(MadeWithUnityDetector.isMadeWithUnity() ? "Unity" : "");
        return dsl2._build();
    }
}
