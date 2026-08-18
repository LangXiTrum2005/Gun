package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationResponseKt {
    public static final InitializationResponseKt INSTANCE = new InitializationResponseKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.InitializationResponse.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class ScarEligibleFormatsProxy extends DslProxy {
            private ScarEligibleFormatsProxy() {
            }
        }

        public static final class ScarPlacementsProxy extends DslProxy {
            private ScarPlacementsProxy() {
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.InitializationResponse _build() {
            InitializationResponseOuterClass.InitializationResponse initializationResponseBuild = this._builder.build();
            AbstractC2995aW.p(initializationResponseBuild, "_builder.build()");
            return initializationResponseBuild;
        }

        public final /* synthetic */ void addAllScarEligibleFormats(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllScarEligibleFormats(iterable);
        }

        public final /* synthetic */ void addScarEligibleFormats(DslList dslList, InitializationResponseOuterClass.AdFormat adFormat) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(adFormat, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addScarEligibleFormats(adFormat);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        public final /* synthetic */ void clearScarEligibleFormats(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearScarEligibleFormats();
        }

        public final /* synthetic */ void clearScarPlacements(DslMap dslMap) {
            AbstractC2995aW.q(dslMap, "<this>");
            this._builder.clearScarPlacements();
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            AbstractC2995aW.p(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return InitializationResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this._builder.getNativeConfiguration();
            AbstractC2995aW.p(nativeConfiguration, "_builder.getNativeConfiguration()");
            return nativeConfiguration;
        }

        public final /* synthetic */ DslList getScarEligibleFormats() {
            List<InitializationResponseOuterClass.AdFormat> scarEligibleFormatsList = this._builder.getScarEligibleFormatsList();
            AbstractC2995aW.p(scarEligibleFormatsList, "_builder.getScarEligibleFormatsList()");
            return new DslList(scarEligibleFormatsList);
        }

        public final /* synthetic */ DslMap getScarPlacementsMap() {
            Map<String, InitializationResponseOuterClass.Placement> scarPlacementsMap = this._builder.getScarPlacementsMap();
            AbstractC2995aW.p(scarPlacementsMap, "_builder.getScarPlacementsMap()");
            return new DslMap(scarPlacementsMap);
        }

        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        public final String getUniversalRequestUrl() {
            String universalRequestUrl = this._builder.getUniversalRequestUrl();
            AbstractC2995aW.p(universalRequestUrl, "_builder.getUniversalRequestUrl()");
            return universalRequestUrl;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
        }

        public final /* synthetic */ void plusAssignAllScarEligibleFormats(DslList<InitializationResponseOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, Iterable<? extends InitializationResponseOuterClass.AdFormat> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllScarEligibleFormats(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignScarEligibleFormats(DslList<InitializationResponseOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, InitializationResponseOuterClass.AdFormat adFormat) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(adFormat, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addScarEligibleFormats(dslList, adFormat);
        }

        public final /* synthetic */ void putAllScarPlacements(DslMap dslMap, Map map) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(map, "map");
            this._builder.putAllScarPlacements(map);
        }

        public final void putScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String str, InitializationResponseOuterClass.Placement placement) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            AbstractC2995aW.q(placement, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.putScarPlacements(str, placement);
        }

        public final /* synthetic */ void removeScarPlacements(DslMap dslMap, String str) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            this._builder.removeScarPlacements(str);
        }

        public final void setCountOfLastShownCampaigns(int i) {
            this._builder.setCountOfLastShownCampaigns(i);
        }

        public final void setError(ErrorOuterClass.Error error) {
            AbstractC2995aW.q(error, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setError(error);
        }

        public final void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            AbstractC2995aW.q(nativeConfiguration, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setNativeConfiguration(nativeConfiguration);
        }

        public final /* synthetic */ void setScarEligibleFormats(DslList dslList, int i, InitializationResponseOuterClass.AdFormat adFormat) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(adFormat, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setScarEligibleFormats(i, adFormat);
        }

        public final /* synthetic */ void setScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String str, InitializationResponseOuterClass.Placement placement) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            AbstractC2995aW.q(placement, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            putScarPlacements(dslMap, str, placement);
        }

        public final void setTriggerInitializationCompletedRequest(boolean z) {
            this._builder.setTriggerInitializationCompletedRequest(z);
        }

        public final void setUniversalRequestUrl(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setUniversalRequestUrl(str);
        }

        private Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationResponseKt() {
    }
}
