package com.unity3d.services.store.gpbl;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientBuilderFactory;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClient;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseUpdatedResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseHistoryResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class StoreBilling {
    private final IBillingClient _billingClientBridge;

    public StoreBilling(Context context, PurchaseUpdatedResponseListener purchaseUpdatedResponseListener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        this._billingClientBridge = BillingClientBuilderFactory.getBillingClientBuilder(context).setListener(new PurchaseUpdatedListenerProxy(purchaseUpdatedResponseListener)).enablePendingPurchases().build();
    }

    public void getPurchaseHistory(String str, int i, PurchaseHistoryResponseListener purchaseHistoryResponseListener) throws ClassNotFoundException {
        this._billingClientBridge.queryPurchaseHistoryAsync(str, new PurchaseHistoryResponseListenerProxy(purchaseHistoryResponseListener, i));
    }

    public void getPurchases(String str, PurchasesResponseListener purchasesResponseListener) throws ClassNotFoundException {
        this._billingClientBridge.queryPurchasesAsync(str, new PurchasesResponseListenerProxy(purchasesResponseListener));
    }

    public void getSkuDetails(String str, List<String> list, SkuDetailsResponseListener skuDetailsResponseListener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        this._billingClientBridge.querySkuDetailsAsync(SkuDetailsParamsBridge.newBuilder().setSkuList(list).setType(str).build(), new SkuDetailsResponseListenerProxy(skuDetailsResponseListener));
    }

    public void initialize(BillingClientStateListener billingClientStateListener) throws ClassNotFoundException {
        this._billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x0027 A[ORIG_RETURN, RETURN] */
    public int isFeatureSupported(String str) {
        if (str.equals("inapp")) {
            if (this._billingClientBridge.isReady()) {
                return 0;
            }
            return -1;
        }
        if (str.equals("subs")) {
            str = "subscriptions";
        }
        if (this._billingClientBridge.isFeatureSupported(str) == BillingResultResponseCode.OK) {
            return 0;
        }
        return -1;
    }
}
