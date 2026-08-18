package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public interface PrivacyDeviceInfoDataSource {

    public static final class DefaultImpls {
        public static /* synthetic */ PiiOuterClass.Pii fetch$default(PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, AllowedPiiOuterClass.AllowedPii allowedPii, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i & 1) != 0) {
                allowedPii = AllowedPiiOuterClass.AllowedPii.getDefaultInstance();
                AbstractC2995aW.p(allowedPii, "getDefaultInstance()");
            }
            return privacyDeviceInfoDataSource.fetch(allowedPii);
        }
    }

    PiiOuterClass.Pii fetch(AllowedPiiOuterClass.AllowedPii allowedPii);
}
