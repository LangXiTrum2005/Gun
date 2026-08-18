package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class ClientInfoKt {
    public static final ClientInfoKt INSTANCE = new ClientInfoKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ClientInfoOuterClass.ClientInfo.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(ClientInfoOuterClass.ClientInfo.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(ClientInfoOuterClass.ClientInfo.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ ClientInfoOuterClass.ClientInfo _build() {
            ClientInfoOuterClass.ClientInfo clientInfoBuild = this._builder.build();
            AbstractC2995aW.p(clientInfoBuild, "_builder.build()");
            return clientInfoBuild;
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOmidPartnerVersion() {
            this._builder.clearOmidPartnerVersion();
        }

        public final void clearOmidVersion() {
            this._builder.clearOmidVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearScarVersionName() {
            this._builder.clearScarVersionName();
        }

        public final void clearSdkDevelopmentPlatform() {
            this._builder.clearSdkDevelopmentPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearTest() {
            this._builder.clearTest();
        }

        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            AbstractC2995aW.p(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        public final String getGameId() {
            String gameId = this._builder.getGameId();
            AbstractC2995aW.p(gameId, "_builder.getGameId()");
            return gameId;
        }

        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            AbstractC2995aW.p(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            AbstractC2995aW.p(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        public final String getOmidPartnerVersion() {
            String omidPartnerVersion = this._builder.getOmidPartnerVersion();
            AbstractC2995aW.p(omidPartnerVersion, "_builder.getOmidPartnerVersion()");
            return omidPartnerVersion;
        }

        public final String getOmidVersion() {
            String omidVersion = this._builder.getOmidVersion();
            AbstractC2995aW.p(omidVersion, "_builder.getOmidVersion()");
            return omidVersion;
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            AbstractC2995aW.p(platform, "_builder.getPlatform()");
            return platform;
        }

        public final String getScarVersionName() {
            String scarVersionName = this._builder.getScarVersionName();
            AbstractC2995aW.p(scarVersionName, "_builder.getScarVersionName()");
            return scarVersionName;
        }

        public final String getSdkDevelopmentPlatform() {
            String sdkDevelopmentPlatform = this._builder.getSdkDevelopmentPlatform();
            AbstractC2995aW.p(sdkDevelopmentPlatform, "_builder.getSdkDevelopmentPlatform()");
            return sdkDevelopmentPlatform;
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            AbstractC2995aW.p(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        public final boolean getTest() {
            return this._builder.getTest();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasOmidPartnerVersion() {
            return this._builder.hasOmidPartnerVersion();
        }

        public final boolean hasOmidVersion() {
            return this._builder.hasOmidVersion();
        }

        public final boolean hasScarVersionName() {
            return this._builder.hasScarVersionName();
        }

        public final boolean hasSdkDevelopmentPlatform() {
            return this._builder.hasSdkDevelopmentPlatform();
        }

        public final void setCustomMediationName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCustomMediationName(str);
        }

        public final void setGameId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setGameId(str);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            AbstractC2995aW.q(mediationProvider, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setMediationProvider(mediationProvider);
        }

        public final void setMediationVersion(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setMediationVersion(str);
        }

        public final void setOmidPartnerVersion(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOmidPartnerVersion(str);
        }

        public final void setOmidVersion(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOmidVersion(str);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform platform) {
            AbstractC2995aW.q(platform, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPlatform(platform);
        }

        public final void setScarVersionName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setScarVersionName(str);
        }

        public final void setSdkDevelopmentPlatform(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSdkDevelopmentPlatform(str);
        }

        public final void setSdkVersion(int i) {
            this._builder.setSdkVersion(i);
        }

        public final void setSdkVersionName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSdkVersionName(str);
        }

        public final void setTest(boolean z) {
            this._builder.setTest(z);
        }

        private Dsl(ClientInfoOuterClass.ClientInfo.Builder builder) {
            this._builder = builder;
        }
    }

    private ClientInfoKt() {
    }
}
