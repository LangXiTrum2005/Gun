package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class PlacementKtKt {
    /* JADX INFO: renamed from: -initializeplacement, reason: not valid java name */
    public static final InitializationResponseOuterClass.Placement m138initializeplacement(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builderNewBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationResponseOuterClass.Placement copy(InitializationResponseOuterClass.Placement placement, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(placement, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder builder = placement.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        PlacementKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
