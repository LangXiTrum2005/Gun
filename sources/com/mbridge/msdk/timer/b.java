package com.mbridge.msdk.timer;

import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.b$b, reason: collision with other inner class name */
    public static class C0254b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static b f2023a = new b();
    }

    public static b getInstance() {
        return C0254b.f2023a;
    }

    public void addInterstitialList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().a(str, str2);
        } catch (Exception e) {
            AbstractC3888ke0.q(e, new StringBuilder("addInterstitialList error:"), "TimerController");
        }
    }

    public void addRewardList(String str, String str2) {
        try {
            com.mbridge.msdk.timer.a.a().b(str, str2);
        } catch (Exception e) {
            AbstractC3888ke0.q(e, new StringBuilder("addRewardList error:"), "TimerController");
        }
    }

    public void start() {
        g gVarF = AbstractC3888ke0.f(h.b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        int iH = gVarF.h();
        if (iH > 0) {
            com.mbridge.msdk.timer.a.a().b(iH * 1000);
        }
    }

    private b() {
    }
}
