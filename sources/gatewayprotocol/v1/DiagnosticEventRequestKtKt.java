package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticEventRequestKtKt {
    /* JADX INFO: renamed from: -initializediagnosticEventRequest, reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest m115initializediagnosticEventRequest(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticEventRequest.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DiagnosticEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticEventRequest copy(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(diagnosticEventRequest, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DiagnosticEventRequestKt.Dsl.Companion companion = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder = diagnosticEventRequest.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        DiagnosticEventRequestKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
