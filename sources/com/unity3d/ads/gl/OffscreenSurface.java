package com.unity3d.ads.gl;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class OffscreenSurface extends EglSurfaceBase {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffscreenSurface(EglCore eglCore, int i, int i2) {
        super(eglCore);
        AbstractC2995aW.q(eglCore, "eglCore");
        createOffscreenSurface(i, i2);
    }

    public final void release() {
        releaseEglSurface();
    }
}
