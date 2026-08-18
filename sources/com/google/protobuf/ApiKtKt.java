package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiKtKt {
    /* JADX INFO: renamed from: -initializeapi, reason: not valid java name */
    public static final Api m26initializeapi(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builderNewBuilder = Api.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Api copy(Api api, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(api, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builder = api.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(ApiOrBuilder apiOrBuilder) {
        AbstractC2995aW.q(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
