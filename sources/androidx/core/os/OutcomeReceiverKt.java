package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4043mO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(InterfaceC2857Wj interfaceC2857Wj) {
        return AbstractC4043mO.m(new ContinuationOutcomeReceiver(interfaceC2857Wj));
    }
}
