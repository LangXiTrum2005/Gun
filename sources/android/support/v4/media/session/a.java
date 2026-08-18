package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.core.app.BundleCompat;
import androidx.versionedparcelable.ParcelUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MN;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaController f6a;
    public final Object b = new Object();
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final MediaSessionCompat$Token e;

    public a(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.d());
        this.f6a = mediaController;
        if (mediaSessionCompat$Token.c() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                private WeakReference<a> mMediaControllerImpl;

                {
                    super(null);
                    this.mMediaControllerImpl = new WeakReference<>(this);
                }

                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i, Bundle bundle) {
                    a aVar = this.mMediaControllerImpl.get();
                    if (aVar == null || bundle == null) {
                        return;
                    }
                    synchronized (aVar.b) {
                        aVar.e.e(AB.c(BundleCompat.getBinder(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        aVar.e.f(ParcelUtils.getVersionedParcelable(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        aVar.a();
                    }
                }
            });
        }
    }

    public final void a() {
        if (this.e.c() == null) {
            return;
        }
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
            return;
        }
        AbstractC3950lJ.z(it.next());
        this.d.put(null, new MN());
        throw null;
    }
}
