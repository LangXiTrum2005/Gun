package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class SourceContextKt {
    public static final SourceContextKt INSTANCE = new SourceContextKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final SourceContext.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(SourceContext.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(SourceContext.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ SourceContext _build() {
            SourceContext sourceContextBuild = this._builder.build();
            AbstractC2995aW.p(sourceContextBuild, "_builder.build()");
            return sourceContextBuild;
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        public final String getFileName() {
            String fileName = this._builder.getFileName();
            AbstractC2995aW.p(fileName, "_builder.getFileName()");
            return fileName;
        }

        public final void setFileName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setFileName(str);
        }

        private Dsl(SourceContext.Builder builder) {
            this._builder = builder;
        }
    }

    private SourceContextKt() {
    }
}
