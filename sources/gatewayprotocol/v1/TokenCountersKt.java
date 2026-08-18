package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class TokenCountersKt {
    public static final TokenCountersKt INSTANCE = new TokenCountersKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingTokenOuterClass.TokenCounters.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingTokenOuterClass.TokenCounters.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(HeaderBiddingTokenOuterClass.TokenCounters.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingTokenOuterClass.TokenCounters _build() {
            HeaderBiddingTokenOuterClass.TokenCounters tokenCountersBuild = this._builder.build();
            AbstractC2995aW.p(tokenCountersBuild, "_builder.build()");
            return tokenCountersBuild;
        }

        public final void clearSeq() {
            this._builder.clearSeq();
        }

        public final void clearStarts() {
            this._builder.clearStarts();
        }

        public final void clearWins() {
            this._builder.clearWins();
        }

        public final int getSeq() {
            return this._builder.getSeq();
        }

        public final int getStarts() {
            return this._builder.getStarts();
        }

        public final int getWins() {
            return this._builder.getWins();
        }

        public final void setSeq(int i) {
            this._builder.setSeq(i);
        }

        public final void setStarts(int i) {
            this._builder.setStarts(i);
        }

        public final void setWins(int i) {
            this._builder.setWins(i);
        }

        private Dsl(HeaderBiddingTokenOuterClass.TokenCounters.Builder builder) {
            this._builder = builder;
        }
    }

    private TokenCountersKt() {
    }
}
