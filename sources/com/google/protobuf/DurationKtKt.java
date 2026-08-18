package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class DurationKtKt {
    /* JADX INFO: renamed from: -initializeduration, reason: not valid java name */
    public static final Duration m30initializeduration(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builderNewBuilder = Duration.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Duration copy(Duration duration, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(duration, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builder = duration.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        DurationKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
