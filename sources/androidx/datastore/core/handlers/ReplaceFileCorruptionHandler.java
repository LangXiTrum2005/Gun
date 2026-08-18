package androidx.datastore.core.handlers;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    private final InterfaceC2766Sw produceNewData;

    public ReplaceFileCorruptionHandler(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "produceNewData");
        this.produceNewData = interfaceC2766Sw;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, InterfaceC2857Wj interfaceC2857Wj) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
