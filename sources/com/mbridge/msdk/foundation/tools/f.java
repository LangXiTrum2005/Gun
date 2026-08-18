package com.mbridge.msdk.foundation.tools;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebEnvCheckEntry;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f1277a = null;
    public static String b = null;
    public static boolean c = false;
    public static int d = 0;
    private static String e = "";
    private static boolean f = false;
    private static String g = "";
    private static boolean h = false;
    private static boolean i = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1278a;

        public a(Context context) {
            this.f1278a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID) && com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f1278a);
                    f.a(advertisingIdInfo.getId());
                    f.d = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    f.b(this.f1278a, advertisingIdInfo.getId(), f.d);
                } catch (Exception unused) {
                    o0.d("DomainSameDiTool", "GET ADID ERROR TRY TO GET FROM GOOGLE PLAY APP");
                    try {
                        b.C0177b c0177bA = new b().a(this.f1278a);
                        f.a(c0177bA.a());
                        f.d = c0177bA.b() ? 1 : 0;
                        f.b(this.f1278a, c0177bA.a(), f.d);
                    } catch (Exception unused2) {
                        o0.d("DomainSameDiTool", "GET ADID FROM GOOGLE PLAY APP ERROR");
                    }
                } catch (Throwable th) {
                    o0.b("DomainSameDiTool", th.getMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, int i2) {
        try {
            if (y0.b(str)) {
                w0.b(context, MBridgeConstans.SP_GA_ID, str);
            }
            w0.b(context, MBridgeConstans.SP_GA_ID_LIMIT, Integer.valueOf(i2));
        } catch (Exception e2) {
            o0.b("DomainSameDiTool", e2.getMessage());
        }
    }

    public static String c() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(b) ? "" : b;
        }
        if (!TextUtils.isEmpty(b)) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                return b;
            }
            return d == 0 ? b : "";
        }
        if (!c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            c = true;
        }
        return "";
    }

    public static String d() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            return TextUtils.isEmpty(f1277a) ? "" : f1277a;
        }
        if (!TextUtils.isEmpty(f1277a)) {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.b.j()) {
                return f1277a;
            }
            return d == 0 ? f1277a : "";
        }
        k0.k();
        if (!c) {
            a(com.mbridge.msdk.foundation.controller.c.n().d());
            c = true;
        }
        return TextUtils.isEmpty(f1277a) ? "" : f1277a;
    }

    public static String e() {
        if (TextUtils.isEmpty(g) && !f) {
            b();
        }
        return g;
    }

    public static int a() {
        return d;
    }

    public static void a(int i2) {
        d = i2;
    }

    public static void a(Context context) {
        new Thread(new a(context)).start();
    }

    public static String b() {
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.c.l() || !com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return "";
        }
        if (f) {
            return e;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                ContentResolver contentResolver = com.mbridge.msdk.foundation.controller.c.n().d().getContentResolver();
                int i2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, i2);
                jSONObject.put("amazonId", string);
                String string2 = jSONObject.toString();
                if (!TextUtils.isEmpty(string2)) {
                    g = string2;
                    e = i0.b(string2);
                }
            } catch (Settings.SettingNotFoundException e2) {
                o0.b("DomainSameDiTool", e2.getMessage());
            }
        } catch (Throwable th) {
            o0.b("DomainSameDiTool", th.getMessage());
        }
        f = true;
        return e;
    }

    public static void a(String str) {
        b = i0.b(str);
        f1277a = str;
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        try {
            WebEnvCheckEntry.class.getMethod("check", Context.class).invoke(WebEnvCheckEntry.class.newInstance(), context);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean b(Context context) {
        try {
            if (i) {
                return h;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                h = context.getPackageManager().checkPermission(i0.a("DkP3hrKuHoPMH+zwL+fALkK/WQc5x5zH+TcincKNNVfWNVJcVM=="), context.getPackageName()) == 0;
            } else {
                h = true;
            }
            i = true;
            return h;
        } catch (Exception unused) {
            h = false;
        }
    }
}
