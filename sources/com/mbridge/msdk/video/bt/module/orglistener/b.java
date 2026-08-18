package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.o0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f2131a = null;
    private Boolean b = null;

    public void a() {
        this.b = Boolean.TRUE;
    }

    public void b() {
        this.f2131a = Boolean.TRUE;
    }

    public Boolean c() {
        return this.b;
    }

    public Boolean d() {
        return this.f2131a;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        o0.a("ShowRewardListener", "onAdShow");
        this.f2131a = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        AbstractC3888ke0.s("onVideoComplete: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z, com.mbridge.msdk.videocommon.entity.c cVar2) {
        o0.a("ShowRewardListener", "onAdClose:isCompleteView:" + z + ",reward:" + cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        AbstractC3888ke0.s("onShowFail:", str, "ShowRewardListener");
        this.b = Boolean.TRUE;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z, String str, String str2) {
        AbstractC3888ke0.s("onVideoAdClicked:", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z, int i) {
        o0.a("ShowRewardListener", "onAdCloseWithIVReward: " + z + "  " + i);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        AbstractC3888ke0.s("onEndcardShow: ", str2, "ShowRewardListener");
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i, String str, String str2) {
        AbstractC3888ke0.s("onAutoLoad: ", str2, "ShowRewardListener");
    }
}
