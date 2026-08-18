package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.umeng.analytics.pro.f;
import com.unity3d.services.core.device.Storage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidStorageManager implements StorageManager {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_INITIALIZED = "configuration.hasInitialized";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void addStorageLocation(com.unity3d.services.core.device.StorageManager.StorageType storageType, String str) {
        AbstractC2995aW.q(storageType, "type");
        AbstractC2995aW.q(str, "fileName");
        com.unity3d.services.core.device.StorageManager.addStorageLocation(storageType, str);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public Storage getStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        AbstractC2995aW.q(storageType, "type");
        Storage storage = com.unity3d.services.core.device.StorageManager.getStorage(storageType);
        AbstractC2995aW.p(storage, "getStorage(type)");
        return storage;
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void hasInitialized() {
        Storage storage = getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        storage.set(KEY_INITIALIZED, Boolean.TRUE);
        storage.writeStorage();
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean hasStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        AbstractC2995aW.q(storageType, "type");
        return com.unity3d.services.core.device.StorageManager.hasStorage(storageType);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public boolean init(Context context) {
        AbstractC2995aW.q(context, f.X);
        return com.unity3d.services.core.device.StorageManager.init(context);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void initStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        AbstractC2995aW.q(storageType, "type");
        com.unity3d.services.core.device.StorageManager.initStorage(storageType);
    }

    @Override // com.unity3d.ads.core.data.manager.StorageManager
    public void removeStorage(com.unity3d.services.core.device.StorageManager.StorageType storageType) {
        AbstractC2995aW.q(storageType, "type");
        com.unity3d.services.core.device.StorageManager.removeStorage(storageType);
    }
}
