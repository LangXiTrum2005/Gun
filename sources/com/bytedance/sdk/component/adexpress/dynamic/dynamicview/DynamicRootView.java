package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.ZU, com.bytedance.sdk.component.adexpress.theme.Lxb {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private JXs dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.LD.JVA mRenderListener;
    private com.bytedance.sdk.component.adexpress.LD.NXR mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.LD muteListener;
    protected final com.bytedance.sdk.component.adexpress.LD.STP renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.lk> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.JXs videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.LD.NXR nxr, com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb lxb) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.LD.STP stp = new com.bytedance.sdk.component.adexpress.LD.STP();
        this.renderResult = stp;
        stp.Lxb(2);
        this.mDynamicClickListener = lxb;
        lxb.Lxb(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.Lxb(this);
        this.mIsMute = z;
        this.mRenderRequest = nxr;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        com.bytedance.sdk.component.adexpress.dynamic.ZU.lc lcVarJXs;
        com.bytedance.sdk.component.adexpress.dynamic.ZU.JXs jXsNBu = oy.nBu();
        if (jXsNBu == null || (lcVarJXs = jXsNBu.JXs()) == null) {
            return;
        }
        this.renderResult.LD(lcVarJXs.LRt());
    }

    private boolean checkSizeValid() {
        JXs jXs = this.dynamicBaseWidget;
        return jXs.JXs > 0.0f && jXs.lc > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !oy.aH()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i, String str) {
        this.renderResult.Lxb(false);
        this.renderResult.LD(i);
        this.renderResult.Lxb(str);
        this.mRenderListener.Lxb(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.LD.JVA getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.LD.NXR getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.lk> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.Lxb
    public void onThemeChanged(int i) {
        JXs jXs = this.dynamicBaseWidget;
        if (jXs == null) {
            return;
        }
        jXs.Lxb(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void onvideoComplate() {
        try {
            this.videoListener.Lxb();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, int i) {
        this.dynamicBaseWidget = renderDynamicView(oy, this, i);
        this.renderResult.Lxb(true);
        this.renderResult.Lxb(this.dynamicBaseWidget.JXs);
        this.renderResult.LD(this.dynamicBaseWidget.lc);
        this.renderResult.Lxb(this.videoView);
        this.mRenderListener.Lxb(this.renderResult);
    }

    public JXs renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy, ViewGroup viewGroup, int i) {
        if (oy == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> listJVA = oy.JVA();
        JXs jXsLxb = com.bytedance.sdk.component.adexpress.dynamic.Lxb.LD.Lxb(this.mContext, this, oy);
        if (jXsLxb instanceof nE) {
            callBackRenderFail(i == 3 ? 128 : EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(oy);
        jXsLxb.lk();
        if (viewGroup != null) {
            viewGroup.addView(jXsLxb);
            setClipChildren(viewGroup, oy);
        }
        if (listJVA == null || listJVA.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> it = listJVA.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), jXsLxb, i);
        }
        return jXsLxb;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setDislikeView(View view) {
        this.mDynamicClickListener.LD(view);
    }

    public void setLogoUnionHeight(int i) {
        this.logoUnionHeight = i;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.LD ld) {
        this.muteListener = ld;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.LD.JVA jva) {
        this.mRenderListener = jva;
        this.mDynamicClickListener.Lxb(jva);
    }

    public void setScoreCountWithIcon(int i) {
        this.scoreCountWithIcon = i;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void setSoundMute(boolean z) {
        com.bytedance.sdk.component.adexpress.dynamic.LD ld = this.muteListener;
        if (ld != null) {
            ld.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        for (int i3 = 0; i3 < this.timeOutListener.size(); i3++) {
            if (this.timeOutListener.get(i3) != null) {
                this.timeOutListener.get(i3).Lxb(charSequence, i == 1, i2, z);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.lk lkVar) {
        this.timeOutListener.add(lkVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ZU
    public void setTimeUpdate(int i) {
        this.videoListener.setTimeUpdate(i);
    }

    public void setTimedown(int i) {
        this.timedown = i;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.JXs jXs) {
        this.videoListener = jXs;
    }

    public void updateRenderInfoForVideo(double d, double d2, double d3, double d4, float f) {
        this.renderResult.lk(d);
        this.renderResult.ZU(d2);
        this.renderResult.JXs(d3);
        this.renderResult.lc(d4);
        this.renderResult.Lxb(f);
        this.renderResult.LD(f);
        this.renderResult.lk(f);
        this.renderResult.ZU(f);
    }

    public void beginShowFromInvisible(JXs jXs, int i) {
        if (jXs == null) {
            return;
        }
        if (jXs.getBeginInvisibleAndShow()) {
            jXs.setVisibility(i);
            View view = jXs.IeN;
            if (view != null) {
                view.setVisibility(i);
            }
        }
        int childCount = jXs.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            if (jXs.getChildAt(i2) instanceof JXs) {
                beginShowFromInvisible((JXs) jXs.getChildAt(i2), i);
            }
        }
    }
}
