package com.unity3d.ads.core.domain.events;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionEventObserver {
    private final AbstractC3899kk defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final InterfaceC4309pQ isRunning;
    private final TransactionEventRepository transactionEventRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2$2", f = "TransactionEventObserver.kt", l = {44, 46, 55}, m = "invokeSuspend")
        public static final class C03002 extends Ea0 implements InterfaceC3567gx {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransactionEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03002(TransactionEventObserver transactionEventObserver, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.this$0 = transactionEventObserver;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                C03002 c03002 = new C03002(this.this$0, interfaceC2857Wj);
                c03002.L$0 = obj;
                return c03002;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, InterfaceC2857Wj interfaceC2857Wj) {
                return ((C03002) create(transactionEventRequest, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            /* JADX WARN: Code duplicated, block: B:20:0x0083  */
            /* JADX WARN: Code duplicated, block: B:22:0x00a9 A[RETURN] */
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                UniversalRequestOuterClass.UniversalRequest universalRequest;
                ByteStringDataSource byteStringDataSource;
                ByteString byteString;
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC3375el.b0(obj);
                    } else if (i == 2) {
                        universalRequest = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
                        AbstractC3375el.b0(obj);
                        if (((UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
                            byteStringDataSource = this.this$0.iapTransactionStore;
                            byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                            AbstractC2995aW.p(byteString, "fullRequest.sharedData.t….timestamp.toByteString()");
                            this.L$0 = null;
                            this.label = 3;
                            if (byteStringDataSource.set(byteString, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj);
                    }
                    return C5033xf0.f5238a;
                }
                AbstractC3375el.b0(obj);
                TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = (TransactionEventRequestOuterClass.TransactionEventRequest) this.L$0;
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
                UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                dsl_create.setTransactionEventRequest(transactionEventRequest);
                UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(payload_build, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
                GatewayClient gatewayClient = this.this$0.gatewayClient;
                RequestPolicy requestPolicyInvoke = this.this$0.getRequestPolicy.invoke();
                OperationType operationType = OperationType.TRANSACTION_EVENT;
                this.L$0 = universalRequest;
                this.label = 2;
                obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, this, 1, null);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                if (((UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
                    byteStringDataSource = this.this$0.iapTransactionStore;
                    byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                    AbstractC2995aW.p(byteString, "fullRequest.sharedData.t….timestamp.toByteString()");
                    this.L$0 = null;
                    this.label = 3;
                    if (byteStringDataSource.set(byteString, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
                return C5033xf0.f5238a;
            }
        }

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return TransactionEventObserver.this.new AnonymousClass2(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            C4907w90 c4907w90;
            Object value;
            Boolean bool;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            InterfaceC4309pQ interfaceC4309pQ = TransactionEventObserver.this.isRunning;
            do {
                c4907w90 = (C4907w90) interfaceC4309pQ;
                value = c4907w90.getValue();
                bool = (Boolean) value;
                bool.getClass();
            } while (!c4907w90.h(value, Boolean.TRUE));
            boolean zBooleanValue = bool.booleanValue();
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            if (zBooleanValue) {
                return c5033xf0;
            }
            AbstractC3375el.K(AbstractC3375el.Q(new C03002(TransactionEventObserver.this, null), TransactionEventObserver.this.transactionEventRepository.getTransactionEvents()), WD.a(TransactionEventObserver.this.defaultDispatcher));
            return c5033xf0;
        }
    }

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, AbstractC3899kk abstractC3899kk, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource byteStringDataSource) {
        AbstractC2995aW.q(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        AbstractC2995aW.q(abstractC3899kk, "defaultDispatcher");
        AbstractC2995aW.q(transactionEventRepository, "transactionEventRepository");
        AbstractC2995aW.q(gatewayClient, "gatewayClient");
        AbstractC2995aW.q(getRequestPolicy, "getRequestPolicy");
        AbstractC2995aW.q(byteStringDataSource, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = abstractC3899kk;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = byteStringDataSource;
        this.isRunning = AbstractC4995x90.a(Boolean.FALSE);
    }

    public final Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        Object objX = WD.X(new AnonymousClass2(null), this.defaultDispatcher, interfaceC2857Wj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }
}
