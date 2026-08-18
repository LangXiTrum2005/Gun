package com.mbridge.msdk.video.bt.module.orglistener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.bc;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f2132a = "com.mbridge.msdk.video.bt.module.orglistener.f";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                n nVarA = n.a(com.mbridge.msdk.foundation.db.g.a(context));
                if (TextUtils.isEmpty(str) || nVarA == null || nVarA.a() <= 0) {
                    return;
                }
                List<m> listA = nVarA.a("m_download_end");
                List<m> listA2 = nVarA.a("2000021");
                List<m> listA3 = nVarA.a("2000039");
                List<m> listA4 = nVarA.a("m_download_end");
                List<m> listA5 = nVarA.a("m_download_end");
                List<m> listA6 = nVarA.a("2000044");
                o.e(listA2);
                o.a(listA);
                o.c(listA3);
                o.b(listA4);
                o.f(listA5);
                o.d(listA6);
            } catch (Exception e) {
                o0.b(f2132a, e.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, int i) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000054");
            jSONObject.put(bc.T, k0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put("reason", "");
            jSONObject.put("templateshowtype", i + " offer show success");
            jSONObject.put("result", 2);
            jSONObject.put("ad_type", campaignEx.getAdType() == 287 ? 3 : 1);
            String str2 = campaignEx.getendcard_url();
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("creative", URLEncoder.encode(str2, C.UTF8_NAME));
            }
            jSONObject.put("devid", com.mbridge.msdk.foundation.tools.f.d());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th) {
            o0.b(f2132a, th.getMessage());
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, int i) {
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000054");
                jSONObject.put(bc.T, k0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
                jSONObject.put("reason", str2);
                jSONObject.put("templateshowtype", i);
                jSONObject.put("result", 1);
                String str3 = campaignEx.getendcard_url();
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put("creative", URLEncoder.encode(str3, C.UTF8_NAME));
                }
                jSONObject.put("devid", com.mbridge.msdk.foundation.tools.f.d());
                jSONObject.put("ad_type", campaignEx.getAdType() == 287 ? 3 : 1);
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            }
        } catch (Throwable th) {
            o0.b(f2132a, th.getMessage());
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str) {
        if (context == null || list == null) {
            return;
        }
        try {
            if (list.isEmpty() || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000054");
            jSONObject.put(bc.T, k0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(list.get(i).getId());
            }
            jSONObject.put(BidResponsedEx.KEY_CID, arrayList);
            jSONObject.put("result", 2);
            if (list.get(0) != null) {
                CampaignEx campaignEx = list.get(0);
                jSONObject.put("reason", "");
                jSONObject.put("templateshowtype", "two offer ec show success");
                jSONObject.put("ad_type", campaignEx.getAdType());
                jSONObject.put("devid", com.mbridge.msdk.foundation.tools.f.d());
                jSONObject.put("rid", campaignEx.getRequestId());
                jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th) {
            o0.b(f2132a, th.getMessage());
        }
    }

    public static void a(Context context, List<CampaignEx> list, String str, String str2) {
        if (context == null || list == null) {
            return;
        }
        try {
            if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty(str2))) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000054");
                jSONObject.put(bc.T, k0.s(context));
                jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(list.get(i).getId());
                }
                jSONObject.put(BidResponsedEx.KEY_CID, arrayList);
                jSONObject.put("reason", str2);
                jSONObject.put("result", 1);
                jSONObject.put("devid", com.mbridge.msdk.foundation.tools.f.d());
                if (list.get(0) != null) {
                    CampaignEx campaignEx = list.get(0);
                    jSONObject.put("ad_type", campaignEx.getAdType());
                    jSONObject.put("rid", campaignEx.getRequestId());
                    jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
                    jSONObject.put("templateshowtype", campaignEx.getMof_tplid());
                    jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            }
        } catch (Throwable th) {
            o0.b(f2132a, th.getMessage());
        }
    }

    public static void a(CampaignEx campaignEx, String str, int i) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null || campaignEx == null || TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000115");
            jSONObject.put(bc.T, k0.s(contextD));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put("play_cur_time", i);
            jSONObject.put("reason", "close ad in advance " + campaignEx.getMof_tplid());
            jSONObject.put("result", 1);
            jSONObject.put("devid", com.mbridge.msdk.foundation.tools.f.d());
            jSONObject.put("ad_type", campaignEx.getAdType());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th) {
            o0.b(f2132a, th.getMessage());
        }
    }
}
