package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final InterfaceC2857Wj continuation;

    public ContinuationOutcomeReceiver(InterfaceC2857Wj interfaceC2857Wj) {
        super(false);
        this.continuation = interfaceC2857Wj;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(AbstractC3375el.v(e));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(r);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
