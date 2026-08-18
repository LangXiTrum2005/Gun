package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.core.device.Storage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLegacyConfigStoreDataSource implements ByteStringDataSource {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_CONFIGURATION_STORE = "configuration.store";
    private final StorageManager storageManager;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    public AndroidLegacyConfigStoreDataSource(StorageManager storageManager) {
        AbstractC2995aW.q(storageManager, "storageManager");
        this.storageManager = storageManager;
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object get(InterfaceC2857Wj interfaceC2857Wj) {
        Object objV;
        Object obj = this.storageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE).get(KEY_CONFIGURATION_STORE);
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            try {
                objV = ProtobufExtensionsKt.fromBase64(str, true);
            } catch (Throwable th) {
                objV = AbstractC3375el.v(th);
            }
        } else {
            objV = null;
        }
        ByteString byteString = (ByteString) (objV instanceof HZ ? null : objV);
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (byteString == null) {
            byteString = ByteString.EMPTY;
            AbstractC2995aW.p(byteString, "EMPTY");
        }
        dsl_create.setData(byteString);
        return dsl_create._build();
    }

    @Override // com.unity3d.ads.core.data.datasource.ByteStringDataSource
    public Object set(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        Storage storage = this.storageManager.getStorage(com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE);
        storage.set(KEY_CONFIGURATION_STORE, ProtobufExtensionsKt.toBase64(byteString, true));
        storage.writeStorage();
        return C5033xf0.f5238a;
    }
}
