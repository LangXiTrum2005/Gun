package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeKtKt {
    /* JADX INFO: renamed from: -initializetype, reason: not valid java name */
    public static final Type m47initializetype(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builderNewBuilder = Type.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        TypeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Type copy(Type type, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(type, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builder = type.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        TypeKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(TypeOrBuilder typeOrBuilder) {
        AbstractC2995aW.q(typeOrBuilder, "<this>");
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
