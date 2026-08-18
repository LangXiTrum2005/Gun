package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class UInt32ValueKtKt {
    /* JADX INFO: renamed from: -initializeuInt32Value, reason: not valid java name */
    public static final UInt32Value m48initializeuInt32Value(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder builderNewBuilder = UInt32Value.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        UInt32ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UInt32Value copy(UInt32Value uInt32Value, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(uInt32Value, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        UInt32ValueKt.Dsl.Companion companion = UInt32ValueKt.Dsl.Companion;
        UInt32Value.Builder builder = uInt32Value.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        UInt32ValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
