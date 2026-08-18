package com.google.protobuf;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class TimestampKt {
    public static final TimestampKt INSTANCE = new TimestampKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Timestamp.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Timestamp.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Timestamp.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Timestamp _build() {
            Timestamp timestampBuild = this._builder.build();
            AbstractC2995aW.p(timestampBuild, "_builder.build()");
            return timestampBuild;
        }

        public final void clearNanos() {
            this._builder.clearNanos();
        }

        public final void clearSeconds() {
            this._builder.clearSeconds();
        }

        public final int getNanos() {
            return this._builder.getNanos();
        }

        public final long getSeconds() {
            return this._builder.getSeconds();
        }

        public final void setNanos(int i) {
            this._builder.setNanos(i);
        }

        public final void setSeconds(long j) {
            this._builder.setSeconds(j);
        }

        private Dsl(Timestamp.Builder builder) {
            this._builder = builder;
        }
    }

    private TimestampKt() {
    }
}
