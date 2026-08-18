package androidx.lifecycle;

import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3217cz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;

/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcher extends AbstractC3899kk {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public void dispatch(InterfaceC3549gk interfaceC3549gk, Runnable runnable) {
        AbstractC2995aW.q(interfaceC3549gk, f.X);
        AbstractC2995aW.q(runnable, "block");
        this.dispatchQueue.dispatchAndEnqueue(interfaceC3549gk, runnable);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk
    public boolean isDispatchNeeded(InterfaceC3549gk interfaceC3549gk) {
        AbstractC2995aW.q(interfaceC3549gk, f.X);
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        if (((C3217cz) TL.f3768a).d.isDispatchNeeded(interfaceC3549gk)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }
}
