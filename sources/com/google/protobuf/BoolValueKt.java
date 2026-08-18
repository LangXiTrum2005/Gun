package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class BoolValueKt {
    public static final BoolValueKt INSTANCE = new BoolValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final BoolValue.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(BoolValue.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(BoolValue.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ BoolValue _build() {
            BoolValue boolValueBuild = this._builder.build();
            AbstractC2995aW.p(boolValueBuild, "_builder.build()");
            return boolValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final boolean getValue() {
            return this._builder.getValue();
        }

        public final void setValue(boolean z) {
            this._builder.setValue(z);
        }

        private Dsl(BoolValue.Builder builder) {
            this._builder = builder;
        }
    }

    private BoolValueKt() {
    }
}
