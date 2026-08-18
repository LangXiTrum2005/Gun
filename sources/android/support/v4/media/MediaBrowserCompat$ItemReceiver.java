package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4922wO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.YM;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    private final YM mCallback;
    private final String mMediaId;

    public MediaBrowserCompat$ItemReceiver(String str, YM ym, Handler handler) {
        super(handler);
        this.mMediaId = str;
    }

    @Override // android.support.v4.os.ResultReceiver
    public final void b(int i, Bundle bundle) {
        if (bundle != null) {
            AbstractC4922wO.a(bundle);
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
