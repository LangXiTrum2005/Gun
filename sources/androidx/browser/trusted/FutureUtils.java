package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes.dex */
class FutureUtils {
    private FutureUtils() {
    }

    @NonNull
    public static <T> AI immediateFailedFuture(@NonNull Throwable th) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.setException(th);
        return resolvableFutureCreate;
    }
}
