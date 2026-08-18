package com.unity3d.ads.core.domain.events;

import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* JADX INFO: loaded from: classes4.dex */
public interface GetTransactionData {
    TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseBridge, SkuDetailsBridge skuDetailsBridge);
}
