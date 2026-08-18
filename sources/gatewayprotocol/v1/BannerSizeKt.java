package gatewayprotocol.v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerSizeKt {
    public static final BannerSizeKt INSTANCE = new BannerSizeKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AdRequestOuterClass.BannerSize.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(AdRequestOuterClass.BannerSize.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(AdRequestOuterClass.BannerSize.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ AdRequestOuterClass.BannerSize _build() {
            AdRequestOuterClass.BannerSize bannerSizeBuild = this._builder.build();
            AbstractC2995aW.p(bannerSizeBuild, "_builder.build()");
            return bannerSizeBuild;
        }

        public final void clearHeight() {
            this._builder.clearHeight();
        }

        public final void clearWidth() {
            this._builder.clearWidth();
        }

        public final int getHeight() {
            return this._builder.getHeight();
        }

        public final int getWidth() {
            return this._builder.getWidth();
        }

        public final void setHeight(int i) {
            this._builder.setHeight(i);
        }

        public final void setWidth(int i) {
            this._builder.setWidth(i);
        }

        private Dsl(AdRequestOuterClass.BannerSize.Builder builder) {
            this._builder = builder;
        }
    }

    private BannerSizeKt() {
    }
}
