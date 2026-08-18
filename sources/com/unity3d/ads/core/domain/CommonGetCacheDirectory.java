package com.unity3d.ads.core.domain;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetCacheDirectory implements GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    public File invoke(File file, String str) {
        AbstractC2995aW.q(file, "cacheDirectoryBase");
        AbstractC2995aW.q(str, "cacheDirectoryPath");
        return new File(file, str);
    }
}
