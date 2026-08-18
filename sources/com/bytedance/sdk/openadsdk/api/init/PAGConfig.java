package com.bytedance.sdk.openadsdk.api.init;

import android.text.TextUtils;
import com.bytedance.sdk.component.ebl.ZU.lk;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.PAGConstant;
import com.bytedance.sdk.openadsdk.core.foI;
import com.bytedance.sdk.openadsdk.utils.Sfi;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ro0;

/* JADX INFO: loaded from: classes2.dex */
public final class PAGConfig implements InitConfig {
    private static String JVA;
    private boolean LD;
    private String Lxb;
    private boolean OY;
    private String QAg;
    private int lk;
    private String nBu;
    private int ZU = -1;
    private int JXs = -1;
    private int lc = -1;
    private int ebl = 0;

    public static class Builder {
        private String JVA;
        private boolean LD;
        private String Lxb;
        private String[] QAg;
        private int lk;
        private String nBu;
        private int ZU = -1;
        private int JXs = -1;
        private int lc = -1;
        private int ebl = 0;
        private boolean OY = false;

        public Builder appIcon(int i) {
            this.lk = i;
            return this;
        }

        public Builder appId(String str) {
            this.Lxb = str;
            return this;
        }

        public PAGConfig build() {
            PAGConfig pAGConfig = new PAGConfig();
            pAGConfig.LD(this.Lxb);
            pAGConfig.LD(this.ZU);
            pAGConfig.Lxb(this.lk);
            pAGConfig.JXs(this.ebl);
            pAGConfig.LD(this.OY);
            pAGConfig.lk(this.JXs);
            pAGConfig.ZU(this.lc);
            pAGConfig.Lxb(this.LD);
            pAGConfig.lk(this.nBu);
            pAGConfig.Lxb(this.JVA);
            return pAGConfig;
        }

        public Builder debugLog(boolean z) {
            this.LD = z;
            return this;
        }

        public Builder needClearTaskReset(String... strArr) {
            this.QAg = strArr;
            return this;
        }

        public Builder setChildDirected(@PAGConstant.PAGChildDirectedType int i) {
            this.ZU = i;
            return this;
        }

        public Builder setDoNotSell(@PAGConstant.PAGDoNotSellType int i) {
            this.lc = i;
            return this;
        }

        public Builder setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i) {
            this.JXs = i;
            return this;
        }

        public Builder setPackageName(String str) {
            this.nBu = str;
            return this;
        }

        public Builder setUserData(String str) {
            this.JVA = str;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.OY = z;
            return this;
        }

        public Builder titleBarTheme(int i) {
            this.ebl = i;
            return this;
        }

        public Builder useTextureView(boolean z) {
            return this;
        }
    }

    public static void debugLog(boolean z) {
        if (foI.Lxb() != null) {
            if (z) {
                foI.Lxb().JXs(1);
                foI.Lxb().Lxb();
            } else {
                foI.Lxb().JXs(0);
                lk.Lxb(lk.Lxb.OFF);
                sLN.lk();
                Sfi.LD();
            }
        }
    }

    public static int getChildDirected() {
        if (nJ.QAg("getCoppa")) {
            return foI.Lxb().LD();
        }
        return -1;
    }

    public static int getDoNotSell() {
        if (nJ.QAg("getCCPA")) {
            return foI.Lxb().lc();
        }
        return -1;
    }

    public static int getGDPRConsent() {
        if (!nJ.QAg("getGdpr")) {
            return -1;
        }
        int iLk = foI.Lxb().lk();
        if (iLk == 1) {
            return 0;
        }
        if (iLk == 0) {
            return 1;
        }
        return iLk;
    }

    public static void setAppIconId(int i) {
        if (foI.Lxb() != null) {
            foI.Lxb().lc(i);
        }
    }

    public static void setChildDirected(@PAGConstant.PAGChildDirectedType int i) {
        if (nJ.QAg("setCoppa")) {
            if (i < -1 || i > 1) {
                i = -1;
            }
            foI.Lxb().LD(i);
        }
    }

    public static void setDoNotSell(@PAGConstant.PAGDoNotSellType int i) {
        if (nJ.QAg("setCCPA")) {
            if (i < -1 || i > 1) {
                i = -1;
            }
            foI.Lxb().ZU(i);
        }
    }

    public static void setGDPRConsent(@PAGConstant.PAGGDPRConsentType int i) {
        nJ.QAg("setGdpr");
        if (i < -1 || i > 1) {
            i = -1;
        }
        foI.Lxb().lk(i);
    }

    public static void setPackageName(String str) {
        JVA = str;
    }

    public static void setUserData(String str) {
        if (foI.Lxb() != null) {
            foI.Lxb().LD(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getAppIconId() {
        return this.lk;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getAppId() {
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCcpa() {
        return this.lc;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getCoppa() {
        return this.ZU;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getData() {
        return this.nBu;
    }

    public boolean getDebugLog() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getGdpr() {
        return this.JXs;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public String getPackageName() {
        return TextUtils.isEmpty(this.QAg) ? JVA : this.QAg;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public int getTitleBarTheme() {
        return this.ebl;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isSupportMultiProcess() {
        return this.OY;
    }

    @Override // com.bytedance.sdk.openadsdk.InitConfig
    public boolean isUseTextureView() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public void JXs(int i) {
        this.ebl = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZU(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.lc = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.JXs = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(String str) {
        this.Lxb = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str) {
        this.nBu = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(String str) {
        this.QAg = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(int i) {
        if (i < -1 || i > 1) {
            i = -1;
        }
        this.ZU = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(boolean z) {
        this.LD = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(boolean z) {
        this.OY = z;
        Ro0.c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(int i) {
        this.lk = i;
    }
}
