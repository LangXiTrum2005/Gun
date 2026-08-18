package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class OptionKt {
    public static final OptionKt INSTANCE = new OptionKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Option.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Option.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Option.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Option _build() {
            Option optionBuild = this._builder.build();
            AbstractC2995aW.p(optionBuild, "_builder.build()");
            return optionBuild;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getName() {
            String name = this._builder.getName();
            AbstractC2995aW.p(name, "_builder.getName()");
            return name;
        }

        public final Any getValue() {
            Any value = this._builder.getValue();
            AbstractC2995aW.p(value, "_builder.getValue()");
            return value;
        }

        public final boolean hasValue() {
            return this._builder.hasValue();
        }

        public final void setName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setName(str);
        }

        public final void setValue(Any any) {
            AbstractC2995aW.q(any, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setValue(any);
        }

        private Dsl(Option.Builder builder) {
            this._builder = builder;
        }
    }

    private OptionKt() {
    }
}
