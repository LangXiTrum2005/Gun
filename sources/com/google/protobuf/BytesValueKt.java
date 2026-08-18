package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class BytesValueKt {
    public static final BytesValueKt INSTANCE = new BytesValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BytesValue.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(BytesValue.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(BytesValue.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ BytesValue _build() {
            BytesValue bytesValueBuild = this._builder.build();
            AbstractC2995aW.p(bytesValueBuild, "_builder.build()");
            return bytesValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            AbstractC2995aW.p(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setValue(byteString);
        }

        private Dsl(BytesValue.Builder builder) {
            this._builder = builder;
        }
    }

    private BytesValueKt() {
    }
}
