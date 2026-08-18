package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    private final GatewayClient gatewayClient;
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest", f = "AndroidTriggerInitializationCompletedRequest.kt", l = {32, 34}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        long J$0;
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
            return AndroidTriggerInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidTriggerInitializationCompletedRequest(GetInitializationCompletedRequest getInitializationCompletedRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        AbstractC2995aW.q(getRequestPolicy, "getRequestPolicy");
        AbstractC2995aW.q(gatewayClient, "gatewayClient");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1 A[Catch: Exception -> 0x0124, TRY_LEAVE, TryCatch #4 {Exception -> 0x0124, blocks: (B:36:0x00c9, B:38:0x00d1), top: B:65:0x00c9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0128  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        Object obj;
        Object obj2;
        Object obj3;
        long j;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest;
        long j2;
        long j3;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest2;
        Object obj4;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
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
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i2 != 0) {
            if (i2 == 1) {
                long j4 = anonymousClass2.J$0;
                AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest3 = (AndroidTriggerInitializationCompletedRequest) anonymousClass2.L$0;
                try {
                    AbstractC3375el.b0(objInvoke);
                    androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                    j2 = j4;
                    try {
                        UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                        RequestPolicy requestPolicyInvoke = androidTriggerInitializationCompletedRequest.getRequestPolicy.invoke();
                        GatewayClient gatewayClient = androidTriggerInitializationCompletedRequest.gatewayClient;
                        OperationType operationType = OperationType.INITIALIZATION_COMPLETED;
                        anonymousClass2.L$0 = androidTriggerInitializationCompletedRequest;
                        anonymousClass2.J$0 = j2;
                        anonymousClass2.label = 2;
                        androidTriggerInitializationCompletedRequest2 = androidTriggerInitializationCompletedRequest;
                        j3 = j2;
                        obj = "operation";
                        obj2 = "reason";
                        obj4 = "reason_debug";
                        try {
                            objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, anonymousClass2, 1, null);
                            if (objInvoke == enumC4602sk) {
                                return enumC4602sk;
                            }
                            androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest2;
                            j = j3;
                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                            if (!universalResponse.hasError()) {
                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j))), null, null, null, 28, null);
                                return c5033xf0;
                            }
                            SendDiagnosticEvent sendDiagnosticEvent = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                            Double d = new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j)));
                            C4839vT[] c4839vTArr = new C4839vT[3];
                            c4839vTArr[0] = new C4839vT(obj, OperationType.INITIALIZATION_COMPLETED.toString());
                            c4839vTArr[1] = new C4839vT(obj2, "gateway");
                            obj3 = obj4;
                            c4839vTArr[2] = new C4839vT(obj3, universalResponse.getError().getErrorText());
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialization_completed_event_request_failure_time", d, U5.u0(c4839vTArr), null, null, 24, null);
                            return c5033xf0;
                        } catch (Exception e) {
                            e = e;
                            obj3 = obj4;
                            androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest2;
                            j = j3;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        j3 = j2;
                        obj = "operation";
                        obj2 = "reason";
                        obj3 = "reason_debug";
                    }
                } catch (Exception e3) {
                    e = e3;
                    j = j4;
                    androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                    obj = "operation";
                    obj2 = "reason";
                    obj3 = "reason_debug";
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = anonymousClass2.J$0;
                androidTriggerInitializationCompletedRequest = (AndroidTriggerInitializationCompletedRequest) anonymousClass2.L$0;
                try {
                    AbstractC3375el.b0(objInvoke);
                    obj = "operation";
                    obj2 = "reason";
                    obj4 = "reason_debug";
                    try {
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                        if (!universalResponse.hasError()) {
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j))), null, null, null, 28, null);
                            return c5033xf0;
                        }
                        SendDiagnosticEvent sendDiagnosticEvent2 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                        Double d2 = new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j)));
                        C4839vT[] c4839vTArr2 = new C4839vT[3];
                        c4839vTArr2[0] = new C4839vT(obj, OperationType.INITIALIZATION_COMPLETED.toString());
                        c4839vTArr2[1] = new C4839vT(obj2, "gateway");
                        obj3 = obj4;
                        try {
                            c4839vTArr2[2] = new C4839vT(obj3, universalResponse.getError().getErrorText());
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_initialization_completed_event_request_failure_time", d2, U5.u0(c4839vTArr2), null, null, 24, null);
                            return c5033xf0;
                        } catch (Exception e4) {
                            e = e4;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        obj3 = obj4;
                    }
                } catch (Exception e6) {
                    e = e6;
                    obj = "operation";
                    obj2 = "reason";
                    obj3 = "reason_debug";
                }
            }
            obj = "operation";
            obj2 = "reason";
            obj3 = "reason_debug";
        } else {
            AbstractC3375el.b0(objInvoke);
            long jA = IP.a();
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_completed_event_request_started", null, null, null, null, 30, null);
            try {
                GetInitializationCompletedRequest getInitializationCompletedRequest = this.getInitializationCompletedRequest;
                anonymousClass2.L$0 = this;
                anonymousClass2.J$0 = jA;
                anonymousClass2.label = 1;
                objInvoke = getInitializationCompletedRequest.invoke(anonymousClass2);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                j2 = jA;
                androidTriggerInitializationCompletedRequest = this;
                UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                RequestPolicy requestPolicyInvoke2 = androidTriggerInitializationCompletedRequest.getRequestPolicy.invoke();
                GatewayClient gatewayClient2 = androidTriggerInitializationCompletedRequest.gatewayClient;
                OperationType operationType2 = OperationType.INITIALIZATION_COMPLETED;
                anonymousClass2.L$0 = androidTriggerInitializationCompletedRequest;
                anonymousClass2.J$0 = j2;
                anonymousClass2.label = 2;
                androidTriggerInitializationCompletedRequest2 = androidTriggerInitializationCompletedRequest;
                j3 = j2;
                obj = "operation";
                obj2 = "reason";
                obj4 = "reason_debug";
                objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, requestPolicyInvoke2, operationType2, anonymousClass2, 1, null);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest2;
                j = j3;
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                if (!universalResponse.hasError()) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j))), null, null, null, 28, null);
                    return c5033xf0;
                }
                SendDiagnosticEvent sendDiagnosticEvent3 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                Double d3 = new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j)));
                C4839vT[] c4839vTArr3 = new C4839vT[3];
                c4839vTArr3[0] = new C4839vT(obj, OperationType.INITIALIZATION_COMPLETED.toString());
                c4839vTArr3[1] = new C4839vT(obj2, "gateway");
                obj3 = obj4;
                c4839vTArr3[2] = new C4839vT(obj3, universalResponse.getError().getErrorText());
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, "native_initialization_completed_event_request_failure_time", d3, U5.u0(c4839vTArr3), null, null, 24, null);
                return c5033xf0;
            } catch (Exception e7) {
                e = e7;
                obj = "operation";
                obj2 = "reason";
                obj3 = "reason_debug";
                j = jA;
                androidTriggerInitializationCompletedRequest = this;
            }
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_failure_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j))), U5.u0(new C4839vT(obj, OperationType.INITIALIZATION_COMPLETED.toString()), new C4839vT(obj2, "uncaught_exception"), new C4839vT(obj3, ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null))), null, null, 24, null);
        return c5033xf0;
    }
}
