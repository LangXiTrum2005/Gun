package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class RequestRetryPolicyKt {
    public static final RequestRetryPolicyKt INSTANCE = new RequestRetryPolicyKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.RequestRetryPolicy.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestRetryPolicy _build() {
            NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicyBuild = this._builder.build();
            AbstractC2995aW.p(requestRetryPolicyBuild, "_builder.build()");
            return requestRetryPolicyBuild;
        }

        public final void clearMaxDuration() {
            this._builder.clearMaxDuration();
        }

        public final void clearRetryJitterPct() {
            this._builder.clearRetryJitterPct();
        }

        public final void clearRetryMaxInterval() {
            this._builder.clearRetryMaxInterval();
        }

        public final void clearRetryScalingFactor() {
            this._builder.clearRetryScalingFactor();
        }

        public final void clearRetryWaitBase() {
            this._builder.clearRetryWaitBase();
        }

        public final void clearShouldStoreLocally() {
            this._builder.clearShouldStoreLocally();
        }

        public final int getMaxDuration() {
            return this._builder.getMaxDuration();
        }

        public final float getRetryJitterPct() {
            return this._builder.getRetryJitterPct();
        }

        public final int getRetryMaxInterval() {
            return this._builder.getRetryMaxInterval();
        }

        public final float getRetryScalingFactor() {
            return this._builder.getRetryScalingFactor();
        }

        public final int getRetryWaitBase() {
            return this._builder.getRetryWaitBase();
        }

        public final boolean getShouldStoreLocally() {
            return this._builder.getShouldStoreLocally();
        }

        public final void setMaxDuration(int i) {
            this._builder.setMaxDuration(i);
        }

        public final void setRetryJitterPct(float f) {
            this._builder.setRetryJitterPct(f);
        }

        public final void setRetryMaxInterval(int i) {
            this._builder.setRetryMaxInterval(i);
        }

        public final void setRetryScalingFactor(float f) {
            this._builder.setRetryScalingFactor(f);
        }

        public final void setRetryWaitBase(int i) {
            this._builder.setRetryWaitBase(i);
        }

        public final void setShouldStoreLocally(boolean z) {
            this._builder.setShouldStoreLocally(z);
        }

        private Dsl(NativeConfigurationOuterClass.RequestRetryPolicy.Builder builder) {
            this._builder = builder;
        }
    }

    private RequestRetryPolicyKt() {
    }
}
