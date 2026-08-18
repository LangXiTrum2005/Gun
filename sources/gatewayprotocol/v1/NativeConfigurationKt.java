package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class NativeConfigurationKt {
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfigurationBuild = this._builder.build();
            AbstractC2995aW.p(nativeConfigurationBuild, "_builder.build()");
            return nativeConfigurationBuild;
        }

        public final /* synthetic */ void addAdditionalStorePackages(DslList dslList, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addAdditionalStorePackages(str);
        }

        public final /* synthetic */ void addAllAdditionalStorePackages(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllAdditionalStorePackages(iterable);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            AbstractC2995aW.p(adOperations, "_builder.getAdOperations()");
            return adOperations;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            AbstractC2995aW.p(adPolicy, "_builder.getAdPolicy()");
            return adPolicy;
        }

        public final DslList<String, AdditionalStorePackagesProxy> getAdditionalStorePackages() {
            List<String> additionalStorePackagesList = this._builder.getAdditionalStorePackagesList();
            AbstractC2995aW.p(additionalStorePackagesList, "_builder.getAdditionalStorePackagesList()");
            return new DslList<>(additionalStorePackagesList);
        }

        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            AbstractC2995aW.p(diagnosticEvents, "_builder.getDiagnosticEvents()");
            return diagnosticEvents;
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            AbstractC2995aW.p(featureFlags, "_builder.getFeatureFlags()");
            return featureFlags;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            AbstractC2995aW.p(initPolicy, "_builder.getInitPolicy()");
            return initPolicy;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            AbstractC2995aW.p(operativeEventPolicy, "_builder.getOperativeEventPolicy()");
            return operativeEventPolicy;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            AbstractC2995aW.p(otherPolicy, "_builder.getOtherPolicy()");
            return otherPolicy;
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addAdditionalStorePackages(dslList, str);
        }

        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, Iterable<String> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllAdditionalStorePackages(dslList, iterable);
        }

        public final void setAdOperations(NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            AbstractC2995aW.q(adOperationsConfiguration, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdOperations(adOperationsConfiguration);
        }

        public final void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            AbstractC2995aW.q(requestPolicy, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdPolicy(requestPolicy);
        }

        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdditionalStorePackages(i, str);
        }

        public final void setDiagnosticEvents(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            AbstractC2995aW.q(diagnosticEventsConfiguration, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDiagnosticEvents(diagnosticEventsConfiguration);
        }

        public final void setEnableIapEvent(boolean z) {
            this._builder.setEnableIapEvent(z);
        }

        public final void setEnableOm(boolean z) {
            this._builder.setEnableOm(z);
        }

        public final void setFeatureFlags(NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            AbstractC2995aW.q(featureFlags, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setFeatureFlags(featureFlags);
        }

        public final void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            AbstractC2995aW.q(requestPolicy, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setInitPolicy(requestPolicy);
        }

        public final void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            AbstractC2995aW.q(requestPolicy, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOperativeEventPolicy(requestPolicy);
        }

        public final void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            AbstractC2995aW.q(requestPolicy, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOtherPolicy(requestPolicy);
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }
    }

    private NativeConfigurationKt() {
    }
}
