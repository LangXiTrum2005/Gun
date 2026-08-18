package com.unity3d.ads.adplayer;

import android.app.Activity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidShowOptions implements ShowOptions {
    private final WeakReference<Activity> activity;
    private final boolean isScarAd;
    private final String placementId;
    private final String scarAdString;
    private final String scarAdUnitId;
    private final String scarQueryId;
    private final Map<String, Object> unityAdsShowOptions;

    public /* synthetic */ AndroidShowOptions(WeakReference weakReference, Map map, String str, boolean z, String str2, String str3, String str4, int i, AbstractC2471Hm abstractC2471Hm) {
        this(weakReference, map, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AndroidShowOptions copy$default(AndroidShowOptions androidShowOptions, WeakReference weakReference, Map map, String str, boolean z, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            weakReference = androidShowOptions.activity;
        }
        if ((i & 2) != 0) {
            map = androidShowOptions.unityAdsShowOptions;
        }
        Map map2 = map;
        if ((i & 4) != 0) {
            str = androidShowOptions.placementId;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            z = androidShowOptions.isScarAd;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str2 = androidShowOptions.scarQueryId;
        }
        String str6 = str2;
        if ((i & 32) != 0) {
            str3 = androidShowOptions.scarAdString;
        }
        String str7 = str3;
        if ((i & 64) != 0) {
            str4 = androidShowOptions.scarAdUnitId;
        }
        return androidShowOptions.copy(weakReference, map2, str5, z2, str6, str7, str4);
    }

    public final WeakReference<Activity> component1() {
        return this.activity;
    }

    public final Map<String, Object> component2() {
        return this.unityAdsShowOptions;
    }

    public final String component3() {
        return this.placementId;
    }

    public final boolean component4() {
        return this.isScarAd;
    }

    public final String component5() {
        return this.scarQueryId;
    }

    public final String component6() {
        return this.scarAdString;
    }

    public final String component7() {
        return this.scarAdUnitId;
    }

    public final AndroidShowOptions copy(WeakReference<Activity> weakReference, Map<String, ? extends Object> map, String str, boolean z, String str2, String str3, String str4) {
        AbstractC2995aW.q(weakReference, "activity");
        return new AndroidShowOptions(weakReference, map, str, z, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidShowOptions)) {
            return false;
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) obj;
        return AbstractC2995aW.i(this.activity, androidShowOptions.activity) && AbstractC2995aW.i(this.unityAdsShowOptions, androidShowOptions.unityAdsShowOptions) && AbstractC2995aW.i(this.placementId, androidShowOptions.placementId) && this.isScarAd == androidShowOptions.isScarAd && AbstractC2995aW.i(this.scarQueryId, androidShowOptions.scarQueryId) && AbstractC2995aW.i(this.scarAdString, androidShowOptions.scarAdString) && AbstractC2995aW.i(this.scarAdUnitId, androidShowOptions.scarAdUnitId);
    }

    public final WeakReference<Activity> getActivity() {
        return this.activity;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final String getScarAdString() {
        return this.scarAdString;
    }

    public final String getScarAdUnitId() {
        return this.scarAdUnitId;
    }

    public final String getScarQueryId() {
        return this.scarQueryId;
    }

    public final Map<String, Object> getUnityAdsShowOptions() {
        return this.unityAdsShowOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    public int hashCode() {
        int iHashCode = this.activity.hashCode() * 31;
        Map<String, Object> map = this.unityAdsShowOptions;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.placementId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.isScarAd;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode3 + r1) * 31;
        String str2 = this.scarQueryId;
        int iHashCode4 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scarAdString;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scarAdUnitId;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isScarAd() {
        return this.isScarAd;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidShowOptions(activity=");
        sb.append(this.activity);
        sb.append(", unityAdsShowOptions=");
        sb.append(this.unityAdsShowOptions);
        sb.append(", placementId=");
        sb.append(this.placementId);
        sb.append(", isScarAd=");
        sb.append(this.isScarAd);
        sb.append(", scarQueryId=");
        sb.append(this.scarQueryId);
        sb.append(", scarAdString=");
        sb.append(this.scarAdString);
        sb.append(", scarAdUnitId=");
        return DM.l(sb, this.scarAdUnitId, ')');
    }

    public AndroidShowOptions(WeakReference<Activity> weakReference, Map<String, ? extends Object> map, String str, boolean z, String str2, String str3, String str4) {
        AbstractC2995aW.q(weakReference, "activity");
        this.activity = weakReference;
        this.unityAdsShowOptions = map;
        this.placementId = str;
        this.isScarAd = z;
        this.scarQueryId = str2;
        this.scarAdString = str3;
        this.scarAdUnitId = str4;
    }
}
