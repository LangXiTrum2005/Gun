package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EnumKt {
    public static final EnumKt INSTANCE = new EnumKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Enum.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Enum.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class EnumvalueProxy extends DslProxy {
            private EnumvalueProxy() {
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Enum.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Enum _build() {
            Enum enumBuild = this._builder.build();
            AbstractC2995aW.p(enumBuild, "_builder.build()");
            return enumBuild;
        }

        public final /* synthetic */ void addAllEnumvalue(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllEnumvalue(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addEnumvalue(DslList dslList, EnumValue enumValue) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(enumValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addEnumvalue(enumValue);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addOptions(option);
        }

        public final /* synthetic */ void clearEnumvalue(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearEnumvalue();
        }

        public final void clearName() {
            this._builder.clearName();
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

        public final /* synthetic */ DslList getEnumvalue() {
            List<EnumValue> enumvalueList = this._builder.getEnumvalueList();
            AbstractC2995aW.p(enumvalueList, "_builder.getEnumvalueList()");
            return new DslList(enumvalueList);
        }

        public final String getName() {
            String name = this._builder.getName();
            AbstractC2995aW.p(name, "_builder.getName()");
            return name;
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

        public final /* synthetic */ void plusAssignAllEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, Iterable<EnumValue> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllEnumvalue(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignEnumvalue(DslList<EnumValue, EnumvalueProxy> dslList, EnumValue enumValue) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(enumValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addEnumvalue(dslList, enumValue);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addOptions(dslList, option);
        }

        public final /* synthetic */ void setEnumvalue(DslList dslList, int i, EnumValue enumValue) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(enumValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setEnumvalue(i, enumValue);
        }

        public final void setName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setName(str);
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

        private Dsl(Enum.Builder builder) {
            this._builder = builder;
        }
    }

    private EnumKt() {
    }
}
