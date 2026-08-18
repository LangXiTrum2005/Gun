package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import com.unity3d.ads.core.domain.CreateFile;
import com.unity3d.ads.core.domain.GetFileExtensionFromUrl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    private final CreateFile createFile;
    private final GetFileExtensionFromUrl getFileExtensionFromUrl;

    public AndroidLocalCacheDataSource(CreateFile createFile, GetFileExtensionFromUrl getFileExtensionFromUrl) {
        AbstractC2995aW.q(createFile, "createFile");
        AbstractC2995aW.q(getFileExtensionFromUrl, "getFileExtensionFromUrl");
        this.createFile = createFile;
        this.getFileExtensionFromUrl = getFileExtensionFromUrl;
    }

    public final CreateFile getCreateFile() {
        return this.createFile;
    }

    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, InterfaceC2857Wj interfaceC2857Wj) {
        File fileInvoke = this.createFile.invoke(file, str);
        if (!fileInvoke.exists()) {
            return new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
        }
        String strInvoke = (str2 == null || str2.length() == 0) ? null : this.getFileExtensionFromUrl.invoke(str2);
        return new CacheResult.Success(new CachedFile("", str2 == null ? "" : str2, str, fileInvoke, strInvoke == null ? "" : strInvoke, fileInvoke.length(), null, num != null ? num.intValue() : Integer.MAX_VALUE, 64, null), CacheSource.LOCAL);
    }

    public final GetFileExtensionFromUrl getGetFileExtensionFromUrl() {
        return this.getFileExtensionFromUrl;
    }
}
