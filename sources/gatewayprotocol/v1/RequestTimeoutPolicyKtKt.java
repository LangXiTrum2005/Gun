package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestTimeoutPolicyKtKt {
    /* JADX INFO: renamed from: -initializerequestTimeoutPolicy, reason: not valid java name */
    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy m143initializerequestTimeoutPolicy(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestTimeoutPolicy.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy copy(NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(requestTimeoutPolicy, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        RequestTimeoutPolicyKt.Dsl.Companion companion = RequestTimeoutPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder = requestTimeoutPolicy.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        RequestTimeoutPolicyKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
