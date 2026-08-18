package com.unity3d.ads.core.domain.privacy;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.services.core.misc.JsonFlattenerRules;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;

/* JADX INFO: loaded from: classes4.dex */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    @Override // com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(AbstractC2340Cl.L("privacy", "unity", "pipl"), AbstractC2340Cl.J(AppMeasurementSdk.ConditionalUserProperty.VALUE), AbstractC2340Cl.L("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
