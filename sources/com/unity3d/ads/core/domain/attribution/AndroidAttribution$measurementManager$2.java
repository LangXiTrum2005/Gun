package com.unity3d.ads.core.domain.attribution;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidAttribution$measurementManager$2 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ Context $context;
    final /* synthetic */ AndroidAttribution this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAttribution$measurementManager$2(AndroidAttribution androidAttribution, Context context) {
        super(0);
        this.this$0 = androidAttribution;
        this.$context = context;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final MeasurementManager invoke() {
        return this.this$0.getMeasurementManager(this.$context);
    }
}
