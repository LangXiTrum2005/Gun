package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class MixinKt {
    public static final MixinKt INSTANCE = new MixinKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Mixin.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Mixin _build() {
            Mixin mixinBuild = this._builder.build();
            AbstractC2995aW.p(mixinBuild, "_builder.build()");
            return mixinBuild;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        public final String getName() {
            String name = this._builder.getName();
            AbstractC2995aW.p(name, "_builder.getName()");
            return name;
        }

        public final String getRoot() {
            String root = this._builder.getRoot();
            AbstractC2995aW.p(root, "_builder.getRoot()");
            return root;
        }

        public final void setName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setName(str);
        }

        public final void setRoot(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setRoot(str);
        }

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }
    }

    private MixinKt() {
    }
}
