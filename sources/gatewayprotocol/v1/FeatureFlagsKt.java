package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class FeatureFlagsKt {
    public static final FeatureFlagsKt INSTANCE = new FeatureFlagsKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.FeatureFlags.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.FeatureFlags _build() {
            NativeConfigurationOuterClass.FeatureFlags featureFlagsBuild = this._builder.build();
            AbstractC2995aW.p(featureFlagsBuild, "_builder.build()");
            return featureFlagsBuild;
        }

        public final void clearAppSheetBugCheckEnabled() {
            this._builder.clearAppSheetBugCheckEnabled();
        }

        public final void clearBoldSdkNextSessionEnabled() {
            this._builder.clearBoldSdkNextSessionEnabled();
        }

        public final void clearOpenglGpuEnabled() {
            this._builder.clearOpenglGpuEnabled();
        }

        public final void clearOpportunityIdPlacementValidation() {
            this._builder.clearOpportunityIdPlacementValidation();
        }

        public final boolean getAppSheetBugCheckEnabled() {
            return this._builder.getAppSheetBugCheckEnabled();
        }

        public final boolean getBoldSdkNextSessionEnabled() {
            return this._builder.getBoldSdkNextSessionEnabled();
        }

        public final boolean getOpenglGpuEnabled() {
            return this._builder.getOpenglGpuEnabled();
        }

        public final boolean getOpportunityIdPlacementValidation() {
            return this._builder.getOpportunityIdPlacementValidation();
        }

        public final void setAppSheetBugCheckEnabled(boolean z) {
            this._builder.setAppSheetBugCheckEnabled(z);
        }

        public final void setBoldSdkNextSessionEnabled(boolean z) {
            this._builder.setBoldSdkNextSessionEnabled(z);
        }

        public final void setOpenglGpuEnabled(boolean z) {
            this._builder.setOpenglGpuEnabled(z);
        }

        public final void setOpportunityIdPlacementValidation(boolean z) {
            this._builder.setOpportunityIdPlacementValidation(z);
        }

        private Dsl(NativeConfigurationOuterClass.FeatureFlags.Builder builder) {
            this._builder = builder;
        }
    }

    private FeatureFlagsKt() {
    }
}
