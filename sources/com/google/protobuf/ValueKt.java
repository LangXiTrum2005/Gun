package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class ValueKt {
    public static final ValueKt INSTANCE = new ValueKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Value.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(Value.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Value.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ Value _build() {
            Value valueBuild = this._builder.build();
            AbstractC2995aW.p(valueBuild, "_builder.build()");
            return valueBuild;
        }

        public final void clearBoolValue() {
            this._builder.clearBoolValue();
        }

        public final void clearKind() {
            this._builder.clearKind();
        }

        public final void clearListValue() {
            this._builder.clearListValue();
        }

        public final void clearNullValue() {
            this._builder.clearNullValue();
        }

        public final void clearNumberValue() {
            this._builder.clearNumberValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final void clearStructValue() {
            this._builder.clearStructValue();
        }

        public final boolean getBoolValue() {
            return this._builder.getBoolValue();
        }

        public final Value.KindCase getKindCase() {
            Value.KindCase kindCase = this._builder.getKindCase();
            AbstractC2995aW.p(kindCase, "_builder.getKindCase()");
            return kindCase;
        }

        public final ListValue getListValue() {
            ListValue listValue = this._builder.getListValue();
            AbstractC2995aW.p(listValue, "_builder.getListValue()");
            return listValue;
        }

        public final NullValue getNullValue() {
            NullValue nullValue = this._builder.getNullValue();
            AbstractC2995aW.p(nullValue, "_builder.getNullValue()");
            return nullValue;
        }

        public final double getNumberValue() {
            return this._builder.getNumberValue();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            AbstractC2995aW.p(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final Struct getStructValue() {
            Struct structValue = this._builder.getStructValue();
            AbstractC2995aW.p(structValue, "_builder.getStructValue()");
            return structValue;
        }

        public final boolean hasBoolValue() {
            return this._builder.hasBoolValue();
        }

        public final boolean hasListValue() {
            return this._builder.hasListValue();
        }

        public final boolean hasNullValue() {
            return this._builder.hasNullValue();
        }

        public final boolean hasNumberValue() {
            return this._builder.hasNumberValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final boolean hasStructValue() {
            return this._builder.hasStructValue();
        }

        public final void setBoolValue(boolean z) {
            this._builder.setBoolValue(z);
        }

        public final void setListValue(ListValue listValue) {
            AbstractC2995aW.q(listValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setListValue(listValue);
        }

        public final void setNullValue(NullValue nullValue) {
            AbstractC2995aW.q(nullValue, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setNullValue(nullValue);
        }

        public final void setNumberValue(double d) {
            this._builder.setNumberValue(d);
        }

        public final void setStringValue(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setStringValue(str);
        }

        public final void setStructValue(Struct struct) {
            AbstractC2995aW.q(struct, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setStructValue(struct);
        }

        private Dsl(Value.Builder builder) {
            this._builder = builder;
        }
    }

    private ValueKt() {
    }
}
