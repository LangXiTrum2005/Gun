package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final InterfaceC4514rk sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$2", f = "AndroidHandleGatewayInitializationResponse.kt", l = {36}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidHandleGatewayInitializationResponse.this.new AnonymousClass2(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                TriggerInitializationCompletedRequest triggerInitializationCompletedRequest = AndroidHandleGatewayInitializationResponse.this.triggerInitializationCompletedRequest;
                this.label = 1;
                if (triggerInitializationCompletedRequest.invoke(this) == enumC4602sk) {
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

    public AndroidHandleGatewayInitializationResponse(TransactionEventManager transactionEventManager, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, SessionRepository sessionRepository, InterfaceC4514rk interfaceC4514rk) {
        AbstractC2995aW.q(transactionEventManager, "transactionEventManager");
        AbstractC2995aW.q(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(interfaceC4514rk, "sdkScope");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = interfaceC4514rk;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public Object invoke(InitializationResponseOuterClass.InitializationResponse initializationResponse, InterfaceC2857Wj interfaceC2857Wj) throws GatewayException {
        String universalRequestUrl;
        if (initializationResponse.hasError()) {
            String errorText = initializationResponse.getError().getErrorText();
            AbstractC2995aW.p(errorText, "response.error.errorText");
            throw new GatewayException(errorText, new IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
        }
        SessionRepository sessionRepository = this.sessionRepository;
        NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
        AbstractC2995aW.p(nativeConfiguration, "response.nativeConfiguration");
        sessionRepository.setNativeConfiguration(nativeConfiguration);
        if (initializationResponse.hasUniversalRequestUrl() && (universalRequestUrl = initializationResponse.getUniversalRequestUrl()) != null && universalRequestUrl.length() != 0) {
            SessionRepository sessionRepository2 = this.sessionRepository;
            String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
            AbstractC2995aW.p(universalRequestUrl2, "response.universalRequestUrl");
            sessionRepository2.setGatewayUrl(universalRequestUrl2);
        }
        List<InitializationResponseOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        List<InitializationResponseOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
        AbstractC2995aW.p(scarEligibleFormatsList, "response.scarEligibleFormatsList");
        scarEligibleFormats.addAll(scarEligibleFormatsList);
        if (initializationResponse.getTriggerInitializationCompletedRequest()) {
            WD.D(this.sdkScope, null, 0, new AnonymousClass2(null), 3);
        }
        if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
            this.transactionEventManager.invoke();
        }
        return C5033xf0.f5238a;
    }
}
