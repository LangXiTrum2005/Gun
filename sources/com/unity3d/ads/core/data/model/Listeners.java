package com.unity3d.ads.core.data.model;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public interface Listeners {

    public static final class DefaultImpls {
        public static void onClick(Listeners listeners, String str) {
            AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        }

        public static void onComplete(Listeners listeners, String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
            AbstractC2995aW.q(unityAdsShowCompletionState, "state");
        }

        public static void onError(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
            AbstractC2995aW.q(unityAdsShowError, "error");
            AbstractC2995aW.q(str2, PglCryptUtils.KEY_MESSAGE);
        }

        public static void onLeftApplication(Listeners listeners, String str) {
            AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        }

        public static void onStart(Listeners listeners, String str) {
            AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        }
    }

    void onClick(String str);

    void onComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2);

    void onLeftApplication(String str);

    void onStart(String str);
}
