package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class OptionKtKt {
    /* JADX INFO: renamed from: -initializeoption, reason: not valid java name */
    public static final Option m42initializeoption(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builderNewBuilder = Option.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Option copy(Option option, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(option, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builder = option.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Any getValueOrNull(OptionOrBuilder optionOrBuilder) {
        AbstractC2995aW.q(optionOrBuilder, "<this>");
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
