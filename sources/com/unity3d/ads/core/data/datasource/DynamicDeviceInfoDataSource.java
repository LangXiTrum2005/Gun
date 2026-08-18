package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface DynamicDeviceInfoDataSource {
    DynamicDeviceInfoOuterClass.DynamicDeviceInfo fetch();

    String getConnectionTypeStr();

    int getCurrentUiTheme();

    List<String> getLocaleList();

    String getOrientation();

    int getRingerMode();

    InterfaceC4443qv getVolumeSettingsChange();

    boolean hasInternet();
}
