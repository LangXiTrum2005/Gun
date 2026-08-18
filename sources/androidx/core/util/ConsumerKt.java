package androidx.core.util;

import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.F6;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class ConsumerKt {
    @RequiresApi(24)
    public static final <T> java.util.function.Consumer<T> asConsumer(InterfaceC2857Wj interfaceC2857Wj) {
        return F6.p(new ContinuationConsumer(interfaceC2857Wj));
    }
}
