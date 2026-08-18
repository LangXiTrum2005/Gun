package androidx.work;

import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class PeriodicWorkRequestKt {
    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit timeUnit) {
        AbstractC2995aW.q(timeUnit, "repeatIntervalTimeUnit");
        AbstractC2995aW.w0();
        throw null;
    }

    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        AbstractC2995aW.q(timeUnit, "repeatIntervalTimeUnit");
        AbstractC2995aW.q(timeUnit2, "flexTimeIntervalUnit");
        AbstractC2995aW.w0();
        throw null;
    }

    @RequiresApi(26)
    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration) {
        AbstractC2995aW.q(duration, "repeatInterval");
        AbstractC2995aW.w0();
        throw null;
    }

    @RequiresApi(26)
    public static final <W extends ListenableWorker> PeriodicWorkRequest.Builder PeriodicWorkRequestBuilder(Duration duration, Duration duration2) {
        AbstractC2995aW.q(duration, "repeatInterval");
        AbstractC2995aW.q(duration2, "flexTimeInterval");
        AbstractC2995aW.w0();
        throw null;
    }
}
