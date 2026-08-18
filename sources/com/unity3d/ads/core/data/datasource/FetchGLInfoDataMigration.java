package com.unity3d.ads.core.data.datasource;

import androidx.datastore.core.DataMigration;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.domain.GetOpenGLRendererInfo;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class FetchGLInfoDataMigration implements DataMigration<ByteStringStoreOuterClass.ByteStringStore> {
    private final GetOpenGLRendererInfo getOpenGLRendererInfo;

    public FetchGLInfoDataMigration(GetOpenGLRendererInfo getOpenGLRendererInfo) {
        AbstractC2995aW.q(getOpenGLRendererInfo, "getOpenGLRendererInfo");
        this.getOpenGLRendererInfo = getOpenGLRendererInfo;
    }

    private final ByteString gatherOpenGLRendererInfo() {
        return this.getOpenGLRendererInfo.invoke();
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(InterfaceC2857Wj interfaceC2857Wj) {
        return C5033xf0.f5238a;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, InterfaceC2857Wj interfaceC2857Wj) {
        ByteString byteStringGatherOpenGLRendererInfo;
        try {
            byteStringGatherOpenGLRendererInfo = gatherOpenGLRendererInfo();
        } catch (Exception unused) {
            byteStringGatherOpenGLRendererInfo = ByteString.EMPTY;
            AbstractC2995aW.p(byteStringGatherOpenGLRendererInfo, "{\n            ByteString.EMPTY\n        }");
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(byteStringGatherOpenGLRendererInfo).build();
        AbstractC2995aW.p(byteStringStoreBuild, "newBuilder()\n           …rer)\n            .build()");
        return byteStringStoreBuild;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, InterfaceC2857Wj interfaceC2857Wj) {
        return Boolean.valueOf(byteStringStore.getData().isEmpty());
    }
}
