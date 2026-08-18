package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticEventJob extends UniversalRequestJob implements IServiceComponent {
    private final InterfaceC3069bH diagnosticEventRequestWorkModifier$delegate;
    private final InterfaceC3069bH getDiagnosticRequestPolicy$delegate;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.work.DiagnosticEventJob", f = "DiagnosticEventJob.kt", l = {22, 25, 27}, m = "doWork")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DiagnosticEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(workerParameters, "workerParams");
        EnumC4124nH enumC4124nH = EnumC4124nH.c;
        this.getDiagnosticRequestPolicy$delegate = AbstractC2340Cl.H(enumC4124nH, new DiagnosticEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OTHER_REQ));
        this.diagnosticEventRequestWorkModifier$delegate = AbstractC2340Cl.H(enumC4124nH, new DiagnosticEventJob$special$$inlined$inject$default$2(this, ""));
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    public Object doWork(InterfaceC2857Wj interfaceC2857Wj) throws InvalidProtocolBufferException {
        AnonymousClass1 anonymousClass1;
        String string;
        DiagnosticEventJob diagnosticEventJob;
        DiagnosticEventJob diagnosticEventJob2;
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
        Object objDoWork = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                string = (String) anonymousClass1.L$1;
                diagnosticEventJob = (DiagnosticEventJob) anonymousClass1.L$0;
                AbstractC3375el.b0(objDoWork);
            } else if (i2 == 2) {
                diagnosticEventJob2 = (DiagnosticEventJob) anonymousClass1.L$0;
                AbstractC3375el.b0(objDoWork);
                diagnosticEventJob2.setRequestPolicy(diagnosticEventJob2.getGetDiagnosticRequestPolicy().invoke());
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 3;
                objDoWork = super.doWork(anonymousClass1);
                if (objDoWork == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objDoWork);
            }
            return objDoWork;
        }
        AbstractC3375el.b0(objDoWork);
        string = getWorkerParams().getInputData().getString(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
        if (string == null) {
            ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
            AbstractC2995aW.p(resultSuccess, "success()");
            return resultSuccess;
        }
        UniversalRequestDataSource universalRequestDataSource = getUniversalRequestDataSource();
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = string;
        anonymousClass1.label = 1;
        objDoWork = universalRequestDataSource.get(anonymousClass1);
        if (objDoWork == enumC4602sk) {
            return enumC4602sk;
        }
        diagnosticEventJob = this;
        UniversalRequestOuterClass.UniversalRequest from = UniversalRequestOuterClass.UniversalRequest.parseFrom(((UniversalRequestStoreOuterClass.UniversalRequestStore) objDoWork).getUniversalRequestMapOrThrow(string));
        DiagnosticEventRequestWorkModifier diagnosticEventRequestWorkModifier = diagnosticEventJob.getDiagnosticEventRequestWorkModifier();
        AbstractC2995aW.p(from, "universalRequest");
        UniversalRequestOuterClass.UniversalRequest universalRequestInvoke = diagnosticEventRequestWorkModifier.invoke(from);
        UniversalRequestDataSource universalRequestDataSource2 = diagnosticEventJob.getUniversalRequestDataSource();
        ByteString byteString = universalRequestInvoke.toByteString();
        AbstractC2995aW.p(byteString, "modifiedUniversalRequest.toByteString()");
        anonymousClass1.L$0 = diagnosticEventJob;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (universalRequestDataSource2.set(string, byteString, anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        diagnosticEventJob2 = diagnosticEventJob;
        diagnosticEventJob2.setRequestPolicy(diagnosticEventJob2.getGetDiagnosticRequestPolicy().invoke());
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 3;
        objDoWork = super.doWork(anonymousClass1);
        if (objDoWork == enumC4602sk) {
            return enumC4602sk;
        }
        return objDoWork;
    }
}
