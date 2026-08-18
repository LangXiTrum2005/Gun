package androidx.work;

import androidx.annotation.RestrictTo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ListenableFutureKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <R> Object await(AI ai, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        if (!ai.isDone()) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            ai.addListener(new ListenableFutureKt$await$2$1(c2798Uc, ai), DirectExecutor.INSTANCE);
            return c2798Uc.s();
        }
        try {
            return ai.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            throw cause;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static final <R> Object await$$forInline(AI ai, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        if (!ai.isDone()) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            ai.addListener(new ListenableFutureKt$await$2$1(c2798Uc, ai), DirectExecutor.INSTANCE);
            return c2798Uc.s();
        }
        try {
            return ai.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            throw cause;
        }
    }
}
