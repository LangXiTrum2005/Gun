package androidx.activity;

import androidx.annotation.MainThread;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private InterfaceC2714Qw enabledChangedCallback;
    private boolean isEnabled;

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(Cancellable cancellable) {
        AbstractC2995aW.q(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final InterfaceC2714Qw getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @MainThread
    public void handleOnBackCancelled() {
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public void handleOnBackProgressed(BackEventCompat backEventCompat) {
        AbstractC2995aW.q(backEventCompat, "backEvent");
    }

    @MainThread
    public void handleOnBackStarted(BackEventCompat backEventCompat) {
        AbstractC2995aW.q(backEventCompat, "backEvent");
    }

    @MainThread
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @MainThread
    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    public final void removeCancellable(Cancellable cancellable) {
        AbstractC2995aW.q(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    @MainThread
    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        InterfaceC2714Qw interfaceC2714Qw = this.enabledChangedCallback;
        if (interfaceC2714Qw != null) {
            interfaceC2714Qw.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC2714Qw interfaceC2714Qw) {
        this.enabledChangedCallback = interfaceC2714Qw;
    }
}
