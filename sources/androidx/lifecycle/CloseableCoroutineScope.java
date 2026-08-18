package androidx.lifecycle;

import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class CloseableCoroutineScope implements Closeable, InterfaceC4514rk {
    private final InterfaceC3549gk coroutineContext;

    public CloseableCoroutineScope(InterfaceC3549gk interfaceC3549gk) {
        AbstractC2995aW.q(interfaceC3549gk, f.X);
        this.coroutineContext = interfaceC3549gk;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) getCoroutineContext().get(G7.e);
        if (interfaceC5000xE != null) {
            interfaceC5000xE.a(null);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk
    public InterfaceC3549gk getCoroutineContext() {
        return this.coroutineContext;
    }
}
