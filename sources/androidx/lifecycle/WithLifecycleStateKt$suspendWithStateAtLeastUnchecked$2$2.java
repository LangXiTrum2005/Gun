package androidx.lifecycle;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2 extends WG implements InterfaceC2766Sw {
    final /* synthetic */ AbstractC3899kk $lifecycleDispatcher;
    final /* synthetic */ WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 $observer;
    final /* synthetic */ Lifecycle $this_suspendWithStateAtLeastUnchecked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2(AbstractC3899kk abstractC3899kk, Lifecycle lifecycle, WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        super(1);
        this.$lifecycleDispatcher = abstractC3899kk;
        this.$this_suspendWithStateAtLeastUnchecked = lifecycle;
        this.$observer = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C5033xf0.f5238a;
    }

    public final void invoke(Throwable th) {
        AbstractC3899kk abstractC3899kk = this.$lifecycleDispatcher;
        C2734Rq c2734Rq = C2734Rq.f3684a;
        if (!abstractC3899kk.isDispatchNeeded(c2734Rq)) {
            this.$this_suspendWithStateAtLeastUnchecked.removeObserver(this.$observer);
            return;
        }
        AbstractC3899kk abstractC3899kk2 = this.$lifecycleDispatcher;
        final Lifecycle lifecycle = this.$this_suspendWithStateAtLeastUnchecked;
        final WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = this.$observer;
        abstractC3899kk2.dispatch(c2734Rq, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$2.1
            @Override // java.lang.Runnable
            public final void run() {
                lifecycle.removeObserver(withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1);
            }
        });
    }
}
