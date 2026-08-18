package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class SourceContextKtKt {
    /* JADX INFO: renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m43initializesourceContext(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builderNewBuilder = SourceContext.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext copy(SourceContext sourceContext, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(sourceContext, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builder = sourceContext.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
