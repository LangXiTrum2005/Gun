package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class GetOperativeEventApi {
    private final OperativeEventRepository operativeEventRepository;
    private final GetOperativeEventRequest operativeEventRequest;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.events.GetOperativeEventApi", f = "GetOperativeEventApi.kt", l = {20}, m = "invoke")
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
            return GetOperativeEventApi.this.invoke(null, null, null, null, null, this);
        }
    }

    public GetOperativeEventApi(OperativeEventRepository operativeEventRepository, GetOperativeEventRequest getOperativeEventRequest) {
        AbstractC2995aW.q(operativeEventRepository, "operativeEventRepository");
        AbstractC2995aW.q(getOperativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = getOperativeEventRequest;
    }

    public static /* synthetic */ Object invoke$default(GetOperativeEventApi getOperativeEventApi, OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        return getOperativeEventApi.invoke(operativeEventType, byteString, byteString2, byteString3, str, interfaceC2857Wj);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        GetOperativeEventApi getOperativeEventApi;
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
        if (i2 == 0) {
            AbstractC3375el.b0(objInvoke);
            GetOperativeEventRequest getOperativeEventRequest = this.operativeEventRequest;
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            objInvoke = getOperativeEventRequest.invoke(operativeEventType, byteString2, byteString, byteString3, str, anonymousClass2);
            if (objInvoke == enumC4602sk) {
                return enumC4602sk;
            }
            getOperativeEventApi = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getOperativeEventApi = (GetOperativeEventApi) anonymousClass2.L$0;
            AbstractC3375el.b0(objInvoke);
        }
        getOperativeEventApi.operativeEventRepository.addOperativeEvent((OperativeEventRequestOuterClass.OperativeEventRequest) objInvoke);
        return C5033xf0.f5238a;
    }

    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, AdObject adObject, ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        Object objInvoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), interfaceC2857Wj);
        return objInvoke == EnumC4602sk.f4993a ? objInvoke : C5033xf0.f5238a;
    }
}
