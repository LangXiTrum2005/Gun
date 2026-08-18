package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class JobListenableFuture<R> implements AI {
    private final InterfaceC5000xE job;
    private final SettableFuture<R> underlying;

    /* JADX INFO: renamed from: androidx.work.JobListenableFuture$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2766Sw {
        final /* synthetic */ JobListenableFuture<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(JobListenableFuture<R> jobListenableFuture) {
            super(1);
            this.this$0 = jobListenableFuture;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C5033xf0.f5238a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                if (!((JobListenableFuture) this.this$0).underlying.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th instanceof CancellationException) {
                    ((JobListenableFuture) this.this$0).underlying.cancel(true);
                    return;
                }
                SettableFuture settableFuture = ((JobListenableFuture) this.this$0).underlying;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                settableFuture.setException(th);
            }
        }
    }

    public JobListenableFuture(InterfaceC5000xE interfaceC5000xE, SettableFuture<R> settableFuture) {
        AbstractC2995aW.q(interfaceC5000xE, "job");
        AbstractC2995aW.q(settableFuture, "underlying");
        this.job = interfaceC5000xE;
        this.underlying = settableFuture;
        interfaceC5000xE.p(new AnonymousClass1(this));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI
    public void addListener(Runnable runnable, Executor executor) {
        this.underlying.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.underlying.cancel(z);
    }

    public final void complete(R r) {
        this.underlying.set(r);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.underlying.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.underlying.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.underlying.isDone();
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) {
        return this.underlying.get(j, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JobListenableFuture(InterfaceC5000xE interfaceC5000xE, SettableFuture settableFuture, int i, AbstractC2471Hm abstractC2471Hm) {
        if ((i & 2) != 0) {
            settableFuture = SettableFuture.create();
            AbstractC2995aW.p(settableFuture, "create()");
        }
        this(interfaceC5000xE, settableFuture);
    }
}
