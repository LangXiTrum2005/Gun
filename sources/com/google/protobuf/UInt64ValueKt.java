package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class UInt64ValueKt {
    public static final UInt64ValueKt INSTANCE = new UInt64ValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UInt64Value.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(UInt64Value.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(UInt64Value.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ UInt64Value _build() {
            UInt64Value uInt64ValueBuild = this._builder.build();
            AbstractC2995aW.p(uInt64ValueBuild, "_builder.build()");
            return uInt64ValueBuild;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final long getValue() {
            return this._builder.getValue();
        }

        public final void setValue(long j) {
            this._builder.setValue(j);
        }

        private Dsl(UInt64Value.Builder builder) {
            this._builder = builder;
        }
    }

    private UInt64ValueKt() {
    }
}
