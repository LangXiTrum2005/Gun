package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5195zX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreDelegateKt {

    /* JADX INFO: renamed from: androidx.datastore.DataStoreDelegateKt$dataStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public final List invoke(Context context) {
            AbstractC2995aW.q(context, "it");
            return C2812Uq.f3846a;
        }
    }

    public static final <T> InterfaceC5195zX dataStore(String str, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, InterfaceC2766Sw interfaceC2766Sw, InterfaceC4514rk interfaceC4514rk) {
        AbstractC2995aW.q(str, "fileName");
        AbstractC2995aW.q(serializer, "serializer");
        AbstractC2995aW.q(interfaceC2766Sw, "produceMigrations");
        AbstractC2995aW.q(interfaceC4514rk, "scope");
        return new DataStoreSingletonDelegate(str, serializer, replaceFileCorruptionHandler, interfaceC2766Sw, interfaceC4514rk);
    }

    public static InterfaceC5195zX dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, InterfaceC2766Sw interfaceC2766Sw, InterfaceC4514rk interfaceC4514rk, int i, Object obj) {
        if ((i & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i & 8) != 0) {
            interfaceC2766Sw = AnonymousClass1.INSTANCE;
        }
        if ((i & 16) != 0) {
            interfaceC4514rk = WD.a(AbstractC4437qp.b.plus(AbstractC3375el.c()));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, interfaceC2766Sw, interfaceC4514rk);
    }
}
