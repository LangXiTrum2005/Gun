package com.unity3d.services.core.extensions;

import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes4.dex */
public final class StringExtensionsKt {
    public static final String toUnityMessage(String str) {
        return (str == null || str.length() == 0) ? "[Unity Ads] Internal error" : AbstractC3888ke0.i(UnityAdsConstants.Messages.MSG_UNITY_BASE, str);
    }
}
