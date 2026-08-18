package com.unity3d.ads.core.domain;

import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    private final GetGameId getGameId;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(GetGameId getGameId, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(getGameId, "getGameId");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String str, Map<String, String> map, boolean z) {
        if (z) {
            InitializeEventsMetricSender.getInstance().sendMetric(new Metric(str, map, null, 4, null));
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, null, map, null, null, 26, null);
        }
    }

    @Override // com.unity3d.ads.core.domain.CheckForGameIdAndTestModeChanges
    public void invoke(boolean z) {
        String strInvoke = this.getGameId.invoke();
        if (strInvoke == null) {
            strInvoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        Map<String, String> mapU0 = U5.u0(new C4839vT("previous_game_id", previousGameId), new C4839vT("game_id", strInvoke));
        if (AbstractC2995aW.i(previousGameId, "null")) {
            return;
        }
        if (AbstractC2995aW.i(strInvoke, previousGameId)) {
            sendDiagnostic("native_initialize_game_id_same", mapU0, z);
        } else {
            sendDiagnostic("native_initialize_game_id_changed", mapU0, z);
        }
        boolean zIsTestMode = SdkProperties.isTestMode();
        boolean previousTestMode = SdkProperties.getPreviousTestMode();
        Map<String, String> mapU1 = U5.u0(new C4839vT("previous_test_mode", String.valueOf(previousTestMode)), new C4839vT("test_mode", String.valueOf(zIsTestMode)));
        if (zIsTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", mapU1, z);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", mapU1, z);
        }
    }
}
