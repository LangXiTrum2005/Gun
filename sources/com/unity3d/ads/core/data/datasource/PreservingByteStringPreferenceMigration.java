package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import androidx.datastore.core.DataMigration;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class PreservingByteStringPreferenceMigration implements DataMigration<ByteStringStoreOuterClass.ByteStringStore> {
    private final Context context;
    private final GetByteStringData getByteStringData;
    private final String key;
    private final String name;

    public PreservingByteStringPreferenceMigration(Context context, String str, String str2, GetByteStringData getByteStringData) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(str, "name");
        AbstractC2995aW.q(str2, "key");
        AbstractC2995aW.q(getByteStringData, "getByteStringData");
        this.context = context;
        this.name = str;
        this.key = str2;
        this.getByteStringData = getByteStringData;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object cleanUp(InterfaceC2857Wj interfaceC2857Wj) {
        return C5033xf0.f5238a;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object migrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, InterfaceC2857Wj interfaceC2857Wj) {
        String string;
        if (!byteStringStore.getData().isEmpty() || (string = this.context.getSharedPreferences(this.name, 0).getString(this.key, null)) == null || string.length() == 0) {
            return byteStringStore;
        }
        ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = ByteStringStoreOuterClass.ByteStringStore.newBuilder().setData(this.getByteStringData.invoke(string)).build();
        AbstractC2995aW.p(byteStringStoreBuild, "newBuilder()\n           …                 .build()");
        return byteStringStoreBuild;
    }

    @Override // androidx.datastore.core.DataMigration
    public Object shouldMigrate(ByteStringStoreOuterClass.ByteStringStore byteStringStore, InterfaceC2857Wj interfaceC2857Wj) {
        return Boolean.valueOf(byteStringStore.getData().isEmpty());
    }
}
