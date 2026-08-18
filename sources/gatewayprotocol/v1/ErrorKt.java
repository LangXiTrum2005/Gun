package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class ErrorKt {
    public static final ErrorKt INSTANCE = new ErrorKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ErrorOuterClass.Error.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error errorBuild = this._builder.build();
            AbstractC2995aW.p(errorBuild, "_builder.build()");
            return errorBuild;
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            AbstractC2995aW.p(errorText, "_builder.getErrorText()");
            return errorText;
        }

        public final void setErrorText(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setErrorText(str);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }
    }

    private ErrorKt() {
    }
}
