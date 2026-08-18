package com.google.ads.mediation.vungle;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3856kD;

/* JADX INFO: loaded from: classes2.dex */
public interface SdkWrapper {
    String getBiddingToken(Context context);

    String getSdkVersion();

    void init(Context context, String str, InterfaceC3856kD interfaceC3856kD);

    boolean isInitialized();
}
