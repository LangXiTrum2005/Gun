package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2953a0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3190ch;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3605hO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3736ir;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4201o8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4235oc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5226zo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3121br;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Sd0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Td0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ud0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wd0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static Td0 lambda$getComponents$0(InterfaceC3543gh interfaceC3543gh) {
        Set setSingleton;
        byte[] bytes;
        Wd0.b((Context) interfaceC3543gh.a(Context.class));
        Wd0 wd0A = Wd0.a();
        C4235oc c4235oc = C4235oc.e;
        wd0A.getClass();
        if (c4235oc instanceof InterfaceC3121br) {
            c4235oc.getClass();
            setSingleton = Collections.unmodifiableSet(C4235oc.d);
        } else {
            setSingleton = Collections.singleton(new C3736ir("proto"));
        }
        C4201o8 c4201o8A = Sd0.a();
        c4235oc.getClass();
        c4201o8A.b("cct");
        String str = c4235oc.f4795a;
        String str2 = c4235oc.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC5044xl.m("1$", str, "\\", str2).getBytes(Charset.forName(C.UTF8_NAME));
        }
        c4201o8A.b = bytes;
        return new Ud0(setSingleton, c4201o8A.a(), wd0A);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3190ch> getComponents() {
        C3605hO c3605hOA = C3190ch.a(Td0.class);
        c3605hOA.f4454a = LIBRARY_NAME;
        c3605hOA.b(C5226zo.a(Context.class));
        c3605hOA.f = new C2953a0(5);
        return Arrays.asList(c3605hOA.c(), AbstractC3375el.u(LIBRARY_NAME, "18.1.7"));
    }
}
