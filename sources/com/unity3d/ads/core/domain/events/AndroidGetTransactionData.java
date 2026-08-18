package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetTransactionData implements GetTransactionData {
    private final GetByteStringId getByteStringId;

    public AndroidGetTransactionData(GetByteStringId getByteStringId) {
        AbstractC2995aW.q(getByteStringId, "getByteStringId");
        this.getByteStringId = getByteStringId;
    }

    @Override // com.unity3d.ads.core.domain.events.GetTransactionData
    public TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseBridge, SkuDetailsBridge skuDetailsBridge) throws JSONException {
        AbstractC2995aW.q(purchaseBridge, "purchaseDetail");
        AbstractC2995aW.q(skuDetailsBridge, "productDetail");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        TransactionDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setProductId(purchaseBridge.getOriginalJson().get(InAppPurchaseMetaData.KEY_PRODUCT_ID).toString());
        dsl_create.setEventId(this.getByteStringId.invoke());
        Object obj = purchaseBridge.getOriginalJson().get("purchaseTime");
        AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.Long");
        dsl_create.setTimestamp(TimestampExtensionsKt.fromMillis(((Long) obj).longValue()));
        dsl_create.setTransactionId(purchaseBridge.getOriginalJson().get("orderId").toString());
        String string = skuDetailsBridge.getOriginalJson().toString();
        AbstractC2995aW.p(string, "productDetail.originalJson.toString()");
        dsl_create.setProduct(string);
        String string2 = purchaseBridge.getOriginalJson().toString();
        AbstractC2995aW.p(string2, "purchaseDetail.originalJson.toString()");
        dsl_create.setTransaction(string2);
        Object obj2 = purchaseBridge.getOriginalJson().get("purchaseState");
        AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.Int");
        dsl_create.setTransactionState(TransactionStateExtensionsKt.fromPurchaseState(((Integer) obj2).intValue()));
        return dsl_create._build();
    }
}
