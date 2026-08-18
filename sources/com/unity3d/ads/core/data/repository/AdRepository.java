package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public interface AdRepository {
    Object addAd(ByteString byteString, AdObject adObject, InterfaceC2857Wj interfaceC2857Wj);

    Object getAd(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj);

    Object hasOpportunityId(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj);

    Object removeAd(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj);
}
