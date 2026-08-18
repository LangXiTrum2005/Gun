package com.mbridge.msdk.newreward.function.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.w0;
import com.mbridge.msdk.newreward.function.core.campaign.a;
import com.mbridge.msdk.newreward.function.core.campaign.b;
import com.mbridge.msdk.newreward.function.core.resource.d;
import com.mbridge.msdk.newreward.function.core.resource.n;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MBridgeGlobalCommon {
    public static String SESSION_ID = "";
    public static Map<String, h> showRewardListenerMap = new HashMap();

    public static String addQueryParameter(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                String strEncode = URLEncoder.encode(str2, C.UTF8_NAME);
                String strEncode2 = URLEncoder.encode(str3, C.UTF8_NAME);
                StringBuilder sb = new StringBuilder(str);
                if (!str.contains("?")) {
                    sb.append("?");
                } else if (!str.endsWith("&") && !str.endsWith("?")) {
                    sb.append("&");
                }
                sb.append(strEncode);
                sb.append("=");
                sb.append(strEncode2);
                return sb.toString();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("MBridgeGlobalCommon", "addQueryParameter", e);
                }
            }
        }
        return "";
    }

    public static String getIsReadyNotReadyReasonType(b bVar) {
        if (bVar == null) {
            return "8";
        }
        d<?> dVarH = bVar.h();
        if (dVarH != null && !dVarH.j()) {
            return "4";
        }
        if (!bVar.H()) {
            return "10";
        }
        List<a> listG = bVar.g();
        if (listG == null || listG.isEmpty()) {
            return "8";
        }
        for (a aVar : listG) {
            if (aVar != null) {
                n nVarF = aVar.f();
                if (nVarF != null && !nVarF.j()) {
                    return "1";
                }
                d<?> dVarG = aVar.g();
                if (dVarG != null && !dVarG.j()) {
                    return "2";
                }
                d<?> dVarB = aVar.b();
                if (dVarB != null && !dVarB.j()) {
                    return "6";
                }
            }
        }
        return "0";
    }

    public static void handlerCampaigns(String str, b bVar, List<CampaignEx> list, List<a> list2) {
        if (bVar == null || list == null || list2 == null) {
            return;
        }
        for (CampaignEx campaignEx : list) {
            try {
                campaignEx.setRequestId(bVar.t());
                campaignEx.setLocalRequestId(str);
                campaignEx.setCampaignUnitId(bVar.E());
                a aVar = new a(bVar);
                aVar.c(campaignEx.getRequestIdNotice());
                aVar.b(campaignEx.getAppName());
                aVar.a(campaignEx.getId());
                aVar.a(campaignEx);
                list2.add(aVar);
                if (!com.mbridge.msdk.foundation.same.b.b().a("new_bridge_reward_show") && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) && campaignEx.getAdSpaceT() != 2) {
                    String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                    boolean zI = t0.i(cMPTEntryUrl);
                    bVar.b(!zI);
                    if (!zI) {
                        cMPTEntryUrl = addQueryParameter(cMPTEntryUrl, "dyview", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE);
                    }
                    campaignEx.setCMPTEntryUrl(cMPTEntryUrl);
                }
                if (TextUtils.isEmpty(bVar.e())) {
                    bVar.c(campaignEx.getCMPTEntryUrl());
                    bVar.a(campaignEx.getMof_tplid());
                }
                long candidateCacheTime = campaignEx.getCandidateCacheTime();
                if (candidateCacheTime > 0) {
                    bVar.a((candidateCacheTime * 1000) + System.currentTimeMillis());
                }
                bVar.k(campaignEx.getVcn());
                bVar.j(campaignEx.getTokenRule());
                CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                if (!com.mbridge.msdk.foundation.same.b.b().a("new_bridge_reward_show")) {
                    if (rewardTemplateMode != null) {
                        bVar.c(rewardTemplateMode.b());
                        String strE = rewardTemplateMode.e();
                        if (!TextUtils.isEmpty(strE) && campaignEx.getAdSpaceT() != 2) {
                            boolean zI2 = t0.i(strE);
                            aVar.b(!zI2);
                            if (!zI2) {
                                strE = addQueryParameter(strE, "dyview", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE);
                            }
                            rewardTemplateMode.c(strE);
                            campaignEx.setRewardTemplateMode(rewardTemplateMode);
                        }
                    }
                    String str2 = campaignEx.getendcard_url();
                    if (!TextUtils.isEmpty(str2)) {
                        boolean zL = t0.l(str2);
                        boolean zI3 = t0.i(str2);
                        if (!zL && !zI3) {
                            campaignEx.setendcard_url(addQueryParameter(str2, "isplayableec", "0"));
                        }
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("MBridgeGlobalCommon", "handlerCampaigns", e);
                }
            }
        }
        bVar.a(list);
        bVar.b(list2);
    }

    public static void setAlertDialogText(String str, String str2, String str3, String str4, String str5) {
        Context contextD = c.n().d();
        if (!TextUtils.isEmpty(str2)) {
            w0.b(contextD, AbstractC3888ke0.i("MBridge_ConfirmTitle", str), str2.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            w0.b(contextD, AbstractC3888ke0.i("MBridge_ConfirmContent", str), str3.trim());
        }
        if (!TextUtils.isEmpty(str5)) {
            w0.b(contextD, AbstractC3888ke0.i("MBridge_CancelText", str), str5.trim());
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        w0.b(contextD, AbstractC3888ke0.i("MBridge_ConfirmText", str), str4.trim());
    }
}
