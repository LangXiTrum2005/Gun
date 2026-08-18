package com.mbridge.msdk.video.signal.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.w0;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f2378a;
    private MBridgeContainerView b;

    public o(Activity activity, MBridgeContainerView mBridgeContainerView) {
        this.f2378a = activity;
        this.b = mBridgeContainerView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public void a(String str) {
        super.a(str);
        try {
            if (this.f2378a != null && !TextUtils.isEmpty(str)) {
                if (str.equals("landscape")) {
                    this.f2378a.setRequestedOrientation(0);
                } else if (str.equals("portrait")) {
                    this.f2378a.setRequestedOrientation(1);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public String b() {
        if (this.b == null) {
            super.b();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.b.getCampaign());
                String unitID = this.b.getUnitID();
                com.mbridge.msdk.videocommon.setting.c cVarB = b(unitID);
                JSONObject jSONObject = new JSONObject();
                if (cVarB != null) {
                    jSONObject = cVarB.H();
                }
                o0.a("JSRewardVideoV1", "getEndScreenInfo success campaign = " + this.b.getCampaign());
                return a(arrayList, unitID, "MAL_16.9.41,3.0.1", jSONObject);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return super.b();
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public void handlerPlayableException(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.handlerPlayableException(str);
        try {
            if (this.f2378a == null || TextUtils.isEmpty(str) || (mBridgeContainerView = this.b) == null) {
                return;
            }
            mBridgeContainerView.handlerPlayableException(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i) {
        super.notifyCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.notifyCloseBtn(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i) {
        super.toggleCloseBtn(i);
        MBridgeContainerView mBridgeContainerView = this.b;
        if (mBridgeContainerView != null) {
            mBridgeContainerView.toggleCloseBtn(i);
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.g, com.mbridge.msdk.video.signal.i
    public void triggerCloseBtn(String str) {
        MBridgeContainerView mBridgeContainerView;
        super.triggerCloseBtn(str);
        try {
            if (this.f2378a == null || TextUtils.isEmpty(str) || !str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK) || (mBridgeContainerView = this.b) == null) {
                return;
            }
            mBridgeContainerView.triggerCloseBtn(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private String a(List<CampaignEx> list, String str, String str2, JSONObject jSONObject) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    Object camplistToJson = CampaignEx.parseCamplistToJson(list);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("campaignList", camplistToJson);
                    a(jSONObject2);
                    jSONObject2.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
                    jSONObject2.put("sdk_info", str2);
                    jSONObject2.put("unitSetting", jSONObject);
                    if (com.mbridge.msdk.setting.h.b() != null) {
                        String strE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b());
                        if (!TextUtils.isEmpty(strE)) {
                            JSONObject jSONObject3 = new JSONObject(strE);
                            a(jSONObject3, str);
                            String strC = com.mbridge.msdk.setting.h.b().c(str);
                            if (!TextUtils.isEmpty(strC)) {
                                jSONObject3.put("ivreward", new JSONObject(strC));
                            }
                            jSONObject2.put("appSetting", jSONObject3);
                        }
                    }
                    return jSONObject2.toString();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private com.mbridge.msdk.videocommon.setting.c b(String str) {
        if (com.mbridge.msdk.videocommon.setting.b.b() == null) {
            return null;
        }
        return com.mbridge.msdk.videocommon.setting.b.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str);
    }

    private void a(JSONObject jSONObject, String str) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            String string = w0.a(contextD, "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = w0.a(contextD, "MBridge_ConfirmContent" + str, "").toString();
            String string3 = w0.a(contextD, "MBridge_CancelText" + str, "").toString();
            String string4 = w0.a(contextD, "MBridge_ConfirmText" + str, "").toString();
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
}
