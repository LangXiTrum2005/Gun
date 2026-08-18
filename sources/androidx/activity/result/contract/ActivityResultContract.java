package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t) {
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }
    }

    public abstract Intent createIntent(Context context, I i);

    public SynchronousResult<O> getSynchronousResult(Context context, I i) {
        AbstractC2995aW.q(context, f.X);
        return null;
    }

    public abstract O parseResult(int i, Intent intent);
}
