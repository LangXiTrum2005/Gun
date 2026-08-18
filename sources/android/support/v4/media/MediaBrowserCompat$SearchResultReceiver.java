package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3604hN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4922wO;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    private final AbstractC3604hN mCallback;
    private final Bundle mExtras;
    private final String mQuery;

    public MediaBrowserCompat$SearchResultReceiver(String str, Bundle bundle, AbstractC3604hN abstractC3604hN, Handler handler) {
        super(handler);
        this.mQuery = str;
        this.mExtras = bundle;
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
        if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS)) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS);
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
