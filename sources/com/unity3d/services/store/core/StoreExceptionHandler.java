package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;

/* JADX INFO: loaded from: classes4.dex */
public interface StoreExceptionHandler {
    void handleStoreException(StoreEvent storeEvent, int i, Exception exc);
}
