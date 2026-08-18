package androidx.core.util;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(InterfaceC2857Wj interfaceC2857Wj) {
        return new AndroidXContinuationConsumer(interfaceC2857Wj);
    }
}
