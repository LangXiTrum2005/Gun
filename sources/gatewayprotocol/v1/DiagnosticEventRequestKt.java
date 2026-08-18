package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticEventRequestKt {
    public static final DiagnosticEventRequestKt INSTANCE = new DiagnosticEventRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder _builder;

        public static final class BatchProxy extends DslProxy {
            private BatchProxy() {
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticEventRequest _build() {
            DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequestBuild = this._builder.build();
            AbstractC2995aW.p(diagnosticEventRequestBuild, "_builder.build()");
            return diagnosticEventRequestBuild;
        }

        public final /* synthetic */ void addAllBatch(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllBatch(iterable);
        }

        public final /* synthetic */ void addBatch(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticEvent, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addBatch(diagnosticEvent);
        }

        public final /* synthetic */ void clearBatch(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearBatch();
        }

        public final /* synthetic */ DslList getBatch() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEvent> batchList = this._builder.getBatchList();
            AbstractC2995aW.p(batchList, "_builder.getBatchList()");
            return new DslList(batchList);
        }

        public final /* synthetic */ void plusAssignAllBatch(DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent, BatchProxy> dslList, Iterable<DiagnosticEventRequestOuterClass.DiagnosticEvent> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllBatch(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignBatch(DslList<DiagnosticEventRequestOuterClass.DiagnosticEvent, BatchProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticEvent, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addBatch(dslList, diagnosticEvent);
        }

        public final /* synthetic */ void setBatch(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticEvent, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setBatch(i, diagnosticEvent);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventRequestKt() {
    }
}
