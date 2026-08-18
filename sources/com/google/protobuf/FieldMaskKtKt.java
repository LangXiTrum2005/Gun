package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldMaskKtKt {
    /* JADX INFO: renamed from: -initializefieldMask, reason: not valid java name */
    public static final FieldMask m35initializefieldMask(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder builderNewBuilder = FieldMask.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        FieldMaskKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FieldMask copy(FieldMask fieldMask, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(fieldMask, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder builder = fieldMask.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        FieldMaskKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
