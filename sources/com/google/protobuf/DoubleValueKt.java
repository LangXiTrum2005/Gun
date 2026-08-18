package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class DoubleValueKt {
    public static final DoubleValueKt INSTANCE = new DoubleValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DoubleValue.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(DoubleValue.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(DoubleValue.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ DoubleValue _build() {
            DoubleValue doubleValueBuild = this._builder.build();
            AbstractC2995aW.p(doubleValueBuild, "_builder.build()");
            return doubleValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final double getValue() {
            return this._builder.getValue();
        }

        public final void setValue(double d) {
            this._builder.setValue(d);
        }

        private Dsl(DoubleValue.Builder builder) {
            this._builder = builder;
        }
    }

    private DoubleValueKt() {
    }
}
