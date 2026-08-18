package androidx.lifecycle;

import android.view.View;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 extends WG implements InterfaceC2766Sw {
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1 INSTANCE = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1() {
        super(1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final View invoke(View view) {
        AbstractC2995aW.q(view, "currentView");
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }
}
