package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class UInt64ValueKtKt {
    /* JADX INFO: renamed from: -initializeuInt64Value, reason: not valid java name */
    public static final UInt64Value m49initializeuInt64Value(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder builderNewBuilder = UInt64Value.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        UInt64ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UInt64Value copy(UInt64Value uInt64Value, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(uInt64Value, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        UInt64ValueKt.Dsl.Companion companion = UInt64ValueKt.Dsl.Companion;
        UInt64Value.Builder builder = uInt64Value.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        UInt64ValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
