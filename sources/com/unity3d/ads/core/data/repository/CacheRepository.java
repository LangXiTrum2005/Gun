package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public interface CacheRepository {

    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, String str2, JSONArray jSONArray, int i, InterfaceC2857Wj interfaceC2857Wj, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i2 & 4) != 0) {
                jSONArray = null;
            }
            return cacheRepository.getFile(str, str2, jSONArray, (i2 & 8) != 0 ? 0 : i, interfaceC2857Wj);
        }
    }

    Object clearCache(InterfaceC2857Wj interfaceC2857Wj);

    Object doesFileExist(String str, InterfaceC2857Wj interfaceC2857Wj);

    Object getCacheSize(InterfaceC2857Wj interfaceC2857Wj);

    Object getFile(String str, String str2, JSONArray jSONArray, int i, InterfaceC2857Wj interfaceC2857Wj);

    boolean removeFile(CachedFile cachedFile);

    CacheResult retrieveFile(String str);
}
