package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2911Yl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2953a0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3190ch;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3202cn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3235d8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3379en;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3605hO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3645ho;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4266ou;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4710tz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5226zo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.D8;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4798uz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4886vz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RW;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        int i = 0;
        ArrayList arrayList = new ArrayList();
        C3605hO c3605hOA = C3190ch.a(C3645ho.class);
        c3605hOA.b(new C5226zo(C3235d8.class, 2, 0));
        c3605hOA.f = new C2953a0(8);
        arrayList.add(c3605hOA.c());
        RW rw = new RW(D8.class, Executor.class);
        C3605hO c3605hO = new C3605hO(C3379en.class, new Class[]{InterfaceC4798uz.class, InterfaceC4886vz.class});
        c3605hO.b(C5226zo.a(Context.class));
        c3605hO.b(C5226zo.a(C4266ou.class));
        c3605hO.b(new C5226zo(C4710tz.class, 2, 0));
        c3605hO.b(new C5226zo(C3645ho.class, 1, 1));
        c3605hO.b(new C5226zo(rw, 1, 0));
        c3605hO.f = new C3202cn(rw, i);
        arrayList.add(c3605hO.c());
        arrayList.add(AbstractC3375el.u("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(AbstractC3375el.u("fire-core", "20.3.3"));
        arrayList.add(AbstractC3375el.u("device-name", a(Build.PRODUCT)));
        arrayList.add(AbstractC3375el.u("device-model", a(Build.DEVICE)));
        arrayList.add(AbstractC3375el.u("device-brand", a(Build.BRAND)));
        arrayList.add(AbstractC3375el.A("android-target-sdk", new C2911Yl(27)));
        arrayList.add(AbstractC3375el.A("android-min-sdk", new C2911Yl(28)));
        arrayList.add(AbstractC3375el.A("android-platform", new C2911Yl(29)));
        arrayList.add(AbstractC3375el.A("android-installer", new C2953a0(i)));
        try {
            DG.b.getClass();
            str = "1.9.0";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(AbstractC3375el.u("kotlin", str));
        }
        return arrayList;
    }
}
