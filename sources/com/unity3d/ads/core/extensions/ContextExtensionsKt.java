package com.unity3d.ads.core.extensions;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class ContextExtensionsKt {
    public static final File unityAdsDataStoreFile(Context context, String str) {
        AbstractC2995aW.q(context, "<this>");
        AbstractC2995aW.q(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), UnityAdsConstants.Cache.DATASTORE_PATH.concat(str));
    }
}
