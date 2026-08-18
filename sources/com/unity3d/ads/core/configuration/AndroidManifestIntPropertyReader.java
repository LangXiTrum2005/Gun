package com.unity3d.ads.core.configuration;

import android.content.Context;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        AbstractC2995aW.q(context, f.X);
        this.context = context;
    }

    public final Integer getPropertyByName(String str) {
        AbstractC2995aW.q(str, "propertyName");
        try {
            return Integer.valueOf(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData.getInt(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
