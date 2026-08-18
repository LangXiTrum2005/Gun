package androidx.work;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ InterfaceC2772Tc $cancellableContinuation;
    final /* synthetic */ AI $this_await;

    public ListenableFutureKt$await$2$1(InterfaceC2772Tc interfaceC2772Tc, AI ai) {
        this.$cancellableContinuation = interfaceC2772Tc;
        this.$this_await = ai;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.$cancellableContinuation.resumeWith(this.$this_await.get());
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.e(cause);
            } else {
                this.$cancellableContinuation.resumeWith(AbstractC3375el.v(cause));
            }
        }
    }
}
