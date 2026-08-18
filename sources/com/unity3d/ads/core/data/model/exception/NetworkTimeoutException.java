package com.unity3d.ads.core.data.model.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.data.model.OperationType;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkTimeoutException extends UnityAdsNetworkException {
    public /* synthetic */ NetworkTimeoutException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, (i & 2) != 0 ? OperationType.UNKNOWN : operationType, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num2, (i & 64) == 0 ? str4 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTimeoutException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4) {
        super(str, operationType, num, str2, str3, num2, str4);
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(operationType, "type");
    }
}
