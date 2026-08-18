package androidx.activity.contextaware;

import android.content.Context;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc;

/* JADX INFO: loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC2772Tc $co;
    final /* synthetic */ InterfaceC2766Sw $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC2772Tc interfaceC2772Tc, InterfaceC2766Sw interfaceC2766Sw) {
        this.$co = interfaceC2772Tc;
        this.$onContextAvailable = interfaceC2766Sw;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objV;
        AbstractC2995aW.q(context, f.X);
        InterfaceC2772Tc interfaceC2772Tc = this.$co;
        try {
            objV = this.$onContextAvailable.invoke(context);
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        interfaceC2772Tc.resumeWith(objV);
    }
}
