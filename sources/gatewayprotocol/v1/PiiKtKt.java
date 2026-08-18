package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class PiiKtKt {
    /* JADX INFO: renamed from: -initializepii, reason: not valid java name */
    public static final PiiOuterClass.Pii m137initializepii(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builderNewBuilder = PiiOuterClass.Pii.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        PiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final PiiOuterClass.Pii copy(PiiOuterClass.Pii pii, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(pii, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builder = pii.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        PiiKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
