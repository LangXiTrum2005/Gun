package com.unity3d.services.core.di;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class UnityAdsModule$publicApiJob$1$1 extends WG implements InterfaceC2766Sw {
    final /* synthetic */ DiagnosticEventRepository $diagnosticEventRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$publicApiJob$1$1(DiagnosticEventRepository diagnosticEventRepository) {
        super(1);
        this.$diagnosticEventRepository = diagnosticEventRepository;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return C5033xf0.f5238a;
    }

    public final void invoke(Throwable th) {
        this.$diagnosticEventRepository.flush();
    }
}
