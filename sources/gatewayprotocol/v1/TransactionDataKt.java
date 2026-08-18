package gatewayprotocol.v1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionDataKt {
    public static final TransactionDataKt INSTANCE = new TransactionDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TransactionEventRequestOuterClass.TransactionData.Builder _builder;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
                this();
            }

            public final /* synthetic */ Dsl _create(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
                AbstractC2995aW.q(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder, AbstractC2471Hm abstractC2471Hm) {
            this(builder);
        }

        public final /* synthetic */ TransactionEventRequestOuterClass.TransactionData _build() {
            TransactionEventRequestOuterClass.TransactionData transactionDataBuild = this._builder.build();
            AbstractC2995aW.p(transactionDataBuild, "_builder.build()");
            return transactionDataBuild;
        }

        public final void clearEventId() {
            this._builder.clearEventId();
        }

        public final void clearProduct() {
            this._builder.clearProduct();
        }

        public final void clearProductId() {
            this._builder.clearProductId();
        }

        public final void clearReceipt() {
            this._builder.clearReceipt();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final void clearTransaction() {
            this._builder.clearTransaction();
        }

        public final void clearTransactionId() {
            this._builder.clearTransactionId();
        }

        public final void clearTransactionState() {
            this._builder.clearTransactionState();
        }

        public final ByteString getEventId() {
            ByteString eventId = this._builder.getEventId();
            AbstractC2995aW.p(eventId, "_builder.getEventId()");
            return eventId;
        }

        public final String getProduct() {
            String product = this._builder.getProduct();
            AbstractC2995aW.p(product, "_builder.getProduct()");
            return product;
        }

        public final String getProductId() {
            String productId = this._builder.getProductId();
            AbstractC2995aW.p(productId, "_builder.getProductId()");
            return productId;
        }

        public final String getReceipt() {
            String receipt = this._builder.getReceipt();
            AbstractC2995aW.p(receipt, "_builder.getReceipt()");
            return receipt;
        }

        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            AbstractC2995aW.p(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final String getTransaction() {
            String transaction = this._builder.getTransaction();
            AbstractC2995aW.p(transaction, "_builder.getTransaction()");
            return transaction;
        }

        public final String getTransactionId() {
            String transactionId = this._builder.getTransactionId();
            AbstractC2995aW.p(transactionId, "_builder.getTransactionId()");
            return transactionId;
        }

        public final TransactionEventRequestOuterClass.TransactionState getTransactionState() {
            TransactionEventRequestOuterClass.TransactionState transactionState = this._builder.getTransactionState();
            AbstractC2995aW.p(transactionState, "_builder.getTransactionState()");
            return transactionState;
        }

        public final boolean hasReceipt() {
            return this._builder.hasReceipt();
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setEventId(ByteString byteString) {
            AbstractC2995aW.q(byteString, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setEventId(byteString);
        }

        public final void setProduct(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setProduct(str);
        }

        public final void setProductId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setProductId(str);
        }

        public final void setReceipt(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setReceipt(str);
        }

        public final void setTimestamp(Timestamp timestamp) {
            AbstractC2995aW.q(timestamp, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTimestamp(timestamp);
        }

        public final void setTransaction(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTransaction(str);
        }

        public final void setTransactionId(String str) {
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTransactionId(str);
        }

        public final void setTransactionState(TransactionEventRequestOuterClass.TransactionState transactionState) {
            AbstractC2995aW.q(transactionState, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            this._builder.setTransactionState(transactionState);
        }

        private Dsl(TransactionEventRequestOuterClass.TransactionData.Builder builder) {
            this._builder = builder;
        }
    }

    private TransactionDataKt() {
    }
}
