package com.unity3d.services.store.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class StoreLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final ArrayList<String> _purchaseTypes;
    private final StoreBilling _storeBilling;
    private final StoreEventListener _storeEventListener;

    public StoreLifecycleListener(ArrayList<String> arrayList, StoreBilling storeBilling, StoreEventListener storeEventListener) {
        AbstractC2995aW.q(arrayList, "_purchaseTypes");
        AbstractC2995aW.q(storeBilling, "_storeBilling");
        AbstractC2995aW.q(storeEventListener, "_storeEventListener");
        this._purchaseTypes = arrayList;
        this._storeBilling = storeBilling;
        this._storeEventListener = storeEventListener;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC2995aW.q(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC2995aW.q(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC2995aW.q(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AbstractC2995aW.q(activity, "activity");
        try {
            Iterator<String> it = this._purchaseTypes.iterator();
            while (it.hasNext()) {
                this._storeBilling.getPurchases(it.next(), this._storeEventListener);
            }
        } catch (ClassNotFoundException e) {
            DeviceLog.warning("Couldn't fetch purchases onActivityResumed. " + e.getMessage());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC2995aW.q(activity, "activity");
        AbstractC2995aW.q(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC2995aW.q(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC2995aW.q(activity, "activity");
    }
}
