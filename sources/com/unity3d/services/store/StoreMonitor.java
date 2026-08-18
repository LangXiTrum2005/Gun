package com.unity3d.services.store;

import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.core.StoreLifecycleListener;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class StoreMonitor {
    private final InterfaceC4309pQ _isInitialized;
    private StoreBilling storeBilling;
    private final StoreExceptionHandler storeExceptionHandler;
    private StoreLifecycleListener storeLifecycleListener;

    public StoreMonitor(StoreExceptionHandler storeExceptionHandler) {
        AbstractC2995aW.q(storeExceptionHandler, "storeExceptionHandler");
        this.storeExceptionHandler = storeExceptionHandler;
        this._isInitialized = AbstractC4995x90.a(Boolean.FALSE);
    }

    public final void getPurchaseHistory(int i, String str, int i2, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        AbstractC2995aW.q(purchaseHistoryResponseListener, "purchaseHistoryResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getPurchaseHistory(str, i2, purchaseHistoryResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_ERROR, i, e);
        }
    }

    public final void getPurchases(int i, String str, PurchasesResponseListener purchasesResponseListener) {
        AbstractC2995aW.q(purchasesResponseListener, "purchasesResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (storeBilling != null) {
                storeBilling.getPurchases(str, purchasesResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASES_REQUEST_ERROR, i, e);
        }
    }

    public final void getSkuDetails(int i, String str, List<String> list, SkuDetailsResponseListener skuDetailsResponseListener) {
        AbstractC2995aW.q(skuDetailsResponseListener, "skuDetailsResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getSkuDetails(str, list, skuDetailsResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, i, e);
        }
    }

    public final void initialize(BillingInitializationListener billingInitializationListener) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        AbstractC2995aW.q(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        StoreBilling storeBilling = new StoreBilling(ClientProperties.getApplicationContext(), billingInitializationListener);
        this.storeBilling = storeBilling;
        storeBilling.initialize(billingInitializationListener);
        ((C4907w90) this._isInitialized).i(Boolean.TRUE);
    }

    public final int isFeatureSupported(int i, String str, FeatureSupportedListener featureSupportedListener) {
        AbstractC2995aW.q(featureSupportedListener, "featureSupportedListener");
        int iIsFeatureSupported = -1;
        try {
            StoreBilling storeBilling = this.storeBilling;
            iIsFeatureSupported = storeBilling != null ? storeBilling.isFeatureSupported(str) : -1;
            featureSupportedListener.onFeatureSupported(iIsFeatureSupported);
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_ERROR, i, e);
        }
        return iIsFeatureSupported;
    }

    public final boolean isInitialized() {
        return ((Boolean) ((C4907w90) this._isInitialized).getValue()).booleanValue();
    }

    public final void startPurchaseTracking(ArrayList<String> arrayList, StoreEventListener storeEventListener) {
        AbstractC2995aW.q(arrayList, "purchaseTypes");
        AbstractC2995aW.q(storeEventListener, "storeEventListener");
        if (this.storeLifecycleListener != null) {
            stopPurchaseTracking();
        }
        StoreBilling storeBilling = this.storeBilling;
        AbstractC2995aW.n(storeBilling);
        this.storeLifecycleListener = new StoreLifecycleListener(arrayList, storeBilling, storeEventListener);
        ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.storeLifecycleListener);
    }

    public final void stopPurchaseTracking() {
        if (this.storeLifecycleListener != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.storeLifecycleListener);
            this.storeLifecycleListener = null;
        }
    }
}
