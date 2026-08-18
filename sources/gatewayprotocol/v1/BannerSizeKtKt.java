package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerSizeKtKt {
    /* JADX INFO: renamed from: -initializebannerSize, reason: not valid java name */
    public static final AdRequestOuterClass.BannerSize m108initializebannerSize(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder builderNewBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        BannerSizeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdRequestOuterClass.BannerSize copy(AdRequestOuterClass.BannerSize bannerSize, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(bannerSize, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder builder = bannerSize.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        BannerSizeKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
