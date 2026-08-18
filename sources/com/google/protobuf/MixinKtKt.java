package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class MixinKtKt {
    /* JADX INFO: renamed from: -initializemixin, reason: not valid java name */
    public static final Mixin m41initializemixin(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builderNewBuilder = Mixin.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Mixin copy(Mixin mixin, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(mixin, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builder = mixin.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
