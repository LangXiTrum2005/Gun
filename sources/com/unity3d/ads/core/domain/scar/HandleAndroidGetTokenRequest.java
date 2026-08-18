package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class HandleAndroidGetTokenRequest implements HandleGetTokenRequest {
    private final GatewayClient gatewayClient;
    private final GetHbTokenEventRequest getHbTokenEventRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest", f = "HandleAndroidGetTokenRequest.kt", l = {19, 23, 25}, m = "invoke")
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
            return HandleAndroidGetTokenRequest.this.invoke(null, null, this);
        }
    }

    public HandleAndroidGetTokenRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetHbTokenEventRequest getHbTokenEventRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        AbstractC2995aW.q(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        AbstractC2995aW.q(getHbTokenEventRequest, "getHbTokenEventRequest");
        AbstractC2995aW.q(getRequestPolicy, "getRequestPolicy");
        AbstractC2995aW.q(gatewayClient, "gatewayClient");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getHbTokenEventRequest = getHbTokenEventRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.unity3d.ads.core.domain.scar.HandleGetTokenRequest
    public Object invoke(ByteString byteString, BiddingSignals biddingSignals, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        HandleAndroidGetTokenRequest handleAndroidGetTokenRequest;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objInvoke = anonymousClass2.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                handleAndroidGetTokenRequest = (HandleAndroidGetTokenRequest) anonymousClass2.L$0;
                AbstractC3375el.b0(objInvoke);
            } else if (i2 == 2) {
                handleAndroidGetTokenRequest = (HandleAndroidGetTokenRequest) anonymousClass2.L$0;
                AbstractC3375el.b0(objInvoke);
                RequestPolicy requestPolicyInvoke = handleAndroidGetTokenRequest.getRequestPolicy.invoke();
                GatewayClient gatewayClient = handleAndroidGetTokenRequest.gatewayClient;
                anonymousClass2.L$0 = null;
                anonymousClass2.label = 3;
                objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke, null, anonymousClass2, 9, null);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objInvoke);
            }
            return objInvoke;
        }
        AbstractC3375el.b0(objInvoke);
        GetHbTokenEventRequest getHbTokenEventRequest = this.getHbTokenEventRequest;
        anonymousClass2.L$0 = this;
        anonymousClass2.label = 1;
        objInvoke = getHbTokenEventRequest.invoke(byteString, biddingSignals, anonymousClass2);
        if (objInvoke == enumC4602sk) {
            return enumC4602sk;
        }
        handleAndroidGetTokenRequest = this;
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setGetTokenEventRequest((GetTokenEventRequestOuterClass.GetTokenEventRequest) objInvoke);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = handleAndroidGetTokenRequest.getUniversalRequestForPayLoad;
        anonymousClass2.L$0 = handleAndroidGetTokenRequest;
        anonymousClass2.label = 2;
        objInvoke = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass2);
        if (objInvoke == enumC4602sk) {
            return enumC4602sk;
        }
        RequestPolicy requestPolicyInvoke2 = handleAndroidGetTokenRequest.getRequestPolicy.invoke();
        GatewayClient gatewayClient2 = handleAndroidGetTokenRequest.gatewayClient;
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 3;
        objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke2, null, anonymousClass2, 9, null);
        if (objInvoke == enumC4602sk) {
            return enumC4602sk;
        }
        return objInvoke;
    }
}
