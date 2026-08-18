package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class AnyKtKt {
    /* JADX INFO: renamed from: -initializeany, reason: not valid java name */
    public static final Any m25initializeany(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builderNewBuilder = Any.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Any copy(Any any, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(any, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builder = any.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
