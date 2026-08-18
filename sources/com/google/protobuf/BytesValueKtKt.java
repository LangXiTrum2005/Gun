package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class BytesValueKtKt {
    /* JADX INFO: renamed from: -initializebytesValue, reason: not valid java name */
    public static final BytesValue m28initializebytesValue(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BytesValue copy(BytesValue bytesValue, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(bytesValue, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builder = bytesValue.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
