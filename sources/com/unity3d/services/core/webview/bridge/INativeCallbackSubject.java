package com.unity3d.services.core.webview.bridge;

/* JADX INFO: loaded from: classes4.dex */
public interface INativeCallbackSubject {
    NativeCallback getCallback(String str);

    void remove(NativeCallback nativeCallback);
}
