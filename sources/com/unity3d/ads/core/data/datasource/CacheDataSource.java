package com.unity3d.ads.core.data.datasource;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public interface CacheDataSource {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                num = Integer.MAX_VALUE;
            }
            return cacheDataSource.getFile(file, str, str3, num, interfaceC2857Wj);
        }
    }

    Object getFile(File file, String str, String str2, Integer num, InterfaceC2857Wj interfaceC2857Wj);
}
