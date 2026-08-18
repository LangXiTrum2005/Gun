package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class PiiKt {
    public static final PiiKt INSTANCE = new PiiKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PiiOuterClass.Pii.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(PiiOuterClass.Pii.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(PiiOuterClass.Pii.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ PiiOuterClass.Pii _build() {
            PiiOuterClass.Pii piiBuild = this._builder.build();
            AbstractC2995aW.p(piiBuild, "_builder.build()");
            return piiBuild;
        }

        public final void clearAdvertisingId() {
            this._builder.clearAdvertisingId();
        }

        public final void clearOpenAdvertisingTrackingId() {
            this._builder.clearOpenAdvertisingTrackingId();
        }

        public final void clearVendorId() {
            this._builder.clearVendorId();
        }

        public final ByteString getAdvertisingId() {
            ByteString advertisingId = this._builder.getAdvertisingId();
            AbstractC2995aW.p(advertisingId, "_builder.getAdvertisingId()");
            return advertisingId;
        }

        public final ByteString getOpenAdvertisingTrackingId() {
            ByteString openAdvertisingTrackingId = this._builder.getOpenAdvertisingTrackingId();
            AbstractC2995aW.p(openAdvertisingTrackingId, "_builder.getOpenAdvertisingTrackingId()");
            return openAdvertisingTrackingId;
        }

        public final ByteString getVendorId() {
            ByteString vendorId = this._builder.getVendorId();
            AbstractC2995aW.p(vendorId, "_builder.getVendorId()");
            return vendorId;
        }

        public final void setAdvertisingId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAdvertisingId(byteString);
        }

        public final void setOpenAdvertisingTrackingId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOpenAdvertisingTrackingId(byteString);
        }

        public final void setVendorId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setVendorId(byteString);
        }

        private Dsl(PiiOuterClass.Pii.Builder builder) {
            this._builder = builder;
        }
    }

    private PiiKt() {
    }
}
