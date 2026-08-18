package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiKt {
    public static final ApiKt INSTANCE = new ApiKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Api.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Api.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class MethodsProxy extends DslProxy {
            private MethodsProxy() {
            }
        }

        public static final class MixinsProxy extends DslProxy {
            private MixinsProxy() {
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(Api.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Api _build() {
            Api apiBuild = this._builder.build();
            AbstractC2995aW.p(apiBuild, "_builder.build()");
            return apiBuild;
        }

        public final /* synthetic */ void addAllMethods(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllMethods(iterable);
        }

        public final /* synthetic */ void addAllMixins(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllMixins(iterable);
        }

        public final /* synthetic */ void addAllOptions(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllOptions(iterable);
        }

        public final /* synthetic */ void addMethods(DslList dslList, Method method) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(method, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addMethods(method);
        }

        public final /* synthetic */ void addMixins(DslList dslList, Mixin mixin) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(mixin, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addMixins(mixin);
        }

        public final /* synthetic */ void addOptions(DslList dslList, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addOptions(option);
        }

        public final /* synthetic */ void clearMethods(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearMethods();
        }

        public final /* synthetic */ void clearMixins(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearMixins();
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

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final /* synthetic */ DslList getMethods() {
            List<Method> methodsList = this._builder.getMethodsList();
            AbstractC2995aW.p(methodsList, "_builder.getMethodsList()");
            return new DslList(methodsList);
        }

        public final /* synthetic */ DslList getMixins() {
            List<Mixin> mixinsList = this._builder.getMixinsList();
            AbstractC2995aW.p(mixinsList, "_builder.getMixinsList()");
            return new DslList(mixinsList);
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

        public final String getVersion() {
            String version = this._builder.getVersion();
            AbstractC2995aW.p(version, "_builder.getVersion()");
            return version;
        }

        public final boolean hasSourceContext() {
            return this._builder.hasSourceContext();
        }

        public final /* synthetic */ void plusAssignAllMethods(DslList<Method, MethodsProxy> dslList, Iterable<Method> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllMethods(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllMixins(DslList<Mixin, MixinsProxy> dslList, Iterable<Mixin> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllMixins(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOptions(DslList<Option, OptionsProxy> dslList, Iterable<Option> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllOptions(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignMethods(DslList<Method, MethodsProxy> dslList, Method method) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(method, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addMethods(dslList, method);
        }

        public final /* synthetic */ void plusAssignMixins(DslList<Mixin, MixinsProxy> dslList, Mixin mixin) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(mixin, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addMixins(dslList, mixin);
        }

        public final /* synthetic */ void plusAssignOptions(DslList<Option, OptionsProxy> dslList, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addOptions(dslList, option);
        }

        public final /* synthetic */ void setMethods(DslList dslList, int i, Method method) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(method, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setMethods(i, method);
        }

        public final /* synthetic */ void setMixins(DslList dslList, int i, Mixin mixin) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(mixin, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setMixins(i, mixin);
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

        public final void setVersion(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setVersion(str);
        }

        private Dsl(Api.Builder builder) {
            this._builder = builder;
        }
    }

    private ApiKt() {
    }
}
