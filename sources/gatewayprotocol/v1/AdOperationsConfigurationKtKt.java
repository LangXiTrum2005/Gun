package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class AdOperationsConfigurationKtKt {
    /* JADX INFO: renamed from: -initializeadOperationsConfiguration, reason: not valid java name */
    public static final NativeConfigurationOuterClass.AdOperationsConfiguration m102initializeadOperationsConfiguration(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builderNewBuilder = NativeConfigurationOuterClass.AdOperationsConfiguration.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.AdOperationsConfiguration copy(NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(adOperationsConfiguration, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdOperationsConfigurationKt.Dsl.Companion companion = AdOperationsConfigurationKt.Dsl.Companion;
        NativeConfigurationOuterClass.AdOperationsConfiguration.Builder builder = adOperationsConfiguration.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        AdOperationsConfigurationKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
