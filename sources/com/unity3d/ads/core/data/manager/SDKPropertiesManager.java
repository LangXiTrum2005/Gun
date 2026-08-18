package com.unity3d.ads.core.data.manager;

import com.unity3d.services.core.properties.SdkProperties;

/* JADX INFO: loaded from: classes4.dex */
public interface SDKPropertiesManager {
    SdkProperties.InitializationState getCurrentInitializationState();

    void setInitializationTime();

    void setInitializationTimeSinceEpoch();

    void setInitializeState(SdkProperties.InitializationState initializationState);

    void setInitialized(boolean z);
}
