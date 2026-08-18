package com.bytedance.sdk.openadsdk;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sLN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SG;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AdSlot {
    public static final int TYPE_BANNER = 1;
    public static final int TYPE_CACHED_SPLASH = 4;
    public static final int TYPE_FEED = 5;
    public static final int TYPE_FULL_SCREEN_VIDEO = 8;
    public static final int TYPE_INTERACTION_AD = 2;
    public static final int TYPE_OPEN_AD = 3;
    public static final int TYPE_REWARD_VIDEO = 7;
    private Bundle CSn;
    private int DY;
    private int HD;
    private String IeN;
    private String JVA;
    private float JXs;
    private Map<String, Object> KPU;
    private int LD;
    private String Lxb;
    private boolean NXR;
    private String OY;
    private int QAg;
    private boolean STP;
    private int Sfi;
    private String VVE;
    private float ZU;
    private JSONArray aH;
    private String brP;
    private int eK;
    private boolean ebl;
    private boolean foI;
    private String id;
    private String kqm;
    private int lc;
    private int lk;
    private String nBu;
    private int sLN;
    private String tD;

    public static class Builder {
        private String HD;
        private String IeN;
        private float JVA;
        private String Lxb;
        private boolean NXR;
        private String OY;
        private String STP;
        private Bundle Sfi;
        private String VVE;
        private String brP;
        private int eK;
        private String kqm;
        private int nBu;
        private float sLN;
        private int LD = 640;
        private int lk = EnumC4719u30.WEBVIEW_ERROR_VALUE;
        private final boolean ZU = true;
        private int JXs = 1;
        private final String lc = "";
        private final int ebl = 0;
        private String QAg = "defaultUser";
        private boolean tD = true;
        private Map<String, Object> DY = null;

        public AdSlot build() {
            AdSlot adSlot = new AdSlot();
            adSlot.Lxb = this.Lxb;
            adSlot.lc = this.JXs;
            adSlot.ebl = true;
            adSlot.LD = this.LD;
            adSlot.lk = this.lk;
            float f = this.JVA;
            if (f <= 0.0f) {
                adSlot.ZU = this.LD;
                adSlot.JXs = this.lk;
            } else {
                adSlot.ZU = f;
                adSlot.JXs = this.sLN;
            }
            adSlot.OY = "";
            adSlot.QAg = 0;
            adSlot.nBu = this.OY;
            adSlot.JVA = this.QAg;
            adSlot.sLN = this.nBu;
            adSlot.NXR = this.tD;
            adSlot.STP = this.NXR;
            adSlot.IeN = this.STP;
            adSlot.VVE = this.IeN;
            adSlot.kqm = this.VVE;
            adSlot.brP = this.kqm;
            adSlot.tD = this.brP;
            adSlot.KPU = this.DY;
            adSlot.id = this.HD;
            adSlot.eK = this.eK;
            return adSlot;
        }

        public Builder isExpressAd(boolean z) {
            this.NXR = z;
            return this;
        }

        public Builder setAdCount(int i) {
            if (i <= 0) {
                i = 1;
            }
            if (i > 20) {
                i = 20;
            }
            this.JXs = i;
            return this;
        }

        public Builder setAdId(String str) {
            this.IeN = str;
            return this;
        }

        public Builder setCodeId(String str) {
            this.Lxb = str;
            return this;
        }

        public Builder setCreativeId(String str) {
            this.VVE = str;
            return this;
        }

        public Builder setDurationSlotType(int i) {
            this.eK = i;
            return this;
        }

        public Builder setExpressViewAcceptedSize(float f, float f2) {
            this.JVA = f;
            this.sLN = f2;
            return this;
        }

        public Builder setExt(String str) {
            this.kqm = str;
            return this;
        }

        public Builder setImageAcceptedSize(int i, int i2) {
            this.LD = i;
            this.lk = i2;
            return this;
        }

        public Builder setIsAutoPlay(boolean z) {
            this.tD = z;
            return this;
        }

        public Builder setLinkId(String str) {
            this.HD = str;
            return this;
        }

        public Builder setMediaExtra(String str) {
            this.OY = str;
            return this;
        }

        public Builder setNativeAdType(int i) {
            this.nBu = i;
            return this;
        }

        public Builder setNetworkExtrasBundle(Bundle bundle) {
            this.Sfi = bundle;
            return this;
        }

        public Builder setRequestExtraMap(Map<String, Object> map) {
            this.DY = map;
            return this;
        }

        @Deprecated
        public Builder setRewardAmount(int i) {
            return this;
        }

        @Deprecated
        public Builder setRewardName(String str) {
            return this;
        }

        @Deprecated
        public Builder setSupportDeepLink(boolean z) {
            return this;
        }

        public Builder setUserData(String str) {
            this.brP = str;
            return this;
        }

        public Builder setUserID(String str) {
            this.QAg = str;
            return this;
        }

        public Builder withBid(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (sLN.ZU()) {
                SG.a(str);
            }
            this.STP = str;
            return this;
        }
    }

    public static int getPosition(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return (i == 3 || i == 4 || i == 7 || i == 8) ? 5 : 3;
        }
        return 4;
    }

    public static AdSlot getSlot(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Builder builder = new Builder();
        try {
            int iOptInt = jSONObject.optInt("mImgAcceptedWidth", 640);
            int iOptInt2 = jSONObject.optInt("mImgAcceptedHeight", EnumC4719u30.WEBVIEW_ERROR_VALUE);
            double dOptDouble = jSONObject.optDouble("mExpressViewAcceptedWidth", 0.0d);
            double dOptDouble2 = jSONObject.optDouble("mExpressViewAcceptedHeight", 0.0d);
            builder.setCodeId(jSONObject.optString("mCodeId", null));
            builder.setAdCount(jSONObject.optInt("mAdCount", 1));
            builder.setIsAutoPlay(jSONObject.optBoolean("mIsAutoPlay"));
            builder.setImageAcceptedSize(iOptInt, iOptInt2);
            builder.setExpressViewAcceptedSize(Double.valueOf(dOptDouble).floatValue(), Double.valueOf(dOptDouble2).floatValue());
            builder.setSupportDeepLink(jSONObject.optBoolean("mSupportDeepLink", false));
            builder.setRewardName(jSONObject.optString("mRewardName", null));
            builder.setRewardAmount(jSONObject.optInt("mRewardAmount"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra", null));
            builder.setUserID(jSONObject.optString("mUserID", null));
            builder.setNativeAdType(jSONObject.optInt("mNativeAdType"));
            builder.isExpressAd(jSONObject.optBoolean("mIsExpressAd"));
            builder.withBid(jSONObject.optString("mBidAdm"));
            builder.setAdId(jSONObject.optString("mAdId"));
            builder.setCreativeId(jSONObject.optString("mCreativeId"));
            builder.setExt(jSONObject.optString("mExt"));
            builder.setMediaExtra(jSONObject.optString("mMediaExtra"));
        } catch (Exception unused) {
        }
        AdSlot adSlotBuild = builder.build();
        adSlotBuild.setDurationSlotType(jSONObject.optInt("mDurationSlotType"));
        return adSlotBuild;
    }

    public int getAdCount() {
        return this.lc;
    }

    public String getAdId() {
        return this.VVE;
    }

    public String getBidAdm() {
        return this.IeN;
    }

    public JSONArray getBiddingTokens() {
        return this.aH;
    }

    public String getCodeId() {
        return this.Lxb;
    }

    public String getCreativeId() {
        return this.kqm;
    }

    public int getDurationSlotType() {
        return this.eK;
    }

    public float getExpressViewAcceptedHeight() {
        return this.JXs;
    }

    public float getExpressViewAcceptedWidth() {
        return this.ZU;
    }

    public String getExt() {
        return this.brP;
    }

    public int getImgAcceptedHeight() {
        return this.lk;
    }

    public int getImgAcceptedWidth() {
        return this.LD;
    }

    public int getIsRotateBanner() {
        return this.DY;
    }

    public String getLinkId() {
        return this.id;
    }

    public String getMediaExtra() {
        return this.nBu;
    }

    public int getNativeAdType() {
        return this.sLN;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.CSn;
    }

    @Nullable
    public Map<String, Object> getRequestExtraMap() {
        return this.KPU;
    }

    @Deprecated
    public int getRewardAmount() {
        return this.QAg;
    }

    @Deprecated
    public String getRewardName() {
        return this.OY;
    }

    public int getRotateOrder() {
        return this.HD;
    }

    public int getRotateTime() {
        return this.Sfi;
    }

    public String getUserData() {
        return this.tD;
    }

    public String getUserID() {
        return this.JVA;
    }

    public boolean isAutoPlay() {
        return this.NXR;
    }

    public boolean isExpressAd() {
        return this.STP;
    }

    public boolean isPreload() {
        return this.foI;
    }

    public boolean isSupportDeepLink() {
        return this.ebl;
    }

    public void setAdCount(int i) {
        this.lc = i;
    }

    public void setBiddingTokens(JSONArray jSONArray) {
        this.aH = jSONArray;
    }

    public void setDurationSlotType(int i) {
        this.eK = i;
    }

    public void setIsRotateBanner(int i) {
        this.DY = i;
    }

    public void setNativeAdType(int i) {
        this.sLN = i;
    }

    public void setPreload(boolean z) {
        this.foI = z;
    }

    public void setRotateOrder(int i) {
        this.HD = i;
    }

    public void setRotateTime(int i) {
        this.Sfi = i;
    }

    public void setUserData(String str) {
        this.tD = str;
    }

    public JSONObject toJsonObj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mCodeId", this.Lxb);
            jSONObject.put("mAdCount", this.lc);
            jSONObject.put("mIsAutoPlay", this.NXR);
            jSONObject.put("mImgAcceptedWidth", this.LD);
            jSONObject.put("mImgAcceptedHeight", this.lk);
            jSONObject.put("mExpressViewAcceptedWidth", this.ZU);
            jSONObject.put("mExpressViewAcceptedHeight", this.JXs);
            jSONObject.put("mSupportDeepLink", this.ebl);
            jSONObject.put("mRewardName", this.OY);
            jSONObject.put("mRewardAmount", this.QAg);
            jSONObject.put("mMediaExtra", this.nBu);
            jSONObject.put("mUserID", this.JVA);
            jSONObject.put("mNativeAdType", this.sLN);
            jSONObject.put("mIsExpressAd", this.STP);
            jSONObject.put("mAdId", this.VVE);
            jSONObject.put("mCreativeId", this.kqm);
            jSONObject.put("mExt", this.brP);
            jSONObject.put("mBidAdm", this.IeN);
            jSONObject.put("mUserData", this.tD);
            jSONObject.put("mDurationSlotType", this.eK);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return super.toString();
    }

    private AdSlot() {
        this.NXR = true;
        this.STP = false;
        this.DY = 0;
        this.Sfi = 0;
        this.HD = 0;
    }
}
