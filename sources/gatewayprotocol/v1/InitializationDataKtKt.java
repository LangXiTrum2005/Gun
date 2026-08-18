package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationDataKtKt {
    /* JADX INFO: renamed from: -initializeinitializationData, reason: not valid java name */
    public static final InitializationDataOuterClass.InitializationData m127initializeinitializationData(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.Companion;
        InitializationDataOuterClass.InitializationData.Builder builderNewBuilder = InitializationDataOuterClass.InitializationData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        InitializationDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationDataOuterClass.InitializationData copy(InitializationDataOuterClass.InitializationData initializationData, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(initializationData, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.Companion;
        InitializationDataOuterClass.InitializationData.Builder builder = initializationData.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        InitializationDataKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        AbstractC2995aW.q(initializationDataOrBuilder, "<this>");
        if (initializationDataOrBuilder.hasInitializationRequest()) {
            return initializationDataOrBuilder.getInitializationRequest();
        }
        return null;
    }

    public static final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(InitializationDataOuterClass.InitializationDataOrBuilder initializationDataOrBuilder) {
        AbstractC2995aW.q(initializationDataOrBuilder, "<this>");
        if (initializationDataOrBuilder.hasSharedData()) {
            return initializationDataOrBuilder.getSharedData();
        }
        return null;
    }
}
