package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetTransactionRequest implements GetTransactionRequest {
    private final DeviceInfoRepository deviceInfoRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", f = "CommonGetTransactionRequest.kt", l = {14}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGetTransactionRequest.this.invoke(null, this);
        }
    }

    public CommonGetTransactionRequest(DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    public Object invoke(List<TransactionEventRequestOuterClass.TransactionData> list, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        List<TransactionEventRequestOuterClass.TransactionData> list2;
        TransactionEventRequestKt.Dsl dsl;
        TransactionEventRequestKt.Dsl dsl2;
        TransactionEventRequestKt.Dsl dsl3;
        CommonGetTransactionRequest commonGetTransactionRequest;
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
            TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
            TransactionEventRequestOuterClass.TransactionEventRequest.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
            AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
            TransactionEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = list;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.L$4 = dsl_create;
            anonymousClass1.label = 1;
            Object objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo == enumC4602sk) {
                return enumC4602sk;
            }
            list2 = list;
            dsl = dsl_create;
            dsl2 = dsl;
            dsl3 = dsl2;
            obj = objStaticDeviceInfo;
            commonGetTransactionRequest = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl = (TransactionEventRequestKt.Dsl) anonymousClass1.L$4;
            dsl2 = (TransactionEventRequestKt.Dsl) anonymousClass1.L$3;
            dsl3 = (TransactionEventRequestKt.Dsl) anonymousClass1.L$2;
            list2 = (List) anonymousClass1.L$1;
            commonGetTransactionRequest = (CommonGetTransactionRequest) anonymousClass1.L$0;
            AbstractC3375el.b0(obj);
        }
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl2.setDynamicDeviceInfo(commonGetTransactionRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setAppStore(TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
        dsl2.addAllTransactionData(dsl2.getTransactionData(), list2);
        return dsl3._build();
    }
}
