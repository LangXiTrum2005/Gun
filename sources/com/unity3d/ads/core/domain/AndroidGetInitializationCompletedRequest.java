package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.InitializationCompletedEventRequestKt;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest", f = "AndroidGetInitializationCompletedRequest.kt", l = {16, 24}, m = "invoke")
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
            return AndroidGetInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidGetInitializationCompletedRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        InitializationCompletedEventRequestKt.Dsl dsl_create;
        AndroidGetInitializationCompletedRequest androidGetInitializationCompletedRequest;
        InitializationCompletedEventRequestKt.Dsl dsl;
        InitializationCompletedEventRequestKt.Dsl dsl2;
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
                dsl_create = (InitializationCompletedEventRequestKt.Dsl) anonymousClass1.L$3;
                dsl = (InitializationCompletedEventRequestKt.Dsl) anonymousClass1.L$2;
                dsl2 = (InitializationCompletedEventRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationCompletedRequest = (AndroidGetInitializationCompletedRequest) anonymousClass1.L$0;
                AbstractC3375el.b0(objStaticDeviceInfo);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objStaticDeviceInfo);
            }
        }
        AbstractC3375el.b0(objStaticDeviceInfo);
        InitializationCompletedEventRequestKt.Dsl.Companion companion = InitializationCompletedEventRequestKt.Dsl.Companion;
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builderNewBuilder = InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 1;
        objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == enumC4602sk) {
            return enumC4602sk;
        }
        androidGetInitializationCompletedRequest = this;
        dsl = dsl_create;
        dsl2 = dsl;
        dsl_create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl.setDynamicDeviceInfo(androidGetInitializationCompletedRequest.deviceInfoRepository.getDynamicDeviceInfo());
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest_build = dsl2._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        AbstractC2995aW.p(builderNewBuilder2, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setInitializationCompletedEventRequest(initializationCompletedEventRequest_build);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetInitializationCompletedRequest.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        objStaticDeviceInfo = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
        return objStaticDeviceInfo == enumC4602sk ? enumC4602sk : objStaticDeviceInfo;
    }
}
