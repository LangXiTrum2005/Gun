package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class LimitedSessionTokenKt {
    public static final LimitedSessionTokenKt INSTANCE = new LimitedSessionTokenKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestOuterClass.LimitedSessionToken.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.LimitedSessionToken _build() {
            UniversalRequestOuterClass.LimitedSessionToken limitedSessionTokenBuild = this._builder.build();
            AbstractC2995aW.p(limitedSessionTokenBuild, "_builder.build()");
            return limitedSessionTokenBuild;
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearDeviceMake() {
            this._builder.clearDeviceMake();
        }

        public final void clearDeviceModel() {
            this._builder.clearDeviceModel();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOsVersion() {
            this._builder.clearOsVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            AbstractC2995aW.p(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        public final String getDeviceMake() {
            String deviceMake = this._builder.getDeviceMake();
            AbstractC2995aW.p(deviceMake, "_builder.getDeviceMake()");
            return deviceMake;
        }

        public final String getDeviceModel() {
            String deviceModel = this._builder.getDeviceModel();
            AbstractC2995aW.p(deviceModel, "_builder.getDeviceModel()");
            return deviceModel;
        }

        public final String getGameId() {
            String gameId = this._builder.getGameId();
            AbstractC2995aW.p(gameId, "_builder.getGameId()");
            return gameId;
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            AbstractC2995aW.p(idfi, "_builder.getIdfi()");
            return idfi;
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

        public final String getOsVersion() {
            String osVersion = this._builder.getOsVersion();
            AbstractC2995aW.p(osVersion, "_builder.getOsVersion()");
            return osVersion;
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            AbstractC2995aW.p(platform, "_builder.getPlatform()");
            return platform;
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            AbstractC2995aW.p(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            AbstractC2995aW.p(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasSessionId() {
            return this._builder.hasSessionId();
        }

        public final void setCustomMediationName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCustomMediationName(str);
        }

        public final void setDeviceMake(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDeviceMake(str);
        }

        public final void setDeviceModel(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDeviceModel(str);
        }

        public final void setGameId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setGameId(str);
        }

        public final void setIdfi(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setIdfi(str);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            AbstractC2995aW.q(mediationProvider, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setMediationProvider(mediationProvider);
        }

        public final void setMediationVersion(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setMediationVersion(str);
        }

        public final void setOsVersion(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOsVersion(str);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform platform) {
            AbstractC2995aW.q(platform, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPlatform(platform);
        }

        public final void setSdkVersion(int i) {
            this._builder.setSdkVersion(i);
        }

        public final void setSdkVersionName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSdkVersionName(str);
        }

        public final void setSessionId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSessionId(byteString);
        }

        private Dsl(UniversalRequestOuterClass.LimitedSessionToken.Builder builder) {
            this._builder = builder;
        }
    }

    private LimitedSessionTokenKt() {
    }
}
