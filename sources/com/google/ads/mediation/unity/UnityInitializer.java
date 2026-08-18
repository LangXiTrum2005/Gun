package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4710tz;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class UnityInitializer {
    public static UnityInitializer b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4710tz f781a = new C4710tz(23);

    public static synchronized UnityInitializer a() {
        try {
            if (b == null) {
                b = new UnityInitializer();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public void initializeUnityAds(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        C4710tz c4710tz = this.f781a;
        c4710tz.getClass();
        if (UnityAds.isInitialized()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        c4710tz.getClass();
        MediationMetaData mediationMetaData = new MediationMetaData(context);
        mediationMetaData.setName("AdMob");
        c4710tz.getClass();
        mediationMetaData.setVersion(UnityAds.getVersion());
        mediationMetaData.set("adapter_version", BuildConfig.ADAPTER_VERSION);
        mediationMetaData.commit();
        c4710tz.getClass();
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }
}
