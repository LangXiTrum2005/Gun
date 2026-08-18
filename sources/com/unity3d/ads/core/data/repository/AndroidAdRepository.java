package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidAdRepository implements AdRepository {
    private final ConcurrentHashMap<ByteString, AdObject> loadedAds = new ConcurrentHashMap<>();

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object addAd(ByteString byteString, AdObject adObject, InterfaceC2857Wj interfaceC2857Wj) {
        this.loadedAds.put(byteString, adObject);
        return C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object getAd(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        return this.loadedAds.get(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object hasOpportunityId(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        return Boolean.valueOf(this.loadedAds.containsKey(byteString));
    }

    @Override // com.unity3d.ads.core.data.repository.AdRepository
    public Object removeAd(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        this.loadedAds.remove(byteString);
        return C5033xf0.f5238a;
    }
}
