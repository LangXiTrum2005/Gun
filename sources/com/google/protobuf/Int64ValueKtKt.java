package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class Int64ValueKtKt {
    /* JADX INFO: renamed from: -initializeint64Value, reason: not valid java name */
    public static final Int64Value m38initializeint64Value(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder builderNewBuilder = Int64Value.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        Int64ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Int64Value copy(Int64Value int64Value, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(int64Value, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder builder = int64Value.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        Int64ValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
