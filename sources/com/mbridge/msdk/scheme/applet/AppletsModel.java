package com.mbridge.msdk.scheme.applet;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.same.net.exception.a;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.scheme.report.AppletsReport;
import com.mbridge.msdk.scheme.request.AppletSchemeRequest;
import com.mbridge.msdk.scheme.response.AppletSchemeResponse;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AppletsModel implements Serializable {
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_0 = "0";
    private static final String DYNAMIC_VIEW_WX_IS_REDIRECT_1 = "1";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK = "event_callback";
    private static final String DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK = "install_callback";
    public static final int REQUEST_TYPE_CLICK = 1;
    public static final int REQUEST_TYPE_SHOW = 0;
    private static String TAG = "AppletsModel";
    private static final String URL_ENCODE_UTF_8 = "UTF-8";
    private static final String WX_MINIPROGRAM = "wx_miniprogram";
    private static final int WX_SCHEME_REQUEST_ERROR_CODE_44993 = 44993;
    private volatile IAppletSchemeCallBack appletSchemeCallBack;
    private final CampaignEx campaignEx;
    private String deepLink = "";
    private volatile boolean isRequestSuccess = false;
    private boolean isRequestTimesMaxPerDay = false;
    private volatile boolean isRequesting = false;
    private boolean isSupportWxScheme = false;
    private boolean isUserClick = false;
    private int lastRequestType = -1;
    private Map<String, String> params;
    private String reBuildClickUrl;
    private final String requestId;
    private final String unitID;

    public static final class DefaultAppletSchemeResponse extends AppletSchemeResponse {
        private AppletsModel appletsModel;

        public DefaultAppletSchemeResponse(AppletsModel appletsModel) {
            this.appletsModel = appletsModel;
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onError(a aVar) {
            super.onError(aVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            this.appletsModel.handlerSchemeRequestNetworkError(aVar);
        }

        @Override // com.mbridge.msdk.scheme.response.AppletSchemeResponse, com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
        public void onSuccess(e<JSONObject> eVar) {
            super.onSuccess(eVar);
            AppletsModel appletsModel = this.appletsModel;
            if (appletsModel == null) {
                return;
            }
            appletsModel.changeRequestingState(false);
            if (eVar == null || eVar.c == null) {
                this.appletsModel.handlerRequestNetworkError();
                return;
            }
            try {
                this.appletsModel.handlerSchemeRequestResult(eVar);
            } catch (SchemeRequestException e) {
                this.appletsModel.handlerSchemeRequestFailed(-2, e.getMessage());
            }
        }
    }

    public static final class SchemeRequestException extends Exception {
        public SchemeRequestException(String str) {
            super(str);
        }
    }

    public AppletsModel(CampaignEx campaignEx, String str, String str2) {
        this.campaignEx = campaignEx;
        this.unitID = str;
        this.requestId = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeRequestingState(boolean z) {
        this.isRequesting = z;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00be A[Catch: Exception -> 0x0078, TRY_LEAVE, TryCatch #3 {Exception -> 0x0078, blocks: (B:14:0x0045, B:16:0x0054, B:21:0x0067, B:23:0x006f, B:35:0x00ab, B:37:0x00be, B:32:0x0088, B:34:0x008c, B:50:0x00e8, B:60:0x0102, B:70:0x011c, B:71:0x011f, B:79:0x0139, B:81:0x0147, B:82:0x015d, B:76:0x012f, B:78:0x0133, B:67:0x0112, B:69:0x0116, B:57:0x00f8, B:59:0x00fc, B:47:0x00de, B:49:0x00e2, B:61:0x0105, B:41:0x00d1, B:51:0x00eb, B:28:0x007d), top: B:100:0x0045, inners: #0, #1, #4, #5, #7 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b1  */
    private Map<String, String> getAppletsParamsAndBuildRequest(CampaignEx campaignEx) {
        String str;
        String str2;
        String str3;
        String strEncode;
        String str4 = MBridgeConstans.DYNAMIC_VIEW_WX_IS_REDIRECT;
        String str5 = "query";
        HashMap map = new HashMap();
        if (campaignEx == null) {
            return map;
        }
        try {
            Uri uri = Uri.parse(campaignEx.getClickURL());
            if (uri != null && uri.getQueryParameterNames() != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = uri.getQueryParameterNames().iterator();
                int i = 0;
                try {
                    try {
                        while (true) {
                            String queryParameter = "";
                            if (!it.hasNext()) {
                                break;
                            }
                            try {
                                Iterator<String> it2 = it;
                                String next = it.next();
                                if (TextUtils.isEmpty(next) || TextUtils.equals(next, "wx_miniprogram")) {
                                    str4 = str4;
                                    str5 = str5;
                                } else {
                                    try {
                                        queryParameter = uri.getQueryParameter(next);
                                    } catch (Exception unused) {
                                    }
                                    String strEncode2 = queryParameter;
                                    if (TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_EVENT_CALLBACK) || TextUtils.equals(next, DYNAMIC_VIEW_WX_QUERY_PARAM_INSTALL_CALLBACK)) {
                                        try {
                                            strEncode2 = URLEncoder.encode(strEncode2, "UTF-8");
                                        } catch (Exception e) {
                                            if (MBridgeConstans.DEBUG) {
                                                o0.b(TAG, "encode url for " + strEncode2 + " failed", e);
                                            }
                                            sb.append(next);
                                            sb.append("=");
                                            sb.append(strEncode2);
                                            if (i < uri.getQueryParameterNames().size()) {
                                                sb.append("&");
                                            }
                                            i++;
                                            it = it2;
                                            str4 = str4;
                                            str5 = str5;
                                        }
                                    }
                                    sb.append(next);
                                    sb.append("=");
                                    sb.append(strEncode2);
                                    if (i < uri.getQueryParameterNames().size()) {
                                        sb.append("&");
                                    }
                                    i++;
                                }
                                it = it2;
                                str4 = str4;
                                str5 = str5;
                            } catch (Exception e2) {
                                e = e2;
                                if (MBridgeConstans.DEBUG) {
                                    o0.b(TAG, "create wechat app request param failed ", e);
                                }
                            }
                            e = e2;
                            if (MBridgeConstans.DEBUG) {
                                o0.b(TAG, "create wechat app request param failed ", e);
                            }
                            return map;
                        }
                        String queryParameter2 = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID);
                        str3 = queryParameter2 == null ? "" : queryParameter2;
                    } catch (Exception e3) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b(TAG, "create wechat app request param failed ", e3);
                        }
                    }
                    strEncode = URLEncoder.encode(sb.toString(), "UTF-8");
                    if (strEncode == null) {
                        strEncode = "";
                    }
                } catch (UnsupportedEncodingException e4) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b(TAG, "create wechat app request param failed ", e4);
                    }
                }
                String str6 = str4;
                String str7 = str5;
                try {
                    String queryParameter3 = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                    str = queryParameter3 == null ? "" : queryParameter3;
                } catch (Exception e5) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b(TAG, "create wechat app request param failed ", e5);
                    }
                }
                map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, str);
                try {
                    String queryParameter4 = uri.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
                    str2 = queryParameter4 == null ? "" : queryParameter4;
                } catch (Exception e6) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b(TAG, "create wechat app request param failed ", e6);
                    }
                }
                map.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, str2);
                map.put(MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID, str3);
                map.put(str7, strEncode);
                map.put(str6, "0");
                if (MBridgeConstans.DEBUG) {
                    o0.a(TAG, "query: " + strEncode);
                }
                this.reBuildClickUrl = reCreateClickUrl(MBridgeConstans.DYNAMIC_VIEW_WX_APP + "=" + str + "&" + MBridgeConstans.DYNAMIC_VIEW_WX_PATH + "=" + str2 + "&" + str7 + "=" + strEncode + "&" + MBridgeConstans.DYNAMIC_VIEW_WX_CLICKID + "=" + str3 + "&" + str6 + "=1");
                return map;
            }
            return map;
        } catch (Exception e7) {
            e = e7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerRequestNetworkError() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            o0.a(TAG, "handlerRequestNetworkError response or result is null");
        }
        try {
            this.appletSchemeCallBack.onNetworkError(1, "response or result is null", this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b(TAG, "handler request network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "response or result is null", this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestFailed(int i, String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            o0.a(TAG, "handlerSchemeRequestFailed network error by code " + String.valueOf(i) + " and " + str);
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestFailed(i, str, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b(TAG, "handler wx scheme failed exception  ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), AbstractC5044xl.m("network error by code ", String.valueOf(i), " and ", str), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestNetworkError(a aVar) {
        int i;
        String message;
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (aVar != null) {
            i = aVar.f1202a;
            message = aVar.getMessage();
            if (i == 10) {
                message = "request timeout";
            }
        } else {
            i = -1;
            message = "unKnown";
        }
        if (MBridgeConstans.DEBUG) {
            o0.a(TAG, "handlerSchemeRequestNetworkError network error by code " + String.valueOf(i) + " and " + message);
        }
        try {
            this.appletSchemeCallBack.onNetworkError(i, "network error: " + message, this.reBuildClickUrl);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b(TAG, "handler wx scheme network error exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), AbstractC5044xl.m("network error by code ", String.valueOf(i), " and ", message), this.unitID, this.requestId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlerSchemeRequestResult(e<JSONObject> eVar) throws SchemeRequestException {
        JSONObject jSONObject = eVar.c;
        if (MBridgeConstans.DEBUG) {
            o0.a("AppletsModel", "result: " + jSONObject.toString());
        }
        if (jSONObject.has("wx_scheme")) {
            String strOptString = jSONObject.optString("wx_scheme", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new SchemeRequestException("wx_scheme value is null");
            }
            this.isRequestSuccess = true;
            handlerSchemeRequestSuccess(strOptString);
            return;
        }
        int iOptInt = jSONObject.optInt("error_code", -1);
        String strOptString2 = jSONObject.optString("error_msg", "");
        if (iOptInt == WX_SCHEME_REQUEST_ERROR_CODE_44993) {
            this.isRequestTimesMaxPerDay = true;
        }
        handlerSchemeRequestFailed(iOptInt, strOptString2);
    }

    private void handlerSchemeRequestStart() {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        try {
            this.appletSchemeCallBack.onAppletSchemeRequestStart();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b(TAG, "handler wx scheme start exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "start load wx scheme", this.unitID, this.requestId);
    }

    private void handlerSchemeRequestSuccess(String str) {
        if (this.appletSchemeCallBack == null) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            AbstractC3888ke0.s("handlerSchemeRequestSuccess: ", str, TAG);
        }
        try {
            this.deepLink = str;
            this.appletSchemeCallBack.onAppletSchemeRequestSuccess(str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b(TAG, "handler wx scheme success exception ", e);
            }
        }
        AppletsReport.reportAppletsLoadState(c.n().d(), "request wx scheme success", this.unitID, this.requestId);
    }

    private boolean isCanRequestByClickUrl(String str) {
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx == null) {
                return false;
            }
            String clickURL = campaignEx.getClickURL();
            if (TextUtils.isEmpty(clickURL)) {
                return false;
            }
            return TextUtils.equals(z0.a(clickURL, "wx_miniprogram"), str);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            o0.b(TAG, "query wx_miniprogram from click url exception ", e);
            return false;
        }
    }

    private boolean isCanRequestByLinkType() {
        CampaignEx campaignEx = this.campaignEx;
        if (campaignEx == null) {
            return false;
        }
        int linkType = campaignEx.getLinkType();
        return linkType == 8 || linkType == 9;
    }

    private boolean isCanRequestByTemplateUrl(String str) {
        CampaignEx.c rewardTemplateMode;
        try {
            CampaignEx campaignEx = this.campaignEx;
            if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null && !TextUtils.isEmpty(rewardTemplateMode.e())) {
                return TextUtils.equals(z0.a(rewardTemplateMode.e(), MBridgeConstans.DYNAMIC_VIEW_REQ_WX_URL), str);
            }
            return false;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            o0.b(TAG, "query reqwxurl from template url exception ", e);
            return false;
        }
    }

    private String reCreateClickUrl(String str) {
        return AbstractC5044xl.p(new StringBuilder(), d.h().b, "?", str);
    }

    public boolean can(int i) {
        if (isRequesting() || !canRequestWxScheme(i)) {
            return false;
        }
        if (this.lastRequestType == -1) {
            return true;
        }
        if (isRequestSuccess()) {
            return false;
        }
        int i2 = this.lastRequestType;
        return (i2 == 0 && i == 1) || (i2 == 1 && i == 1 && this.isUserClick);
    }

    public boolean canRequestWxScheme(int i) {
        if (!isSupportWxScheme()) {
            return false;
        }
        if (i != 0) {
            return i == 1;
        }
        return isCanRequestByTemplateUrl("2");
    }

    public void clearRequestState() {
        this.isRequestSuccess = false;
        this.isRequesting = false;
        this.appletSchemeCallBack = null;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getReBuildClickUrl() {
        return this.reBuildClickUrl;
    }

    public boolean isRequestSuccess() {
        return this.isRequestSuccess;
    }

    public boolean isRequestTimesMaxPerDay() {
        return this.isRequestTimesMaxPerDay;
    }

    public boolean isRequesting() {
        return this.isRequesting;
    }

    public boolean isSupportWxScheme() {
        if (!this.isSupportWxScheme) {
            this.isSupportWxScheme = isCanRequestByClickUrl("1") && isCanRequestByLinkType();
        }
        return this.isSupportWxScheme;
    }

    public void requestWxAppletsScheme(int i, IAppletSchemeCallBack iAppletSchemeCallBack) {
        if (this.campaignEx == null || TextUtils.isEmpty(this.unitID)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            o0.b(TAG, "start request wx scheme");
        }
        this.isRequesting = true;
        if (iAppletSchemeCallBack != null) {
            this.appletSchemeCallBack = iAppletSchemeCallBack;
        }
        handlerSchemeRequestStart();
        AppletSchemeRequest appletSchemeRequest = new AppletSchemeRequest(c.n().d());
        if (this.params == null) {
            this.params = getAppletsParamsAndBuildRequest(this.campaignEx);
        }
        if (this.params == null) {
            return;
        }
        if (isRequestTimesMaxPerDay()) {
            handlerSchemeRequestFailed(WX_SCHEME_REQUEST_ERROR_CODE_44993, "get wxscheme failed : request times is max");
        } else {
            this.lastRequestType = i;
            appletSchemeRequest.get(1, d.h().b, this.params, new DefaultAppletSchemeResponse(this), "applets_model", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        }
    }

    public void setAppletSchemeCallBack(IAppletSchemeCallBack iAppletSchemeCallBack) {
        this.appletSchemeCallBack = iAppletSchemeCallBack;
    }

    public void setRequestingFinish() {
        this.isRequesting = false;
    }

    public void setUserClick(boolean z) {
        this.isUserClick = z;
    }
}
