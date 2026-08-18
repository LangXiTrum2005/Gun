package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldKt {
    public static final FieldKt INSTANCE = new FieldKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Field.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Field.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Field.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Field _build() {
            Field fieldBuild = this._builder.build();
            AbstractC2995aW.p(fieldBuild, "_builder.build()");
            return fieldBuild;
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addOptions(option);
        }

        public final void clearCardinality() {
            this._builder.clearCardinality();
        }

        public final void clearDefaultValue() {
            this._builder.clearDefaultValue();
        }

        public final void clearJsonName() {
            this._builder.clearJsonName();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final void clearOneofIndex() {
            this._builder.clearOneofIndex();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearPacked() {
            this._builder.clearPacked();
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final Field.Cardinality getCardinality() {
            Field.Cardinality cardinality = this._builder.getCardinality();
            AbstractC2995aW.p(cardinality, "_builder.getCardinality()");
            return cardinality;
        }

        public final String getDefaultValue() {
            String defaultValue = this._builder.getDefaultValue();
            AbstractC2995aW.p(defaultValue, "_builder.getDefaultValue()");
            return defaultValue;
        }

        public final String getJsonName() {
            String jsonName = this._builder.getJsonName();
            AbstractC2995aW.p(jsonName, "_builder.getJsonName()");
            return jsonName;
        }

        public final Field.Kind getKind() {
            Field.Kind kind = this._builder.getKind();
            AbstractC2995aW.p(kind, "_builder.getKind()");
            return kind;
        }

        public final String getName() {
            String name = this._builder.getName();
            AbstractC2995aW.p(name, "_builder.getName()");
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final int getOneofIndex() {
            return this._builder.getOneofIndex();
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            AbstractC2995aW.p(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final boolean getPacked() {
            return this._builder.getPacked();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            AbstractC2995aW.p(typeUrl, "_builder.getTypeUrl()");
            return typeUrl;
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addOptions(dslList, option);
        }

        public final void setCardinality(Field.Cardinality cardinality) {
            AbstractC2995aW.q(cardinality, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCardinality(cardinality);
        }

        public final void setDefaultValue(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDefaultValue(str);
        }

        public final void setJsonName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setJsonName(str);
        }

        public final void setKind(Field.Kind kind) {
            AbstractC2995aW.q(kind, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setKind(kind);
        }

        public final void setName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setName(str);
        }

        public final void setNumber(int i) {
            this._builder.setNumber(i);
        }

        public final void setOneofIndex(int i) {
            this._builder.setOneofIndex(i);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOptions(i, option);
        }

        public final void setPacked(boolean z) {
            this._builder.setPacked(z);
        }

        public final void setTypeUrl(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTypeUrl(str);
        }

        private Dsl(Field.Builder builder) {
            this._builder = builder;
        }
    }

    private FieldKt() {
    }
}
