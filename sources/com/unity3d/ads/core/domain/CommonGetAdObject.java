package com.unity3d.ads.core.domain;

import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.repository.AdRepository;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetAdObject implements GetAdObject {
    private final AdRepository adRepository;

    public CommonGetAdObject(AdRepository adRepository) {
        AbstractC2995aW.q(adRepository, "adRepository");
        this.adRepository = adRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdObject
    public Object invoke(String str, InterfaceC2857Wj interfaceC2857Wj) {
        return this.adRepository.getAd(ByteStringsKt.toByteStringUtf8(str), interfaceC2857Wj);
    }
}
