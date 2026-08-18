package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3285dk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3732io;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PE;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutineAdapterKt {
    public static final <T> AI asListenableFuture(InterfaceC3732io interfaceC3732io, Object obj) {
        AbstractC2995aW.q(interfaceC3732io, "<this>");
        AI future = CallbackToFutureAdapter.getFuture(new C3285dk(0, interfaceC3732io, obj));
        AbstractC2995aW.p(future, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return future;
    }

    public static /* synthetic */ AI asListenableFuture$default(InterfaceC3732io interfaceC3732io, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(interfaceC3732io, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object asListenableFuture$lambda$0(InterfaceC3732io interfaceC3732io, Object obj, CallbackToFutureAdapter.Completer completer) {
        AbstractC2995aW.q(interfaceC3732io, "$this_asListenableFuture");
        AbstractC2995aW.q(completer, "completer");
        ((PE) interfaceC3732io).p(new CoroutineAdapterKt$asListenableFuture$1$1(completer, interfaceC3732io));
        return obj;
    }
}
