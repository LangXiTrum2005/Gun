package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;

/* JADX INFO: loaded from: classes4.dex */
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {
    private final InterfaceC3069bH getOperativeRequestPolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(workerParameters, "workerParams");
        this.getOperativeRequestPolicy$delegate = AbstractC2340Cl.H(EnumC4124nH.c, new OperativeEventJob$special$$inlined$inject$default$1(this, ServiceProvider.NAMED_OPERATIVE_REQ));
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    public Object doWork(InterfaceC2857Wj interfaceC2857Wj) {
        setRequestPolicy(getGetOperativeRequestPolicy().invoke());
        return super.doWork(interfaceC2857Wj);
    }
}
