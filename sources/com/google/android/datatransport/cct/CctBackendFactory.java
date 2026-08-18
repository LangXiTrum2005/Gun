package com.google.android.datatransport.cct;

import android.content.Context;
import androidx.annotation.Keep;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4778uk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3359ed;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qd0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.W7;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class CctBackendFactory {
    public Qd0 create(AbstractC4778uk abstractC4778uk) {
        Context context = ((W7) abstractC4778uk).f3910a;
        W7 w7 = (W7) abstractC4778uk;
        return new C3359ed(context, w7.b, w7.c);
    }
}
