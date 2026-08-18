package com.unity3d.services.core.di;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class IServiceComponentKt {

    /* JADX INFO: renamed from: com.unity3d.services.core.di.IServiceComponentKt$inject$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ String $named;
        final /* synthetic */ IServiceComponent $this_inject;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IServiceComponent iServiceComponent, String str) {
            super(0);
            this.$this_inject = iServiceComponent;
            this.$named = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final T invoke() {
            this.$this_inject.getServiceProvider().getRegistry();
            AbstractC2995aW.w0();
            throw null;
        }
    }

    public static final <T> T get(IServiceComponent iServiceComponent, String str) {
        AbstractC2995aW.q(iServiceComponent, "<this>");
        AbstractC2995aW.q(str, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        AbstractC2995aW.w0();
        throw null;
    }

    public static Object get$default(IServiceComponent iServiceComponent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        AbstractC2995aW.q(iServiceComponent, "<this>");
        AbstractC2995aW.q(str, "named");
        iServiceComponent.getServiceProvider().getRegistry();
        AbstractC2995aW.w0();
        throw null;
    }

    public static final <T> InterfaceC3069bH inject(IServiceComponent iServiceComponent, String str, EnumC4124nH enumC4124nH) {
        AbstractC2995aW.q(iServiceComponent, "<this>");
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(enumC4124nH, "mode");
        AbstractC2995aW.w0();
        throw null;
    }

    public static InterfaceC3069bH inject$default(IServiceComponent iServiceComponent, String str, EnumC4124nH enumC4124nH, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            enumC4124nH = EnumC4124nH.c;
        }
        AbstractC2995aW.q(iServiceComponent, "<this>");
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(enumC4124nH, "mode");
        AbstractC2995aW.w0();
        throw null;
    }
}
