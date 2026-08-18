package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import androidx.annotation.FloatRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.color.utilities.Contrast;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
public final class BackEventCompat {
    public static final Companion Companion = new Companion(null);
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;
    private final float progress;
    private final int swipeEdge;
    private final float touchX;
    private final float touchY;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface SwipeEdge {
    }

    @VisibleForTesting
    public BackEventCompat(float f, float f2, @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f3, int i) {
        this.touchX = f;
        this.touchY = f2;
        this.progress = f3;
        this.swipeEdge = i;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    public final float getTouchX() {
        return this.touchX;
    }

    public final float getTouchY() {
        return this.touchY;
    }

    @RequiresApi(34)
    public final BackEvent toBackEvent() {
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.INSTANCE.createOnBackEvent(this.touchX, this.touchY, this.progress, this.swipeEdge);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 34+");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.touchX);
        sb.append(", touchY=");
        sb.append(this.touchY);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", swipeEdge=");
        return DM.k(sb, this.swipeEdge, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @RequiresApi(34)
    public BackEventCompat(BackEvent backEvent) {
        AbstractC2995aW.q(backEvent, "backEvent");
        Api34Impl api34Impl = Api34Impl.INSTANCE;
        this(api34Impl.touchX(backEvent), api34Impl.touchY(backEvent), api34Impl.progress(backEvent), api34Impl.swipeEdge(backEvent));
    }
}
