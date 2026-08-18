package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.InitializationDataKt;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetInitializationData implements GetInitializationData {
    private final GetInitializationRequestPayload getInitializeRequestPayload;
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetInitializationData", f = "AndroidGetInitializationData.kt", l = {10, 11}, m = "invoke")
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
            return AndroidGetInitializationData.this.invoke(this);
        }
    }

    public AndroidGetInitializationData(GetInitializationRequestPayload getInitializationRequestPayload, GetUniversalRequestSharedData getUniversalRequestSharedData) {
        AbstractC2995aW.q(getInitializationRequestPayload, "getInitializeRequestPayload");
        AbstractC2995aW.q(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getInitializeRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetInitializationData
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        InitializationDataKt.Dsl dsl_create;
        AndroidGetInitializationData androidGetInitializationData;
        InitializationDataKt.Dsl dsl;
        InitializationDataKt.Dsl dsl2;
        InitializationDataKt.Dsl dsl3;
        InitializationDataKt.Dsl dsl4;
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
                InitializationDataKt.Dsl dsl5 = (InitializationDataKt.Dsl) anonymousClass1.L$3;
                dsl = (InitializationDataKt.Dsl) anonymousClass1.L$2;
                InitializationDataKt.Dsl dsl6 = (InitializationDataKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationData = (AndroidGetInitializationData) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
                dsl2 = dsl5;
                dsl_create = dsl6;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl4 = (InitializationDataKt.Dsl) anonymousClass1.L$1;
                dsl3 = (InitializationDataKt.Dsl) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
            }
            dsl4.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) objInvoke);
            return dsl3._build();
        }
        AbstractC3375el.b0(objInvoke);
        InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.Companion;
        InitializationDataOuterClass.InitializationData.Builder builderNewBuilder = InitializationDataOuterClass.InitializationData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializeRequestPayload;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 1;
        objInvoke = getInitializationRequestPayload.invoke(anonymousClass1);
        if (objInvoke == enumC4602sk) {
            return enumC4602sk;
        }
        androidGetInitializationData = this;
        dsl = dsl_create;
        dsl2 = dsl;
        dsl2.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) objInvoke);
        GetUniversalRequestSharedData getUniversalRequestSharedData = androidGetInitializationData.getUniversalRequestSharedData;
        anonymousClass1.L$0 = dsl_create;
        anonymousClass1.L$1 = dsl;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        objInvoke = getUniversalRequestSharedData.invoke(anonymousClass1);
        if (objInvoke == enumC4602sk) {
            return enumC4602sk;
        }
        dsl3 = dsl_create;
        dsl4 = dsl;
        dsl4.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) objInvoke);
        return dsl3._build();
    }
}
