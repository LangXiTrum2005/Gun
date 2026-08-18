package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OmidOptions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, InterfaceC2857Wj interfaceC2857Wj);

    Object finishSession(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj);

    OMData getOmData();

    boolean hasSessionFinished(ByteString byteString);

    Object impressionOccurred(ByteString byteString, boolean z, InterfaceC2857Wj interfaceC2857Wj);

    boolean isOMActive();

    void setOMActive(boolean z);

    Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, InterfaceC2857Wj interfaceC2857Wj);
}
