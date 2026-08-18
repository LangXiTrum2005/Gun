package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.PiiOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface DeviceInfoRepository {
    StaticDeviceInfoOuterClass.StaticDeviceInfo cachedStaticDeviceInfo();

    InterfaceC4309pQ getAllowedPii();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuidByteString(InterfaceC2857Wj interfaceC2857Wj);

    Object getAuidString(InterfaceC2857Wj interfaceC2857Wj);

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    DynamicDeviceInfoOuterClass.DynamicDeviceInfo getDynamicDeviceInfo();

    boolean getHasInternet();

    Object getIdfi(InterfaceC2857Wj interfaceC2857Wj);

    List<String> getLocaleList();

    String getManufacturer();

    String getModel();

    String getOrientation();

    String getOsVersion();

    PiiOuterClass.Pii getPiiData();

    int getRingerMode();

    long getSystemBootTime();

    InterfaceC4443qv getVolumeSettingsChange();

    Object staticDeviceInfo(InterfaceC2857Wj interfaceC2857Wj);
}
