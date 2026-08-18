package com.apm.insight.entity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.apm.insight.l.k;
import com.apm.insight.l.l;
import com.apm.insight.runtime.q;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Header {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f88a = {"version_code", "manifest_version_code", "aid", "update_version_code"};
    private static String d = null;
    private static int e = -1;
    private static int f = -1;
    private Context b;
    private JSONObject c = new JSONObject();

    public Header(Context context) {
        this.b = context;
    }

    public static Header a(Context context) {
        Header header = new Header(context);
        JSONObject jSONObject = header.c;
        try {
            jSONObject.put("sdk_version", 1030851);
            jSONObject.put("sdk_version_name", "1.3.8.nourl-rc.1");
        } catch (Exception unused) {
        }
        return header;
    }

    @Keep
    public static void addOtherHeader(JSONObject jSONObject) {
        Object obj;
        if (jSONObject == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        try {
            if (com.apm.insight.l.d.b()) {
                sb.append("MIUI-");
            } else if (com.apm.insight.l.d.c()) {
                sb.append("FLYME-");
            } else {
                String strA = com.apm.insight.l.d.a();
                if (com.apm.insight.l.d.a(strA)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strA)) {
                    sb.append(strA);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
            if (sb.length() > 0) {
                jSONObject.put("rom", sb.toString());
            }
            jSONObject.put("rom_version", l.a());
        } catch (Throwable unused) {
        }
        try {
            DisplayMetrics displayMetrics = e.g().getResources().getDisplayMetrics();
            int i = displayMetrics.densityDpi;
            if (i == 120) {
                obj = "ldpi";
            } else if (i != 240) {
                obj = i != 320 ? "mdpi" : "xhdpi";
            } else {
                obj = "hdpi";
            }
            jSONObject.put("density_dpi", i);
            jSONObject.put("display_density", obj);
            jSONObject.put(bc.z, displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception unused2) {
        }
        try {
            String language = e.g().getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(bc.N, language);
            }
            int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
            if (rawOffset < -12) {
                rawOffset = -12;
            }
            if (rawOffset > 12) {
                rawOffset = 12;
            }
            jSONObject.put(bc.M, rawOffset);
        } catch (Exception unused3) {
        }
        try {
            jSONObject.put(bc.x, AnalyticsConstants.SDK_TYPE);
            jSONObject.put("device_id", e.c().a());
            String strConcat = Build.VERSION.RELEASE;
            if (!strConcat.contains(".")) {
                strConcat = strConcat.concat(".0");
            }
            jSONObject.put(bc.y, strConcat);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            String str = Build.MODEL;
            String str2 = Build.BRAND;
            if (str == null) {
                str = str2;
            } else if (str2 != null && !str.contains(str2)) {
                str = str2 + ' ' + str;
            }
            jSONObject.put("device_model", str);
            jSONObject.put(bc.F, str2);
            jSONObject.put(bc.H, Build.MANUFACTURER);
            jSONObject.put("cpu_abi", g());
            Context contextG = e.g();
            String packageName = contextG.getPackageName();
            jSONObject.put("package", packageName);
            PackageInfo packageInfo = contextG.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null) {
                int i2 = applicationInfo.labelRes;
                if (i2 > 0) {
                    jSONObject.put(bc.s, contextG.getString(i2));
                } else {
                    jSONObject.put(bc.s, contextG.getPackageManager().getApplicationLabel(packageInfo.applicationInfo));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d.a(jSONObject);
    }

    public static void addRuntimeHeader(JSONObject jSONObject) {
        try {
            jSONObject.put(bc.Q, k.a(e.g()));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) e.g().getSystemService("phone");
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    jSONObject.put(bc.P, networkOperatorName);
                }
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator)) {
                    return;
                }
                jSONObject.put("mcc_mnc", networkOperator);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public static Header b(Context context) {
        Header headerA = a(context);
        a(headerA);
        b(headerA);
        headerA.c();
        headerA.d();
        headerA.e();
        return headerA;
    }

    private static String g() {
        if (d == null) {
            try {
                StringBuilder sb = new StringBuilder();
                if (Build.SUPPORTED_ABIS.length > 0) {
                    int i = 0;
                    while (true) {
                        String[] strArr = Build.SUPPORTED_ABIS;
                        if (i >= strArr.length) {
                            break;
                        }
                        sb.append(strArr[i]);
                        if (i != strArr.length - 1) {
                            sb.append(", ");
                        }
                        i++;
                    }
                } else {
                    sb = new StringBuilder(Build.CPU_ABI);
                }
                if (TextUtils.isEmpty(sb.toString())) {
                    d = "unknown";
                }
                d = sb.toString();
            } catch (Exception e2) {
                com.apm.insight.a.b((Throwable) e2);
                d = "unknown";
            }
        }
        return d;
    }

    public final JSONObject c() {
        return a(e.a().a());
    }

    public final JSONObject d() {
        try {
            this.c.put("device_id", e.c().a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this.c;
    }

    public final JSONObject e() {
        try {
            long jF = e.a().f();
            if (jF > 0) {
                this.c.put("user_id", jF);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return this.c;
    }

    public final JSONObject f() {
        return this.c;
    }

    public static boolean c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return (jSONObject.opt("app_version") == null && jSONObject.opt("version_name") == null) || jSONObject.opt("version_code") == null || jSONObject.opt("update_version_code") == null;
    }

    public static boolean d(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            String strOptString = jSONObject.optString("aid");
            if (TextUtils.isEmpty(strOptString)) {
                return true;
            }
            try {
                return Integer.parseInt(strOptString) <= 0;
            } catch (Throwable unused) {
            }
        }
        return true;
    }

    public static Header a(long j) {
        Header headerA;
        q qVarA = q.a();
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject jSONObjectA = qVarA.a(j);
        if (jSONObjectA != null && jSONObjectA.length() != 0) {
            headerA = new Header(e.g());
        } else {
            headerA = a(e.g());
            headerA.c();
            try {
                headerA.c.put("errHeader", 1);
            } catch (Throwable unused) {
            }
        }
        b(headerA);
        headerA.a(jSONObjectA);
        return headerA;
    }

    public static boolean b() {
        if (f == -1) {
            f = g().contains("86") ? 1 : 0;
        }
        return f == 1;
    }

    public static boolean b(JSONObject jSONObject) {
        return jSONObject.optInt("unauthentic_version", 0) == 1;
    }

    public static void b(Header header) {
        if (header == null) {
            return;
        }
        addOtherHeader(header.c);
    }

    public static boolean a() {
        if (e == -1) {
            e = g().contains("64") ? 1 : 0;
        }
        return e == 1;
    }

    public final JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.c;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                this.c.put(next, jSONObject.opt(next));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return this.c;
    }

    public final JSONObject a(@Nullable Map<String, Object> map) {
        try {
            if (map == null) {
                return this.c;
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                if (!this.c.has(entry.getKey())) {
                    this.c.put(entry.getKey(), entry.getValue());
                }
            }
            String[] strArr = f88a;
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (map.containsKey(str)) {
                    try {
                        this.c.put(str, Integer.parseInt(String.valueOf(map.get(str))));
                    } catch (Throwable unused) {
                        this.c.put(str, map.get(str));
                    }
                }
            }
            if (map.containsKey("version_code") && !map.containsKey("manifest_version_code")) {
                try {
                    this.c.put("manifest_version_code", Integer.parseInt(String.valueOf(map.get("version_code"))));
                } catch (Throwable unused2) {
                }
            }
            if (map.containsKey("iid")) {
                this.c.put("udid", map.get("iid"));
                this.c.remove("iid");
            }
            if (map.containsKey("version_name")) {
                this.c.put("app_version", map.get("version_name"));
                this.c.remove("version_name");
            }
        } catch (Throwable unused3) {
        }
        return this.c;
    }

    public static Header a(Header header) {
        addRuntimeHeader(header.c);
        return header;
    }
}
