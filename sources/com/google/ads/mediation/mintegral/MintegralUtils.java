package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.out.MBConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralUtils {
    public static final String TAG = "MintegralUtils";

    public static int convertDipToPixel(@NonNull Context context, float f) {
        Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f + 0.5f, resources.getDisplayMetrics());
    }

    public static String getAdapterVersion() {
        return BuildConfig.ADAPTER_VERSION;
    }

    public static String getSdkVersion() {
        return MBConfiguration.SDK_VERSION;
    }

    public static boolean shouldMuteAudio(@NonNull Bundle bundle) {
        return bundle.getBoolean("mute_audio");
    }

    @Nullable
    public static AdError validateMintegralAdLoadParams(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(101, "Missing or invalid ad Unit ID configured for this ad source instance in the AdMob or Ad Manager UI.");
            adErrorCreateAdapterError.toString();
            return adErrorCreateAdapterError;
        }
        if (!TextUtils.isEmpty(str2)) {
            return null;
        }
        AdError adErrorCreateAdapterError2 = MintegralConstants.createAdapterError(101, "Missing or invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.");
        adErrorCreateAdapterError2.toString();
        return adErrorCreateAdapterError2;
    }

    @Nullable
    public static AdError validateMintegralAdLoadParams(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        AdError adErrorValidateMintegralAdLoadParams = validateMintegralAdLoadParams(str, str2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            return adErrorValidateMintegralAdLoadParams;
        }
        if (!TextUtils.isEmpty(str3)) {
            return null;
        }
        AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(103, "Missing or invalid Mintegral bidding signal in this ad request.");
        adErrorCreateAdapterError.toString();
        return adErrorCreateAdapterError;
    }
}
