package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
final class ReadException<T> extends State<T> {
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable th) {
        super(null);
        AbstractC2995aW.q(th, "readException");
        this.readException = th;
    }

    public final Throwable getReadException() {
        return this.readException;
    }
}
