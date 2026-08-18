package com.unity3d.ads.core.extensions;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionStateExtensionsKt {
    public static final TransactionEventRequestOuterClass.TransactionState fromPurchaseState(int i) {
        if (i == 0) {
            return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PURCHASED;
        }
        if (i != 1) {
            return i != 2 ? TransactionEventRequestOuterClass.TransactionState.UNRECOGNIZED : TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PENDING;
        }
        return TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_UNSPECIFIED;
    }
}
