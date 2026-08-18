package androidx.datastore;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4035mG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5195zX;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreSingletonDelegate<T> implements InterfaceC5195zX {

    @GuardedBy("lock")
    private volatile DataStore<T> INSTANCE;
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final String fileName;
    private final Object lock;
    private final InterfaceC2766Sw produceMigrations;
    private final InterfaceC4514rk scope;
    private final Serializer<T> serializer;

    public DataStoreSingletonDelegate(String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, InterfaceC2766Sw interfaceC2766Sw, InterfaceC4514rk interfaceC4514rk) {
        AbstractC2995aW.q(str, "fileName");
        AbstractC2995aW.q(serializer, "serializer");
        AbstractC2995aW.q(interfaceC2766Sw, "produceMigrations");
        AbstractC2995aW.q(interfaceC4514rk, "scope");
        this.fileName = str;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = interfaceC2766Sw;
        this.scope = interfaceC4514rk;
        this.lock = new Object();
    }

    public DataStore<T> getValue(Context context, InterfaceC4035mG interfaceC4035mG) {
        DataStore<T> dataStore;
        AbstractC2995aW.q(context, "thisRef");
        AbstractC2995aW.q(interfaceC4035mG, "property");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = context.getApplicationContext();
                    Serializer<T> serializer = this.serializer;
                    ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                    InterfaceC2766Sw interfaceC2766Sw = this.produceMigrations;
                    AbstractC2995aW.p(applicationContext, "applicationContext");
                    this.INSTANCE = DataStoreFactory.INSTANCE.create(serializer, replaceFileCorruptionHandler, (List) interfaceC2766Sw.invoke(applicationContext), this.scope, new DataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                dataStore = this.INSTANCE;
                AbstractC2995aW.n(dataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
