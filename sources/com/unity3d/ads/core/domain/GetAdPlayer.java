package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;

/* JADX INFO: loaded from: classes4.dex */
public interface GetAdPlayer {
    AdPlayer invoke(WebViewBridge webViewBridge, AndroidWebViewContainer androidWebViewContainer, ByteString byteString);
}
