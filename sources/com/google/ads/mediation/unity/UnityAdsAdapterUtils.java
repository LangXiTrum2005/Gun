package com.google.ads.mediation.unity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.UnityBannerSize;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ef0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class UnityAdsAdapterUtils {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AdEvent {
        public static final AdEvent CLICKED;
        public static final AdEvent CLOSED;
        public static final AdEvent IMPRESSION;
        public static final AdEvent LEFT_APPLICATION;
        public static final AdEvent LOADED;
        public static final AdEvent OPENED;
        public static final AdEvent REWARD;
        public static final AdEvent VIDEO_COMPLETE;
        public static final AdEvent VIDEO_START;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ AdEvent[] f780a;

        static {
            AdEvent adEvent = new AdEvent("LOADED", 0);
            LOADED = adEvent;
            AdEvent adEvent2 = new AdEvent("OPENED", 1);
            OPENED = adEvent2;
            AdEvent adEvent3 = new AdEvent("CLICKED", 2);
            CLICKED = adEvent3;
            AdEvent adEvent4 = new AdEvent("CLOSED", 3);
            CLOSED = adEvent4;
            AdEvent adEvent5 = new AdEvent("LEFT_APPLICATION", 4);
            LEFT_APPLICATION = adEvent5;
            AdEvent adEvent6 = new AdEvent("IMPRESSION", 5);
            IMPRESSION = adEvent6;
            AdEvent adEvent7 = new AdEvent("VIDEO_START", 6);
            VIDEO_START = adEvent7;
            AdEvent adEvent8 = new AdEvent("REWARD", 7);
            REWARD = adEvent8;
            AdEvent adEvent9 = new AdEvent("VIDEO_COMPLETE", 8);
            VIDEO_COMPLETE = adEvent9;
            f780a = new AdEvent[]{adEvent, adEvent2, adEvent3, adEvent4, adEvent5, adEvent6, adEvent7, adEvent8, adEvent9};
        }

        public static AdEvent valueOf(String str) {
            return (AdEvent) Enum.valueOf(AdEvent.class, str);
        }

        public static AdEvent[] values() {
            return (AdEvent[]) f780a.clone();
        }
    }

    public static AdError a(int i, String str) {
        return new AdError(i, str, "com.unity3d.ads");
    }

    public static boolean areValidIds(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    public static AdError b(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        int i;
        int i2 = Ef0.b[unityAdsInitializationError.ordinal()];
        if (i2 == 1) {
            i = 301;
        } else if (i2 != 2) {
            i = i2 != 3 ? 300 : 303;
        } else {
            i = 302;
        }
        return a(i, str);
    }

    public static AdError c(UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        int i;
        int i2 = Ef0.c[unityAdsLoadError.ordinal()];
        if (i2 == 1) {
            i = 401;
        } else if (i2 == 2) {
            i = 402;
        } else if (i2 == 3) {
            i = 403;
        } else if (i2 != 4) {
            i = i2 != 5 ? 400 : 405;
        } else {
            i = 404;
        }
        return a(i, str);
    }

    public static AdError d(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        int i;
        switch (Ef0.d[unityAdsShowError.ordinal()]) {
            case 1:
                i = 501;
                break;
            case 2:
                i = 502;
                break;
            case 3:
                i = 503;
                break;
            case 4:
                i = 504;
                break;
            case 5:
                i = 505;
                break;
            case 6:
                i = 506;
                break;
            case 7:
                i = 507;
                break;
            default:
                i = 500;
                break;
        }
        return a(i, str);
    }

    public static int e(BannerErrorInfo bannerErrorInfo) {
        int i = Ef0.f3032a[bannerErrorInfo.errorCode.ordinal()];
        if (i == 1) {
            return 201;
        }
        if (i == 2) {
            return 202;
        }
        if (i != 3) {
            return i != 4 ? 200 : 204;
        }
        return 203;
    }

    @Nullable
    public static UnityBannerSize getUnityBannerSize(@NonNull Context context, @NonNull AdSize adSize) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(AdSize.BANNER);
        arrayList.add(AdSize.LEADERBOARD);
        AdSize adSizeFindClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (adSizeFindClosestSize != null) {
            return new UnityBannerSize(adSizeFindClosestSize.getWidth(), adSizeFindClosestSize.getHeight());
        }
        return null;
    }

    public static void setCoppa(int i, @NonNull Context context) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        MetaData metaData = new MetaData(context);
        if (i == 0) {
            metaData.set("user.nonbehavioral", Boolean.FALSE);
        } else {
            metaData.set("user.nonbehavioral", Boolean.TRUE);
        }
        metaData.commit();
    }
}
