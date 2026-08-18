package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class DoubleValueKtKt {
    /* JADX INFO: renamed from: -initializedoubleValue, reason: not valid java name */
    public static final DoubleValue m29initializedoubleValue(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        DoubleValue.Builder builderNewBuilder = DoubleValue.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DoubleValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DoubleValue copy(DoubleValue doubleValue, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(doubleValue, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        DoubleValue.Builder builder = doubleValue.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        DoubleValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
