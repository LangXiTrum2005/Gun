package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class StructKt {
    public static final StructKt INSTANCE = new StructKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Struct.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Struct.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        public /* synthetic */ Dsl(Struct.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Struct _build() {
            Struct structBuild = this._builder.build();
            AbstractC2995aW.p(structBuild, "_builder.build()");
            return structBuild;
        }

        public final /* synthetic */ void clearFields(DslMap dslMap) {
            AbstractC2995aW.q(dslMap, "<this>");
            this._builder.clearFields();
        }

        public final /* synthetic */ DslMap getFieldsMap() {
            Map<String, Value> fieldsMap = this._builder.getFieldsMap();
            AbstractC2995aW.p(fieldsMap, "_builder.getFieldsMap()");
            return new DslMap(fieldsMap);
        }

        public final /* synthetic */ void putAllFields(DslMap dslMap, Map map) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(map, "map");
            this._builder.putAllFields(map);
        }

        public final void putFields(DslMap<String, Value, FieldsProxy> dslMap, String str, Value value) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            AbstractC2995aW.q(value, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.putFields(str, value);
        }

        public final /* synthetic */ void removeFields(DslMap dslMap, String str) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            this._builder.removeFields(str);
        }

        public final /* synthetic */ void setFields(DslMap<String, Value, FieldsProxy> dslMap, String str, Value value) {
            AbstractC2995aW.q(dslMap, "<this>");
            AbstractC2995aW.q(str, "key");
            AbstractC2995aW.q(value, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            putFields(dslMap, str, value);
        }

        private Dsl(Struct.Builder builder) {
            this._builder = builder;
        }
    }

    private StructKt() {
    }
}
