package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class DeveloperConsentOptionKt {
    public static final DeveloperConsentOptionKt INSTANCE = new DeveloperConsentOptionKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DeveloperConsentOuterClass.DeveloperConsentOption.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ DeveloperConsentOuterClass.DeveloperConsentOption _build() {
            DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOptionBuild = this._builder.build();
            AbstractC2995aW.p(developerConsentOptionBuild, "_builder.build()");
            return developerConsentOptionBuild;
        }

        public final void clearCustomType() {
            this._builder.clearCustomType();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getCustomType() {
            String customType = this._builder.getCustomType();
            AbstractC2995aW.p(customType, "_builder.getCustomType()");
            return customType;
        }

        public final DeveloperConsentOuterClass.DeveloperConsentType getType() {
            DeveloperConsentOuterClass.DeveloperConsentType type = this._builder.getType();
            AbstractC2995aW.p(type, "_builder.getType()");
            return type;
        }

        public final DeveloperConsentOuterClass.DeveloperConsentChoice getValue() {
            DeveloperConsentOuterClass.DeveloperConsentChoice value = this._builder.getValue();
            AbstractC2995aW.p(value, "_builder.getValue()");
            return value;
        }

        public final boolean hasCustomType() {
            return this._builder.hasCustomType();
        }

        public final void setCustomType(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCustomType(str);
        }

        public final void setType(DeveloperConsentOuterClass.DeveloperConsentType developerConsentType) {
            AbstractC2995aW.q(developerConsentType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setType(developerConsentType);
        }

        public final void setValue(DeveloperConsentOuterClass.DeveloperConsentChoice developerConsentChoice) {
            AbstractC2995aW.q(developerConsentChoice, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setValue(developerConsentChoice);
        }

        private Dsl(DeveloperConsentOuterClass.DeveloperConsentOption.Builder builder) {
            this._builder = builder;
        }
    }

    private DeveloperConsentOptionKt() {
    }
}
