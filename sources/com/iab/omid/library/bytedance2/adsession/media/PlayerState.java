package com.iab.omid.library.bytedance2.adsession.media;

import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2390Ej;

/* JADX INFO: loaded from: classes3.dex */
public enum PlayerState {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED(MRAIDCommunicatorUtil.STATES_EXPANDED),
    FULLSCREEN(C2390Ej.TEMPLATE_TYPE_FULLSCREEN);

    private final String playerState;

    PlayerState(String str) {
        this.playerState = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.playerState;
    }
}
