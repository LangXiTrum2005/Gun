package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidTestDataInfo implements GetTestDataInfo {
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    public AndroidTestDataInfo(AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        AbstractC2995aW.q(androidManifestIntPropertyReader, "androidManifestIntPropertyReader");
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    @Override // com.unity3d.ads.core.domain.GetTestDataInfo
    public TestDataOuterClass.TestData invoke() {
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder builderNewBuilder = TestDataOuterClass.TestData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        TestDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName("ExchangeTestMode");
        if (propertyByName != null) {
            dsl_create.setForceExchangeTestMode(propertyByName.intValue());
        }
        return dsl_create._build();
    }
}
