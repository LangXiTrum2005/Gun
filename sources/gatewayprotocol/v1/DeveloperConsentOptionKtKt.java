package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class DeveloperConsentOptionKtKt {
    /* JADX INFO: renamed from: -initializedeveloperConsentOption, reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsentOption m113initializedeveloperConsentOption(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsentOption copy(DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(developerConsentOption, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder = developerConsentOption.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        DeveloperConsentOptionKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
