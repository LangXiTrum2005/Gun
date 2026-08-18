package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class LimitedSessionTokenKtKt {
    /* JADX INFO: renamed from: -initializelimitedSessionToken, reason: not valid java name */
    public static final UniversalRequestOuterClass.LimitedSessionToken m131initializelimitedSessionToken(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builderNewBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        LimitedSessionTokenKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken copy(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(limitedSessionToken, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builder = limitedSessionToken.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        LimitedSessionTokenKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
