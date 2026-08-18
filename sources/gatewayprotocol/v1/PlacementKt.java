package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class PlacementKt {
    public static final PlacementKt INSTANCE = new PlacementKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.Placement.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.Placement.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.Placement.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.Placement _build() {
            InitializationResponseOuterClass.Placement placementBuild = this._builder.build();
            AbstractC2995aW.p(placementBuild, "_builder.build()");
            return placementBuild;
        }

        public final void clearAdFormat() {
            this._builder.clearAdFormat();
        }

        public final InitializationResponseOuterClass.AdFormat getAdFormat() {
            InitializationResponseOuterClass.AdFormat adFormat = this._builder.getAdFormat();
            AbstractC2995aW.p(adFormat, "_builder.getAdFormat()");
            return adFormat;
        }

        public final void setAdFormat(InitializationResponseOuterClass.AdFormat adFormat) {
            AbstractC2995aW.q(adFormat, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdFormat(adFormat);
        }

        private Dsl(InitializationResponseOuterClass.Placement.Builder builder) {
            this._builder = builder;
        }
    }

    private PlacementKt() {
    }
}
