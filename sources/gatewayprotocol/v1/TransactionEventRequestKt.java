package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionEventRequestKt {
    public static final TransactionEventRequestKt INSTANCE = new TransactionEventRequestKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionEventRequest.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public static final class TransactionDataProxy extends DslProxy {
            private TransactionDataProxy() {
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionEventRequest _build() {
            TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequestBuild = this._builder.build();
            AbstractC2995aW.p(transactionEventRequestBuild, "_builder.build()");
            return transactionEventRequestBuild;
        }

        public final /* synthetic */ void addAllTransactionData(DslList dslList, Iterable iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            this._builder.addAllTransactionData(iterable);
        }

        public final /* synthetic */ void addTransactionData(DslList dslList, TransactionEventRequestOuterClass.TransactionData transactionData) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(transactionData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.addTransactionData(transactionData);
        }

        public final void clearAppStore() {
            this._builder.clearAppStore();
        }

        public final void clearCustomStore() {
            this._builder.clearCustomStore();
        }

        public final void clearDynamicDeviceInfo() {
            this._builder.clearDynamicDeviceInfo();
        }

        public final void clearStaticDeviceInfo() {
            this._builder.clearStaticDeviceInfo();
        }

        public final /* synthetic */ void clearTransactionData(DslList dslList) {
            AbstractC2995aW.q(dslList, "<this>");
            this._builder.clearTransactionData();
        }

        public final TransactionEventRequestOuterClass.StoreType getAppStore() {
            TransactionEventRequestOuterClass.StoreType appStore = this._builder.getAppStore();
            AbstractC2995aW.p(appStore, "_builder.getAppStore()");
            return appStore;
        }

        public final String getCustomStore() {
            String customStore = this._builder.getCustomStore();
            AbstractC2995aW.p(customStore, "_builder.getCustomStore()");
            return customStore;
        }

        public final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo() {
            DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this._builder.getDynamicDeviceInfo();
            AbstractC2995aW.p(dynamicDeviceInfo, "_builder.getDynamicDeviceInfo()");
            return dynamicDeviceInfo;
        }

        public final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
            StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this._builder.getStaticDeviceInfo();
            AbstractC2995aW.p(staticDeviceInfo, "_builder.getStaticDeviceInfo()");
            return staticDeviceInfo;
        }

        public final /* synthetic */ DslList getTransactionData() {
            List<TransactionEventRequestOuterClass.TransactionData> transactionDataList = this._builder.getTransactionDataList();
            AbstractC2995aW.p(transactionDataList, "_builder.getTransactionDataList()");
            return new DslList(transactionDataList);
        }

        public final boolean hasDynamicDeviceInfo() {
            return this._builder.hasDynamicDeviceInfo();
        }

        public final boolean hasStaticDeviceInfo() {
            return this._builder.hasStaticDeviceInfo();
        }

        public final /* synthetic */ void plusAssignAllTransactionData(DslList<TransactionEventRequestOuterClass.TransactionData, TransactionDataProxy> dslList, Iterable<TransactionEventRequestOuterClass.TransactionData> iterable) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(iterable, "values");
            addAllTransactionData(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignTransactionData(DslList<TransactionEventRequestOuterClass.TransactionData, TransactionDataProxy> dslList, TransactionEventRequestOuterClass.TransactionData transactionData) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(transactionData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            addTransactionData(dslList, transactionData);
        }

        public final void setAppStore(TransactionEventRequestOuterClass.StoreType storeType) {
            AbstractC2995aW.q(storeType, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setAppStore(storeType);
        }

        public final void setCustomStore(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setCustomStore(str);
        }

        public final void setDynamicDeviceInfo(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo) {
            AbstractC2995aW.q(dynamicDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setDynamicDeviceInfo(dynamicDeviceInfo);
        }

        public final void setStaticDeviceInfo(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo) {
            AbstractC2995aW.q(staticDeviceInfo, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setStaticDeviceInfo(staticDeviceInfo);
        }

        public final /* synthetic */ void setTransactionData(DslList dslList, int i, TransactionEventRequestOuterClass.TransactionData transactionData) {
            AbstractC2995aW.q(dslList, "<this>");
            AbstractC2995aW.q(transactionData, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTransactionData(i, transactionData);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private TransactionEventRequestKt() {
    }
}
