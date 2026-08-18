package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class MethodKtKt {
    /* JADX INFO: renamed from: -initializemethod, reason: not valid java name */
    public static final Method m40initializemethod(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builderNewBuilder = Method.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Method copy(Method method, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(method, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builder = method.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
