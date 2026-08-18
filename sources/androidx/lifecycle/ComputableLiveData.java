package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.ComputableLiveData;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class ComputableLiveData<T> {
    private final LiveData<T> _liveData;
    private final AtomicBoolean computing;
    private final Executor executor;
    private final AtomicBoolean invalid;
    public final Runnable invalidationRunnable;
    private final LiveData<T> liveData;
    public final Runnable refreshRunnable;

    public ComputableLiveData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invalidationRunnable$lambda$1(ComputableLiveData computableLiveData) {
        AbstractC2995aW.q(computableLiveData, "this$0");
        boolean zHasActiveObservers = computableLiveData.getLiveData().hasActiveObservers();
        if (computableLiveData.invalid.compareAndSet(false, true) && zHasActiveObservers) {
            computableLiveData.executor.execute(computableLiveData.refreshRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void refreshRunnable$lambda$0(ComputableLiveData computableLiveData) {
        AbstractC2995aW.q(computableLiveData, "this$0");
        while (computableLiveData.computing.compareAndSet(false, true)) {
            Object objCompute = null;
            boolean z = false;
            while (computableLiveData.invalid.compareAndSet(true, false)) {
                try {
                    objCompute = computableLiveData.compute();
                    z = true;
                } catch (Throwable th) {
                    computableLiveData.computing.set(false);
                    throw th;
                }
            }
            if (z) {
                computableLiveData.getLiveData().postValue(objCompute);
            }
            computableLiveData.computing.set(false);
            if (!z || !computableLiveData.invalid.get()) {
                return;
            }
        }
    }

    @WorkerThread
    public abstract T compute();

    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.computing;
    }

    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.executor;
    }

    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.invalid;
    }

    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ComputableLiveData(Executor executor, int i, AbstractC2471Hm abstractC2471Hm) {
        if ((i & 1) != 0) {
            executor = ArchTaskExecutor.getIOThreadExecutor();
            AbstractC2995aW.p(executor, "getIOThreadExecutor()");
        }
        this(executor);
    }

    public ComputableLiveData(Executor executor) {
        AbstractC2995aW.q(executor, "executor");
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                this.this$0.getExecutor$lifecycle_livedata_release().execute(this.this$0.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        final int i = 1;
        this.invalid = new AtomicBoolean(true);
        final int i2 = 0;
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yh
            public final /* synthetic */ ComputableLiveData b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                ComputableLiveData computableLiveData = this.b;
                switch (i3) {
                    case 0:
                        ComputableLiveData.refreshRunnable$lambda$0(computableLiveData);
                        break;
                    default:
                        ComputableLiveData.invalidationRunnable$lambda$1(computableLiveData);
                        break;
                }
            }
        };
        this.invalidationRunnable = new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yh
            public final /* synthetic */ ComputableLiveData b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                ComputableLiveData computableLiveData = this.b;
                switch (i3) {
                    case 0:
                        ComputableLiveData.refreshRunnable$lambda$0(computableLiveData);
                        break;
                    default:
                        ComputableLiveData.invalidationRunnable$lambda$1(computableLiveData);
                        break;
                }
            }
        };
    }
}
