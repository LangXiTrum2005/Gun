package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class TokenCountersKtKt {
    /* JADX INFO: renamed from: -initializetokenCounters, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.TokenCounters m150initializetokenCounters(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters copy(HeaderBiddingTokenOuterClass.TokenCounters tokenCounters, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(tokenCounters, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builder = tokenCounters.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        TokenCountersKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
