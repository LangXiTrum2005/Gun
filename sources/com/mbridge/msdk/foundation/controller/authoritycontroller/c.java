package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public class c extends b {
    private static volatile c j;

    private c() {
        h();
    }

    public static void c(boolean z) {
    }

    public static boolean l() {
        return true;
    }

    public static c m() {
        if (j == null) {
            synchronized (c.class) {
                try {
                    if (j == null) {
                        j = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.b
    public int a(g gVar, String str) {
        if (gVar == null) {
            gVar = h.b().a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return gVar.t0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return gVar.s0();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return gVar.u0();
        }
        return -1;
    }

    public boolean c(String str) {
        boolean z;
        g gVarF = AbstractC3888ke0.f(h.b());
        if (gVarF == null) {
            gVarF = h.b().a();
            z = true;
        } else {
            z = false;
        }
        int iH0 = gVarF.h0();
        boolean z2 = iH0 != 0 ? iH0 == 1 && a(gVarF, str) == 1 : a(str) == 1 && a(gVarF, str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z2 = a(str) == 1;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m().e() == 2) {
            return (gVarF.E0() || z || a(str) != 1) ? false : true;
        }
        return z2;
    }
}
