package androidx.core.os;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;

/* JADX INFO: loaded from: classes.dex */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    final /* synthetic */ InterfaceC2714Qw $action;

    public HandlerKt$postAtTime$runnable$1(InterfaceC2714Qw interfaceC2714Qw) {
        this.$action = interfaceC2714Qw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
