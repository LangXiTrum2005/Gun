package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface StaticDeviceInfoDataSource {
    Object fetch(List<String> list, InterfaceC2857Wj interfaceC2857Wj);

    StaticDeviceInfoOuterClass.StaticDeviceInfo fetchCached();

    String getAnalyticsUserId();

    String getAppName();

    Object getAuid(InterfaceC2857Wj interfaceC2857Wj);

    Object getIdfi(InterfaceC2857Wj interfaceC2857Wj);

    String getManufacturer();

    String getModel();

    String getOsVersion();

    long getSystemBootTime();
}
