package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class OperativeEventErrorDataKt {
    public static final OperativeEventErrorDataKt INSTANCE = new OperativeEventErrorDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final OperativeEventRequestOuterClass.OperativeEventErrorData.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ OperativeEventRequestOuterClass.OperativeEventErrorData _build() {
            OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorDataBuild = this._builder.build();
            AbstractC2995aW.p(operativeEventErrorDataBuild, "_builder.build()");
            return operativeEventErrorDataBuild;
        }

        public final void clearErrorType() {
            this._builder.clearErrorType();
        }

        public final void clearMessage() {
            this._builder.clearMessage();
        }

        public final OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType() {
            OperativeEventRequestOuterClass.OperativeEventErrorType errorType = this._builder.getErrorType();
            AbstractC2995aW.p(errorType, "_builder.getErrorType()");
            return errorType;
        }

        public final String getMessage() {
            String message = this._builder.getMessage();
            AbstractC2995aW.p(message, "_builder.getMessage()");
            return message;
        }

        public final void setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType) {
            AbstractC2995aW.q(operativeEventErrorType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setErrorType(operativeEventErrorType);
        }

        public final void setMessage(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setMessage(str);
        }

        private Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
            this._builder = builder;
        }
    }

    private OperativeEventErrorDataKt() {
    }
}
