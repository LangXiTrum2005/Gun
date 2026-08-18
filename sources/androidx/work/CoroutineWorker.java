package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.SettableFuture;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2805Uj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2880Xg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final AbstractC3899kk coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final InterfaceC2880Xg job;

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class C03321 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ JobListenableFuture<ForegroundInfo> $jobFuture;
        Object L$0;
        int label;
        final /* synthetic */ CoroutineWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03321(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$jobFuture = jobListenableFuture;
            this.this$0 = coroutineWorker;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C03321(this.$jobFuture, this.this$0, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C03321) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            JobListenableFuture jobListenableFuture;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                JobListenableFuture<ForegroundInfo> jobListenableFuture2 = this.$jobFuture;
                CoroutineWorker coroutineWorker = this.this$0;
                this.L$0 = jobListenableFuture2;
                this.label = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == enumC4602sk) {
                    return enumC4602sk;
                }
                jobListenableFuture = jobListenableFuture2;
                obj = foregroundInfo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jobListenableFuture = (JobListenableFuture) this.L$0;
                AbstractC3375el.b0(obj);
            }
            jobListenableFuture.complete(obj);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {Input.Keys.GRAVE}, m = "invokeSuspend")
    public static final class C03331 extends Ea0 implements InterfaceC3567gx {
        int label;

        public C03331(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return CoroutineWorker.this.new C03331(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C03331) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.label = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().set((ListenableWorker.Result) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().setException(th);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC2995aW.q(context, "appContext");
        AbstractC2995aW.q(workerParameters, "params");
        this.job = AbstractC2995aW.a();
        SettableFuture<ListenableWorker.Result> settableFutureCreate = SettableFuture.create();
        AbstractC2995aW.p(settableFutureCreate, "create()");
        this.future = settableFutureCreate;
        settableFutureCreate.addListener(new Runnable() { // from class: androidx.work.CoroutineWorker.1
            @Override // java.lang.Runnable
            public final void run() {
                if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().isCancelled()) {
                    ((PE) CoroutineWorker.this.getJob$work_runtime_ktx_release()).a(null);
                }
            }
        }, getTaskExecutor().getBackgroundExecutor());
        this.coroutineContext = AbstractC4437qp.f4904a;
    }

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, InterfaceC2857Wj interfaceC2857Wj) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object doWork(InterfaceC2857Wj interfaceC2857Wj);

    public AbstractC3899kk getCoroutineContext() {
        return this.coroutineContext;
    }

    public Object getForegroundInfo(InterfaceC2857Wj interfaceC2857Wj) {
        return getForegroundInfo$suspendImpl(this, interfaceC2857Wj);
    }

    @Override // androidx.work.ListenableWorker
    public final AI getForegroundInfoAsync() {
        CE ceA = AbstractC2995aW.a();
        C2805Uj c2805UjA = WD.a(getCoroutineContext().plus(ceA));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(ceA, null, 2, null);
        WD.D(c2805UjA, null, 0, new C03321(jobListenableFuture, this, null), 3);
        return jobListenableFuture;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    public final InterfaceC2880Xg getJob$work_runtime_ktx_release() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        Object objS;
        AI foregroundAsync = setForegroundAsync(foregroundInfo);
        AbstractC2995aW.p(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                objS = foregroundAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(c2798Uc, foregroundAsync), DirectExecutor.INSTANCE);
            objS = c2798Uc.s();
        }
        return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
    }

    public final Object setProgress(Data data, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        Object objS;
        AI progressAsync = setProgressAsync(data);
        AbstractC2995aW.p(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                objS = progressAsync.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        } else {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            progressAsync.addListener(new ListenableFutureKt$await$2$1(c2798Uc, progressAsync), DirectExecutor.INSTANCE);
            objS = c2798Uc.s();
        }
        return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
    }

    @Override // androidx.work.ListenableWorker
    public final AI startWork() {
        WD.D(WD.a(getCoroutineContext().plus(this.job)), null, 0, new C03331(null), 3);
        return this.future;
    }
}
