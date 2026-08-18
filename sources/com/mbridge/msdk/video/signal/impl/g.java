package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.o0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public class g implements com.mbridge.msdk.video.signal.i {
    @Override // com.mbridge.msdk.video.signal.i
    public void a(String str) {
        AbstractC3888ke0.s("setOrientation,landscape=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.i
    public String b() {
        o0.a("js", "getEndScreenInfo");
        return "{}";
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void handlerPlayableException(String str) {
        AbstractC3888ke0.s("handlerPlayableException，msg=", str, "js");
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void notifyCloseBtn(int i) {
        o0.a("js", "notifyCloseBtn,state=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.h
    public void toggleCloseBtn(int i) {
        o0.a("js", "toggleCloseBtn,state=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.i
    public void triggerCloseBtn(String str) {
        AbstractC3888ke0.s("triggerCloseBtn,state=", str, "js");
    }
}
