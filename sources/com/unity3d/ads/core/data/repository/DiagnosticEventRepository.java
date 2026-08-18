package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;

/* JADX INFO: loaded from: classes4.dex */
public interface DiagnosticEventRepository {
    void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent);

    void clear();

    void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration);

    void flush();

    InterfaceC4286p60 getDiagnosticEvents();
}
