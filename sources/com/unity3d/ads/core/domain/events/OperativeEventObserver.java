package com.unity3d.ads.core.domain.events;

import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.OperativeEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
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
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final AbstractC3899kk defaultDispatcher;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final InterfaceC4309pQ isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final UniversalRequestDataSource universalRequestDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", l = {40, 43}, m = "invokeSuspend")
        public static final class C02992 extends Ea0 implements InterfaceC3567gx {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ OperativeEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02992(OperativeEventObserver operativeEventObserver, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.this$0 = operativeEventObserver;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                C02992 c02992 = new C02992(this.this$0, interfaceC2857Wj);
                c02992.L$0 = obj;
                return c02992;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, InterfaceC2857Wj interfaceC2857Wj) {
                return ((C02992) create(operativeEventRequest, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                String str;
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        AbstractC3375el.b0(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) this.L$0;
                        AbstractC3375el.b0(obj);
                    }
                    UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(str);
                    BackgroundWorker backgroundWorker = this.this$0.backgroundWorker;
                    Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
                    AbstractC2995aW.p(constraintsBuild, "Builder()\n            .s…TED)\n            .build()");
                    OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(OperativeEventJob.class).setConstraints(constraintsBuild).setInputData(universalRequestWorkerData.invoke()).build();
                    AbstractC2995aW.p(oneTimeWorkRequestBuild, "OneTimeWorkRequestBuilde…a())\n            .build()");
                    backgroundWorker.getWorkManager().enqueue(oneTimeWorkRequestBuild);
                    return C5033xf0.f5238a;
                }
                AbstractC3375el.b0(obj);
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = (OperativeEventRequestOuterClass.OperativeEventRequest) this.L$0;
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
                UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                dsl_create.setOperativeEvent(operativeEventRequest);
                UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(payload_build, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
                String strF = AbstractC5044xl.f("randomUUID().toString()");
                UniversalRequestDataSource universalRequestDataSource = this.this$0.universalRequestDataSource;
                byte[] byteArray = ((UniversalRequestOuterClass.UniversalRequest) obj).toByteArray();
                AbstractC2995aW.p(byteArray, "fullRequest.toByteArray()");
                ByteString byteString = ByteStringsKt.toByteString(byteArray);
                this.L$0 = strF;
                this.label = 2;
                if (universalRequestDataSource.set(strF, byteString, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                str = strF;
                UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(str);
                BackgroundWorker backgroundWorker2 = this.this$0.backgroundWorker;
                Constraints constraintsBuild2 = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
                AbstractC2995aW.p(constraintsBuild2, "Builder()\n            .s…TED)\n            .build()");
                OneTimeWorkRequest oneTimeWorkRequestBuild2 = new OneTimeWorkRequest.Builder(OperativeEventJob.class).setConstraints(constraintsBuild2).setInputData(universalRequestWorkerData2.invoke()).build();
                AbstractC2995aW.p(oneTimeWorkRequestBuild2, "OneTimeWorkRequestBuilde…a())\n            .build()");
                backgroundWorker2.getWorkManager().enqueue(oneTimeWorkRequestBuild2);
                return C5033xf0.f5238a;
            }
        }

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return OperativeEventObserver.this.new AnonymousClass2(interfaceC2857Wj);
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
            InterfaceC4309pQ interfaceC4309pQ = OperativeEventObserver.this.isRunning;
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
            AbstractC3375el.K(AbstractC3375el.Q(new C02992(OperativeEventObserver.this, null), OperativeEventObserver.this.operativeEventRepository.getOperativeEvents()), WD.a(OperativeEventObserver.this.defaultDispatcher));
            return c5033xf0;
        }
    }

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, AbstractC3899kk abstractC3899kk, OperativeEventRepository operativeEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker) {
        AbstractC2995aW.q(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        AbstractC2995aW.q(abstractC3899kk, "defaultDispatcher");
        AbstractC2995aW.q(operativeEventRepository, "operativeEventRepository");
        AbstractC2995aW.q(universalRequestDataSource, "universalRequestDataSource");
        AbstractC2995aW.q(backgroundWorker, "backgroundWorker");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.defaultDispatcher = abstractC3899kk;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.isRunning = AbstractC4995x90.a(Boolean.FALSE);
    }

    public final Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        Object objX = WD.X(new AnonymousClass2(null), this.defaultDispatcher, interfaceC2857Wj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }
}
