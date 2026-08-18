package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class ValueKtKt {
    /* JADX INFO: renamed from: -initializevalue, reason: not valid java name */
    public static final Value m50initializevalue(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builderNewBuilder = Value.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Value copy(Value value, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(value, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builder = value.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ListValue getListValueOrNull(ValueOrBuilder valueOrBuilder) {
        AbstractC2995aW.q(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }

    public static final Struct getStructValueOrNull(ValueOrBuilder valueOrBuilder) {
        AbstractC2995aW.q(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }
}
