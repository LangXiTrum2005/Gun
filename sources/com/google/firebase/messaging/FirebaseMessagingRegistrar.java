package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2953a0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3190ch;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3605hO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3645ho;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4266ou;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5226zo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4320pa0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4705tu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4881vu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4886vz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Td0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC3543gh interfaceC3543gh) {
        C4266ou c4266ou = (C4266ou) interfaceC3543gh.a(C4266ou.class);
        AbstractC3950lJ.z(interfaceC3543gh.a(InterfaceC4881vu.class));
        return new FirebaseMessaging(c4266ou, interfaceC3543gh.c(C3645ho.class), interfaceC3543gh.c(InterfaceC4886vz.class), (InterfaceC4705tu) interfaceC3543gh.a(InterfaceC4705tu.class), (Td0) interfaceC3543gh.a(Td0.class), (InterfaceC4320pa0) interfaceC3543gh.a(InterfaceC4320pa0.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C3190ch> getComponents() {
        C3605hO c3605hOA = C3190ch.a(FirebaseMessaging.class);
        c3605hOA.f4454a = LIBRARY_NAME;
        c3605hOA.b(C5226zo.a(C4266ou.class));
        c3605hOA.b(new C5226zo(InterfaceC4881vu.class, 0, 0));
        c3605hOA.b(new C5226zo(C3645ho.class, 0, 1));
        c3605hOA.b(new C5226zo(InterfaceC4886vz.class, 0, 1));
        c3605hOA.b(new C5226zo(Td0.class, 0, 0));
        c3605hOA.b(C5226zo.a(InterfaceC4705tu.class));
        c3605hOA.b(C5226zo.a(InterfaceC4320pa0.class));
        c3605hOA.f = new C2953a0(7);
        c3605hOA.m(1);
        return Arrays.asList(c3605hOA.c(), AbstractC3375el.u(LIBRARY_NAME, "23.2.1"));
    }
}
