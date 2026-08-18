package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class SendPrivacyUpdateRequest {
    private final GatewayClient gatewayClient;
    private final GetPrivacyUpdateRequest getPrivacyUpdateRequest;
    private final GetRequestPolicy getRequestPolicy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.SendPrivacyUpdateRequest", f = "SendPrivacyUpdateRequest.kt", l = {21, 23}, m = "invoke")
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
            return SendPrivacyUpdateRequest.this.invoke(0, null, this);
        }
    }

    public SendPrivacyUpdateRequest(GetPrivacyUpdateRequest getPrivacyUpdateRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        AbstractC2995aW.q(getPrivacyUpdateRequest, "getPrivacyUpdateRequest");
        AbstractC2995aW.q(getRequestPolicy, "getRequestPolicy");
        AbstractC2995aW.q(gatewayClient, "gatewayClient");
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object invoke(int i, ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        SendPrivacyUpdateRequest sendPrivacyUpdateRequest;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objInvoke = anonymousClass2.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i3 = anonymousClass2.label;
        if (i3 != 0) {
            if (i3 == 1) {
                sendPrivacyUpdateRequest = (SendPrivacyUpdateRequest) anonymousClass2.L$0;
                AbstractC3375el.b0(objInvoke);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objInvoke);
            }
            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = ((UniversalResponseOuterClass.UniversalResponse) objInvoke).getPayload().getPrivacyUpdateResponse();
            AbstractC2995aW.p(privacyUpdateResponse, "response.payload.privacyUpdateResponse");
            return privacyUpdateResponse;
        }
        AbstractC3375el.b0(objInvoke);
        GetPrivacyUpdateRequest getPrivacyUpdateRequest = this.getPrivacyUpdateRequest;
        anonymousClass2.L$0 = this;
        anonymousClass2.label = 1;
        objInvoke = getPrivacyUpdateRequest.invoke(i, byteString, anonymousClass2);
        if (objInvoke == enumC4602sk) {
            return enumC4602sk;
        }
        sendPrivacyUpdateRequest = this;
        RequestPolicy requestPolicyInvoke = sendPrivacyUpdateRequest.getRequestPolicy.invoke();
        GatewayClient gatewayClient = sendPrivacyUpdateRequest.gatewayClient;
        OperationType operationType = OperationType.PRIVACY_UPDATE;
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 2;
        objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke, operationType, anonymousClass2, 1, null);
        if (objInvoke == enumC4602sk) {
            return enumC4602sk;
        }
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse2 = ((UniversalResponseOuterClass.UniversalResponse) objInvoke).getPayload().getPrivacyUpdateResponse();
        AbstractC2995aW.p(privacyUpdateResponse2, "response.payload.privacyUpdateResponse");
        return privacyUpdateResponse2;
    }
}
