package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class FloatValueKtKt {
    /* JADX INFO: renamed from: -initializefloatValue, reason: not valid java name */
    public static final FloatValue m36initializefloatValue(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builderNewBuilder = FloatValue.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        FloatValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FloatValue copy(FloatValue floatValue, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(floatValue, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builder = floatValue.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        FloatValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
