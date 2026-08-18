package com.unity3d.ads.datastore;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class ByteStringStoreKtKt {
    /* JADX INFO: renamed from: -initializebyteStringStore, reason: not valid java name */
    public static final ByteStringStoreOuterClass.ByteStringStore m78initializebyteStringStore(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder builderNewBuilder = ByteStringStoreOuterClass.ByteStringStore.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ByteStringStoreOuterClass.ByteStringStore copy(ByteStringStoreOuterClass.ByteStringStore byteStringStore, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(byteStringStore, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ByteStringStoreKt.Dsl.Companion companion = ByteStringStoreKt.Dsl.Companion;
        ByteStringStoreOuterClass.ByteStringStore.Builder builder = byteStringStore.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        ByteStringStoreKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
