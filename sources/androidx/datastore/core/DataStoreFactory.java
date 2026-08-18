package androidx.datastore.core;

import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreFactory {
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public static DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, InterfaceC4514rk interfaceC4514rk, InterfaceC2714Qw interfaceC2714Qw, int i, Object obj) {
        if ((i & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        if ((i & 4) != 0) {
            list = C2812Uq.f3846a;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            interfaceC4514rk = WD.a(AbstractC4437qp.b.plus(AbstractC3375el.c()));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, interfaceC4514rk, interfaceC2714Qw);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(serializer, "serializer");
        AbstractC2995aW.q(interfaceC2714Qw, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, interfaceC2714Qw, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, InterfaceC4514rk interfaceC4514rk, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(serializer, "serializer");
        AbstractC2995aW.q(list, "migrations");
        AbstractC2995aW.q(interfaceC4514rk, "scope");
        AbstractC2995aW.q(interfaceC2714Qw, "produceFile");
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new SingleProcessDataStore(interfaceC2714Qw, serializer, AbstractC2340Cl.J(DataMigrationInitializer.Companion.getInitializer(list)), replaceFileCorruptionHandler, interfaceC4514rk);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(serializer, "serializer");
        AbstractC2995aW.q(list, "migrations");
        AbstractC2995aW.q(interfaceC2714Qw, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, list, null, interfaceC2714Qw, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(serializer, "serializer");
        AbstractC2995aW.q(interfaceC2714Qw, "produceFile");
        return create$default(this, serializer, null, null, null, interfaceC2714Qw, 14, null);
    }
}
