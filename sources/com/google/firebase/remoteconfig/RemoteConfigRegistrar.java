package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3190ch;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3202cn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3605hO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3826ju;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4266ou;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4844vY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5226zo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2588Ma;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3227d4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4705tu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static C4844vY lambda$getComponents$0(RW rw, InterfaceC3543gh interfaceC3543gh) {
        C3826ju c3826ju;
        Context context = (Context) interfaceC3543gh.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) interfaceC3543gh.e(rw);
        C4266ou c4266ou = (C4266ou) interfaceC3543gh.a(C4266ou.class);
        InterfaceC4705tu interfaceC4705tu = (InterfaceC4705tu) interfaceC3543gh.a(InterfaceC4705tu.class);
        X x = (X) interfaceC3543gh.a(X.class);
        synchronized (x) {
            try {
                if (!x.f3950a.containsKey("frc")) {
                    x.f3950a.put("frc", new C3826ju(x.c));
                }
                c3826ju = (C3826ju) x.f3950a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new C4844vY(context, scheduledExecutorService, c4266ou, interfaceC4705tu, c3826ju, interfaceC3543gh.c(InterfaceC3227d4.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3190ch> getComponents() {
        RW rw = new RW(InterfaceC2588Ma.class, ScheduledExecutorService.class);
        C3605hO c3605hOA = C3190ch.a(C4844vY.class);
        c3605hOA.f4454a = LIBRARY_NAME;
        c3605hOA.b(C5226zo.a(Context.class));
        c3605hOA.b(new C5226zo(rw, 1, 0));
        c3605hOA.b(C5226zo.a(C4266ou.class));
        c3605hOA.b(C5226zo.a(InterfaceC4705tu.class));
        c3605hOA.b(C5226zo.a(X.class));
        c3605hOA.b(new C5226zo(InterfaceC3227d4.class, 0, 1));
        c3605hOA.f = new C3202cn(rw, 1);
        c3605hOA.m(2);
        return Arrays.asList(c3605hOA.c(), AbstractC3375el.u(LIBRARY_NAME, "21.4.1"));
    }
}
