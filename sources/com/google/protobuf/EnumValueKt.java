package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EnumValueKt {
    public static final EnumValueKt INSTANCE = new EnumValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final EnumValue.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(EnumValue.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class OptionsProxy extends DslProxy {
            private OptionsProxy() {
            }
        }

        public /* synthetic */ Dsl(EnumValue.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ EnumValue _build() {
            EnumValue enumValueBuild = this._builder.build();
            AbstractC2995aW.p(enumValueBuild, "_builder.build()");
            return enumValueBuild;
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

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final /* synthetic */ void clearOptions(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearOptions();
        }

        public final String getName() {
            String name = this._builder.getName();
            AbstractC2995aW.p(name, "_builder.getName()");
            return name;
        }

        public final int getNumber() {
            return this._builder.getNumber();
        }

        public final /* synthetic */ DslList getOptions() {
            List<Option> optionsList = this._builder.getOptionsList();
            AbstractC2995aW.p(optionsList, "_builder.getOptionsList()");
            return new DslList(optionsList);
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

        public final void setName(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setName(str);
        }

        public final void setNumber(int i) {
            this._builder.setNumber(i);
        }

        public final /* synthetic */ void setOptions(DslList dslList, int i, Option option) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(option, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setOptions(i, option);
        }

        private Dsl(EnumValue.Builder builder) {
            this._builder = builder;
        }
    }

    private EnumValueKt() {
    }
}
