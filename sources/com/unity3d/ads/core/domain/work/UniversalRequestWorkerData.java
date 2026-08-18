package com.unity3d.ads.core.domain.work;

import androidx.work.Data;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class UniversalRequestWorkerData {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_UNIVERSAL_REQUEST_ID = "universalRequestId";
    private final String universalRequestId;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    public UniversalRequestWorkerData(String str) {
        AbstractC2995aW.q(str, KEY_UNIVERSAL_REQUEST_ID);
        this.universalRequestId = str;
    }

    public final Data invoke() throws Throwable {
        Data dataBuild = new Data.Builder().putString(KEY_UNIVERSAL_REQUEST_ID, this.universalRequestId).build();
        AbstractC2995aW.p(dataBuild, "Builder()\n            .p…tId)\n            .build()");
        return dataBuild;
    }
}
