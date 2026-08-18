package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticTagKtKt {
    /* JADX INFO: renamed from: -initializediagnosticTag, reason: not valid java name */
    public static final DiagnosticEventRequestOuterClass.DiagnosticTag m117initializediagnosticTag(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builderNewBuilder = DiagnosticEventRequestOuterClass.DiagnosticTag.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DiagnosticTagKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DiagnosticEventRequestOuterClass.DiagnosticTag copy(DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTag, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(diagnosticTag, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DiagnosticTagKt.Dsl.Companion companion = DiagnosticTagKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder = diagnosticTag.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        DiagnosticTagKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
