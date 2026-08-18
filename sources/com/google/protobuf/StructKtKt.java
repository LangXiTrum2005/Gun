package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class StructKtKt {
    /* JADX INFO: renamed from: -initializestruct, reason: not valid java name */
    public static final Struct m45initializestruct(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        StructKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Struct copy(Struct struct, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(struct, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builder = struct.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        StructKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
