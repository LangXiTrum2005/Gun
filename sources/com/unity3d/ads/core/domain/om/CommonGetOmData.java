package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetOmData implements GetOmData {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(OpenMeasurementRepository openMeasurementRepository) {
        AbstractC2995aW.q(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.GetOmData
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        return this.openMeasurementRepository.getOmData();
    }
}
