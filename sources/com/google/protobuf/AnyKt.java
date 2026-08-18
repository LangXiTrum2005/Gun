package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class AnyKt {
    public static final AnyKt INSTANCE = new AnyKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Any.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Any.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Any _build() {
            Any anyBuild = this._builder.build();
            AbstractC2995aW.p(anyBuild, "_builder.build()");
            return anyBuild;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            AbstractC2995aW.p(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            AbstractC2995aW.p(value, "_builder.getValue()");
            return value;
        }

        public final void setTypeUrl(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTypeUrl(str);
        }

        public final void setValue(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setValue(byteString);
        }

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }
    }

    private AnyKt() {
    }
}
