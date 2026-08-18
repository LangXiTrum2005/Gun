package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class EmptyKtKt {
    /* JADX INFO: renamed from: -initializeempty, reason: not valid java name */
    public static final Empty m31initializeempty(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builderNewBuilder = Empty.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Empty copy(Empty empty, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(empty, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builder = empty.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
