package com.iab.omid.library.bytedance2.utils;

import android.os.Build;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static String a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    public static String b() {
        return AnalyticsConstants.SDK_TYPE;
    }

    public static String c() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    public static JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        c.a(jSONObject, "deviceType", a());
        c.a(jSONObject, "osVersion", c());
        c.a(jSONObject, bc.x, b());
        return jSONObject;
    }
}
