package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.w0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k extends l {
    private Activity t;
    private String u;
    private String v;
    private CampaignEx x;
    private List<CampaignEx> y;
    private int z;
    private int w = 0;
    private String A = "";
    private String B = "";
    private boolean C = false;
    private boolean D = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2375a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ int e;

        public a(String str, String str2, String str3, String str4, int i) {
            this.f2375a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(k.this.t.getApplication())).a(new com.mbridge.msdk.foundation.entity.m("2000039", this.f2375a, this.b, this.c, this.d, k.this.x.getId(), this.e, k0.a(k.this.t.getApplication(), this.e)));
        }
    }

    public k(Activity activity, CampaignEx campaignEx) {
        this.t = activity;
        this.x = campaignEx;
    }

    private String A() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceId", this.A);
            jSONObject2.put("rootViewInstanceId", this.B);
            jSONObject2.put("isRootTemplateWebView", this.C);
            jSONObject.put("sdk_info", "MAL_16.9.41,3.0.1");
            jSONObject2.put("playVideoMute", this.n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<CampaignEx> list = this.y;
            if (list == null || list.size() <= 0) {
                jSONArray.put(CampaignEx.campaignToJsonObject(this.x));
            } else {
                for (CampaignEx campaignEx : this.y) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(campaignEx, campaignEx.isReady(), b(campaignEx)));
                }
            }
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String strE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strE)) {
                JSONObject jSONObject3 = new JSONObject(strE);
                c(jSONObject3);
                String strC = com.mbridge.msdk.setting.h.b().c(this.j);
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject3.put("ivreward", new JSONObject(strC));
                }
                jSONObject.put("appSetting", jSONObject3);
            }
            jSONObject.put("rewardSetting", w());
            if (!TextUtils.isEmpty(this.j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            }
            jSONObject.put("rw_plus", this.D ? "1" : "0");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject.toString();
    }

    private JSONObject B() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.j)) {
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.j);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject C() {
        JSONObject jSONObject = new JSONObject();
        try {
            com.mbridge.msdk.videocommon.setting.c cVar = this.k;
            if (cVar != null) {
                jSONObject.put("unitSetting", cVar.H());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject s() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strE)) {
                jSONObject.put("appSetting", new JSONObject(strE));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject t() {
        JSONObject jSONObject = new JSONObject();
        a(jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.n);
            jSONObject.put("sdkSetting", jSONObject2);
            a(jSONObject);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(CampaignEx.campaignToJsonObject(this.x));
            jSONObject.put("campaignList", jSONArray);
            jSONObject.put("unitSetting", x());
            String strE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b());
            if (!TextUtils.isEmpty(strE)) {
                JSONObject jSONObject3 = new JSONObject(strE);
                c(jSONObject3);
                String strC = com.mbridge.msdk.setting.h.b().c(this.j);
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject3.put("ivreward", strC);
                }
                jSONObject.put("appSetting", jSONObject3.toString());
            }
            jSONObject.put("rewardSetting", w());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject w() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
        return aVarC != null ? aVarC.k() : jSONObject;
    }

    private JSONObject x() {
        JSONObject jSONObject = new JSONObject();
        com.mbridge.msdk.videocommon.setting.c cVar = this.k;
        return cVar != null ? cVar.H() : jSONObject;
    }

    private JSONObject y() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_info", "MAL_16.9.41,3.0.1");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private JSONObject z() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("playVideoMute", this.n);
            jSONObject2.put("instanceId", this.A);
            jSONObject.put("sdkSetting", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public void c(CampaignEx campaignEx) {
        this.x = campaignEx;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.e
    public void click(int i, String str) {
        AppletsModel appletsModel;
        List<CampaignEx> list;
        int i2;
        super.click(i, str);
        CampaignEx campaignEx = this.x;
        if (campaignEx != null && campaignEx.getDynamicTempCode() == 5) {
            b(str);
        }
        try {
            if (i == 1) {
                if (this.x == null && (list = this.y) != null && list.size() > 0) {
                    this.x = this.y.get(0);
                }
                CampaignEx campaignEx2 = this.x;
                if (campaignEx2 == null) {
                    return;
                }
                CampaignEx campaignExA = a(str, campaignEx2);
                if (this.w != 3) {
                    this.w = i;
                }
                a(campaignExA);
                if (campaignExA != null && (appletsModel = AppletModelManager.getInstance().get(campaignExA)) != null) {
                    appletsModel.setUserClick(true);
                    AppletModelManager.getInstance().replace(appletsModel, campaignExA);
                }
                a(campaignExA, this.t);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.m.a(true);
                return;
            }
            CampaignEx campaignEx3 = this.x;
            if (campaignEx3 == null || campaignEx3.getCbd() <= -2) {
                com.mbridge.msdk.videocommon.setting.c cVar = this.k;
                if (cVar != null) {
                    i2 = cVar.i();
                }
                this.w = i;
                click(1, str);
            }
            i2 = this.x.getCbd();
            if (i2 == -1) {
                a(new com.mbridge.msdk.video.signal.impl.a.b(this, this.m));
            }
            this.w = i;
            click(1, str);
        } catch (Throwable th) {
            o0.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    public void d(String str) {
        this.B = str;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String e() {
        o0.a("DefaultJSCommon", "getNotchArea");
        return this.v;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void f() {
        super.f();
        try {
            Activity activity = this.t;
            if (activity != null) {
                activity.finish();
            }
        } catch (Throwable th) {
            o0.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playVideoMute", this.n);
            jSONObject.put("userVideoMute", this.o);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public void h(int i) {
        this.z = i;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.e
    public void handlerH5Exception(int i, String str) {
        super.handlerH5Exception(i, str);
        try {
            this.m.a(i, str);
        } catch (Throwable th) {
            o0.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    public void r() {
        this.u = "";
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void setActivity(Activity activity) {
        this.t = activity;
    }

    public int v() {
        return this.z;
    }

    private void b(String str) {
        List<CampaignEx> list;
        if (this.x == null || (list = this.y) == null || list.size() == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("camp_position")) {
                this.x = this.y.get(jSONObject.getInt("camp_position"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void a(List<CampaignEx> list) {
        this.y = list;
    }

    public void c(boolean z) {
        this.C = z;
    }

    public void d(boolean z) {
        this.D = z;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void h() {
        super.h();
        com.mbridge.msdk.video.signal.a.InterfaceC0270a interfaceC0270a = this.m;
        if (interfaceC0270a != null) {
            interfaceC0270a.a();
        }
    }

    private CampaignEx a(String str, CampaignEx campaignEx) {
        String strValueOf;
        String strValueOf2;
        if (TextUtils.isEmpty(str)) {
            return campaignEx;
        }
        if (TextUtils.isEmpty(str) && campaignEx == null) {
            return null;
        }
        if (!str.contains("notice")) {
            try {
                JSONObject jSONObjectCampaignToJsonObject = CampaignEx.campaignToJsonObject(campaignEx);
                CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject);
                if (campaignWithBackData == null) {
                    campaignWithBackData = campaignEx;
                }
                if (!TextUtils.isEmpty(str)) {
                    a(jSONObjectCampaignToJsonObject, campaignWithBackData);
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(com.mbridge.msdk.foundation.same.a.j);
                    if (jSONObjectOptJSONObject != null) {
                        strValueOf = String.valueOf(t0.a(this.t, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.h)).intValue()));
                        strValueOf2 = String.valueOf(t0.a(this.t, Integer.valueOf(jSONObjectOptJSONObject.getString(com.mbridge.msdk.foundation.same.a.i)).intValue()));
                    } else {
                        strValueOf = "-999";
                        strValueOf2 = "-999";
                    }
                    campaignWithBackData.setClickURL(com.mbridge.msdk.click.c.a(campaignWithBackData.getClickURL(), strValueOf, strValueOf2));
                    String noticeUrl = campaignWithBackData.getNoticeUrl();
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        StringBuilder sb = new StringBuilder();
                        while (itKeys.hasNext()) {
                            sb.append("&");
                            String next = itKeys.next();
                            String strOptString = jSONObjectOptJSONObject.optString(next);
                            if (com.mbridge.msdk.foundation.same.a.h.equals(next) || com.mbridge.msdk.foundation.same.a.i.equals(next)) {
                                strOptString = String.valueOf(t0.a(this.t, Integer.valueOf(strOptString).intValue()));
                            }
                            sb.append(next);
                            sb.append("=");
                            sb.append(strOptString);
                        }
                        campaignWithBackData.setNoticeUrl(noticeUrl + ((Object) sb));
                    }
                }
                return campaignWithBackData;
            } catch (JSONException e) {
                e.printStackTrace();
                return campaignEx;
            } catch (Throwable th) {
                th.printStackTrace();
                return campaignEx;
            }
        }
        try {
            JSONObject jSONObjectCampaignToJsonObject2 = CampaignEx.campaignToJsonObject(campaignEx);
            JSONObject jSONObject = new JSONObject(str);
            b(jSONObject);
            try {
                if (!jSONObject.has(CampaignEx.JSON_KEY_DEEP_LINK_URL)) {
                    jSONObjectCampaignToJsonObject2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, "");
                }
            } catch (Exception unused) {
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObjectCampaignToJsonObject2.put(next2, jSONObject.getString(next2));
            }
            CampaignEx campaignWithBackData2 = CampaignEx.parseCampaignWithBackData(jSONObjectCampaignToJsonObject2);
            a(jSONObjectCampaignToJsonObject2, campaignWithBackData2);
            return campaignWithBackData2;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return campaignEx;
        }
    }

    public void c(String str) {
        this.A = str;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String c() {
        this.m.onInitSuccess();
        this.f2371a = true;
        if (TextUtils.isEmpty(this.u)) {
            this.u = A();
        } else {
            this.u = t0.b(this.u, "tun", k0.y() + "");
        }
        return this.u;
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public String f(int i) {
        switch (i) {
            case 1:
                return y().toString();
            case 2:
                return B().toString();
            case 3:
                return s().toString();
            case 4:
                return C().toString();
            case 5:
                return u().toString();
            case 6:
                return z().toString();
            default:
                return t().toString();
        }
    }

    public k(Activity activity, CampaignEx campaignEx, List<CampaignEx> list) {
        this.t = activity;
        this.x = campaignEx;
        this.y = list;
    }

    private boolean b(CampaignEx campaignEx) {
        com.mbridge.msdk.setting.g gVarD;
        try {
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            long jA0 = (TextUtils.isEmpty(strB) || (gVarD = com.mbridge.msdk.setting.h.b().d(strB)) == null) ? 0L : gVarD.a0() * 1000;
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            long jE = aVarC != null ? aVarC.e() : 0L;
            if (campaignEx != null) {
                return campaignEx.isSpareOffer(jE, jA0);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private void c(JSONObject jSONObject) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String string = w0.a(contextD, "MBridge_ConfirmTitle" + this.j, "").toString();
            String string2 = w0.a(contextD, "MBridge_ConfirmContent" + this.j, "").toString();
            String string3 = w0.a(contextD, "MBridge_CancelText" + this.j, "").toString();
            String string4 = w0.a(contextD, "MBridge_ConfirmText" + this.j, "").toString();
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("confirm_title", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                jSONObject.put("confirm_description", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                jSONObject.put("confirm_t", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                jSONObject.put("confirm_c_play", string4);
            }
            if (TextUtils.isEmpty(string4)) {
                return;
            }
            jSONObject.put("confirm_c_rv", string4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, CampaignEx campaignEx) {
        try {
            String strOptString = jSONObject.optString("unitId");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            campaignEx.setCampaignUnitId(strOptString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void a(int i, String str) {
        super.a(i, str);
        if (i != 2) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            a aVar = new a(jSONObject.optString(NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT), jSONObject.optString("template", "-1"), jSONObject.optString(TtmlNode.TAG_LAYOUT, "-1"), jSONObject.optString(MBridgeConstans.PROPERTIES_UNIT_ID, this.j), k0.s(this.t.getApplication()));
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        } catch (Throwable th) {
            o0.b("DefaultJSCommon", th.getMessage(), th);
        }
    }

    private void a(CampaignEx campaignEx) {
        try {
            int i = this.w;
            if (i == 3) {
                campaignEx.setClickTempSource(2);
                if (campaignEx.getTriggerClickSource() == 0) {
                    campaignEx.setTriggerClickSource(2);
                    return;
                }
                return;
            }
            if (i != 1 || campaignEx.getClickTempSource() == 2) {
                return;
            }
            campaignEx.setClickTempSource(1);
        } catch (Exception e) {
            o0.b("DefaultJSCommon", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.a, com.mbridge.msdk.video.signal.a
    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.v = str;
    }
}
