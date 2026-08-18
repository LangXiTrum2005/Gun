package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestPolicyKtKt {
    /* JADX INFO: renamed from: -initializerequestPolicy, reason: not valid java name */
    public static final NativeConfigurationOuterClass.RequestPolicy m141initializerequestPolicy(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder builderNewBuilder = NativeConfigurationOuterClass.RequestPolicy.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.RequestPolicy copy(NativeConfigurationOuterClass.RequestPolicy requestPolicy, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(requestPolicy, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        RequestPolicyKt.Dsl.Companion companion = RequestPolicyKt.Dsl.Companion;
        NativeConfigurationOuterClass.RequestPolicy.Builder builder = requestPolicy.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        RequestPolicyKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicyOrNull(NativeConfigurationOuterClass.RequestPolicyOrBuilder requestPolicyOrBuilder) {
        AbstractC2995aW.q(requestPolicyOrBuilder, "<this>");
        if (requestPolicyOrBuilder.hasRetryPolicy()) {
            return requestPolicyOrBuilder.getRetryPolicy();
        }
        return null;
    }

    public static final NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicyOrNull(NativeConfigurationOuterClass.RequestPolicyOrBuilder requestPolicyOrBuilder) {
        AbstractC2995aW.q(requestPolicyOrBuilder, "<this>");
        if (requestPolicyOrBuilder.hasTimeoutPolicy()) {
            return requestPolicyOrBuilder.getTimeoutPolicy();
        }
        return null;
    }
}
