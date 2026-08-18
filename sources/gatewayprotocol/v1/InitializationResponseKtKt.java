package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationResponseKtKt {
    /* JADX INFO: renamed from: -initializeinitializationResponse, reason: not valid java name */
    public static final InitializationResponseOuterClass.InitializationResponse m130initializeinitializationResponse(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.Companion;
        InitializationResponseOuterClass.InitializationResponse.Builder builderNewBuilder = InitializationResponseOuterClass.InitializationResponse.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        InitializationResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationResponseOuterClass.InitializationResponse copy(InitializationResponseOuterClass.InitializationResponse initializationResponse, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(initializationResponse, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        InitializationResponseKt.Dsl.Companion companion = InitializationResponseKt.Dsl.Companion;
        InitializationResponseOuterClass.InitializationResponse.Builder builder = initializationResponse.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        InitializationResponseKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        AbstractC2995aW.q(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasError()) {
            return initializationResponseOrBuilder.getError();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.NativeConfiguration getNativeConfigurationOrNull(InitializationResponseOuterClass.InitializationResponseOrBuilder initializationResponseOrBuilder) {
        AbstractC2995aW.q(initializationResponseOrBuilder, "<this>");
        if (initializationResponseOrBuilder.hasNativeConfiguration()) {
            return initializationResponseOrBuilder.getNativeConfiguration();
        }
        return null;
    }
}
