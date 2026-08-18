package androidx.work;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class OperationKt {

    /* JADX INFO: renamed from: androidx.work.OperationKt$await$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.work.OperationKt", f = "Operation.kt", l = {39}, m = "await")
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
            return OperationKt.await(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object await(Operation operation, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object obj;
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
        Object objS = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objS);
            AI result = operation.getResult();
            AbstractC2995aW.p(result, "result");
            if (result.isDone()) {
                try {
                    obj = result.get();
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause == null) {
                        throw e;
                    }
                    throw cause;
                }
            } else {
                anonymousClass1.L$0 = result;
                anonymousClass1.label = 1;
                C2798Uc c2798Uc = new C2798Uc(1, WD.w(anonymousClass1));
                c2798Uc.t();
                result.addListener(new ListenableFutureKt$await$2$1(c2798Uc, result), DirectExecutor.INSTANCE);
                objS = c2798Uc.s();
                if (objS == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            AbstractC2995aW.p(obj, "result.await()");
            return obj;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC3375el.b0(objS);
        obj = objS;
        AbstractC2995aW.p(obj, "result.await()");
        return obj;
    }

    private static final Object await$$forInline(Operation operation, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        Object objS;
        AI result = operation.getResult();
        AbstractC2995aW.p(result, "result");
        if (result.isDone()) {
            try {
                objS = result.get();
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
            result.addListener(new ListenableFutureKt$await$2$1(c2798Uc, result), DirectExecutor.INSTANCE);
            objS = c2798Uc.s();
        }
        AbstractC2995aW.p(objS, "result.await()");
        return objS;
    }
}
