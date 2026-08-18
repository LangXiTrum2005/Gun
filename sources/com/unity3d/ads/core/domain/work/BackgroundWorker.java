package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class BackgroundWorker {
    private final WorkManager workManager;

    public BackgroundWorker(Context context) {
        AbstractC2995aW.q(context, "applicationContext");
        WorkManager workManager = WorkManager.getInstance(context);
        AbstractC2995aW.p(workManager, "getInstance(applicationContext)");
        this.workManager = workManager;
    }

    public final WorkManager getWorkManager() {
        return this.workManager;
    }

    public final <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        AbstractC2995aW.q(universalRequestWorkerData, "universalRequestWorkerData");
        AbstractC2995aW.p(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build(), "Builder()\n            .s…TED)\n            .build()");
        AbstractC2995aW.w0();
        throw null;
    }
}
