package com.unity3d.services.store.gpbl.listeners;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface PurchasesResponseListener {
    void onPurchaseResponse(BillingResultBridge billingResultBridge, List<? extends PurchaseBridge> list);
}
