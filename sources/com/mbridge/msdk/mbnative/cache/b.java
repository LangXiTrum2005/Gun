package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<K, V> {
    public long a() {
        g gVarF = AbstractC3888ke0.f(h.b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        return gVarF.Z() * 1000;
    }

    public abstract V a(K k, int i);

    public abstract void a(K k, V v);

    public abstract void a(K k, V v, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public V b(K k, int i) {
        return null;
    }

    public long b() {
        g gVarF = AbstractC3888ke0.f(h.b());
        if (gVarF == null) {
            gVarF = h.b().a();
        }
        return gVarF.a0() * 1000;
    }
}
