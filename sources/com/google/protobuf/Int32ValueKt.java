package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class Int32ValueKt {
    public static final Int32ValueKt INSTANCE = new Int32ValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Int32Value.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Int32Value.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Int32Value.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Int32Value _build() {
            Int32Value int32ValueBuild = this._builder.build();
            AbstractC2995aW.p(int32ValueBuild, "_builder.build()");
            return int32ValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final int getValue() {
            return this._builder.getValue();
        }

        public final void setValue(int i) {
            this._builder.setValue(i);
        }

        private Dsl(Int32Value.Builder builder) {
            this._builder = builder;
        }
    }

    private Int32ValueKt() {
    }
}
