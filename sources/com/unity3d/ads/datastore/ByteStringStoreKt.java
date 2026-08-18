package com.unity3d.ads.datastore;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class ByteStringStoreKt {
    public static final ByteStringStoreKt INSTANCE = new ByteStringStoreKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ByteStringStoreOuterClass.ByteStringStore.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ ByteStringStoreOuterClass.ByteStringStore _build() {
            ByteStringStoreOuterClass.ByteStringStore byteStringStoreBuild = this._builder.build();
            AbstractC2995aW.p(byteStringStoreBuild, "_builder.build()");
            return byteStringStoreBuild;
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final ByteString getData() {
            ByteString data = this._builder.getData();
            AbstractC2995aW.p(data, "_builder.getData()");
            return data;
        }

        public final void setData(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setData(byteString);
        }

        private Dsl(ByteStringStoreOuterClass.ByteStringStore.Builder builder) {
            this._builder = builder;
        }
    }

    private ByteStringStoreKt() {
    }
}
