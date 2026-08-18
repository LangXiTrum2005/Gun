package androidx.core.util;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes.dex */
public final class RunnableKt {
    public static final Runnable asRunnable(InterfaceC2857Wj interfaceC2857Wj) {
        return new ContinuationRunnable(interfaceC2857Wj);
    }
}
