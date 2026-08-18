package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionEventRequestKtKt {
    /* JADX INFO: renamed from: -initializetransactionEventRequest, reason: not valid java name */
    public static final TransactionEventRequestOuterClass.TransactionEventRequest m152initializetransactionEventRequest(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionEventRequest.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        TransactionEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TransactionEventRequestOuterClass.TransactionEventRequest copy(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(transactionEventRequest, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionEventRequest.Builder builder = transactionEventRequest.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        TransactionEventRequestKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfoOrNull(TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        AbstractC2995aW.q(transactionEventRequestOrBuilder, "<this>");
        if (transactionEventRequestOrBuilder.hasDynamicDeviceInfo()) {
            return transactionEventRequestOrBuilder.getDynamicDeviceInfo();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfoOrNull(TransactionEventRequestOuterClass.TransactionEventRequestOrBuilder transactionEventRequestOrBuilder) {
        AbstractC2995aW.q(transactionEventRequestOrBuilder, "<this>");
        if (transactionEventRequestOrBuilder.hasStaticDeviceInfo()) {
            return transactionEventRequestOrBuilder.getStaticDeviceInfo();
        }
        return null;
    }
}
