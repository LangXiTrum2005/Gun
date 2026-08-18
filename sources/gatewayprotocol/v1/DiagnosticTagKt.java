package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticTagKt {
    public static final DiagnosticTagKt INSTANCE = new DiagnosticTagKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final DiagnosticEventRequestOuterClass.DiagnosticTag.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class TagTypeProxy extends DslProxy {
            private TagTypeProxy() {
            }
        }

        public /* synthetic */ Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ DiagnosticEventRequestOuterClass.DiagnosticTag _build() {
            DiagnosticEventRequestOuterClass.DiagnosticTag diagnosticTagBuild = this._builder.build();
            AbstractC2995aW.p(diagnosticTagBuild, "_builder.build()");
            return diagnosticTagBuild;
        }

        public final /* synthetic */ void addAllTagType(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllTagType(iterable);
        }

        public final /* synthetic */ void addTagType(DslList dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticTagType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addTagType(diagnosticTagType);
        }

        public final void clearCustomTagType() {
            this._builder.clearCustomTagType();
        }

        public final void clearIntValue() {
            this._builder.clearIntValue();
        }

        public final void clearStringValue() {
            this._builder.clearStringValue();
        }

        public final /* synthetic */ void clearTagType(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearTagType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getCustomTagType() {
            String customTagType = this._builder.getCustomTagType();
            AbstractC2995aW.p(customTagType, "_builder.getCustomTagType()");
            return customTagType;
        }

        public final int getIntValue() {
            return this._builder.getIntValue();
        }

        public final String getStringValue() {
            String stringValue = this._builder.getStringValue();
            AbstractC2995aW.p(stringValue, "_builder.getStringValue()");
            return stringValue;
        }

        public final /* synthetic */ DslList getTagType() {
            List<DiagnosticEventRequestOuterClass.DiagnosticTagType> tagTypeList = this._builder.getTagTypeList();
            AbstractC2995aW.p(tagTypeList, "_builder.getTagTypeList()");
            return new DslList(tagTypeList);
        }

        public final DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase getValueCase() {
            DiagnosticEventRequestOuterClass.DiagnosticTag.ValueCase valueCase = this._builder.getValueCase();
            AbstractC2995aW.p(valueCase, "_builder.getValueCase()");
            return valueCase;
        }

        public final boolean hasCustomTagType() {
            return this._builder.hasCustomTagType();
        }

        public final boolean hasIntValue() {
            return this._builder.hasIntValue();
        }

        public final boolean hasStringValue() {
            return this._builder.hasStringValue();
        }

        public final /* synthetic */ void plusAssignAllTagType(DslList<DiagnosticEventRequestOuterClass.DiagnosticTagType, TagTypeProxy> dslList, Iterable<? extends DiagnosticEventRequestOuterClass.DiagnosticTagType> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllTagType(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignTagType(DslList<DiagnosticEventRequestOuterClass.DiagnosticTagType, TagTypeProxy> dslList, DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticTagType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addTagType(dslList, diagnosticTagType);
        }

        public final void setCustomTagType(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCustomTagType(str);
        }

        public final void setIntValue(int i) {
            this._builder.setIntValue(i);
        }

        public final void setStringValue(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setStringValue(str);
        }

        public final /* synthetic */ void setTagType(DslList dslList, int i, DiagnosticEventRequestOuterClass.DiagnosticTagType diagnosticTagType) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(diagnosticTagType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTagType(i, diagnosticTagType);
        }

        private Dsl(DiagnosticEventRequestOuterClass.DiagnosticTag.Builder builder) {
            this._builder = builder;
        }
    }

    private DiagnosticTagKt() {
    }
}
