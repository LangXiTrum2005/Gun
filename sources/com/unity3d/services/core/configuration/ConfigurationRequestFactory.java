package com.unity3d.services.core.configuration;

import com.badlogic.gdx.net.HttpResponseHeader;
import com.efs.sdk.base.Constants;
import com.unity3d.services.core.device.reader.IDeviceInfoDataContainer;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigurationRequestFactory {
    private final Configuration _configuration;
    private final IDeviceInfoDataContainer _deviceInfoDataContainer;

    public ConfigurationRequestFactory(Configuration configuration) {
        this(configuration, null);
    }

    public Configuration getConfiguration() {
        return this._configuration;
    }

    public WebRequest getWebRequest() throws MalformedURLException {
        String configUrl = this._configuration.getConfigUrl();
        if (configUrl == null) {
            throw new MalformedURLException("Base URL is null");
        }
        HashMap map = new HashMap();
        map.put(HttpResponseHeader.ContentEncoding, Collections.singletonList(Constants.CP_GZIP));
        WebRequest webRequest = new WebRequest(configUrl, "POST", map);
        IDeviceInfoDataContainer iDeviceInfoDataContainer = this._deviceInfoDataContainer;
        webRequest.setBody(iDeviceInfoDataContainer != null ? iDeviceInfoDataContainer.getDeviceData() : null);
        DeviceLog.debug("Requesting configuration with: ".concat(configUrl));
        return webRequest;
    }

    public ConfigurationRequestFactory(Configuration configuration, IDeviceInfoDataContainer iDeviceInfoDataContainer) {
        this._configuration = configuration;
        this._deviceInfoDataContainer = iDeviceInfoDataContainer;
    }
}
