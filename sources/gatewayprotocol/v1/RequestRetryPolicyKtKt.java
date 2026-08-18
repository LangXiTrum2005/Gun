package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestRetryPolicyKtKt {
    /* JADX INFO: renamed from: -initializerequestRetryPolicy, reason: not valid java name */
    public static final NativeConfigurationOuterClass.RequestRetryPolicy m142initializerequestRetryPolicy(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestRetryPolicy.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.RequestRetryPolicy copy(NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(requestRetryPolicy, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        RequestRetryPolicyKt.Dsl.Companion companion = RequestRetryPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder = requestRetryPolicy.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        RequestRetryPolicyKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
