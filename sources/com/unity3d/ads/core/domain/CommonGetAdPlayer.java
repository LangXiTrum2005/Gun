package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.banners.BannerViewCache;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final InterfaceC4514rk adPlayerScope;
    private final AbstractC3899kk defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final ExecuteAdViewerRequest executeAdViewerRequest;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final ScarManager scarManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, ExecuteAdViewerRequest executeAdViewerRequest, SendDiagnosticEvent sendDiagnosticEvent, AbstractC3899kk abstractC3899kk, InterfaceC4514rk interfaceC4514rk, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(executeAdViewerRequest, "executeAdViewerRequest");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(abstractC3899kk, "defaultDispatcher");
        AbstractC2995aW.q(interfaceC4514rk, "adPlayerScope");
        AbstractC2995aW.q(openMeasurementRepository, "openMeasurementRepository");
        AbstractC2995aW.q(scarManager, "scarManager");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.executeAdViewerRequest = executeAdViewerRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.defaultDispatcher = abstractC3899kk;
        this.adPlayerScope = interfaceC4514rk;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
    }

    @Override // com.unity3d.ads.core.domain.GetAdPlayer
    public AdPlayer invoke(WebViewBridge webViewBridge, AndroidWebViewContainer androidWebViewContainer, ByteString byteString) {
        AbstractC2995aW.q(webViewBridge, "webviewBridge");
        AbstractC2995aW.q(androidWebViewContainer, "webviewContainer");
        AbstractC2995aW.q(byteString, "opportunityId");
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webViewBridge, this.deviceInfoRepository, this.sessionRepository, this.executeAdViewerRequest, this.defaultDispatcher, this.sendDiagnosticEvent, androidWebViewContainer, this.adPlayerScope);
        if (BannerViewCache.getInstance().getBannerView(ProtobufExtensionsKt.toUUID(byteString).toString()) != null) {
            String string = ProtobufExtensionsKt.toUUID(byteString).toString();
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ScarManager scarManager = this.scarManager;
            AbstractC2995aW.p(string, "toString()");
            return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, string, androidWebViewContainer, openMeasurementRepository, scarManager);
        }
        String stringUtf8 = byteString.toStringUtf8();
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        SessionRepository sessionRepository = this.sessionRepository;
        OpenMeasurementRepository openMeasurementRepository2 = this.openMeasurementRepository;
        ScarManager scarManager2 = this.scarManager;
        AbstractC2995aW.p(stringUtf8, "toStringUtf8()");
        return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, stringUtf8, androidWebViewContainer, deviceInfoRepository, sessionRepository, openMeasurementRepository2, scarManager2);
    }
}
