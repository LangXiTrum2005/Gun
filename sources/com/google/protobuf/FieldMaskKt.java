package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldMaskKt {
    public static final FieldMaskKt INSTANCE = new FieldMaskKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final FieldMask.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(FieldMask.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class PathsProxy extends DslProxy {
            private PathsProxy() {
            }
        }

        public /* synthetic */ Dsl(FieldMask.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ FieldMask _build() {
            FieldMask fieldMaskBuild = this._builder.build();
            AbstractC2995aW.p(fieldMaskBuild, "_builder.build()");
            return fieldMaskBuild;
        }

        public final /* synthetic */ void addAllPaths(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllPaths(iterable);
        }

        public final /* synthetic */ void addPaths(DslList dslList, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addPaths(str);
        }

        public final /* synthetic */ void clearPaths(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearPaths();
        }

        public final DslList<String, PathsProxy> getPaths() {
            List<String> pathsList = this._builder.getPathsList();
            AbstractC2995aW.p(pathsList, "_builder.getPathsList()");
            return new DslList<>(pathsList);
        }

        public final /* synthetic */ void plusAssignAllPaths(DslList<String, PathsProxy> dslList, Iterable<String> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllPaths(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignPaths(DslList<String, PathsProxy> dslList, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addPaths(dslList, str);
        }

        public final /* synthetic */ void setPaths(DslList dslList, int i, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setPaths(i, str);
        }

        private Dsl(FieldMask.Builder builder) {
            this._builder = builder;
        }
    }

    private FieldMaskKt() {
    }
}
