package com.unity3d.ads.core.domain.work;

import com.google.protobuf.kotlin.DslList;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.DiagnosticEventKt;
import gatewayprotocol.v1.DiagnosticEventRequestKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticEventRequestWorkModifier {
    private final LifecycleDataSource lifecycleDataSource;
    private final SessionRepository sessionRepository;

    public DiagnosticEventRequestWorkModifier(SessionRepository sessionRepository, LifecycleDataSource lifecycleDataSource) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(lifecycleDataSource, "lifecycleDataSource");
        this.sessionRepository = sessionRepository;
        this.lifecycleDataSource = lifecycleDataSource;
    }

    public final UniversalRequestOuterClass.UniversalRequest invoke(UniversalRequestOuterClass.UniversalRequest universalRequest) {
        AbstractC2995aW.q(universalRequest, "universalRequest");
        UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Builder builder = universalRequest.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        UniversalRequestKt.Dsl dsl_create = companion._create(builder);
        UniversalRequestOuterClass.UniversalRequest.Payload payload = dsl_create.getPayload();
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder2 = payload.toBuilder();
        AbstractC2995aW.p(builder2, "this.toBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builder2);
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = dsl_create2.getDiagnosticEventRequest();
        DiagnosticEventRequestKt.Dsl.Companion companion3 = DiagnosticEventRequestKt.Dsl.Companion;
        DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder3 = diagnosticEventRequest.toBuilder();
        AbstractC2995aW.p(builder3, "this.toBuilder()");
        DiagnosticEventRequestKt.Dsl dsl_create3 = companion3._create(builder3);
        DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent> batch = dsl_create3.getBatch();
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, batch));
        for (DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent : batch) {
            DiagnosticEventKt.Dsl.Companion companion4 = DiagnosticEventKt.Dsl.Companion;
            DiagnosticEventRequestOuterClass.DiagnosticEvent.Builder builder4 = diagnosticEvent.toBuilder();
            AbstractC2995aW.p(builder4, "this.toBuilder()");
            DiagnosticEventKt.Dsl dsl_create4 = companion4._create(builder4);
            dsl_create4.putStringTags(dsl_create4.getStringTagsMap(), "same_session", String.valueOf(AbstractC2995aW.i(universalRequest.getSharedData().getSessionToken(), this.sessionRepository.getSessionToken())));
            dsl_create4.putStringTags(dsl_create4.getStringTagsMap(), "app_active", String.valueOf(this.lifecycleDataSource.appIsForeground()));
            arrayList.add(dsl_create4._build());
        }
        dsl_create3.clearBatch(dsl_create3.getBatch());
        dsl_create3.addAllBatch(dsl_create3.getBatch(), arrayList);
        dsl_create2.setDiagnosticEventRequest(dsl_create3._build());
        dsl_create.setPayload(dsl_create2._build());
        return dsl_create._build();
    }
}
