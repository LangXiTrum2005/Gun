package androidx.lifecycle;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3217cz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelKt {
    private static final String JOB_KEY = "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY";

    public static final InterfaceC4514rk getViewModelScope(ViewModel viewModel) {
        AbstractC2995aW.q(viewModel, "<this>");
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) viewModel.getTag(JOB_KEY);
        if (interfaceC4514rk != null) {
            return interfaceC4514rk;
        }
        Ba0 ba0C = AbstractC3375el.c();
        C2627Nn c2627Nn = AbstractC4437qp.f4904a;
        Object tagIfAbsent = viewModel.setTagIfAbsent(JOB_KEY, new CloseableCoroutineScope(AbstractC2995aW.f0(ba0C, ((C3217cz) TL.f3768a).d)));
        AbstractC2995aW.p(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (InterfaceC4514rk) tagIfAbsent;
    }
}
