package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class TestDataKt {
    public static final TestDataKt INSTANCE = new TestDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TestDataOuterClass.TestData.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(TestDataOuterClass.TestData.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(TestDataOuterClass.TestData.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ TestDataOuterClass.TestData _build() {
            TestDataOuterClass.TestData testDataBuild = this._builder.build();
            AbstractC2995aW.p(testDataBuild, "_builder.build()");
            return testDataBuild;
        }

        public final void clearForceCampaignId() {
            this._builder.clearForceCampaignId();
        }

        public final void clearForceCountry() {
            this._builder.clearForceCountry();
        }

        public final void clearForceCountrySubdivision() {
            this._builder.clearForceCountrySubdivision();
        }

        public final void clearForceExchangeTestMode() {
            this._builder.clearForceExchangeTestMode();
        }

        public final String getForceCampaignId() {
            String forceCampaignId = this._builder.getForceCampaignId();
            AbstractC2995aW.p(forceCampaignId, "_builder.getForceCampaignId()");
            return forceCampaignId;
        }

        public final String getForceCountry() {
            String forceCountry = this._builder.getForceCountry();
            AbstractC2995aW.p(forceCountry, "_builder.getForceCountry()");
            return forceCountry;
        }

        public final String getForceCountrySubdivision() {
            String forceCountrySubdivision = this._builder.getForceCountrySubdivision();
            AbstractC2995aW.p(forceCountrySubdivision, "_builder.getForceCountrySubdivision()");
            return forceCountrySubdivision;
        }

        public final int getForceExchangeTestMode() {
            return this._builder.getForceExchangeTestMode();
        }

        public final boolean hasForceCampaignId() {
            return this._builder.hasForceCampaignId();
        }

        public final boolean hasForceCountry() {
            return this._builder.hasForceCountry();
        }

        public final boolean hasForceCountrySubdivision() {
            return this._builder.hasForceCountrySubdivision();
        }

        public final boolean hasForceExchangeTestMode() {
            return this._builder.hasForceExchangeTestMode();
        }

        public final void setForceCampaignId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setForceCampaignId(str);
        }

        public final void setForceCountry(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setForceCountry(str);
        }

        public final void setForceCountrySubdivision(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setForceCountrySubdivision(str);
        }

        public final void setForceExchangeTestMode(int i) {
            this._builder.setForceExchangeTestMode(i);
        }

        private Dsl(TestDataOuterClass.TestData.Builder builder) {
            this._builder = builder;
        }
    }

    private TestDataKt() {
    }
}
