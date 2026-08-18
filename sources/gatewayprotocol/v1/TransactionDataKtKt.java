package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionDataKtKt {
    /* JADX INFO: renamed from: -initializetransactionData, reason: not valid java name */
    public static final TransactionEventRequestOuterClass.TransactionData m151initializetransactionData(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        TransactionDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TransactionEventRequestOuterClass.TransactionData copy(TransactionEventRequestOuterClass.TransactionData transactionData, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(transactionData, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder builder = transactionData.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        TransactionDataKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Timestamp getTimestampOrNull(TransactionEventRequestOuterClass.TransactionDataOrBuilder transactionDataOrBuilder) {
        AbstractC2995aW.q(transactionDataOrBuilder, "<this>");
        if (transactionDataOrBuilder.hasTimestamp()) {
            return transactionDataOrBuilder.getTimestamp();
        }
        return null;
    }
}
