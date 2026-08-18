package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class OperativeEventErrorDataKtKt {
    /* JADX INFO: renamed from: -initializeoperativeEventErrorData, reason: not valid java name */
    public static final OperativeEventRequestOuterClass.OperativeEventErrorData m135initializeoperativeEventErrorData(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final OperativeEventRequestOuterClass.OperativeEventErrorData copy(OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(operativeEventErrorData, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder = operativeEventErrorData.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
