package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class AdRequestKtKt {
    /* JADX INFO: renamed from: -initializeadRequest, reason: not valid java name */
    public static final AdRequestOuterClass.AdRequest m105initializeadRequest(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.Companion;
        AdRequestOuterClass.AdRequest.Builder builderNewBuilder = AdRequestOuterClass.AdRequest.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AdRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdRequestOuterClass.AdRequest copy(AdRequestOuterClass.AdRequest adRequest, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(adRequest, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdRequestKt.Dsl.Companion companion = AdRequestKt.Dsl.Companion;
        AdRequestOuterClass.AdRequest.Builder builder = adRequest.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        AdRequestKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdRequestOuterClass.BannerSize getBannerSizeOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        AbstractC2995aW.q(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasBannerSize()) {
            return adRequestOrBuilder.getBannerSize();
        }
        return null;
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        AbstractC2995aW.q(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasCampaignState()) {
            return adRequestOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        AbstractC2995aW.q(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasDynamicDeviceInfo()) {
            return adRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        AbstractC2995aW.q(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasSessionCounters()) {
            return adRequestOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(AdRequestOuterClass.AdRequestOrBuilder adRequestOrBuilder) {
        AbstractC2995aW.q(adRequestOrBuilder, "<this>");
        if (adRequestOrBuilder.hasStaticDeviceInfo()) {
            return adRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
