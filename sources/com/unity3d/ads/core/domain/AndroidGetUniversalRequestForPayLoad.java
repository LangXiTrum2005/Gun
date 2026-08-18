package com.unity3d.ads.core.domain;

import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad", f = "AndroidGetUniversalRequestForPayLoad.kt", l = {14}, m = "invoke")
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
            return AndroidGetUniversalRequestForPayLoad.this.invoke(null, this);
        }
    }

    public AndroidGetUniversalRequestForPayLoad(GetUniversalRequestSharedData getUniversalRequestSharedData) {
        AbstractC2995aW.q(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    public Object invoke(UniversalRequestOuterClass.UniversalRequest.Payload payload, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        UniversalRequestKt.Dsl dsl;
        UniversalRequestKt.Dsl dsl2;
        UniversalRequestOuterClass.UniversalRequest.Payload payload2;
        UniversalRequestKt.Dsl dsl3;
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
            UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.Companion;
            UniversalRequestOuterClass.UniversalRequest.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.newBuilder();
            AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
            UniversalRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
            GetUniversalRequestSharedData getUniversalRequestSharedData = this.getUniversalRequestSharedData;
            anonymousClass1.L$0 = payload;
            anonymousClass1.L$1 = dsl_create;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.label = 1;
            Object objInvoke = getUniversalRequestSharedData.invoke(anonymousClass1);
            if (objInvoke == enumC4602sk) {
                return enumC4602sk;
            }
            dsl = dsl_create;
            dsl2 = dsl;
            obj = objInvoke;
            payload2 = payload;
            dsl3 = dsl2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl3 = (UniversalRequestKt.Dsl) anonymousClass1.L$3;
            dsl = (UniversalRequestKt.Dsl) anonymousClass1.L$2;
            dsl2 = (UniversalRequestKt.Dsl) anonymousClass1.L$1;
            payload2 = (UniversalRequestOuterClass.UniversalRequest.Payload) anonymousClass1.L$0;
            AbstractC3375el.b0(obj);
        }
        dsl3.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
        dsl.setPayload(payload2);
        return dsl2._build();
    }
}
