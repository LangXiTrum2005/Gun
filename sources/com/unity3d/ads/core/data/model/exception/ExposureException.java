package com.unity3d.ads.core.data.model.exception;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class ExposureException extends Exception {
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(String str, Object[] objArr) {
        super(str);
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(objArr, "parameters");
        this.parameters = objArr;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
