package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class ListValueKtKt {
    /* JADX INFO: renamed from: -initializelistValue, reason: not valid java name */
    public static final ListValue m39initializelistValue(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        ListValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ListValue copy(ListValue listValue, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(listValue, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builder = listValue.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        ListValueKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
