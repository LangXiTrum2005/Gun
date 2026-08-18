package com.mbridge.msdk.omsdk;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2845Vx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3203cn0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3719ih0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5049xn0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3522gT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5218zk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ig0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.S2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y60;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1725a = DomainNameUtils.VERIFICATION_URL;

    public class a extends com.mbridge.msdk.foundation.same.net.handler.a {
        final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            o0.a("OMSDK", "fetch OMJSContent failed, errorCode = " + str);
            new h(this.b).a("", "", "", "", "fetch OM failed, request failed");
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = str;
            b.b(str);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.omsdk.b$b, reason: collision with other inner class name */
    public class RunnableC0218b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1726a;

        public RunnableC0218b(String str) {
            this.f1726a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                File file = new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                if (file.exists()) {
                    file.delete();
                }
                m0.a(this.f1726a.getBytes(), file);
            } catch (Exception e) {
                o0.a("OMSDK", e.getMessage());
            }
        }
    }

    public class c extends com.mbridge.msdk.foundation.same.net.handler.a {
        final /* synthetic */ Context b;

        public c(Context context) {
            this.b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void a(String str) {
            o0.a("OMSDK", "fetch OMJSH5Content failed, errorCode = " + str);
            new h(this.b).a("", "", "", "", "fetch OM H5 failed, request failed");
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.a
        public void b(String str) {
            MBridgeConstans.OMID_JS_H5_CONTENT = str;
            b.c(str);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1727a;

        public d(String str) {
            this.f1727a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                File file = new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                if (file.exists()) {
                    file.delete();
                }
                m0.a(this.f1727a.getBytes(), file);
            } catch (Exception e) {
                o0.a("OMSDK", e.getMessage());
            }
        }
    }

    public static N2 a(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        C3203cn0 c3203cn0B = null;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) || TextUtils.isEmpty(str)) {
            o0.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
            new h(context).a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
            return null;
        }
        try {
            a(context);
            AbstractC2995aW.e("Mintegral", "Name is null or empty");
            AbstractC2995aW.e(MBConfiguration.SDK_VERSION, "Version is null or empty");
            Ig0 ig0 = new Ig0("Mintegral", MBConfiguration.SDK_VERSION, 2);
            EnumC5218zk enumC5218zk = z ? EnumC5218zk.NATIVE_DISPLAY : EnumC5218zk.VIDEO;
            EnumC3522gT enumC3522gT = EnumC3522gT.NATIVE;
            if (z) {
                enumC3522gT = EnumC3522gT.NONE;
            }
            try {
                c3203cn0B = N2.b(Y60.b(enumC5218zk, enumC3522gT), TN.a(ig0, MBridgeConstans.OMID_JS_SERVICE_CONTENT, a(str, context, str2, str3, str4, str6), str5, str2));
                o0.a("OMSDK", "adSession create success");
                return c3203cn0B;
            } catch (IllegalArgumentException e) {
                e = e;
                o0.b("OMSDK", e.getMessage());
                new h(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return c3203cn0B;
            } catch (Exception e2) {
                e = e2;
                o0.b("OMSDK", e.getMessage());
                new h(context).a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                return c3203cn0B;
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        }
    }

    public static String b() {
        try {
            File file = new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            if (file.exists()) {
                return m0.e(file);
            }
        } catch (Exception e) {
            o0.a("OMSDK", e.getMessage());
        }
        return "";
    }

    public static void c(Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_URL)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = "";
            new h(context).a("", "", "", "", "fetch OM failed, OMID_JS_H5_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new com.mbridge.msdk.omsdk.a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_H5_URL, (com.mbridge.msdk.foundation.same.net.wrapper.e) null, new c(context), "om_sdk", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            } catch (Exception e) {
                o0.b("OMSDK", e.getMessage());
            }
        }
    }

    public static void b(Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = "";
            new h(context).a("", "", "", "", "fetch OM failed, OMID_JS_SERVICE_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new com.mbridge.msdk.omsdk.a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_SERVICE_URL, (com.mbridge.msdk.foundation.same.net.wrapper.e) null, new a(context), "om_sdk", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            } catch (Exception e) {
                o0.b("OMSDK", e.getMessage());
            }
        }
    }

    public static void c(String str) {
        new Thread(new d(str)).start();
    }

    public static void b(String str) {
        new Thread(new RunnableC0218b(str)).start();
    }

    private static void a(Context context) {
        C5049xn0 c5049xn0 = AbstractC2845Vx.d;
        if (c5049xn0.b()) {
            return;
        }
        c5049xn0.a(context.getApplicationContext());
    }

    public static String a() {
        try {
            return m0.e(new File(e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e) {
            o0.a("OMSDK", e.getMessage());
            return "";
        }
    }

    private static List<C3719ih0> a(String str, Context context, String str2, String str3, String str4, String str5) {
        C3719ih0 c3719ih0A;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (str != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    String strOptString = jSONObjectOptJSONObject.optString("vkey", "");
                    URL url = new URL(jSONObjectOptJSONObject.optString("et_url", ""));
                    String strOptString2 = jSONObjectOptJSONObject.optString("verification_p", "");
                    if (TextUtils.isEmpty(strOptString2)) {
                        if (TextUtils.isEmpty(strOptString)) {
                            c3719ih0A = new C3719ih0(null, url, null);
                        } else {
                            c3719ih0A = new C3719ih0(null, url, null);
                        }
                    } else {
                        c3719ih0A = C3719ih0.a(strOptString, url, strOptString2);
                    }
                    arrayList.add(c3719ih0A);
                }
            }
        } catch (IllegalArgumentException e) {
            o0.b("OMSDK", e.getMessage());
            new h(context).a(str2, str5, str3, str4, "failed, exception " + e.getMessage());
        } catch (MalformedURLException e2) {
            o0.b("OMSDK", e2.getMessage());
            new h(context).a(str2, str5, str3, str4, "failed, exception " + e2.getMessage());
        } catch (JSONException e3) {
            o0.b("OMSDK", e3.getMessage());
            new h(context).a(str2, str5, str3, str4, "failed, exception " + e3.getMessage());
        }
        return arrayList;
    }

    public static N2 a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(campaignEx.getOmid())) {
            return a(context, webView, (String) null, EnumC5218zk.DEFINED_BY_JAVASCRIPT);
        }
        o0.a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(campaignEx.getOmid()) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new h(context).a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), campaignEx.getCampaignUnitId(), "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    public static N2 a(Context context, WebView webView, String str, EnumC5218zk enumC5218zk) {
        a(context);
        Y60 y60B = Y60.b(EnumC5218zk.HTML_DISPLAY, EnumC3522gT.NONE);
        AbstractC2995aW.e("Mintegral", "Name is null or empty");
        AbstractC2995aW.e(MBConfiguration.SDK_VERSION, "Version is null or empty");
        Ig0 ig0 = new Ig0("Mintegral", MBConfiguration.SDK_VERSION, 2);
        AbstractC2995aW.d(webView, "WebView is null");
        if (str != null && str.length() > 256) {
            throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
        }
        C3203cn0 c3203cn0B = N2.b(y60B, new TN(ig0, webView, null, null, null, str, S2.HTML));
        c3203cn0B.d(webView);
        return c3203cn0B;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = b();
        }
        return TextUtils.isEmpty(str) ? str : str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", f1725a);
    }
}
