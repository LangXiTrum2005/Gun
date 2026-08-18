package com.unity3d.ads.core.data.model.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class LoadException extends Exception {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadException(int i, String str) {
        super(str);
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
