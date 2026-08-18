package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationRequestKt {
    public static final InitializationRequestKt INSTANCE = new InitializationRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationRequestOuterClass.InitializationRequest.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ InitializationRequestOuterClass.InitializationRequest _build() {
            InitializationRequestOuterClass.InitializationRequest initializationRequestBuild = this._builder.build();
            AbstractC2995aW.p(initializationRequestBuild, "_builder.build()");
            return initializationRequestBuild;
        }

        public final void clearAnalyticsUserId() {
            this._builder.clearAnalyticsUserId();
        }

        public final void clearAuid() {
            this._builder.clearAuid();
        }

        public final void clearAuidString() {
            this._builder.clearAuidString();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearClientInfo() {
            this._builder.clearClientInfo();
        }

        public final void clearDeviceInfo() {
            this._builder.clearDeviceInfo();
        }

        public final void clearIdfi() {
            this._builder.clearIdfi();
        }

        public final void clearIsFirstInit() {
            this._builder.clearIsFirstInit();
        }

        public final void clearLegacyFlowUserConsent() {
            this._builder.clearLegacyFlowUserConsent();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearSessionId() {
            this._builder.clearSessionId();
        }

        public final String getAnalyticsUserId() {
            String analyticsUserId = this._builder.getAnalyticsUserId();
            AbstractC2995aW.p(analyticsUserId, "_builder.getAnalyticsUserId()");
            return analyticsUserId;
        }

        public final ByteString getAuid() {
            ByteString auid = this._builder.getAuid();
            AbstractC2995aW.p(auid, "_builder.getAuid()");
            return auid;
        }

        public final String getAuidString() {
            String auidString = this._builder.getAuidString();
            AbstractC2995aW.p(auidString, "_builder.getAuidString()");
            return auidString;
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            AbstractC2995aW.p(cache, "_builder.getCache()");
            return cache;
        }

        public final ClientInfoOuterClass.ClientInfo getClientInfo() {
            ClientInfoOuterClass.ClientInfo clientInfo = this._builder.getClientInfo();
            AbstractC2995aW.p(clientInfo, "_builder.getClientInfo()");
            return clientInfo;
        }

        public final InitializationRequestOuterClass.InitializationDeviceInfo getDeviceInfo() {
            InitializationRequestOuterClass.InitializationDeviceInfo deviceInfo = this._builder.getDeviceInfo();
            AbstractC2995aW.p(deviceInfo, "_builder.getDeviceInfo()");
            return deviceInfo;
        }

        public final String getIdfi() {
            String idfi = this._builder.getIdfi();
            AbstractC2995aW.p(idfi, "_builder.getIdfi()");
            return idfi;
        }

        public final boolean getIsFirstInit() {
            return this._builder.getIsFirstInit();
        }

        public final String getLegacyFlowUserConsent() {
            String legacyFlowUserConsent = this._builder.getLegacyFlowUserConsent();
            AbstractC2995aW.p(legacyFlowUserConsent, "_builder.getLegacyFlowUserConsent()");
            return legacyFlowUserConsent;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            AbstractC2995aW.p(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getSessionId() {
            ByteString sessionId = this._builder.getSessionId();
            AbstractC2995aW.p(sessionId, "_builder.getSessionId()");
            return sessionId;
        }

        public final boolean hasAnalyticsUserId() {
            return this._builder.hasAnalyticsUserId();
        }

        public final boolean hasAuid() {
            return this._builder.hasAuid();
        }

        public final boolean hasAuidString() {
            return this._builder.hasAuidString();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasClientInfo() {
            return this._builder.hasClientInfo();
        }

        public final boolean hasDeviceInfo() {
            return this._builder.hasDeviceInfo();
        }

        public final boolean hasLegacyFlowUserConsent() {
            return this._builder.hasLegacyFlowUserConsent();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final void setAnalyticsUserId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAnalyticsUserId(str);
        }

        public final void setAuid(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAuid(byteString);
        }

        public final void setAuidString(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAuidString(str);
        }

        public final void setCache(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCache(byteString);
        }

        public final void setClientInfo(ClientInfoOuterClass.ClientInfo clientInfo) {
            AbstractC2995aW.q(clientInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setClientInfo(clientInfo);
        }

        public final void setDeviceInfo(InitializationRequestOuterClass.InitializationDeviceInfo initializationDeviceInfo) {
            AbstractC2995aW.q(initializationDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDeviceInfo(initializationDeviceInfo);
        }

        public final void setIdfi(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setIdfi(str);
        }

        public final void setIsFirstInit(boolean z) {
            this._builder.setIsFirstInit(z);
        }

        public final void setLegacyFlowUserConsent(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setLegacyFlowUserConsent(str);
        }

        public final void setPrivacy(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPrivacy(byteString);
        }

        public final void setSessionId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSessionId(byteString);
        }

        private Dsl(InitializationRequestOuterClass.InitializationRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationRequestKt() {
    }
}
