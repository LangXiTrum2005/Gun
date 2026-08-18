package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4118nB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OB;

/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {
    private NB mBinder = new NB() { // from class: androidx.browser.customtabs.PostMessageService.1
        {
            attachInterface(this, OB.l1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OB
        public void onMessageChannelReady(@NonNull InterfaceC4118nB interfaceC4118nB, @Nullable Bundle bundle) throws RemoteException {
            interfaceC4118nB.onMessageChannelReady(bundle);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OB
        public void onPostMessage(@NonNull InterfaceC4118nB interfaceC4118nB, @NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            interfaceC4118nB.onPostMessage(str, bundle);
        }
    };

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }
}
