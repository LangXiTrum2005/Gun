package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface ScarManager {
    Object getSignals(List<? extends InitializationResponseOuterClass.AdFormat> list, InterfaceC2857Wj interfaceC2857Wj);

    Object getVersion(InterfaceC2857Wj interfaceC2857Wj);

    Object loadAd(String str, String str2, String str3, String str4, String str5, int i, InterfaceC2857Wj interfaceC2857Wj);

    InterfaceC4443qv loadBannerAd(Context context, BannerView bannerView, ScarAdMetadata scarAdMetadata, UnityBannerSize unityBannerSize, String str);

    InterfaceC4443qv show(String str, String str2);
}
