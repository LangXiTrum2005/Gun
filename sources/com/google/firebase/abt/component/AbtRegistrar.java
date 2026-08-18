package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2953a0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3190ch;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3605hO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5226zo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3227d4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ X lambda$getComponents$0(InterfaceC3543gh interfaceC3543gh) {
        return new X((Context) interfaceC3543gh.a(Context.class), interfaceC3543gh.c(InterfaceC3227d4.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3190ch> getComponents() {
        C3605hO c3605hOA = C3190ch.a(X.class);
        c3605hOA.f4454a = LIBRARY_NAME;
        c3605hOA.b(C5226zo.a(Context.class));
        c3605hOA.b(new C5226zo(InterfaceC3227d4.class, 0, 1));
        c3605hOA.f = new C2953a0(0);
        return Arrays.asList(c3605hOA.c(), AbstractC3375el.u(LIBRARY_NAME, "21.1.1"));
    }
}
