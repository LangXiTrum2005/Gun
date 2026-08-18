package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticEventsConfigurationKt {
    public static final DiagnosticEventsConfigurationKt INSTANCE = new DiagnosticEventsConfigurationKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder _builder;

        public static final class AllowedEventsProxy extends DslProxy {
            private AllowedEventsProxy() {
            }
        }

        public static final class BlockedEventsProxy extends DslProxy {
            private BlockedEventsProxy() {
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.DiagnosticEventsConfiguration _build() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfigurationBuild = this._builder.build();
            AbstractC2995aW.p(diagnosticEventsConfigurationBuild, "_builder.build()");
            return diagnosticEventsConfigurationBuild;
        }

        public final /* synthetic */ void addAllAllowedEvents(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllAllowedEvents(iterable);
        }

        public final /* synthetic */ void addAllBlockedEvents(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllBlockedEvents(iterable);
        }

        public final /* synthetic */ void addAllowedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticEventType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addAllowedEvents(diagnosticEventType);
        }

        public final /* synthetic */ void addBlockedEvents(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticEventType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addBlockedEvents(diagnosticEventType);
        }

        public final /* synthetic */ void clearAllowedEvents(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearAllowedEvents();
        }

        public final /* synthetic */ void clearBlockedEvents(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearBlockedEvents();
        }

        public final void clearEnabled() {
            this._builder.clearEnabled();
        }

        public final void clearMaxBatchIntervalMs() {
            this._builder.clearMaxBatchIntervalMs();
        }

        public final void clearMaxBatchSize() {
            this._builder.clearMaxBatchSize();
        }

        public final void clearSeverity() {
            this._builder.clearSeverity();
        }

        public final void clearTtmEnabled() {
            this._builder.clearTtmEnabled();
        }

        public final /* synthetic */ DslList getAllowedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = this._builder.getAllowedEventsList();
            AbstractC2995aW.p(allowedEventsList, "_builder.getAllowedEventsList()");
            return new DslList(allowedEventsList);
        }

        public final /* synthetic */ DslList getBlockedEvents() {
            List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = this._builder.getBlockedEventsList();
            AbstractC2995aW.p(blockedEventsList, "_builder.getBlockedEventsList()");
            return new DslList(blockedEventsList);
        }

        public final boolean getEnabled() {
            return this._builder.getEnabled();
        }

        public final int getMaxBatchIntervalMs() {
            return this._builder.getMaxBatchIntervalMs();
        }

        public final int getMaxBatchSize() {
            return this._builder.getMaxBatchSize();
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity getSeverity() {
            DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity severity = this._builder.getSeverity();
            AbstractC2995aW.p(severity, "_builder.getSeverity()");
            return severity;
        }

        public final boolean getTtmEnabled() {
            return this._builder.getTtmEnabled();
        }

        public final /* synthetic */ void plusAssignAllAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllAllowedEvents(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticEventType> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllBlockedEvents(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllowedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, AllowedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticEventType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addAllowedEvents(dslList, diagnosticEventType);
        }

        public final /* synthetic */ void plusAssignBlockedEvents(DslList<DiagnosticEventRequestOuterClass.DiagnosticEventType, BlockedEventsProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticEventType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addBlockedEvents(dslList, diagnosticEventType);
        }

        public final /* synthetic */ void setAllowedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticEventType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAllowedEvents(i, diagnosticEventType);
        }

        public final /* synthetic */ void setBlockedEvents(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventType) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticEventType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setBlockedEvents(i, diagnosticEventType);
        }

        public final void setEnabled(boolean z) {
            this._builder.setEnabled(z);
        }

        public final void setMaxBatchIntervalMs(int i) {
            this._builder.setMaxBatchIntervalMs(i);
        }

        public final void setMaxBatchSize(int i) {
            this._builder.setMaxBatchSize(i);
        }

        public final void setSeverity(DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity diagnosticEventsSeverity) {
            AbstractC2995aW.q(diagnosticEventsSeverity, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSeverity(diagnosticEventsSeverity);
        }

        public final void setTtmEnabled(boolean z) {
            this._builder.setTtmEnabled(z);
        }

        private Dsl(NativeConfigurationOuterClass.DiagnosticEventsConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticEventsConfigurationKt() {
    }
}
