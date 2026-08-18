package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationRequestKtKt {
    /* JADX INFO: renamed from: -initializeinitializationRequest, reason: not valid java name */
    public static final InitializationRequestOuterClass.InitializationRequest m129initializeinitializationRequest(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationRequest.Builder builderNewBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        InitializationRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest copy(InitializationRequestOuterClass.InitializationRequest initializationRequest, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(initializationRequest, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
        InitializationRequestOuterClass.InitializationRequest.Builder builder = initializationRequest.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        InitializationRequestKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo getClientInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        AbstractC2995aW.q(initializationRequestOrBuilder, "<this>");
        if (initializationRequestOrBuilder.hasClientInfo()) {
            return initializationRequestOrBuilder.getClientInfo();
        }
        return null;
    }

    public static final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfoOrNull(InitializationRequestOuterClass.InitializationRequestOrBuilder initializationRequestOrBuilder) {
        AbstractC2995aW.q(initializationRequestOrBuilder, "<this>");
        if (initializationRequestOrBuilder.hasDeviceInfo()) {
            return initializationRequestOrBuilder.getDeviceInfo();
        }
        return null;
    }
}
