package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class ErrorKtKt {
    /* JADX INFO: renamed from: -initializeerror, reason: not valid java name */
    public static final ErrorOuterClass.Error m121initializeerror(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builderNewBuilder = ErrorOuterClass.Error.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error copy(ErrorOuterClass.Error error, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(error, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder builder = error.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        ErrorKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
