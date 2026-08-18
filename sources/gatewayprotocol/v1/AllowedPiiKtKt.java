package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class AllowedPiiKtKt {
    /* JADX INFO: renamed from: -initializeallowedPii, reason: not valid java name */
    public static final AllowedPiiOuterClass.AllowedPii m107initializeallowedPii(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builderNewBuilder = AllowedPiiOuterClass.AllowedPii.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AllowedPiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii copy(AllowedPiiOuterClass.AllowedPii allowedPii, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(allowedPii, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder builder = allowedPii.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        AllowedPiiKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
