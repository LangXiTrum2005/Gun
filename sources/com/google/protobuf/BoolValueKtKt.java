package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class BoolValueKtKt {
    /* JADX INFO: renamed from: -initializeboolValue, reason: not valid java name */
    public static final BoolValue m27initializeboolValue(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builderNewBuilder = BoolValue.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        BoolValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BoolValue copy(BoolValue boolValue, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(boolValue, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builder = boolValue.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        BoolValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
