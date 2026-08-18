package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TypeKt {
    public static final TypeKt INSTANCE = new TypeKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Type.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Type.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class FieldsProxy extends DslProxy {
            private FieldsProxy() {
            }
        }

        public static final class OneofsProxy extends DslProxy {
            private OneofsProxy() {
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Type.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Type _build() {
            Type typeBuild = this._builder.build();
            AbstractC2995aW.p(typeBuild, "_builder.build()");
            return typeBuild;
        }

        public final /* synthetic */ void addAllFields(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllFields(iterable);
        }

        public final /* synthetic */ void addAllOneofs(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllOneofs(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addFields(DslList dslList, Field field) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(field, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addFields(field);
        }

        public final /* synthetic */ void addOneofs(DslList dslList, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addOneofs(str);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addOptions(option);
        }

        public final /* synthetic */ void clearFields(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearFields();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearOneofs(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearOneofs();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final void clearSourceContext() {
            this._builder.clearSourceContext();
        }

        public final void clearSyntax() {
            this._builder.clearSyntax();
        }

        public final /* synthetic */ DslList getFields() {
            List<Field> fieldsList = this._builder.getFieldsList();
            AbstractC2995aW.p(fieldsList, "_builder.getFieldsList()");
            return new DslList(fieldsList);
        }

        public final String getName() {
            String name = this._builder.getName();
            AbstractC2995aW.p(name, "_builder.getName()");
            return name;
        }

        public final DslList<String, OneofsProxy> getOneofs() {
            List<String> oneofsList = this._builder.getOneofsList();
            AbstractC2995aW.p(oneofsList, "_builder.getOneofsList()");
            return new DslList<>(oneofsList);
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            AbstractC2995aW.p(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
        }

        public final SourceContext getSourceContext() {
            SourceContext sourceContext = this._builder.getSourceContext();
            AbstractC2995aW.p(sourceContext, "_builder.getSourceContext()");
            return sourceContext;
        }

        public final Syntax getSyntax() {
            Syntax syntax = this._builder.getSyntax();
            AbstractC2995aW.p(syntax, "_builder.getSyntax()");
            return syntax;
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllFields(DslList<Field, FieldsProxy> dslList, Iterable<Field> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllFields(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOneofs(DslList<String, OneofsProxy> dslList, Iterable<String> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllOneofs(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignFields(DslList<Field, FieldsProxy> dslList, Field field) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(field, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addFields(dslList, field);
        }

        public final /* synthetic */ void plusAssignOneofs(DslList<String, OneofsProxy> dslList, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addOneofs(dslList, str);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addOptions(dslList, option);
        }

        public final /* synthetic */ void setFields(DslList dslList, int i, Field field) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(field, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setFields(i, field);
        }

        public final void setName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setName(str);
        }

        public final /* synthetic */ void setOneofs(DslList dslList, int i, String str) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOneofs(i, str);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOptions(i, option);
        }

        public final void setSourceContext(SourceContext sourceContext) {
            AbstractC2995aW.q(sourceContext, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSourceContext(sourceContext);
        }

        public final void setSyntax(Syntax syntax) {
            AbstractC2995aW.q(syntax, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setSyntax(syntax);
        }

        private Dsl(Type.Builder builder) {
            this._builder = builder;
        }
    }

    private TypeKt() {
    }
}
