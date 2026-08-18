package androidx.activity;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4620sx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class OnBackPressedDispatcher$addCancellableCallback$1 extends C4620sx implements InterfaceC2714Qw {
    public OnBackPressedDispatcher$addCancellableCallback$1(Object obj) {
        super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public /* bridge */ /* synthetic */ Object invoke() {
        m4invoke();
        return C5033xf0.f5238a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4invoke() {
        ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
    }
}
