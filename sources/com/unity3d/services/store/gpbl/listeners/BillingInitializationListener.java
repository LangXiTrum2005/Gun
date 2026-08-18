package com.unity3d.services.store.gpbl.listeners;

/* JADX INFO: loaded from: classes4.dex */
public interface BillingInitializationListener extends BillingClientStateListener, PurchaseUpdatedResponseListener {
    void onIsAlreadyInitialized();
}
