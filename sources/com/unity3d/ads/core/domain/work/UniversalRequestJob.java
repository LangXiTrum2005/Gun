package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.protobuf.InvalidProtocolBufferException;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {
    public RequestPolicy requestPolicy;
    private final InterfaceC3069bH universalRequestDataSource$delegate;
    private final InterfaceC3069bH universalRequestEventSender$delegate;
    private final WorkerParameters workerParams;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.work.UniversalRequestJob", f = "UniversalRequestJob.kt", l = {25, 28, 31}, m = "doWork$suspendImpl")
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
            return UniversalRequestJob.doWork$suspendImpl(UniversalRequestJob.this, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(workerParameters, "workerParams");
        this.workerParams = workerParameters;
        EnumC4124nH enumC4124nH = EnumC4124nH.c;
        this.universalRequestEventSender$delegate = AbstractC2340Cl.H(enumC4124nH, new UniversalRequestJob$special$$inlined$inject$default$1(this, ""));
        this.universalRequestDataSource$delegate = AbstractC2340Cl.H(enumC4124nH, new UniversalRequestJob$special$$inlined$inject$default$2(this, ""));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.work.UniversalRequestJob] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.unity3d.ads.core.domain.work.UniversalRequestJob, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.unity3d.ads.core.domain.work.UniversalRequestJob, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static Object doWork$suspendImpl(UniversalRequestJob universalRequestJob, InterfaceC2857Wj interfaceC2857Wj) throws InvalidProtocolBufferException {
        AnonymousClass1 anonymousClass1;
        Object objV;
        ?? r9;
        ?? r2;
        ?? universalRequestDataSource;
        ?? r3;
        String str;
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
        ?? r4 = anonymousClass1.label;
        try {
            if (r4 != 0) {
                if (r4 == 1) {
                    String str2 = (String) anonymousClass1.L$1;
                    UniversalRequestJob universalRequestJob2 = (UniversalRequestJob) anonymousClass1.L$0;
                    AbstractC3375el.b0(obj);
                    r3 = universalRequestJob2;
                    str = str2;
                } else if (r4 == 2) {
                    String str3 = (String) anonymousClass1.L$1;
                    UniversalRequestJob universalRequestJob3 = (UniversalRequestJob) anonymousClass1.L$0;
                    AbstractC3375el.b0(obj);
                    r4 = universalRequestJob3;
                    universalRequestJob = str3;
                    objV = C5033xf0.f5238a;
                    r2 = r4;
                    r9 = universalRequestJob;
                    if (!(objV instanceof HZ)) {
                        ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
                        AbstractC2995aW.p(resultRetry, "{\n            Result.retry()\n        }");
                        return resultRetry;
                    }
                    universalRequestDataSource = r2.getUniversalRequestDataSource();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (universalRequestDataSource.remove(r9, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (r4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                AbstractC2995aW.p(resultSuccess, "{\n            universalR…esult.success()\n        }");
                return resultSuccess;
            }
            AbstractC3375el.b0(obj);
            String string = ((UniversalRequestJob) universalRequestJob).workerParams.getInputData().getString(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
            if (string == null) {
                ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
                AbstractC2995aW.p(resultSuccess2, "success()");
                return resultSuccess2;
            }
            UniversalRequestDataSource universalRequestDataSource2 = universalRequestJob.getUniversalRequestDataSource();
            anonymousClass1.L$0 = universalRequestJob;
            anonymousClass1.L$1 = string;
            anonymousClass1.label = 1;
            Object obj2 = universalRequestDataSource2.get(anonymousClass1);
            if (obj2 == enumC4602sk) {
                return enumC4602sk;
            }
            r3 = universalRequestJob;
            str = string;
            obj = obj2;
            UniversalRequestOuterClass.UniversalRequest from = UniversalRequestOuterClass.UniversalRequest.parseFrom(((UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(str));
            UniversalRequestEventSender universalRequestEventSender = r3.getUniversalRequestEventSender();
            AbstractC2995aW.p(from, "universalRequest");
            RequestPolicy requestPolicy = r3.getRequestPolicy();
            anonymousClass1.L$0 = r3;
            anonymousClass1.L$1 = str;
            anonymousClass1.label = 2;
            r4 = r3;
            universalRequestJob = str;
            if (universalRequestEventSender.invoke(from, requestPolicy, anonymousClass1) == enumC4602sk) {
                return enumC4602sk;
            }
            objV = C5033xf0.f5238a;
            r2 = r4;
            r9 = universalRequestJob;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
            r2 = r4;
            r9 = universalRequestJob;
        }
        if (!(objV instanceof HZ)) {
            ListenableWorker.Result resultRetry2 = ListenableWorker.Result.retry();
            AbstractC2995aW.p(resultRetry2, "{\n            Result.retry()\n        }");
            return resultRetry2;
        }
        universalRequestDataSource = r2.getUniversalRequestDataSource();
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 3;
        if (universalRequestDataSource.remove(r9, anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        ListenableWorker.Result resultSuccess3 = ListenableWorker.Result.success();
        AbstractC2995aW.p(resultSuccess3, "{\n            universalR…esult.success()\n        }");
        return resultSuccess3;
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(InterfaceC2857Wj interfaceC2857Wj) {
        return doWork$suspendImpl(this, interfaceC2857Wj);
    }

    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        AbstractC2995aW.x0("requestPolicy");
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource$delegate.getValue();
    }

    public final UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }

    public final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(RequestPolicy requestPolicy) {
        AbstractC2995aW.q(requestPolicy, "<set-?>");
        this.requestPolicy = requestPolicy;
    }
}
