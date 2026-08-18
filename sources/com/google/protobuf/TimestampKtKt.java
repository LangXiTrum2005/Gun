package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampKtKt {
    /* JADX INFO: renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m46initializetimestamp(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builderNewBuilder = Timestamp.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Timestamp copy(Timestamp timestamp, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(timestamp, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builder = timestamp.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
