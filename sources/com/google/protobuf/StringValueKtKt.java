package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class StringValueKtKt {
    /* JADX INFO: renamed from: -initializestringValue, reason: not valid java name */
    public static final StringValue m44initializestringValue(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder builderNewBuilder = StringValue.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StringValue copy(StringValue stringValue, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(stringValue, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder builder = stringValue.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
