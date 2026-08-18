package androidx.activity.contextaware;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareHelper {
    private volatile Context context;
    private final Set<OnContextAvailableListener> listeners = new CopyOnWriteArraySet();

    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        AbstractC2995aW.q(onContextAvailableListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = this.context;
        if (context != null) {
            onContextAvailableListener.onContextAvailable(context);
        }
        this.listeners.add(onContextAvailableListener);
    }

    public final void clearAvailableContext() {
        this.context = null;
    }

    public final void dispatchOnContextAvailable(Context context) {
        AbstractC2995aW.q(context, f.X);
        this.context = context;
        Iterator<OnContextAvailableListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onContextAvailable(context);
        }
    }

    public final Context peekAvailableContext() {
        return this.context;
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        AbstractC2995aW.q(onContextAvailableListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listeners.remove(onContextAvailableListener);
    }
}
