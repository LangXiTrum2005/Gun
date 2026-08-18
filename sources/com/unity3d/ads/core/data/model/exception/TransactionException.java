package com.unity3d.ads.core.data.model.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionException(String str) {
        super(str);
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
    }
}
