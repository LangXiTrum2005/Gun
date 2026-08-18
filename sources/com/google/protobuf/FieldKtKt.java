package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldKtKt {
    /* JADX INFO: renamed from: -initializefield, reason: not valid java name */
    public static final Field m34initializefield(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builderNewBuilder = Field.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Field copy(Field field, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(field, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builder = field.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
