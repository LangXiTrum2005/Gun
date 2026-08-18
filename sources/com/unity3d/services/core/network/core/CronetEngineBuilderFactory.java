package com.unity3d.services.core.network.core;

import android.content.Context;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes4.dex */
public final class CronetEngineBuilderFactory {
    public final CronetEngine.Builder createCronetEngineBuilder(Context context) {
        AbstractC2995aW.q(context, f.X);
        return new CronetEngine.Builder(context);
    }
}
