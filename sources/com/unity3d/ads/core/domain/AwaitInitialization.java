package com.unity3d.ads.core.domain;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public interface AwaitInitialization {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(AwaitInitialization awaitInitialization, long j, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                j = Long.MAX_VALUE;
            }
            return awaitInitialization.invoke(j, interfaceC2857Wj);
        }
    }

    Object invoke(long j, InterfaceC2857Wj interfaceC2857Wj);
}
