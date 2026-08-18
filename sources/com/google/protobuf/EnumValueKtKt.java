package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class EnumValueKtKt {
    /* JADX INFO: renamed from: -initializeenumValue, reason: not valid java name */
    public static final EnumValue m33initializeenumValue(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builderNewBuilder = EnumValue.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnumValue copy(EnumValue enumValue, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(enumValue, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builder = enumValue.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
