package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class FloatValueKt {
    public static final FloatValueKt INSTANCE = new FloatValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FloatValue.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(FloatValue.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(FloatValue.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ FloatValue _build() {
            FloatValue floatValueBuild = this._builder.build();
            AbstractC2995aW.p(floatValueBuild, "_builder.build()");
            return floatValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final float getValue() {
            return this._builder.getValue();
        }

        public final void setValue(float f) {
            this._builder.setValue(f);
        }

        private Dsl(FloatValue.Builder builder) {
            this._builder = builder;
        }
    }

    private FloatValueKt() {
    }
}
