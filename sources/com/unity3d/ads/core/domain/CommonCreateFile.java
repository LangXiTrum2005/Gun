package com.unity3d.ads.core.domain;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonCreateFile implements CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(File file, String str) {
        AbstractC2995aW.q(file, "parent");
        AbstractC2995aW.q(str, "child");
        return new File(file, str);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    public File invoke(String str) {
        AbstractC2995aW.q(str, "pathname");
        return new File(str);
    }
}
