package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", l = {21, 35}, m = "invoke")
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
            return UniversalRequestEventSender.this.invoke(null, null, this);
        }
    }

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator) {
        AbstractC2995aW.q(gatewayClient, "gatewayClient");
        AbstractC2995aW.q(handleGatewayEventResponse, "handleGatewayEventResponse");
        AbstractC2995aW.q(universalRequestTtlValidator, "universalRequestTtlValidator");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        UniversalRequestEventSender universalRequestEventSender;
        Object objV;
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
        Object objRequest$default = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i2 != 0) {
            if (i2 == 1) {
                universalRequestEventSender = (UniversalRequestEventSender) anonymousClass1.L$0;
                try {
                    AbstractC3375el.b0(objRequest$default);
                } catch (Throwable th) {
                    th = th;
                    objV = AbstractC3375el.v(th);
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objRequest$default);
            }
        }
        AbstractC3375el.b0(objRequest$default);
        if (!this.universalRequestTtlValidator.invoke(universalRequest, requestPolicy)) {
            return c5033xf0;
        }
        try {
            GatewayClient gatewayClient = this.gatewayClient;
            OperationType operationType = OperationType.UNIVERSAL_EVENT;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicy, operationType, anonymousClass1, 1, null);
            if (objRequest$default == enumC4602sk) {
                return enumC4602sk;
            }
            universalRequestEventSender = this;
        } catch (Throwable th2) {
            th = th2;
            universalRequestEventSender = this;
            objV = AbstractC3375el.v(th);
        }
        objV = (UniversalResponseOuterClass.UniversalResponse) objRequest$default;
        if (IZ.a(objV) instanceof GatewayException) {
            return c5033xf0;
        }
        HandleGatewayEventResponse handleGatewayEventResponse = universalRequestEventSender.handleGatewayEventResponse;
        AbstractC3375el.b0(objV);
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        return handleGatewayEventResponse.invoke((UniversalResponseOuterClass.UniversalResponse) objV, anonymousClass1) == enumC4602sk ? enumC4602sk : c5033xf0;
    }
}
