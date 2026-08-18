package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class StringValueKt {
    public static final StringValueKt INSTANCE = new StringValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final StringValue.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(StringValue.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(StringValue.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ StringValue _build() {
            StringValue stringValueBuild = this._builder.build();
            AbstractC2995aW.p(stringValueBuild, "_builder.build()");
            return stringValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getValue() {
            String value = this._builder.getValue();
            AbstractC2995aW.p(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setValue(str);
        }

        private Dsl(StringValue.Builder builder) {
            this._builder = builder;
        }
    }

    private StringValueKt() {
    }
}
