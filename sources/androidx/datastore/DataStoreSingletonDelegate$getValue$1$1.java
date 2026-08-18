package androidx.datastore;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreSingletonDelegate$getValue$1$1 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ DataStoreSingletonDelegate<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSingletonDelegate$getValue$1$1(Context context, DataStoreSingletonDelegate<T> dataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = dataStoreSingletonDelegate;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final File invoke() {
        Context context = this.$applicationContext;
        AbstractC2995aW.p(context, "applicationContext");
        return DataStoreFile.dataStoreFile(context, ((DataStoreSingletonDelegate) this.this$0).fileName);
    }
}
