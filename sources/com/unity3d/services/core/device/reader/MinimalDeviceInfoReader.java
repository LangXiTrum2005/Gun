package com.unity3d.services.core.device.reader;

import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class MinimalDeviceInfoReader implements IDeviceInfoReader {
    final IGameSessionIdReader _gameSessionIdReader;

    public MinimalDeviceInfoReader(IGameSessionIdReader iGameSessionIdReader) {
        this._gameSessionIdReader = iGameSessionIdReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        HashMap mapV = AbstractC3950lJ.v("platform", "android");
        mapV.put("sdkVersion", Integer.valueOf(SdkProperties.getVersionCode()));
        mapV.put("sdkVersionName", SdkProperties.getVersionName());
        mapV.put(ScarConstants.IDFI_KEY, Device.getIdfi());
        mapV.put(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this._gameSessionIdReader.getGameSessionIdAndStore());
        mapV.put("ts", Long.valueOf(System.currentTimeMillis()));
        mapV.put(AndroidGetAdPlayerContext.KEY_GAME_ID, ClientProperties.getGameId());
        return mapV;
    }
}
