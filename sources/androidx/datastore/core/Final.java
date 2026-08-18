package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
final class Final<T> extends State<T> {
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(Throwable th) {
        super(null);
        AbstractC2995aW.q(th, "finalException");
        this.finalException = th;
    }

    public final Throwable getFinalException() {
        return this.finalException;
    }
}
