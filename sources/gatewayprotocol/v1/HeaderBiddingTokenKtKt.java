package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class HeaderBiddingTokenKtKt {
    /* JADX INFO: renamed from: -initializeheaderBiddingToken, reason: not valid java name */
    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken m125initializeheaderBiddingToken(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final HeaderBiddingTokenOuterClass.HeaderBiddingToken copy(HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(headerBiddingToken, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        HeaderBiddingTokenKt.Dsl.Companion companion = HeaderBiddingTokenKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builder = headerBiddingToken.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        HeaderBiddingTokenKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final CampaignStateOuterClass.CampaignState getCampaignStateOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasCampaignState()) {
            return headerBiddingTokenOrBuilder.getCampaignState();
        }
        return null;
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasClientInfo()) {
            return headerBiddingTokenOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasDynamicDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final InitializationDataOuterClass.InitializationData getInitializationDataOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasInitializationData()) {
            return headerBiddingTokenOrBuilder.getInitializationData();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasLimitedSessionToken()) {
            return headerBiddingTokenOrBuilder.getLimitedSessionToken();
        }
        return null;
    }

    public static final PiiOuterClass.Pii getPiiOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasPii()) {
            return headerBiddingTokenOrBuilder.getPii();
        }
        return null;
    }

    public static final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasSessionCounters()) {
            return headerBiddingTokenOrBuilder.getSessionCounters();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasStaticDeviceInfo()) {
            return headerBiddingTokenOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }

    public static final TestDataOuterClass.TestData getTestDataOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTestData()) {
            return headerBiddingTokenOrBuilder.getTestData();
        }
        return null;
    }

    public static final TimestampsOuterClass.Timestamps getTimestampsOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTimestamps()) {
            return headerBiddingTokenOrBuilder.getTimestamps();
        }
        return null;
    }

    public static final HeaderBiddingTokenOuterClass.TokenCounters getTokenCountersOrNull(HeaderBiddingTokenOuterClass.HeaderBiddingTokenOrBuilder headerBiddingTokenOrBuilder) {
        AbstractC2995aW.q(headerBiddingTokenOrBuilder, "<this>");
        if (headerBiddingTokenOrBuilder.hasTokenCounters()) {
            return headerBiddingTokenOrBuilder.getTokenCounters();
        }
        return null;
    }
}
