package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class ScarTimeHackFixer {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public ScarTimeHackFixer(SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final int invoke(int i) {
        if (i >= 1000) {
            return i;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_scar_video_length_in_sec", null, null, null, null, 30, null);
        return i * 1000;
    }
}
