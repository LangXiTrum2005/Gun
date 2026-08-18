package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDataRefreshResponseKtKt {
    /* JADX INFO: renamed from: -initializeadDataRefreshResponse, reason: not valid java name */
    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse m101initializeadDataRefreshResponse(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.Companion;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builderNewBuilder = AdDataRefreshResponseOuterClass.AdDataRefreshResponse.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AdDataRefreshResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdDataRefreshResponseOuterClass.AdDataRefreshResponse copy(AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(adDataRefreshResponse, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdDataRefreshResponseKt.Dsl.Companion companion = AdDataRefreshResponseKt.Dsl.Companion;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse.Builder builder = adDataRefreshResponse.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        AdDataRefreshResponseKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdDataRefreshResponseOuterClass.AdDataRefreshResponseOrBuilder adDataRefreshResponseOrBuilder) {
        AbstractC2995aW.q(adDataRefreshResponseOrBuilder, "<this>");
        if (adDataRefreshResponseOrBuilder.hasError()) {
            return adDataRefreshResponseOrBuilder.getError();
        }
        return null;
    }
}
