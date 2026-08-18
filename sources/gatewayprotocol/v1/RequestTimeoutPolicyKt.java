package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestTimeoutPolicyKt {
    public static final RequestTimeoutPolicyKt INSTANCE = new RequestTimeoutPolicyKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestTimeoutPolicy _build() {
            NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicyBuild = this._builder.build();
            AbstractC2995aW.p(requestTimeoutPolicyBuild, "_builder.build()");
            return requestTimeoutPolicyBuild;
        }

        public final void clearConnectTimeoutMs() {
            this._builder.clearConnectTimeoutMs();
        }

        public final void clearOverallTimeoutMs() {
            this._builder.clearOverallTimeoutMs();
        }

        public final void clearReadTimeoutMs() {
            this._builder.clearReadTimeoutMs();
        }

        public final void clearWriteTimeoutMs() {
            this._builder.clearWriteTimeoutMs();
        }

        public final int getConnectTimeoutMs() {
            return this._builder.getConnectTimeoutMs();
        }

        public final int getOverallTimeoutMs() {
            return this._builder.getOverallTimeoutMs();
        }

        public final int getReadTimeoutMs() {
            return this._builder.getReadTimeoutMs();
        }

        public final int getWriteTimeoutMs() {
            return this._builder.getWriteTimeoutMs();
        }

        public final void setConnectTimeoutMs(int i) {
            this._builder.setConnectTimeoutMs(i);
        }

        public final void setOverallTimeoutMs(int i) {
            this._builder.setOverallTimeoutMs(i);
        }

        public final void setReadTimeoutMs(int i) {
            this._builder.setReadTimeoutMs(i);
        }

        public final void setWriteTimeoutMs(int i) {
            this._builder.setWriteTimeoutMs(i);
        }

        private Dsl(NativeConfigurationOuterClass.RequestTimeoutPolicy.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestTimeoutPolicyKt() {
    }
}
