package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2953a0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3190ch;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3605hO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4266ou;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4617su;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4710tz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4808v4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5226zo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2588Ma;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4705tu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4798uz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RW;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC4705tu lambda$getComponents$0(InterfaceC3543gh interfaceC3543gh) {
        return new C4617su((C4266ou) interfaceC3543gh.a(C4266ou.class), interfaceC3543gh.c(InterfaceC4798uz.class), (ExecutorService) interfaceC3543gh.e(new RW(D8.class, ExecutorService.class)), new C40((Executor) interfaceC3543gh.e(new RW(InterfaceC2588Ma.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3190ch> getComponents() {
        int i = 0;
        C3605hO c3605hOA = C3190ch.a(InterfaceC4705tu.class);
        c3605hOA.f4454a = LIBRARY_NAME;
        c3605hOA.b(C5226zo.a(C4266ou.class));
        c3605hOA.b(new C5226zo(InterfaceC4798uz.class, 0, 1));
        c3605hOA.b(new C5226zo(new RW(D8.class, ExecutorService.class), 1, 0));
        c3605hOA.b(new C5226zo(new RW(InterfaceC2588Ma.class, Executor.class), 1, 0));
        c3605hOA.f = new C2953a0(6);
        C3190ch c3190chC = c3605hOA.c();
        C4710tz c4710tz = new C4710tz(i);
        C3605hO c3605hOA2 = C3190ch.a(C4710tz.class);
        c3605hOA2.c = 1;
        c3605hOA2.f = new C4808v4(c4710tz, i);
        return Arrays.asList(c3190chC, c3605hOA2.c(), AbstractC3375el.u(LIBRARY_NAME, "17.1.4"));
    }
}
