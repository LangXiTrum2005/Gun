package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class InitializationCompletedEventRequestKt {
    public static final InitializationCompletedEventRequestKt INSTANCE = new InitializationCompletedEventRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest _build() {
            InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequestBuild = this._builder.build();
            AbstractC2995aW.p(initializationCompletedEventRequestBuild, "_builder.build()");
            return initializationCompletedEventRequestBuild;
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            AbstractC2995aW.p(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            AbstractC2995aW.p(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            AbstractC2995aW.q(dynamicDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            AbstractC2995aW.q(staticDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        private Dsl(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private InitializationCompletedEventRequestKt() {
    }
}
