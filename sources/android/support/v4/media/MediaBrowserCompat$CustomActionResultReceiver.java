package android.support.v4.media;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.os.ResultReceiver;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XM;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$CustomActionResultReceiver extends ResultReceiver {
    private final String mAction;
    private final XM mCallback;
    private final Bundle mExtras;

    public MediaBrowserCompat$CustomActionResultReceiver(String str, Bundle bundle, XM xm, Handler handler) {
        super(handler);
        this.mAction = str;
        this.mExtras = bundle;
    }

    @Override // android.support.v4.os.ResultReceiver
    public final void b(int i, Bundle bundle) {
    }
}
