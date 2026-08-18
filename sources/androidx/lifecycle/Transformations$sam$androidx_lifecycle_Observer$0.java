package androidx.lifecycle;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3215cx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4357px;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC4357px {
    private final /* synthetic */ InterfaceC2766Sw function;

    public Transformations$sam$androidx_lifecycle_Observer$0(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "function");
        this.function = interfaceC2766Sw;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC4357px)) {
            return AbstractC2995aW.i(getFunctionDelegate(), ((InterfaceC4357px) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4357px
    public final InterfaceC3215cx getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
