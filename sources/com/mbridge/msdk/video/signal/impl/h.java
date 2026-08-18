package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.o0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes2.dex */
public class h implements com.mbridge.msdk.video.signal.j {
    @Override // com.mbridge.msdk.video.signal.j
    public void alertWebViewShowed() {
        o0.a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void closeVideoOperate(int i, int i2) {
        o0.a("DefaultJSVideoModule", "closeOperte:close=" + i + "closeViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void dismissAllAlert() {
        o0.a("DefaultJSVideoModule", "dismissAllAlert");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public String getCurrentProgress() {
        o0.a("DefaultJSVideoModule", "getCurrentProgress");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void hideAlertView(int i) {
        o0.a("DefaultJSVideoModule", "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void notifyCloseBtn(int i) {
        o0.a("DefaultJSVideoModule", "notifyCloseBtn:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressBarOperate(int i) {
        o0.a("DefaultJSVideoModule", "progressBarOperate:progressViewVisible=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void progressOperate(int i, int i2) {
        o0.a("DefaultJSVideoModule", "progressOperate:progress=" + i + "progressViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setCover(boolean z) {
        o0.a("DefaultJSVideoModule", "setCover:" + z);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setMiniEndCardState(boolean z) {
        o0.a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setScaleFitXY(int i) {
        o0.a("DefaultJSVideoModule", "setScaleFitXY:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void setVisible(int i) {
        o0.a("DefaultJSVideoModule", "setVisible:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showAlertView() {
        o0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showIVRewardAlertView(String str) {
        o0.a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        StringBuilder sbT = AbstractC3950lJ.t("showVideoLocation:marginTop=", i, ",marginLeft=", i2, ",width=");
        AbstractC3888ke0.t(sbT, i3, ",height=", i4, ",radius=");
        AbstractC3888ke0.t(sbT, i5, ",borderTop=", i6, ",borderTop=");
        AbstractC3888ke0.t(sbT, i6, ",borderLeft=", i7, ",borderWidth=");
        sbT.append(i8);
        sbT.append(",borderHeight=");
        sbT.append(i9);
        o0.a("DefaultJSVideoModule", sbT.toString());
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i, int i2) {
        o0.a("DefaultJSVideoModule", "soundOperate:mute=" + i + ",soundViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void videoOperate(int i) {
        o0.a("DefaultJSVideoModule", "videoOperate:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.j
    public void soundOperate(int i, int i2, String str) {
        StringBuilder sbT = AbstractC3950lJ.t("soundOperate:mute=", i, ",soundViewVisible=", i2, ",pt=");
        sbT.append(str);
        o0.a("DefaultJSVideoModule", sbT.toString());
    }
}
