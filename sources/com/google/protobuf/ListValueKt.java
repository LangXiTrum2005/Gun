package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ListValueKt {
    public static final ListValueKt INSTANCE = new ListValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ListValue.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(ListValue.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class ValuesProxy extends DslProxy {
            private ValuesProxy() {
            }
        }

        public /* synthetic */ Dsl(ListValue.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ ListValue _build() {
            ListValue listValueBuild = this._builder.build();
            AbstractC2995aW.p(listValueBuild, "_builder.build()");
            return listValueBuild;
        }

        public final /* synthetic */ void addAllValues(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllValues(iterable);
        }

        public final /* synthetic */ void addValues(DslList dslList, Value value) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(value, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addValues(value);
        }

        public final /* synthetic */ void clearValues(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearValues();
        }

        public final /* synthetic */ DslList getValues() {
            List<Value> valuesList = this._builder.getValuesList();
            AbstractC2995aW.p(valuesList, "_builder.getValuesList()");
            return new DslList(valuesList);
        }

        public final /* synthetic */ void plusAssignAllValues(DslList<Value, ValuesProxy> dslList, Iterable<Value> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllValues(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignValues(DslList<Value, ValuesProxy> dslList, Value value) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(value, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addValues(dslList, value);
        }

        public final /* synthetic */ void setValues(DslList dslList, int i, Value value) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(value, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setValues(i, value);
        }

        private Dsl(ListValue.Builder builder) {
            this._builder = builder;
        }
    }

    private ListValueKt() {
    }
}
