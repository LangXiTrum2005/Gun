package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivacyUpdateResponseKt {
    public static final PrivacyUpdateResponseKt INSTANCE = new PrivacyUpdateResponseKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse _build() {
            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponseBuild = this._builder.build();
            AbstractC2995aW.p(privacyUpdateResponseBuild, "_builder.build()");
            return privacyUpdateResponseBuild;
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final ByteString getContent() {
            ByteString content = this._builder.getContent();
            AbstractC2995aW.p(content, "_builder.getContent()");
            return content;
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setContent(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setContent(byteString);
        }

        public final void setVersion(int i) {
            this._builder.setVersion(i);
        }

        private Dsl(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder builder) {
            this._builder = builder;
        }
    }

    private PrivacyUpdateResponseKt() {
    }
}
