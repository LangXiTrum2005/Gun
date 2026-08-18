package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.newreward.controller.d;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.reward.controller.a;
import com.mbridge.msdk.util.b;
import com.mbridge.msdk.video.bt.module.orglistener.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MBBidRewardVideoHandler implements BaseExtraInterfaceForHandler {
    private static final String REFACTOR_SWITCH_REWARD_VIDEO = "new_bridge_reward_video";
    private static final String TAG = "MBBidRewardVideoHandler";
    private String cancelText;
    private String confirmContent;
    private String confirmText;
    private String confirmTitle;
    private a controller;
    private d newController;
    private String placementId;
    private String unitId;
    private boolean refactorAvailable = false;
    private g listener = null;
    private int isSilent = 2;
    private boolean isRewardPlusOpen = false;
    private boolean isSetListenerNewController = false;
    private boolean isSetListenerController = false;
    private boolean isConfigAlertDialogTextController = false;
    private boolean isConfigAlertDialogTextNewController = false;

    public MBBidRewardVideoHandler(Context context, String str, String str2) {
        if (c.n().d() == null && context != null) {
            c.n().b(context);
        }
        initData(str, str2);
    }

    private void checkAndCreateController() {
        if (this.controller == null) {
            initMBBidRewardVideoHandler(this.placementId, this.unitId);
        }
        configController();
    }

    private void checkAndCreateNewController() {
        if (this.newController == null) {
            initMBNewBidRewardVideoHandler(this.placementId, this.unitId);
        }
        configNewController();
    }

    private void configController() {
        if (this.controller == null) {
            return;
        }
        if (this.isSetListenerController) {
            if (b.a()) {
                this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(this.listener, this.unitId, true));
            } else {
                this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(this.listener));
            }
            this.isSetListenerController = false;
        }
        this.controller.f(this.isRewardPlusOpen);
        this.controller.a(this.isSilent);
        if (this.isConfigAlertDialogTextController) {
            this.controller.a(this.confirmTitle, this.confirmContent, this.confirmText, this.cancelText);
            this.isConfigAlertDialogTextController = false;
        }
    }

    private void configNewController() {
        d dVar = this.newController;
        if (dVar == null) {
            return;
        }
        if (this.isSetListenerNewController) {
            dVar.setRewardVideoListener(new RewardVideoListenerWrapper(this.listener));
            this.isSetListenerNewController = false;
        }
        this.newController.b(this.isRewardPlusOpen);
        this.newController.a(this.isSilent);
        if (this.isConfigAlertDialogTextNewController) {
            MBridgeGlobalCommon.setAlertDialogText(this.unitId, this.confirmTitle, this.confirmContent, this.confirmText, this.cancelText);
            this.isConfigAlertDialogTextNewController = false;
        }
    }

    private void initData(String str, String str2) {
        String strE = t0.e(str2);
        if (!TextUtils.isEmpty(strE)) {
            t0.b(str2, strE);
        }
        this.placementId = str;
        this.unitId = str2;
        boolean zA = com.mbridge.msdk.foundation.same.b.b().a(REFACTOR_SWITCH_REWARD_VIDEO);
        this.refactorAvailable = zA;
        if (zA) {
            checkAndCreateNewController();
        } else {
            checkAndCreateController();
        }
    }

    private void initMBBidRewardVideoHandler(String str, String str2) {
        try {
            if (this.controller == null) {
                a aVar = new a();
                this.controller = aVar;
                aVar.d(false);
                this.controller.e(true);
                this.controller.c(str, str2);
            }
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage(), th);
        }
    }

    private void initMBNewBidRewardVideoHandler(String str, String str2) {
        if (this.newController == null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            this.newController = new d(94, str, str2, true);
        }
    }

    public void clearVideoCache() {
        if (this.refactorAvailable) {
            return;
        }
        try {
            a aVar = this.controller;
            if (aVar != null) {
                aVar.e();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreativeIdWithUnitId() {
        if (this.refactorAvailable) {
            d dVar = this.newController;
            return dVar != null ? dVar.b() : "";
        }
        a aVar = this.controller;
        return aVar != null ? aVar.j() : "";
    }

    public String getRequestId() {
        if (this.refactorAvailable) {
            d dVar = this.newController;
            return dVar != null ? dVar.c() : "";
        }
        a aVar = this.controller;
        return aVar != null ? aVar.m() : "";
    }

    public boolean isBidReady() {
        if (this.refactorAvailable) {
            checkAndCreateNewController();
            d dVar = this.newController;
            if (dVar != null) {
                return dVar.a(true);
            }
            return false;
        }
        checkAndCreateController();
        a aVar = this.controller;
        if (aVar != null) {
            return aVar.c(true);
        }
        return false;
    }

    public void loadFromBid(String str) {
        boolean zA = com.mbridge.msdk.foundation.same.b.b().a(REFACTOR_SWITCH_REWARD_VIDEO);
        this.refactorAvailable = zA;
        if (zA) {
            checkAndCreateNewController();
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a(true, str);
                return;
            }
            return;
        }
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a(true, str, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 94, this.unitId, true, 2));
        }
    }

    public void playVideoMute(int i) {
        this.isSilent = i;
        if (this.refactorAvailable) {
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a(i);
                return;
            }
            return;
        }
        a aVar = this.controller;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.confirmTitle = str;
        this.confirmContent = str2;
        this.confirmText = str3;
        this.cancelText = str4;
        this.isConfigAlertDialogTextController = true;
        this.isConfigAlertDialogTextNewController = true;
        MBridgeGlobalCommon.setAlertDialogText(this.unitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.n().a(this.unitId, jSONObject);
    }

    public void setRewardPlus(boolean z) {
        this.isRewardPlusOpen = z;
        if (this.refactorAvailable) {
            d dVar = this.newController;
            if (dVar != null) {
                dVar.b(z);
                return;
            }
            return;
        }
        a aVar = this.controller;
        if (aVar != null) {
            aVar.f(z);
        }
    }

    public void setRewardVideoListener(g gVar) {
        d dVar;
        a aVar;
        this.listener = gVar;
        this.isSetListenerController = true;
        if (!this.refactorAvailable && (aVar = this.controller) != null && !aVar.u()) {
            if (b.a()) {
                this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(gVar, this.unitId, true));
            } else {
                this.controller.a(new com.mbridge.msdk.video.bt.module.orglistener.a(gVar));
            }
            this.isSetListenerController = false;
        }
        this.isSetListenerNewController = true;
        if (!this.refactorAvailable || (dVar = this.newController) == null || dVar.d()) {
            return;
        }
        this.newController.setRewardVideoListener(new RewardVideoListenerWrapper(gVar));
        this.isSetListenerNewController = false;
    }

    public void showFromBid() {
        if (this.refactorAvailable) {
            checkAndCreateNewController();
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a("", "", "");
                return;
            }
            return;
        }
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a((String) null, (String) null, (String) null, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 94, this.unitId, false, -1));
        }
    }

    public void showFromBid(String str) {
        if (this.refactorAvailable) {
            checkAndCreateNewController();
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a("", str, "");
                return;
            }
            return;
        }
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a((String) null, str, (String) null, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 94, this.unitId, false, -1));
        }
    }

    public MBBidRewardVideoHandler(String str, String str2) {
        initData(str, str2);
    }

    public void showFromBid(String str, String str2) {
        if (this.refactorAvailable) {
            checkAndCreateNewController();
            d dVar = this.newController;
            if (dVar != null) {
                dVar.a("", str, str2);
                return;
            }
            return;
        }
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.a((String) null, str, str2, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(1, 94, this.unitId, false, -1));
        }
    }
}
