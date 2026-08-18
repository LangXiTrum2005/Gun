package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4620sx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private OnBackPressedCallback inProgressCallback;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final S5 onBackPressedCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2766Sw {
        public AnonymousClass1() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackEventCompat) obj);
            return C5033xf0.f5238a;
        }

        public final void invoke(BackEventCompat backEventCompat) {
            AbstractC2995aW.q(backEventCompat, "backEvent");
            OnBackPressedDispatcher.this.onBackStarted(backEventCompat);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$2, reason: invalid class name */
    public static final class AnonymousClass2 extends WG implements InterfaceC2766Sw {
        public AnonymousClass2() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackEventCompat) obj);
            return C5033xf0.f5238a;
        }

        public final void invoke(BackEventCompat backEventCompat) {
            AbstractC2995aW.q(backEventCompat, "backEvent");
            OnBackPressedDispatcher.this.onBackProgressed(backEventCompat);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$3, reason: invalid class name */
    public static final class AnonymousClass3 extends WG implements InterfaceC2714Qw {
        public AnonymousClass3() {
            super(0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public /* bridge */ /* synthetic */ Object invoke() {
            m0invoke();
            return C5033xf0.f5238a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m0invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$4, reason: invalid class name */
    public static final class AnonymousClass4 extends WG implements InterfaceC2714Qw {
        public AnonymousClass4() {
            super(0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public /* bridge */ /* synthetic */ Object invoke() {
            m1invoke();
            return C5033xf0.f5238a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m1invoke() {
            OnBackPressedDispatcher.this.onBackCancelled();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$5, reason: invalid class name */
    public static final class AnonymousClass5 extends WG implements InterfaceC2714Qw {
        public AnonymousClass5() {
            super(0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public /* bridge */ /* synthetic */ Object invoke() {
            m2invoke();
            return C5033xf0.f5238a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m2invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    @RequiresApi(33)
    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createOnBackInvokedCallback$lambda$0(InterfaceC2714Qw interfaceC2714Qw) {
            AbstractC2995aW.q(interfaceC2714Qw, "$onBackInvoked");
            interfaceC2714Qw.invoke();
        }

        @DoNotInline
        public final OnBackInvokedCallback createOnBackInvokedCallback(final InterfaceC2714Qw interfaceC2714Qw) {
            AbstractC2995aW.q(interfaceC2714Qw, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CS
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(interfaceC2714Qw);
                }
            };
        }

        @DoNotInline
        public final void registerOnBackInvokedCallback(Object obj, int i, Object obj2) {
            AbstractC2995aW.q(obj, "dispatcher");
            AbstractC2995aW.q(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        @DoNotInline
        public final void unregisterOnBackInvokedCallback(Object obj, Object obj2) {
            AbstractC2995aW.q(obj, "dispatcher");
            AbstractC2995aW.q(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    @RequiresApi(34)
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @DoNotInline
        public final OnBackInvokedCallback createOnBackAnimationCallback(final InterfaceC2766Sw interfaceC2766Sw, final InterfaceC2766Sw interfaceC2766Sw2, final InterfaceC2714Qw interfaceC2714Qw, final InterfaceC2714Qw interfaceC2714Qw2) {
            AbstractC2995aW.q(interfaceC2766Sw, "onBackStarted");
            AbstractC2995aW.q(interfaceC2766Sw2, "onBackProgressed");
            AbstractC2995aW.q(interfaceC2714Qw, "onBackInvoked");
            AbstractC2995aW.q(interfaceC2714Qw2, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    interfaceC2714Qw2.invoke();
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    interfaceC2714Qw.invoke();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(BackEvent backEvent) {
                    AbstractC2995aW.q(backEvent, "backEvent");
                    interfaceC2766Sw2.invoke(new BackEventCompat(backEvent));
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(BackEvent backEvent) {
                    AbstractC2995aW.q(backEvent, "backEvent");
                    interfaceC2766Sw.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            AbstractC2995aW.q(lifecycle, "lifecycle");
            AbstractC2995aW.q(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            AbstractC2995aW.q(lifecycleOwner, "source");
            AbstractC2995aW.q(event, NotificationCompat.CATEGORY_EVENT);
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            }
        }
    }

    public final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            AbstractC2995aW.q(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (AbstractC2995aW.i(this.this$0.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.this$0.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            InterfaceC2714Qw enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$addCallback$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C03081 extends C4620sx implements InterfaceC2714Qw {
        public C03081(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public /* bridge */ /* synthetic */ Object invoke() {
            m3invoke();
            return C5033xf0.f5238a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m3invoke() {
            ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
        }
    }

    public OnBackPressedDispatcher() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackCancelled() {
        Object objPrevious;
        S5 s5 = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = s5.listIterator(s5.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((OnBackPressedCallback) objPrevious).isEnabled());
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackProgressed(BackEventCompat backEventCompat) {
        Object objPrevious;
        S5 s5 = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = s5.listIterator(s5.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((OnBackPressedCallback) objPrevious).isEnabled());
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackProgressed(backEventCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void onBackStarted(BackEventCompat backEventCompat) {
        Object objPrevious;
        S5 s5 = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = s5.listIterator(s5.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((OnBackPressedCallback) objPrevious).isEnabled());
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        this.inProgressCallback = onBackPressedCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackStarted(backEventCompat);
        }
    }

    @RequiresApi(33)
    private final void updateBackInvokedCallbackState(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.backInvokedCallbackRegistered) {
            Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (z || !this.backInvokedCallbackRegistered) {
                return;
            }
            Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateEnabledCallbacks() {
        boolean z = this.hasEnabledCallbacks;
        S5 s5 = this.onBackPressedCallbacks;
        boolean z2 = false;
        if (!(s5 instanceof Collection) || !s5.isEmpty()) {
            Iterator<E> it = s5.iterator();
            while (it.hasNext()) {
                if (((OnBackPressedCallback) it.next()).isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z2;
        if (z2 != z) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z2);
            }
        }
    }

    @MainThread
    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        AbstractC2995aW.q(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    @MainThread
    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        AbstractC2995aW.q(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.addLast(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackProgressed(BackEventCompat backEventCompat) {
        AbstractC2995aW.q(backEventCompat, "backEvent");
        onBackProgressed(backEventCompat);
    }

    @MainThread
    @VisibleForTesting
    public final void dispatchOnBackStarted(BackEventCompat backEventCompat) {
        AbstractC2995aW.q(backEventCompat, "backEvent");
        onBackStarted(backEventCompat);
    }

    @MainThread
    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    @MainThread
    public final void onBackPressed() {
        Object objPrevious;
        S5 s5 = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = s5.listIterator(s5.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((OnBackPressedCallback) objPrevious).isEnabled());
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    @RequiresApi(33)
    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        AbstractC2995aW.q(onBackInvokedDispatcher, "invoker");
        this.invokedDispatcher = onBackInvokedDispatcher;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : runnable);
    }

    @MainThread
    public final void addCallback(LifecycleOwner lifecycleOwner, OnBackPressedCallback onBackPressedCallback) {
        AbstractC2995aW.q(lifecycleOwner, "owner");
        AbstractC2995aW.q(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C03081(this));
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        OnBackInvokedCallback onBackInvokedCallbackCreateOnBackInvokedCallback;
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new S5();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                onBackInvokedCallbackCreateOnBackInvokedCallback = Api34Impl.INSTANCE.createOnBackAnimationCallback(new AnonymousClass1(), new AnonymousClass2(), new AnonymousClass3(), new AnonymousClass4());
            } else {
                onBackInvokedCallbackCreateOnBackInvokedCallback = Api33Impl.INSTANCE.createOnBackInvokedCallback(new AnonymousClass5());
            }
            this.onBackInvokedCallback = onBackInvokedCallbackCreateOnBackInvokedCallback;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
