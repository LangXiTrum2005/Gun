package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes.dex */
public interface DataMigration<T> {
    Object cleanUp(InterfaceC2857Wj interfaceC2857Wj);

    Object migrate(T t, InterfaceC2857Wj interfaceC2857Wj);

    Object shouldMigrate(T t, InterfaceC2857Wj interfaceC2857Wj);
}
