package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public interface GetAdRequest {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 4) != 0) {
                bannerSize = null;
            }
            return getAdRequest.invoke(str, byteString, bannerSize, interfaceC2857Wj);
        }
    }

    Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, InterfaceC2857Wj interfaceC2857Wj);
}
