package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();

    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    public static /* synthetic */ void getToken$annotations() {
    }

    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        AbstractC2995aW.p(version, "getInstance().version");
        return version;
    }

    public static /* synthetic */ void getVersion$annotations() {
    }

    public static final void initialize(Context context, String str) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, null);
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static /* synthetic */ void isSupported$annotations() {
    }

    public static final void load(String str) {
        load(str, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds.load.1
            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsAdLoaded(String str2) {
                AbstractC2995aW.q(str2, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
            }

            @Override // com.unity3d.ads.IUnityAdsLoadListener
            public void onUnityAdsFailedToLoad(String str2, UnityAdsLoadError unityAdsLoadError, String str3) {
                AbstractC2995aW.q(str2, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
                AbstractC2995aW.q(unityAdsLoadError, "error");
                AbstractC2995aW.q(str3, PglCryptUtils.KEY_MESSAGE);
            }
        });
    }

    public static final void setDebugMode(boolean z) {
        UnityAdsImplementation.getInstance().setDebugMode(z);
    }

    public static final void show(Activity activity, String str) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), null);
    }

    public static final void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAdsImplementation.getInstance().getToken(iUnityAdsTokenListener);
    }

    public static final void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public static final void load(String str, IUnityAdsLoadListener iUnityAdsLoadListener) {
        UnityAdsImplementation.getInstance().load(str, new UnityAdsLoadOptions(), iUnityAdsLoadListener);
    }

    public static final void show(Activity activity, String str, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, new UnityAdsShowOptions(), iUnityAdsShowListener);
    }

    public static final void initialize(Context context, String str, boolean z) {
        UnityAdsImplementation.getInstance().initialize(context, str, z, null);
    }

    public static final void load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener) {
        IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
        if (unityAdsLoadOptions == null) {
            unityAdsLoadOptions = new UnityAdsLoadOptions();
        }
        unityAdsImplementation.load(str, unityAdsLoadOptions, iUnityAdsLoadListener);
    }

    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, null);
    }

    public static final void initialize(Context context, String str, boolean z, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAdsImplementation.getInstance().initialize(context, str, z, iUnityAdsInitializationListener);
    }

    public static final void show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, IUnityAdsShowListener iUnityAdsShowListener) {
        UnityAdsImplementation.getInstance().show(activity, str, unityAdsShowOptions, iUnityAdsShowListener);
    }
}
