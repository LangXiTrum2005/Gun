package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC2475Hq;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
@Keep
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        b bVar = new b();
        DynamicLoader dynamicLoader = (DynamicLoader) bVar.a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(bVar.f748a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(bVar.f748a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(bVar.f748a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(bVar.f748a);
        dynamicLoader.createNativeAdApi(null, null);
        Method method = bVar.f748a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method method2 = bVar.f748a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) bVar.a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(bVar.f748a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(bVar.f748a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(bVar.f748a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) bVar.a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(bVar.f748a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(bVar.f748a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(bVar.f748a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) bVar.a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(bVar.f748a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(bVar.f748a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(bVar.f748a);
        AdViewApi adViewApi = (AdViewApi) bVar.a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(bVar.f748a);
        adViewApi.loadAd(null);
        arrayList2.add(bVar.f748a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(bVar.f748a);
        ((AdView.AdViewLoadConfigBuilder) bVar.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.f748a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) bVar.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.f748a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) bVar.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.f748a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) bVar.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(bVar.f748a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList, map, arrayList2, arrayList3, map2, arrayList4, arrayList5, method, method2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(@Nullable Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC2475Hq(adListener, ad), 500L);
        return true;
    }
}
