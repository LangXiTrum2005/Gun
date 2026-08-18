package androidx.core.util;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final InterfaceC2857Wj continuation;

    public ContinuationRunnable(InterfaceC2857Wj interfaceC2857Wj) {
        super(false);
        this.continuation = interfaceC2857Wj;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(C5033xf0.f5238a);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
