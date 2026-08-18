package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidDiagnosticEventRepository$flush$events$2 extends WG implements InterfaceC2766Sw {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$events$2(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(1);
        this.this$0 = androidDiagnosticEventRepository;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        return diagnosticEvent == null ? this.this$0.getDiagnosticEventRequest.invoke("null_diagnostic_event", null, null, null, null, null, null, null) : diagnosticEvent;
    }
}
