package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class AdPlayerConfigRequestKtKt {
    /* JADX INFO: renamed from: -initializeadPlayerConfigRequest, reason: not valid java name */
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest m103initializeadPlayerConfigRequest(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.Companion;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builderNewBuilder = AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AdPlayerConfigRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest copy(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(adPlayerConfigRequest, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.Companion;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder builder = adPlayerConfigRequest.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        AdPlayerConfigRequestKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
