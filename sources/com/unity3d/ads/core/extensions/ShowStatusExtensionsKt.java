package com.unity3d.ads.core.extensions;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.model.ShowStatus;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class ShowStatusExtensionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShowStatus.values().length];
            try {
                iArr[ShowStatus.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShowStatus.SKIPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(ShowStatus showStatus) {
        AbstractC2995aW.q(showStatus, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[showStatus.ordinal()];
        if (i == 1) {
            return UnityAds.UnityAdsShowCompletionState.COMPLETED;
        }
        if (i == 2) {
            return UnityAds.UnityAdsShowCompletionState.SKIPPED;
        }
        throw new IllegalStateException("Unexpected show status: " + showStatus);
    }
}
