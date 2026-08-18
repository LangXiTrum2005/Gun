package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class SessionCountersKtKt {
    /* JADX INFO: renamed from: -initializesessionCounters, reason: not valid java name */
    public static final SessionCountersOuterClass.SessionCounters m144initializesessionCounters(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder builderNewBuilder = SessionCountersOuterClass.SessionCounters.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        SessionCountersKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters copy(SessionCountersOuterClass.SessionCounters sessionCounters, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(sessionCounters, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder builder = sessionCounters.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        SessionCountersKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
