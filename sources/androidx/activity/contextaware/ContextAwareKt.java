package androidx.activity.contextaware;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC2766Sw.invoke(contextPeekAvailableContext);
        }
        C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c2798Uc, interfaceC2766Sw);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c2798Uc.n(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        return c2798Uc.s();
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return interfaceC2766Sw.invoke(contextPeekAvailableContext);
        }
        C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(c2798Uc, interfaceC2766Sw);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        c2798Uc.n(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        return c2798Uc.s();
    }
}
