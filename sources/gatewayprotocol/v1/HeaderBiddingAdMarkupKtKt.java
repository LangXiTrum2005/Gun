package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class HeaderBiddingAdMarkupKtKt {
    /* JADX INFO: renamed from: -initializeheaderBiddingAdMarkup, reason: not valid java name */
    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup m124initializeheaderBiddingAdMarkup(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.Companion;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builderNewBuilder = HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        HeaderBiddingAdMarkupKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup copy(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(headerBiddingAdMarkup, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        HeaderBiddingAdMarkupKt.Dsl.Companion companion = HeaderBiddingAdMarkupKt.Dsl.Companion;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder = headerBiddingAdMarkup.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        HeaderBiddingAdMarkupKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
