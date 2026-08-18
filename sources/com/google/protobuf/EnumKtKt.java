package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class EnumKtKt {
    /* JADX INFO: renamed from: -initializeenum, reason: not valid java name */
    public static final Enum m32initializeenum(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builderNewBuilder = Enum.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Enum copy(Enum r2, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(r2, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builder = r2.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(EnumOrBuilder enumOrBuilder) {
        AbstractC2995aW.q(enumOrBuilder, "<this>");
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
