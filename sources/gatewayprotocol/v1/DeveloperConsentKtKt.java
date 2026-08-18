package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class DeveloperConsentKtKt {
    /* JADX INFO: renamed from: -initializedeveloperConsent, reason: not valid java name */
    public static final DeveloperConsentOuterClass.DeveloperConsent m112initializedeveloperConsent(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builderNewBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsent copy(DeveloperConsentOuterClass.DeveloperConsent developerConsent, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(developerConsent, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder builder = developerConsent.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        DeveloperConsentKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
