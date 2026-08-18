package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.log.DeviceLog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4008m;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3987lk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4075mk;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends AbstractC4008m implements InterfaceC4075mk {
    final /* synthetic */ List $metrics$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(C3987lk c3987lk, List list) {
        super(c3987lk);
        this.$metrics$inlined = list;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4075mk
    public void handleException(InterfaceC3549gk interfaceC3549gk, Throwable th) {
        DeviceLog.debug("Metric " + this.$metrics$inlined + " failed to send with error: " + th);
    }
}
