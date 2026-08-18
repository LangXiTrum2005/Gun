package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class Int32ValueKtKt {
    /* JADX INFO: renamed from: -initializeint32Value, reason: not valid java name */
    public static final Int32Value m37initializeint32Value(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        Int32Value.Builder builderNewBuilder = Int32Value.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        Int32ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Int32Value copy(Int32Value int32Value, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(int32Value, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        Int32Value.Builder builder = int32Value.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        Int32ValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
