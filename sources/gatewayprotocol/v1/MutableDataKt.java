package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class MutableDataKt {
    public static final MutableDataKt INSTANCE = new MutableDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final MutableDataOuterClass.MutableData.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(MutableDataOuterClass.MutableData.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(MutableDataOuterClass.MutableData.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ MutableDataOuterClass.MutableData _build() {
            MutableDataOuterClass.MutableData mutableDataBuild = this._builder.build();
            AbstractC2995aW.p(mutableDataBuild, "_builder.build()");
            return mutableDataBuild;
        }

        public final void clearAllowedPii() {
            this._builder.clearAllowedPii();
        }

        public final void clearCache() {
            this._builder.clearCache();
        }

        public final void clearCurrentState() {
            this._builder.clearCurrentState();
        }

        public final void clearPrivacy() {
            this._builder.clearPrivacy();
        }

        public final void clearPrivacyFsm() {
            this._builder.clearPrivacyFsm();
        }

        public final void clearSessionCounters() {
            this._builder.clearSessionCounters();
        }

        public final void clearSessionToken() {
            this._builder.clearSessionToken();
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPii() {
            AllowedPiiOuterClass.AllowedPii allowedPii = this._builder.getAllowedPii();
            AbstractC2995aW.p(allowedPii, "_builder.getAllowedPii()");
            return allowedPii;
        }

        public final AllowedPiiOuterClass.AllowedPii getAllowedPiiOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return MutableDataKtKt.getAllowedPiiOrNull(dsl._builder);
        }

        public final ByteString getCache() {
            ByteString cache = this._builder.getCache();
            AbstractC2995aW.p(cache, "_builder.getCache()");
            return cache;
        }

        public final ByteString getCurrentState() {
            ByteString currentState = this._builder.getCurrentState();
            AbstractC2995aW.p(currentState, "_builder.getCurrentState()");
            return currentState;
        }

        public final ByteString getPrivacy() {
            ByteString privacy = this._builder.getPrivacy();
            AbstractC2995aW.p(privacy, "_builder.getPrivacy()");
            return privacy;
        }

        public final ByteString getPrivacyFsm() {
            ByteString privacyFsm = this._builder.getPrivacyFsm();
            AbstractC2995aW.p(privacyFsm, "_builder.getPrivacyFsm()");
            return privacyFsm;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCounters() {
            SessionCountersOuterClass.SessionCounters sessionCounters = this._builder.getSessionCounters();
            AbstractC2995aW.p(sessionCounters, "_builder.getSessionCounters()");
            return sessionCounters;
        }

        public final SessionCountersOuterClass.SessionCounters getSessionCountersOrNull(Dsl dsl) {
            AbstractC2995aW.q(dsl, "<this>");
            return MutableDataKtKt.getSessionCountersOrNull(dsl._builder);
        }

        public final ByteString getSessionToken() {
            ByteString sessionToken = this._builder.getSessionToken();
            AbstractC2995aW.p(sessionToken, "_builder.getSessionToken()");
            return sessionToken;
        }

        public final boolean hasAllowedPii() {
            return this._builder.hasAllowedPii();
        }

        public final boolean hasCache() {
            return this._builder.hasCache();
        }

        public final boolean hasCurrentState() {
            return this._builder.hasCurrentState();
        }

        public final boolean hasPrivacy() {
            return this._builder.hasPrivacy();
        }

        public final boolean hasPrivacyFsm() {
            return this._builder.hasPrivacyFsm();
        }

        public final boolean hasSessionCounters() {
            return this._builder.hasSessionCounters();
        }

        public final boolean hasSessionToken() {
            return this._builder.hasSessionToken();
        }

        public final void setAllowedPii(AllowedPiiOuterClass.AllowedPii allowedPii) {
            AbstractC2995aW.q(allowedPii, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAllowedPii(allowedPii);
        }

        public final void setCache(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCache(byteString);
        }

        public final void setCurrentState(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCurrentState(byteString);
        }

        public final void setPrivacy(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPrivacy(byteString);
        }

        public final void setPrivacyFsm(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPrivacyFsm(byteString);
        }

        public final void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
            AbstractC2995aW.q(sessionCounters, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSessionCounters(sessionCounters);
        }

        public final void setSessionToken(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSessionToken(byteString);
        }

        private Dsl(MutableDataOuterClass.MutableData.Builder builder) {
            this._builder = builder;
        }
    }

    private MutableDataKt() {
    }
}
